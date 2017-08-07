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
    orderConfirm.showPassword(numericKeypadComponent.parentNumericKeypad.keyWord);
});
var orderConfirm = new Vue({
    el:'#orderConfirm',
    data:{
        product:{
            convertObjId:'',//主键
            headImgs:'',//头部图片
            fullName:'',//兑换物品的全称
            marketPrice:'',//市场价
            totalQuantity:'',//总量
            availableQuantity:'',//库存
            alreadyReceive:'',//已兑换 = 总量-库存
            signQuantity:'',//已报名人数
            validDate:'',
            ruleType:'',
            multiObjDetail:[]
        },
        commodityContractId:0,
        isDraw:false,
        conversionTypeText:'',
        hasAddress:false,
        username:'',
        telNumber:'',
        proviceFirstStageName:'',
        addressCitySecondStageName:'',
        addressCountiesThirdStageName:'',
        addressDetailInfo:'',
        isPaying:false,
        hasDefault:false,
        conversionNumber:1,
        conversionText:'',
        btnText:'',
        passwordShow:false,
        passwordTip:'请输入6位兑换密码',
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
        },
        inputText:'',
        prizeShow:false
    },
    beforeMount:function () {
        this.getAddress();
        this.getConvertInfo();
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
                                    that.hasDefault = true;
                                }
                            }
                            if(!that.hasDefault){
                                that.userDeliveryInfoId= data[0].userDeliveryInfoId;
                                that.username = data[0].username;
                                that.telNumber = data[0].telNumber;
                                that.proviceFirstStageName=data[0].proviceFirstStageName;
                                that.addressCitySecondStageName = data[0].addressCitySecondStageName;
                                that.addressCountiesThirdStageName = data[0].addressCountiesThirdStageName;
                                that.addressDetailInfo = data[0].addressDetailInfo;
                                that.hasDefault = false;
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
                            that.hasDefault = false;
                        }
                    }
                }
            });
        },
        getConvertInfo:function () {
            var that = this;
            var convertObjId = getQueryString('convertObjId');
            $.ajax({
                url: basePath + "conversion/detail/"+convertObjId+"?time="+new Date(),
                type: "GET",
                data: '',
                dataType: "json",
                success: function (rsp) {
                    if(rsp.code == 0) {
                        var data = rsp.body;
                        that.product={
                            convertObjId:data.convertObjId,//主键
                            headImgs:that.getImg(data.icon),//头部图片
                            fullName:data.fullName,//兑换物品的全称
                            marketPrice:Number(data.marketPrice)/100,//市场价
                            totalQuantity:data.totalQuantity,//总量
                            availableQuantity:data.availableQuantity,//库存
                            alreadyReceive:data.totalQuantity - data.availableQuantity,//已兑换 = 总量-库存
                            signQuantity:data.signQuantity,//已报名人数
                            validDate:(new Date(data.expireTime)).format('yyyy年MM月dd日'),
                            ruleType:data.ruleType,
                            vrtualOrActual:data.vrtualOrActual,
                            multiObjDetail:eval(data.multiObjDetail)
                        };
                        that.commodityContractId = getQueryString('commodityContractId');
                        that.conversionNumber = getQueryString('conversionNumber');
                        var comodityObjRatio = Number(getQueryString('comodityObjRatio'))*Number(that.conversionNumber);
                        that.conversionTypeText = getQueryString('comodityObjRatio')+getQueryString('conversionTypeText');
                        that.conversionText = comodityObjRatio+getQueryString('conversionTypeText')
                        if(that.product.ruleType =="DRAW"){
                            that.isDraw = true;
                        }
                        if(that.isDraw){
                            that.btnText = '确认参加';
                            // that.checkCanSignUp();
                        }else{
                            that.btnText = '确认兑换';
                        }
                    }
                }
            });
        },
        viewPrize:function () {
            this.prizeShow = true;
        },
        // checkCanSignUp:function(){
        //     var that = this;
        //     var convertObjId = getQueryString('convertObjId');
        //     var commodityContractId = getQueryString('commodityContractId');
        //     $.ajax({
        //         url: basePath + "conversion/checkCanSignUp",
        //         type: "POST",
        //         data: {"convertObjId":convertObjId,"commodityContractId":commodityContractId},
        //         dataType: "json",
        //         success: function (rsp) {
        //             var data = rsp.body;
        //             if(rsp.code == 0) {
        //             }else{
        //                 dialogComponent.parentModalDialog = {
        //                     show: true,
        //                     header: '兑换信息',
        //                     body: '当前兑换方式礼品不足，请补足礼品',
        //                     leftBtnText: '返回首页',
        //                     rightBtnText: '立即补足'
        //                 };
        //                 dialogComponent.leftBtn=function () {
        //                     dialogComponent.parentTipDialog.show = false;
        //                     window.location.href = basePath+'gift/index';
        //                 }
        //                 dialogComponent.rightBtn=function () {
        //                     dialogComponent.parentTipDialog.show = false;
        //                     window.location.href = basePath+'gift/commodityDetails?commodityId='+commodityContractId;
        //                 }
        //             }
        //         }
        //     });
        // },
        pay:function () {
            if(this.isPaying){
                return;
            }else {
                this.isPaying = true;
            }
            this.checkPassword();
        },
        checkPassword:function () {
            //todo 密码
            var that = this;
            if(that.hasAddress){
                showLoading();
                $.ajax({
                    url: basePath + "conversion/order?time="+new Date(),
                    type: "POST",
                    data: {convertObjId:that.product.convertObjId,
                        commodityContractId:that.commodityContractId,
                        convertObjQuantity:that.conversionNumber,
                        addresseeName:that.username,
                        addresseeMobilePhone:that.telNumber,
                        proviceFirstStageName:that.proviceFirstStageName,
                        addressCitySecondStageName:that.addressCitySecondStageName,
                        addressCountiesThirdStageName:that.addressCountiesThirdStageName,
                        addressDetailInfo:that.addressDetailInfo,
                        'remark':that.inputText},
                    dataType: "json",
                    success: function (rsp) {
                        var body = rsp.body;
                        hideLoading();
                        if(rsp.code==0){
                            that.isPaying = false;
                            if(body.length>0){
                                var signSeq = body[0].signSeq;
                                if(body.length>1){
                                    for(var i=1;i<body.length;i++){
                                        signSeq+=','+body[i].signSeq;
                                    }
                                }
                            }else{
                                var signSeq='';
                            }
                            window.location.href = basePath+'conversion/signSuccessPage?convertObjId='+that.product.convertObjId+'&isDraw='+that.isDraw + '&signSeq='+signSeq + '&convertObjOrderId='+body[0].convertObjOrderId + '&orderGroupId='+body[0].orderGroupId;
                        }else{
                            that.isPaying = false;
                            var tips='';
                            if(that.isDraw){
                                tips = "参加失败";
                            }else{
                                tips = body ? body : "兑换失败";
                            }
                            if(null != body){
                                tips = body;
                            }
                            dialogComponent.parentTipDialog = {
                                show: true,
                                body: tips,
                                btnText:'确定'
                            };
                            dialogComponent.enterBtn=function () {
                                window.location.href = basePath+'gift/index';
                            }
                        }
                    },
                    error:function (err) {
                        that.isPaying = false;
                        hideLoading();
                        orderConfirm.isPaying = false;
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
