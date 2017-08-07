/**
 * Created by Administrator on 2017/3/22.
 */
var getPacketDetails = new Vue({
    el: '#getPacketDetails',
    data:{
        packet:{
            type:1,
            name:'',
            commodityMatter:'',
            img:'',
            typeName:'',
            commodityName:'',
            desc:'',
            commodityUnitName:'',
            number:0,
            money:0,
            receive:0,
            doneeQuota:0,
            receiveNumber:0,
            commodityTotalQuantity:0,
            packetList:[
                {img:'',name:'',time:'',product:'',number:''}
            ]
        },
        detailUrl:basePath+'gift/commodityDetails?commodityId=',
        isGetPacket:false
    },
    computed:{
        bgClass:function () {
            var commodityMatter = this.packet.typeName;
            if(commodityMatter.indexOf('白酒')>-1){
                return {tea:false,"white-wine":true,"red-wine":false}
            }else if(commodityMatter.indexOf('红酒')>-1){
                return {tea:false,"white-wine":false,"red-wine":true}
            }else if(commodityMatter.indexOf('茶')>-1){
                return {tea:true,"white-wine":false,"red-wine":false}
            }
        }
    },
    beforeMount:function () {
        var giftInfoId =  $('#giftInfoId').val();
        var giftInfoCode = $('#giftInfoCode').val();
        var that = this;
        $.ajax({
            url:basePath+'gift/detail/'+giftInfoId+'/'+giftInfoCode,
            data:{'bizType':'ACCEPT_GIFT'},
            type:'POST',
            dataType:'json',
            success:function(response){
                if(response.code == '1007'){
                    dialogComponent.parentTipDialog={
                        show:true,
                        header:'礼包信息',
                        body:response.msg,
                        btnText:'确定'
                    }
                    dialogComponent.enterBtn=function () {
                        wx.closeWindow();
                    }
                }else{
                    var data = response.body;
                    dialogComponent.parentTipDialog.show = false;
                    var list = [];
                    var unit = data.unit;
                    if(data.selfGrabInfo){
                        that.isGetPacket = true;
                        myself = {
                            img:that.getImg(data.selfGrabInfo.headImg),
                            name:data.selfGrabInfo.nickname,
                            time:timeToDate(data.selfGrabInfo.grabTime),
                            commodityName:data.commodityName,
                            number:data.selfGrabInfo.grabQtn.toString()+unit
                        };
                        list.push(myself);
                    }else{
                        that.isGetPacket = false;
                    }
                    var othersGrabInfoList = data.othersGrabInfoList;
                    for(var i=0;i<othersGrabInfoList.length;i++){
                        var item = {
                            img:that.getImg(othersGrabInfoList[i].headImg),
                            name:othersGrabInfoList[i].nickname,
                            time:timeToDate(othersGrabInfoList[i].grabTime),
                            commodityName:data.commodityName,
                            number:othersGrabInfoList[i].grabQtn+data.unit
                        }
                        list.push(item);
                    }
                    that.packet = {
                        commodityContractId:data.commodityId,
                        type:1,
                        name:data.nickname,
                        commodityMatter:data.commodityMatter,
                        typeName:data.typeName,
                        img:that.getImg(data.headImg),
                        desc:data.greeting,
                        commodityName:data.commodityName,
                        commodityUnitName:data.unit,
                        number:data.selfGrabInfo.grabQtn,
                        money:(Number(data.commodityPrice)*Number(data.selfGrabInfo.grabQtn)/100).toFixed(2),
                        receive:Number(data.doneeQuota)-Number(data.doneeSurplus),
                        doneeQuota:data.doneeQuota,
                        receiveNumber:Number(data.commodityTotalQuantity)-Number(data.commoditySurplusQuantity),
                        commodityTotalQuantity:data.commodityTotalQuantity,
                        packetList:list
                    };
                }
            }
        });
    },
    methods:{
        getImg:function(fileName){
            return staticPath + "gift/downloadFile?fileName=" + fileName;
        }
    }
});

var dialogComponent = new Vue({
    el: '#dialogComponent',
    data: {
        parentModalDialog: {
            show: false,
            header: '按钮弹框',
            body: '按钮弹框内容',
            leftBtnText: '取消',
            rightBtnText: '去设置'
        },
        parentTipDialog: {
            show: false,
            header: '消息弹框',
            body: 'asfasf',
            btnText:'确定'
        }
    },
    computed: {},
    methods: {
        leftBtn: function () {
            this.parentModalDialog.show = false;
        },
        rightBtn: function () {
            this.parentModalDialog.show = false;
            window.location.href = basePath+'setPassword';
        },
        enterBtn:function () {
            this.parentTipDialog.show = false
        }
    }
});