/**
 * Created by Administrator on 2017/3/22.
 */
var sellInDetails = new Vue({
    el: '#sellInDetails',
    data:{
        order:{
            type:'',
            typeName:'',
            timeStart:'',
            timeCurrent:'',
            name:'',
            price:'',
            unit:'',
            number:0,
            step:2,
            state:'',
            orderId:'',
            pay:'',
            commodityContractId:1,
            commodityType:'',
            img:'',
            commodityName:'',
            quantity:0,
            standardUnitMultiple:1,
            unitPrice:0,
            quantityType:1,
            countdown:'',
            expressFee:0,
            deduction:0,
            cash:0
        },
        isPay:true,
        isCancel:false,
        isPaying:false
    },
    computed:{
        totalMoney:function () {
            var money = this.order.quantity*this.order.unitPrice/100;
            return money.toFixed(2);
        }
    },
    beforeMount:function () {
        var that = this;
        var tradeOrderId = getQueryString('tradeOrderId');
        $.ajax({
            url: basePath + "test/pay/tradeOrderDetail",
            type: "POST",
            data: {'tradeOrderId':tradeOrderId},
            dataType: "json",
            success: function (rsp) {
                if(rsp.code == 0){
                    var data = rsp.body;
                    var state = data.tradeOrder.status;
                    if(state == 'NOPAY'){
                        state = '待付款';
                        that.isPay = false;
                    }else if(state == 'CANCELLED'){
                        //TODO
                        that.isCancel = true;
                        that.isPay = false;
                        state = '已取消';
                    }else{
                        state = '购买成功';
                        that.isPay = true;
                    }
                    that.order={
                        type:data.commodityVo.subjectMatter,
                        typeName:data.commodityVo.typeName,
                        timeStart:(new Date(data.tradeOrder.createTime)).format('yyyy-MM-dd hh:mm:ss'),
                        timeCurrent:(new Date(data.tradeOrder.successTime)).format('yyyy-MM-dd hh:mm:ss'),
                        name:data.commodityVo.commodityName,
                        price:(data.commodityVo.unitPrice/100).toFixed(2),
                        unit:data.commodityVo.unit,
                        number:data.tradeOrder.commodityUnitQuantity,
                        step:2,
                        orderId:data.tradeOrder.tradeOrderId,
                        pay:(data.tradeOrder.actualPrice/100).toFixed(2),
                        commodityContractId:data.commodityVo.commodityContractId,
                        img:that.getImg(data.commodityVo.iconUrl),
                        commodityType:data.commodityVo.subjectMatter,
                        commodityName:data.commodityVo.commodityName,
                        quantity:data.tradeOrder.commodityStandardQuantity?data.tradeOrder.commodityStandardQuantity:data.tradeOrder.commodityUnitQuantity,
                        standardUnitMultiple:data.commodityVo.standardUnitMultiple,
                        standardUnitName:data.commodityVo.standardUnitName,
                        unitPrice:data.tradeOrder.commodityStandardPrice?data.tradeOrder.commodityStandardPrice:data.tradeOrder.commodityUnitPrice,
                        quantityType:data.tradeOrder.commodityStandardQuantity?2:1,
                        logicId:data.tradeOrder.tradeOrderId,
                        countdown:'',
                        expressFee:data.tradeOrder.feePrice,
                        deduction:data.tradeOrder.couponPrice,
                        state:state,
                        cash:(data.tradeOrder.actualPrice/100).toFixed(2)
                    }
                    if(data.tradeOrder.status == 'NOPAY') {
                        that.order.countdown = GetRTime(data.timeOut);
                        window.clearTime = setInterval(function () {
                            data.timeOut-=1000;
                            that.order.countdown = GetRTime(data.timeOut);
                            if(that.order.countdown==''){
                                clearInterval(window.clearTime);
                                that.deleteOrder();
                            }
                        }, 1000);
                    }
                }else{
                    dialogComponent.parentTipDialog = {
                        show: true,
                        header: '交易明细',
                        body: '查询数据失败',
                        btnText:'确定'
                    };
                }
            }
        });
    },
    methods:{
        getImg:function(iconUrl){
            return staticPath +"static/images/view/"+iconUrl;
        },
        //取消购买
        deleteOrder:function () {
            var tradeOrderId = getQueryString('tradeOrderId');
            var that = this;
            $.ajax({
                url: basePath + "test/pay/cancelBuyCommodityInfo",
                type: "POST",
                data: {tradeOrderId:tradeOrderId},
                dataType: "json",
                success: function (rsp) {
                    if(rsp.code==0){
                        that.isCancel = true;
                        that.isPay = false;
                        that.order.state = '已取消';
                        dialogComponent.parentTipDialog = {
                            show: true,
                            header: '取消操作',
                            body: '订单已取消！',
                            btnText:'确定'
                        }
                    }else{
                        dialogComponent.parentTipDialog = {
                            show: true,
                            header: '取消操作',
                            body: '取消订单失败！',
                            btnText:'确定'
                        };

                    }
                }
            })
        },
        setDelete:function () {
            dialogComponent.parentModalDialog = {
                show: true,
                header: '信息提示',
                body: '确定取消订单吗？',
                leftBtnText: '否',
                rightBtnText: '是'
            };
            dialogComponent.leftBtn = function () {
                dialogComponent.parentModalDialog.show = false;
            }
            dialogComponent.rightBtn = function () {
                dialogComponent.parentModalDialog.show = false;
                sellInDetails.deleteOrder();
            }
        },
        //支付
        pay:function () {
            if(this.isPaying){
                return;
            }else {
                this.isPaying = true;
            }
            showLoading();
            var that = this;
            if(that.isCancel){
                window.location.href = basePath + "gift/commodityDetails?commodityId="+ that.order.commodityContractId;
            }else{
                var tradeOrderId = getQueryString('tradeOrderId');
                $.ajax({
                    url: basePath + "test/pay/payforBuyCommodity",
                    type: "POST",
                    data: {
                        tradeOrderId:tradeOrderId,
                    },
                    dataType: "json",
                    success: function (rsp) {
                        hideLoading()
                        if(rsp.code==0){
                            var body = rsp.body;
                            //唤起H5支付API
                            function onBridgeReady(appId, timeStamp, nonceStr, package, signType, paySign){
                                WeixinJSBridge.invoke(
                                    'getBrandWCPayRequest', {
                                        "appId": appId,     //公众号名称，由商户传入
                                        "timeStamp": timeStamp,         //时间戳，自1970年以来的秒数
                                        "nonceStr":nonceStr, //随机串
                                        "package": package,
                                        "signType":signType,         //微信签名方式：
                                        "paySign":paySign //微信签名
                                    },
                                    function(res){
                                        if(res.err_msg == "get_brand_wcpay_request:ok" ) {
                                            // 使用以上方式判断前端返回,微信团队郑重提示：res.err_msg将在用户支付成功后返回    ok，但并不保证它绝对可靠。
                                            //支付成功, 弹出订单支付成功框，显示去首页和去订单详情两个按钮
                                            dialogComponent.parentModalDialog = {
                                                show:true,
                                                header: '支付消息',
                                                body: '支付成功！',
                                                leftBtnText: '查看订单',
                                                rightBtnText: '去首页'
                                            }
                                            dialogComponent.leftBtn = function () {
                                                var bizType = getQueryString('bizType');
                                                if(bizType=='DELIVERY'){
                                                    window.location.href = basePath+'test/pay/deliveryDetails?bizType='+bizType+'&tradeOrderId='+body.tradeOrderId;
                                                }else if(bizType=='BUY_COMMODITY'){
                                                    window.location.href = basePath+'test/pay/sellInDetails?bizType='+bizType+'&tradeOrderId='+body.tradeOrderId;
                                                }

                                            }
                                            dialogComponent.rightBtn = function () {
                                                window.location.href = basePath+'gift/index';
                                            }
                                        }
                                        else if(res.err_msg == "get_brand_wcpay_request:cancel" || res.err_msg == "get_brand_wcpay_request:fail") {
                                            //支付过程中取消或失败，强制浏览器跳转至订单详情页，页面中需包含 “取消订单”， “支付”按钮
                                            dialogComponent.parentModalDialog = {
                                                show:true,
                                                header: '支付消息',
                                                body: '支付已取消',
                                                leftBtnText: '继续支付',
                                                rightBtnText: '去首页'
                                            };
                                            dialogComponent.leftBtn = function () {
                                                window.location.reload();
                                            };
                                            dialogComponent.rightBtn = function () {
                                                window.location.href = basePath+'gift/index';
                                            };
                                            // var bizType = getQueryString('bizType');
                                            // if(bizType=='DELIVERY'){
                                            //     window.location.href = basePath+'test/pay/deliveryDetails?bizType='+bizType+'&tradeOrderId='+body.tradeOrderId;
                                            // }else if(bizType=='BUY_COMMODITY'){
                                            //     window.location.href = basePath+'test/pay/sellInDetails?bizType='+bizType+'&tradeOrderId='+body.tradeOrderId;
                                            // }
                                        }
                                    }
                                );
                            }

                            if (typeof WeixinJSBridge == "undefined"){
                                if( document.addEventListener ){
                                    document.addEventListener('WeixinJSBridgeReady', onBridgeReady, false);
                                }else if (document.attachEvent){
                                    document.attachEvent('WeixinJSBridgeReady', onBridgeReady);
                                    document.attachEvent('onWeixinJSBridgeReady', onBridgeReady);
                                }
                            }else{
                                onBridgeReady(body.appId, body.timeStamp, body.nonceStr, body.package, body.signType, body.paySign);
                            }
                        }else if(rsp.code==-1){
                            dialogComponent.parentTipDialog = {
                                show: true,
                                header: '买入信息',
                                body: '购买商品付款失败，请重试',
                                btnText:'确定'
                            };
                            sellInDetails.isPaying = false;
                        }else if(rsp.code==-2){
                            dialogComponent.parentModalDialog = {
                                show: true,
                                header: '买入信息',
                                body: body,
                                leftBtnText: '放弃购买',
                                rightBtnText: '继续支付'
                            };
                            dialogComponent.leftBtn=function () {
                                window.location.href = basePath+'gift/index';
                            }
                            dialogComponent.rightBtn=function () {
                                dialogComponent.parentModalDialog.show = false;
                                sellInDetails.isPaying = false;
                            }
                        }else if(rsp.code==504){
                            dialogComponent.parentTipDialog = {
                                show: true,
                                header: '买入信息',
                                body: '请求超时',
                                btnText:'确定'
                            };
                            sellInDetails.isPaying = false;
                        }else{
                            dialogComponent.parentTipDialog = {
                                show: true,
                                header: '买入信息',
                                body: '付款失败',
                                btnText:'确定'
                            };
                            dialogComponent.enterBtn=function () {
                                dialogComponent.parentTipDialog.show = false;
                                sellInDetails.isPaying = false;
                            }
                        }
                    },
                    error:function (err) {
                        hideLoading();
                        sellInDetails.isPaying = false;
                        toastComponent.parentToastMessage = {
                            show:true,
                            body: '网络超时！',
                            autoHide:true
                        };
                    }
                });
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
            rightBtnText: '确定'
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
window.addEventListener('load', function() {
    function updateOnlineStatus(event) {
        var condition = navigator.onLine;
        if(condition){
            sellInDetails.isPaying = false;
            toastComponent.parentToastMessage.show = false;
        }else{
            toastComponent.parentToastMessage= {
                show:true,
                body:'网络错误，请查看网络并刷新页面',
                autoHide:false
            };
        }
        console.log(event.type + "; Status: " + condition );
    }
    window.addEventListener('online',  updateOnlineStatus);
    window.addEventListener('offline', updateOnlineStatus);
});