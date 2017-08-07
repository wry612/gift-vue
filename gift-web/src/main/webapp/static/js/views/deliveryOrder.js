/**
 * Created by Administrator on 2017/3/22.
 */
//注册数字键盘
var numericKeypadComponent = new Vue({
    el: '#numericKeypadComponent',
    data: {
        parentNumericKeypad:{
            show:false,
            keyWord:[]
        }
    }
});
$('.numeric-keypad').on('click',function () {
    deliveryOrder.showPassword(numericKeypadComponent.parentNumericKeypad.keyWord);
});
var deliveryOrder = new Vue({
    el: '#deliveryOrder',
    data:{
        product:{
            commodityContractId:1,
            type:'',
            img:'',
            name:'',
            number:0,
            package:0,
            unit:'',
            money:0,
            expressFee:0,
            deduction:0,
            cash:0
        },
        hasAddress:false,
        username:'',
        telNumber:'',
        proviceFirstStageName:'',
        addressCitySecondStageName:'',
        addressCountiesThirdStageName:'',
        addressDetailInfo:'',
        isPaying:false,
        passwordShow:false,
        passwordTip:'请输入6位支付密码',
        forgetPassword:true,
        errorShow:false,
        errorText:'',
        passwordValue:{
            value1:'',
            value2:'',
            value3:'',
            value4:'',
            value5:'',
            value6:''
        }
    },
    beforeMount:function () {
        this.getAddress();
        this.getGift();
    },
    computed:{
        password:function () {
            return numericKeypadComponent.parentNumericKeypad.keyWord.join('');;
        },
        totalMoney:function () {
            return (Number(this.product.cash)+Number(this.product.expressFee)).toFixed(2);
        },
        address:function () {
            return this.proviceFirstStageName+this.addressCitySecondStageName+this.addressCountiesThirdStageName+this.addressDetailInfo;
        }
    },
    methods:{
        getImg:function(iconUrl){
            return staticPath +"static/images/view/"+iconUrl;
        },
        getAddress:function () {
            var that= this;
            $.ajax({
                url: basePath + "address/queryUserDeliveryInfoList?time="+new Date(),
                type: "POST",
                data: '',
                dataType: "json",
                success: function (rsp) {
                    if (rsp.code == 0) {
                        var data = rsp.body;
                        var hasDefault = false;
                        if(data.length>0){
                            for (var i = 0; i < data.length; i++) {
                                if(data[i].isDefault =="true" || data[i].isDefault ==true){
                                    that.userDeliveryInfoId= data[i].userDeliveryInfoId;
                                    that.username = data[i].username;
                                    that.telNumber = data[i].telNumber;
                                    that.proviceFirstStageName=data[i].proviceFirstStageName;
                                    that.addressCitySecondStageName = data[i].addressCitySecondStageName;
                                    that.addressCountiesThirdStageName = data[i].addressCountiesThirdStageName;
                                    that.addressDetailInfo = data[i].addressDetailInfo;
                                    hasDefault = true;
                                }
                            }
                            if(!hasDefault){
                                that.userDeliveryInfoId= data[0].userDeliveryInfoId;
                                that.username = data[0].username;
                                that.telNumber = data[0].telNumber;
                                that.proviceFirstStageName=data[0].proviceFirstStageName;
                                that.addressCitySecondStageName = data[0].addressCitySecondStageName;
                                that.addressCountiesThirdStageName = data[0].addressCountiesThirdStageName;
                                that.addressDetailInfo = data[0].addressDetailInfo;
                            }
                            that.hasAddress = true;
                        }else{
                            that.userDeliveryInfoId= 0;
                            that.username = '';
                            that.telNumber = '';
                            that.proviceFirstStageName='';
                            that.addressCitySecondStageName = '';
                            that.addressCountiesThirdStageName = '';
                            that.addressDetailInfo = '';
                            that.hasAddress = false;
                        }
                    }
                }
            });
        },
        getGift:function () {
            var that = this;
            $.ajax({
                url: basePath + "gift/getGiftAccountData?time="+new Date(),
                type: "GET",
                data: '',
                dataType: "json",
                success: function (rsp) {
                    if(rsp.code == 0) {
                        var data = rsp.body;
                        var product = null;
                        for(var i=0;i<data.length;i++){
                            if(getQueryString('commodityContractId') == data[i].commodityContractId){
                                product = data[i];
                                break;
                            }
                        }
                        var standardUnitMultiple = product.standardUnitMultiple;
                        var deduct = (Number(getQueryString('takeNumber'))*standardUnitMultiple-product.holdCommodityQuantity)>0?product.holdCommodityQuantity:(Number(getQueryString('takeNumber'))*standardUnitMultiple);
                        var mon = (product.lastUnitPrice*Number(getQueryString('takeNumber'))*standardUnitMultiple/100).toFixed(2);
                        var deductionMoney = (product.lastUnitPrice*deduct/100).toFixed(2);
                        that.product = {
                            commodityContractId:product.commodityContractId,
                            type:product.subjectMatter,
                            typeName:product.typeName,
                            lastUnitPrice:(Number(product.lastUnitPrice)/100).toFixed(2),
                            package:getQueryString('takeNumber'),
                            img:that.getImg(product.iconUrl),
                            name:product.commodityName,
                            standardUnitName:product.standardUnitName,
                            number:standardUnitMultiple,
                            unit:product.unit,
                            money:mon,
                            deduction:deduct,
                            expressFee:0.00,
                            cash:(mon-deductionMoney).toFixed(2)
                        }
                    }
                }
            });
        },
        pay:function () {
            if(this.isPaying){
                return;
            }else {
                this.isPaying = true;
            }
            this.checkPassword();
        },
        checkPassword:function () {
            var that = this;
            if(that.hasAddress){
                showLoading();
                var totalMoneyFlag = false;
                if(that.totalMoney > 0){
                    totalMoneyFlag = true;
                }
                $.ajax({
                    url: basePath+'test/pay/produceOrder',
                    type: "POST",
                    data: {
                        commodityContractId:that.product.commodityContractId,
                        applyCommodityStandardUnitQuantity:that.product.package,
                        addresseeName:that.username,
                        addresseeMobilePhone:that.telNumber,
                        proviceFirstStageName:that.proviceFirstStageName,
                        addressCitySecondStageName:that.addressCitySecondStageName,
                        addressCountiesThirdStageName:that.addressCountiesThirdStageName,
                        addressDetailInfo:that.addressDetailInfo,
                        pwd:that.password,
                        totalMoneyFlag : totalMoneyFlag
                    },
                    dataType: "json",
                    success: function (rsp) {
                        var body = rsp.body;
                        hideLoading();
                        if(rsp.code==0){
                            if(null == body || 'undefined' == body){
                                dialogComponent.parentTipDialog = {
                                    show: true,
                                    header: '支付信息',
                                    body: '支付完成！',
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
                                                //TODO 支付成功, 弹出订单支付成功框，显示去首页和去订单详情两个按钮
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
                                                };
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
                                body: '提货付款失败，请前往订单详情页支付',
                                btnText:'确定'
                            };
                            dialogComponent.enterBtn=function () {
                                window.location.href = basePath+'test/pay/deliveryDetails?bizType=DELIVERY&deliveryDetailsId='+body;
                            }
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
                                deliveryOrder.isPaying = false;
                            }
                        }else if(rsp.code==504){
                            dialogComponent.parentTipDialog = {
                                show: true,
                                header: '提货信息',
                                body: '请求超时',
                                btnText:'确定'
                            };
                            deliveryOrder.isPaying = false;
                        }else if(rsp.code=='2020'){
                            that.passwordShow = true;
                            numericKeypadComponent.parentNumericKeypad.show = true;
                            deliveryOrder.isPaying = false;
                        }else if(rsp.code=='2019'){
                            that.passwordShow = true;
                            that.passwordTip = "密码错误,请重试";
                            numericKeypadComponent.parentNumericKeypad.show = true;
                            numericKeypadComponent.parentNumericKeypad.keyWord = [];
                            deliveryOrder.showPassword(numericKeypadComponent.parentNumericKeypad.keyWord);
                            deliveryOrder.isPaying = false;
                        }else{
                            dialogComponent.parentTipDialog = {
                                show: true,
                                header: '提货信息',
                                body: body,
                                btnText:'确定'
                            };
                            dialogComponent.enterBtn=function () {
                                dialogComponent.parentTipDialog.show = false;
                                deliveryOrder.isPaying = false;
                            }
                        }
                    },
                    error:function (err) {
                        hideLoading();
                        deliveryOrder.isPaying = false;
                        toastComponent.parentToastMessage = {
                            show:true,
                            body: '网络超时！',
                            autoHide:true
                        };
                    }
                });
            }else{
                dialogComponent.parentTipDialog = {
                    show:true,
                    header: '消息弹框',
                    body: '还没有收货地址，去设置',
                    btnText:'确定'
                }
                dialogComponent.enterBtn = function () {
                    window.location.href = basePath+'address/address';
                }
            }
        },
        hidePassword:function () {
            this.passwordShow = false;
            numericKeypadComponent.parentNumericKeypad.show = false;
        },
        showPassword:function (arr) {
            var len = arr.length;
            switch(len){
                case 0:
                    this.passwordValue.value1 = '';
                    this.passwordValue.value2 = '';
                    this.passwordValue.value3 = '';
                    this.passwordValue.value4 = '';
                    this.passwordValue.value5 = '';
                    this.passwordValue.value6 = '';
                    break;
                case 1:
                    this.passwordValue.value1 = '*';
                    this.passwordValue.value2 = '';
                    this.passwordValue.value3 = '';
                    this.passwordValue.value4 = '';
                    this.passwordValue.value5 = '';
                    this.passwordValue.value6 = '';
                    this.errorShow = false;
                    break;
                case 2:
                    this.passwordValue.value1 = '*';
                    this.passwordValue.value2 = '*';
                    this.passwordValue.value3 = '';
                    this.passwordValue.value4 = '';
                    this.passwordValue.value5 = '';
                    this.passwordValue.value6 = '';
                    break;
                case 3:
                    this.passwordValue.value1 = '*';
                    this.passwordValue.value2 = '*';
                    this.passwordValue.value3 = '*';
                    this.passwordValue.value4 = '';
                    this.passwordValue.value5 = '';
                    this.passwordValue.value6 = '';
                    break;
                case 4:
                    this.passwordValue.value1 = '*';
                    this.passwordValue.value2 = '*';
                    this.passwordValue.value3 = '*';
                    this.passwordValue.value4 = '*';
                    this.passwordValue.value5 = '';
                    this.passwordValue.value6 = '';
                    break;
                case 5:
                    this.passwordValue.value1 = '*';
                    this.passwordValue.value2 = '*';
                    this.passwordValue.value3 = '*';
                    this.passwordValue.value4 = '*';
                    this.passwordValue.value5 = '*';
                    this.passwordValue.value6 = '';
                    break;
                case 6:
                    this.passwordValue.value1 = '*';
                    this.passwordValue.value2 = '*';
                    this.passwordValue.value3 = '*';
                    this.passwordValue.value4 = '*';
                    this.passwordValue.value5 = '*';
                    this.passwordValue.value6 = '*';
                    break;
            }
            if(len==6){
                this.pay();
                return;
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
            deliveryOrder.isPaying = false;
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
