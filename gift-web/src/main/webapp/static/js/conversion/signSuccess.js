/**
 * Created by Administrator on 2017/3/22.
 */
var signSuccess = new Vue({
    el:'#signSuccess',
    data:{
        commodity:{
            convertObjId:'',//主键
            headImgs:'',//头部图片
            fullName:'',//兑换物品的全称
            marketPrice:'',//市场价
            totalQuantity:'',//总量
            availableQuantity:'',//库存
            alreadyReceive:'',//已兑换 = 总量-库存
            signQuantity:'',//已报名人数
            validDate:'',
            imgList:'',
            drawed:'',
            doller:[],
            orderGroupId:''
        },
        isDraw:false,
        isQuanShow:true
    },
    beforeMount:function () {
        var that = this;
        var convertObjId = getQueryString('convertObjId');
        var draw = getQueryString('isDraw');
        var convertObjOrderId = getQueryString("convertObjOrderId");
        var orderGroupId = getQueryString("orderGroupId");
        var signSeq = getQueryString('signSeq');
        that.isDraw = (draw=='true')?true:false;
        $.ajax({
            url: basePath + "conversion/detail/"+convertObjId+"?time="+new Date(),
            type: "GET",
            data: '',
            dataType: "json",
            success: function (rsp) {
                if(rsp.code == 0) {
                    var data = rsp.body;
                    that.commodity={
                        convertObjId:data.convertObjId,//主键
                        headImgs:that.getImg(data.icon),//头部图片
                        fullName:data.fullName,//兑换物品的全称
                        marketPrice:Number(data.marketPrice)/100,//市场价
                        totalQuantity:data.totalQuantity,//总量
                        availableQuantity:data.availableQuantity,//库存
                        alreadyReceive:data.totalQuantity - data.availableQuantity,//已兑换 = 总量-库存
                        signQuantity:data.signQuantity,//已报名人数
                        validDate:(new Date(data.expireTime)).format('yyyy年MM月dd日'),
                        endTime:(new Date(data.endTime)).format('yyyy年MM月dd日 hh:mm:ss'),
                        drawTime:(new Date(data.drawTime)).format('yyyy年MM月dd日 hh:mm:ss'),
                        drawed:data.drawed,
                        doller:signSeq.split(','),
                        convertObjOrderId: convertObjOrderId,
                        orderGroupId :orderGroupId
                    }
                }else{
                    dialogComponent.parentTipDialog = {
                        show: true,
                        header: '错误提示',
                        body: rsp.body,
                        btnText:'确定'
                    };
                }
            }
        });
    },
    computed:{
        url:function () {
            return basePath+'conversion/orderDetailPage?isDraw='+this.isDraw+'&convertObjOrderId='+this.commodity.convertObjOrderId+'&orderGroupId='+this.commodity.orderGroupId;
        }
    },
    methods:{
        getImg:function(iconUrl){
            return staticPath +"static/images/view/"+iconUrl;
        },
        toggleQuan:function () {
            if(this.isQuanShow){
                this.isQuanShow=false;
            }else{
                this.isQuanShow=true;
            }
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
        },
        enterBtn:function () {
            this.parentTipDialog.show = false
        }
    }
});
