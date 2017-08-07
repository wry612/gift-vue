/**
 * Created by Administrator on 2017/3/22.
 */
var deliveryDetails = new Vue({
    el: '#deliveryDetails',
    data:{
        deliveDetailInfo: {
            type:'',
            typeName:'',
            timeStart:'',
            timeMid:'',
            timeEnd:'',
            name:'',
            unit:'',
            rule:'',
            number:0,
            kouNumber:'',
            kouMoney:'',
            money:0,
            step:1,
            cosh:'',
            fee:'',
            total:'',
            state:'',
            orderId:'',
            company:'',
            logisticsId:'',
            commodityContractId:1,
            commodityType:'',
            img:'',
            commodityName:'',
            quantity:0,
            standardQuantity:1,
            standardUnitName:'',
            applyCommodityStandardUnitQuantity:1,
            unitPrice:0,
            quantityType:1,
            countdown:'',
            expressFee:0,
            deduction:0,
            cash:0
        },
        isPay:true,
        isCancel:false,
        username:'',
        telNumber:'',
        proviceFirstStageName:'',
        addressCitySecondStageName:'',
        addressCountiesThirdStageName:'',
        addressDetailInfo:'',
        isPaying:false
    },
    beforeMount:function () {
        var that = this;
        var deliveryDetailsId = getQueryString('deliveryDetailsId');
        $.ajax({
            url: basePath + "pickUp/queryDeliveryDetailInfo",
            type: "POST",
            data: {'deliveryDetailsId':deliveryDetailsId},
            dataType: "json",
            success: function (rsp) {
                if(rsp.code == 0){
                    var data = rsp.body;
                    var state = data.deliveryOrder.status;
                    if(state == 'NOPAY'){
                        state = '待付款';
                        that.isPay = false;
                    }else if(state == 'CANCELLED'){
                        that.isCancel = true;
                        that.isPay = false;
                        state = '已取消';
                    }else if(state == 'NOT_DELIVER'){
                        that.deliveDetailInfo.step = 1;
                        state = '待发货';
                        that.isPay = true;
                    }else if(state == 'DELIVERED'){
                        that.deliveDetailInfo.step = 2;
                        state = '已发货';
                        that.isPay = true;
                    }
                    else{
                        state = '提货成功';
                        that.isPay = true;
                    }
                    that.deliveDetailInfo={
                        type:data.commodityVo.subjectMatter,
                        typeName:data.commodityVo.typeName,
                        timeStart:(new Date(data.deliveryOrder.orderTime)).format('yyyy-MM-dd hh:mm:ss'),
                        timeMid:(new Date(data.deliveryOrder.successTime)).format('yyyy-MM-dd hh:mm:ss'),
                        timeEnd:(new Date(data.deliveryOrder.deliveryTime)).format('yyyy-MM-dd hh:mm:ss'),
                        name:data.commodityVo.commodityName,
                        unit:data.commodityVo.unit,
                        rule:''+data.commodityVo.standardUnitMultiple+data.commodityVo.unit+'/'+data.commodityVo.standardUnitName,
                        number:data.deliveryOrder.applyCommodityUnitQuantity,
                        kouNumber:data.deliveryOrder.actConsumeCommUnitQuantity,
                        kouMoney:(data.deliveryOrder.actConsumeCommUnitQuantity*data.commodityVo.unitPrice/100).toFixed(2),
                        money:(data.deliveryOrder.applyCommodityUnitQuantity*data.commodityVo.unitPrice/100).toFixed(2),
                        step:that.deliveDetailInfo.step,
                        fee:'0.00元',
                        total:(data.deliveryOrder.actualPrice/100).toFixed(2),
                        orderId:data.deliveryOrder.deliveryOrderId,
                        company:data.deliveryOrder.logisticsOperator,
                        logisticsId:data.deliveryOrder.logisticsOrderId,
                        commodityContractId:data.commodityVo.commodityContractId,
                        img:staticPath+'/static/images/product-img1.jpg',
                        commodityType:data.commodityVo.subjectMatter,
                        commodityName:data.commodityVo.commodityName,
                        quantity:data.deliveryOrder.applyCommodityUnitQuantity,
                        applyCommodityStandardUnitQuantity:data.deliveryOrder.applyCommodityStandardUnitQuantity,
                        standardUnitMultiple:data.commodityVo.standardUnitMultiple,
                        standardUnitName:data.commodityVo.standardUnitName,
                        standardPrice:(data.commodityVo.standardPrice/100).toFixed(2),
                        unitPrice:data.commodityVo.unitPrice,
                        quantityType:1,
                        time:data.deliveryOrder.orderTime,
                        logicId:data.deliveryOrder.tradeOrderId,
                        countdown:'',
                        expressFee:data.deliveryOrder.feePrice.toFixed(2),
                        expressInfoId:data.deliveryOrder.expressInfoId?data.deliveryOrder.expressInfoId:'',
                        deduction:data.deliveryOrder.actConsumeCommUnitQuantity.toFixed(2),
                        state:state,
                        cash:(data.deliveryOrder.actualPrice/100).toFixed(2),
                        img:that.getImg(data.commodityVo.iconUrl)
                    };
                    that.username = data.deliveryOrder.addresseeName;
                    that.telNumber = data.deliveryOrder.addresseeMobilePhone;
                    that.proviceFirstStageName=data.deliveryOrder.proviceFirstStageName;
                    that.addressCitySecondStageName = data.deliveryOrder.addressCitySecondStageName;
                    that.addressCountiesThirdStageName = data.deliveryOrder.addressCountiesThirdStageName;
                    that.addressDetailInfo = data.deliveryOrder.addressDetailInfo;
                    if(data.deliveryOrder.status == 'NOPAY') {
                        that.deliveDetailInfo.countdown = GetRTime(data.timeOut);
                        window.clearTime = setInterval(function () {
                            data.timeOut-=1000;
                            that.deliveDetailInfo.countdown = GetRTime(data.timeOut);
                            if(that.deliveDetailInfo.countdown==''){
                                clearInterval(window.clearTime);
                                that.deleteOrder();
                            }
                        }, 1000);
                    }
                }
            }
        });
    },
    computed:{
        totalMoney:function () {
            var quantityType = this.deliveDetailInfo.quantityType;
            var unitNumber = (quantityType==1)?1:this.deliveDetailInfo.standardUnitMultiple;
            var money = this.deliveDetailInfo.unitPrice*this.deliveDetailInfo.quantity*unitNumber/100;
            return money.toFixed(2);
        },
        address:function () {
            return this.proviceFirstStageName+this.addressCitySecondStageName+this.addressCountiesThirdStageName+this.addressDetailInfo;
        }
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
                url: basePath + "pickUp/cancelTakeGoods",
                type: "POST",
                data: {deliveryOrderId:that.deliveDetailInfo.orderId},
                dataType: "json",
                success: function (rsp) {
                    if(rsp.code==0){
                        that.isCancel = true;
                        that.isPay = false;
                        that.deliveDetailInfo.state = '已取消';
                        dialogComponent.parentTipDialog = {
                            show: true,
                            header: '取消提货',
                            body: '订单已取消！',
                            btnText:'确定'
                        }
                        dialogComponent.parentTipDialog.enterBtn = function () {
                            window.location.href = basePath+'gift/index';
                        }
                    }else{
                        dialogComponent.parentTipDialog = {
                            show: true,
                            header: '取消提货',
                            body: '取消提货失败！',
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
                deliveryDetails.deleteOrder();
            }
        },
        pay:function () {
            if(this.isPaying){
                return;
            }else {
                this.isPaying = true;
            }
            var that = this;
            if(that.isCancel) {
                window.location.href = basePath + "gift/commodityDetails?commodityId="+that.deliveDetailInfo.commodityContractId;
            }else{
                showLoading();
                $.ajax({
                    url: basePath+'test/pay/payForDetailTakeGoods',
                    type: "POST",
                    data: {
                        deliveryOrderId:that.deliveDetailInfo.orderId,
                        addresseeName:that.username,
                        addresseeMobilePhone:that.telNumber,
                        proviceFirstStageName:that.proviceFirstStageName,
                        addressCitySecondStageName:that.addressCitySecondStageName,
                        addressCountiesThirdStageName:that.addressCountiesThirdStageName,
                        addressDetailInfo:that.addressDetailInfo
                    },
                    dataType: "json",
                    success: function (rsp) {
                        hideLoading();
                        if(rsp.code==0){
                            var body = rsp.body;
                            if(null == body){
                                dialogComponent.parentTipDialog = {
                                    show: true,
                                    header: '支付信息',
                                    body: '提货支付完成！',
                                    btnText:'确定'
                                };
                                dialogComponent.enterBtn = function () {
                                    window.location.href = basePath+'gift/index';
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
                                                    window.location.href = basePath+'test/pay/deliveryDetails?bizType='+bizType+'&deliveryDetailsId='+body.deliveryOrderId;
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
                                                    leftBtnText: '查看订单',
                                                    rightBtnText: '去首页'
                                                };
                                                dialogComponent.leftBtn = function () {
                                                    var bizType = getQueryString('bizType');
                                                    window.location.href = basePath+'test/pay/deliveryDetails?bizType='+bizType+'&deliveryDetailsId='+body.deliveryOrderId;
                                                };
                                                dialogComponent.rightBtn = function () {
                                                    window.location.href = basePath+'gift/index';
                                                };
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
                        }else if(rsp.code == -1){
                            dialogComponent.parentTipDialog = {
                                show: true,
                                header: '提货信息',
                                body: '提货付款失败，请重试',
                                btnText:'确定'
                            };
                            deliveryDetails.isPaying = false;
                        }else if(rsp.code==-2){
                            dialogComponent.parentModalDialog = {
                                show: true,
                                header: '买入信息',
                                body: body,
                                leftBtnText: '放弃提货',
                                rightBtnText: '继续提货'
                            };
                            dialogComponent.leftBtn=function () {
                                window.location.href = basePath+'gift/index';
                            }
                            dialogComponent.rightBtn=function () {
                                dialogComponent.parentModalDialog.show = false;
                                deliveryDetails.isPaying = false;
                            }
                        }else if(rsp.code==504){
                            dialogComponent.parentTipDialog = {
                                show: true,
                                header: '提货信息',
                                body: '请求超时',
                                btnText:'确定'
                            };
                            deliveryDetails.isPaying = false;
                        }else{
                            dialogComponent.parentTipDialog = {
                                show: true,
                                header: '提货信息',
                                body: '提货失败',
                                btnText:'确定'
                            };
                            dialogComponent.enterBtn=function () {
                                dialogComponent.parentTipDialog.show = false;
                                deliveryDetails.isPaying = false;
                            }
                        }
                    },
                    error:function (err) {
                        hideLoading();
                        deliveryDetails.isPaying = false;
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
            body: 'asfasf'
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
