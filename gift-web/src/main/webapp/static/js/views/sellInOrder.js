/**
 * Created by Administrator on 2017/3/22.
 */
var sellInOrder = new Vue({
    el: '#sellInOrder',
    data:{
        commodity:{
            commodityContractId:1,
            commodityType:'',
            typeName:'',
            img:'',
            commodityName:'',
            quantity:0,
            standardUnitMultiple:1,
            unit:'',
            unitPrice:0,
            quantityType:1
        },
        isPaying:false
    },
    computed:{
        totalMoney:function () {
            var money = this.commodity.unitPrice*this.commodity.quantity;
            return money.toFixed(2);
        }
    },
    beforeMount:function () {
        var that = this;
        var commodityId = getQueryString('commodityId');
        $.ajax({
            url: basePath + "buyCommodity/queryCommodityDetail",
            type: "POST",
            data: {'commodityId':commodityId},
            dataType: "json",
            success: function (rsp) {
                if(rsp.code == 0){
                    var data = rsp.body;
                    var quantityType = getQueryString('quantityType');
                    var quantity = getQueryString('quantity');
                    that.commodity={
                        commodityContractId:data.commodityContractId,
                        img:that.getImg(data.iconUrl),
                        commodityType:data.subjectMatter,
                        typeName:data.typeName,
                        commodityName:data.commodityName,
                        quantity:quantity,
                        singleUnit:data.unit,
                        standardUnitName:data.standardUnitName,
                        unit:quantityType==1?data.unit:data.standardUnitName,
                        standardUnitMultiple:data.standardUnitMultiple,
                        unitPrice:quantityType==1?((data.unitPrice)/100).toFixed(2):(Number(data.standardPrice)/100).toFixed(2),
                        quantityType:quantityType,
                        standardPrice:Number(data.standardPrice)/100
                    }
                }
            }
        });
    },
    methods:{
        getImg:function(iconUrl){
            return staticPath +"static/images/view/"+iconUrl;
        },
        pay:function () {
            if(this.isPaying){
                return;
            }else {
                this.isPaying = true;
                            }
            showLoading();
            var that = this;
            $.ajax({
                url: basePath + "test/pay/buyCommodity",
                type: "POST",
                data: {
                    commodityId:that.commodity.commodityContractId,
                    quantity:that.commodity.quantity,
                    quantityType:that.commodity.quantityType
                },
                dataType: "json",
                success: function (rsp) {
                    var body = rsp.body;
                    hideLoading();
                    if(rsp.code==0){
                        if(null == body){
                            var redirectUrl = getQueryString('redirectUrl');
                            if(redirectUrl&&redirectUrl!='') {
                                dialogComponent.parentTipDialog = {
                                    show: true,
                                    header: '支付信息',
                                    body: '支付完成！',
                                    btnText: '回活动页'
                                };
                                dialogComponent.enterBtn = function () {
                                    window.location.href = redirectUrl;
                                }
                            }else{
                                dialogComponent.parentTipDialog = {
                                    show: true,
                                    header: '支付信息',
                                    body: '支付完成！',
                                    btnText: '确定'
                                };
                                dialogComponent.enterBtn = function () {
                                    window.location.href = basePath + 'gift/index';
                                }
                            }
                        }else{
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
                                            //TODO 支付成功, 弹出订单支付成功框，显示去首页和去订单详情两个按钮
                                            var redirectUrl = getQueryString('redirectUrl');
                                            if(redirectUrl&&redirectUrl!=''){
                                                dialogComponent.parentModalDialog = {
                                                    show:true,
                                                    header: '支付消息',
                                                    body: '支付成功！',
                                                    leftBtnText: '查看订单',
                                                    rightBtnText: '回活动页'
                                                };
                                                dialogComponent.leftBtn = function () {
                                                    var bizType = getQueryString('bizType');
                                                    window.location.href = basePath+'test/pay/sellInDetails?bizType='+bizType+'&tradeOrderId='+body.tradeOrderId;
                                                };
                                                dialogComponent.rightBtn = function () {
                                                    window.location.href = redirectUrl;
                                                };
                                            }else{
                                                dialogComponent.parentModalDialog = {
                                                    show:true,
                                                    header: '支付消息',
                                                    body: '支付成功！',
                                                    leftBtnText: '查看订单',
                                                    rightBtnText: '去首页'
                                                };
                                                dialogComponent.leftBtn = function () {
                                                    var bizType = getQueryString('bizType');
                                                    window.location.href = basePath+'test/pay/sellInDetails?bizType='+bizType+'&tradeOrderId='+body.tradeOrderId;
                                                };
                                                dialogComponent.rightBtn = function () {
                                                    window.location.href = basePath+'gift/index';
                                                };
                                            }
                                        }
                                        else if(res.err_msg == "get_brand_wcpay_request:cancel" || res.err_msg == "get_brand_wcpay_request:fail") {
                                            //支付过程中取消或失败，强制浏览器跳转至订单详情页，页面中需包含 “取消订单”， “支付”按钮
                                            var redirectUrl = getQueryString('redirectUrl');
                                            if(redirectUrl&&redirectUrl!='') {
                                                dialogComponent.parentModalDialog = {
                                                    show: true,
                                                    header: '支付消息',
                                                    body: '支付已取消',
                                                    leftBtnText: '查看订单',
                                                    rightBtnText: '回活动页'
                                                };
                                                dialogComponent.leftBtn = function () {
                                                    var bizType = getQueryString('bizType');
                                                    window.location.href = basePath + 'test/pay/sellInDetails?bizType=' + bizType + '&tradeOrderId=' + body.tradeOrderId;
                                                };
                                                dialogComponent.rightBtn = function () {
                                                    window.location.href = redirectUrl;
                                                };
                                            }else{
                                                dialogComponent.parentModalDialog = {
                                                    show: true,
                                                    header: '支付消息',
                                                    body: '支付已取消',
                                                    leftBtnText: '查看订单',
                                                    rightBtnText: '去首页'
                                                };
                                                dialogComponent.leftBtn = function () {
                                                    var bizType = getQueryString('bizType');
                                                    window.location.href = basePath + 'test/pay/sellInDetails?bizType=' + bizType + '&tradeOrderId=' + body.tradeOrderId;
                                                };
                                                dialogComponent.rightBtn = function () {
                                                    window.location.href = basePath + 'gift/index';
                                                };
                                            }
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
                        }
                    }else if(rsp.code==-1) {
                        dialogComponent.parentTipDialog = {
                            show: true,
                            header: '买入信息',
                            body: '购买商品付款失败，请前往订单详情页支付',
                            btnText: '确定'
                        };
                        dialogComponent.enterBtn = function () {
                            window.location.href = basePath + 'test/pay/sellInDetails?bizType=BUY_COMMODITY&tradeOrderId=' + body;
                        }
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
                            sellInOrder.isPaying = false;
                            dialogComponent.parentModalDialog.show = false;
                        }
                    }else if(rsp.code==504){
                        dialogComponent.parentTipDialog = {
                            show: true,
                            header: '买入信息',
                            body: '请求超时',
                            btnText:'确定'
                        };
                        sellInOrder.isPaying = false;
                    }else{
                        dialogComponent.parentTipDialog = {
                            show: true,
                            header: '买入信息',
                            body: body,
                            btnText:'确定'
                        };
                        dialogComponent.enterBtn=function () {
                            dialogComponent.parentTipDialog.show = false;
                            sellInOrder.isPaying = false;
                        }
                    }
                },
                error:function () {
                    hideLoading();
                    sellInOrder.isPaying = false;
                    toastComponent.parentToastMessage = {
                        show:true,
                        body: '网络超时！',
                        autoHide:true
                    };
                }
            });
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
            body: '消息弹框内容！',
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
            alert('ok')
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
            sellInOrder.isPaying = false;
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