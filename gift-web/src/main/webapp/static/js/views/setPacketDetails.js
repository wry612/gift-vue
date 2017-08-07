/**
 * Created by Administrator on 2017/3/22.
 */
var setPacketDetails = new Vue({
    el: '#setPacketDetails',
    data:{
        packet:{
            type:1,
            name:'',
            commodityMatter:'',
            code:'',
            img:'',
            commodityName:'',
            desc:'',
            commodityUnitName:'',
            typeName:'',
            number:0,
            money:0,
            receive:0,
            doneeQuota:0,
            receiveNumber:0,
            commodityTotalQuantity:0,
            expiredTime:'',
            packetList:[
                {img:'',name:'',time:'',product:'',number:''}
            ]
        },
        detailUrl:basePath+'gift/commodityDetails?commodityId=',
        isSend:false,
        hasReceive:true,
        isGetPacket:false,
        isExprired:false
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
            data:{'bizType':'GIVE_GIFT'},
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
                    that.packetFlag = 3;
                    that.isOpen = true;
                    dialogComponent.parentTipDialog.show = false;
                    var list = [];
                    var myself = {};
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
                            time:timeToDate(data.othersGrabInfoList[i].grabTime),
                            commodityName:data.commodityName,
                            number:othersGrabInfoList[i].grabQtn+data.unit
                        }
                        list.push(item);
                    }
                    if(data.selfGrabInfo){
                        var num = data.selfGrabInfo.grabQtn;

                    }else{
                        var num = 0;
                    }
                    that.packet = {
                        commodityContractId:data.commodityId,
                        type:1,
                        code:data.code,
                        name:data.nickname,
                        expiredTime:data.expiredTime,
                        commodityMatter:data.commodityMatter,
                        typeName:data.typeName,
                        img:that.getImg(data.headImg),
                        desc:data.greeting,
                        commodityName:data.commodityName,
                        commodityUnitName:data.unit,
                        number:num,
                        money:(Number(data.commodityPrice)*Number(num)/100).toFixed(2),
                        receive:Number(data.doneeQuota)-Number(data.doneeSurplus),
                        doneeQuota:data.doneeQuota,
                        receiveNumber:Number(data.commodityTotalQuantity)-Number(data.commoditySurplusQuantity),
                        commodityTotalQuantity:data.commodityTotalQuantity,
                        packetList:list
                    };
                    if(that.packet.receiveNumber==that.packet.commodityTotalQuantity){
                        that.hasReceive = false;
                    }else{
                        that.hasReceive = true;
                        if((new Date()).getTime()>=data.expiredTime){
                            that.hasReceive = false;
                            that.isExprired = true;
                        }else{
                            that.isExprired = false;
                        }
                    }
                    if(Number(that.packet.receive)<Number(that.packet.doneeQuota)){
                        share(that.packet.desc,that.packet.code,that.packet.name);
                    }else{
                        forbidden();
                    }
                }
            }
        });
    },
    methods:{
        hide:function () {
            this.isSend = false;
        },
        sendContinue:function () {
            this.isSend = true;
        },
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