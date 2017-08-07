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
    setPacket.showPassword(numericKeypadComponent.parentNumericKeypad.keyWord);
});
var setPacket = new Vue({
    el: '#setPacket',
    data:{
        product:{
            commodityContractId:1,
            commodityType:'',
            commodityName:'',
            typeName:'',
            holdCommodityQuantity:0,
            unit:'',
            standardUnitMultiple:0,
            lastUnitPrice:0
        },
        activeIndex:0,
        selectList:[],
        packetNumber:'',
        packetTotal:'',
        packetDesc:'',
        singleTotal:'',
        giftType:1,
        placeholder:'',
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
        var that = this;
        $.ajax({
            url: basePath + "gift/getGiftAccountData?time="+new Date(),
            type: "GET",
            data: '',
            dataType: "json",
            success: function (rsp) {
                if(rsp.code == 0) {
                    var data = rsp.body;
                    var arr = [];
                    for(var i=0;i<data.length;i++){
                        if(Number(data[i].holdCommodityQuantity)>0){
                            arr.push(data[i]);
                        }
                    }
                    that.selectList = arr;
                    if(that.selectList.length==0){
                        dialogComponent.parentTipDialog = {
                            show:true,
                            header: '信息提示',
                            body: '您的账户暂时没有可用礼品，请先购买礼品',
                            btnText:'确定'
                        };
                        dialogComponent.enterBtn = function () {
                            dialogComponent.parentTipDialog.show = false;
                            window.location.href=basePath+'gift/index';
                        }
                        return;
                    }
                    var commodityId = getQueryString('commodityId');
                    if(commodityId!=''&&commodityId){
                        that.activeIndex = Number(commodityId);
                    }else{
                        that.activeIndex = data[0].commodityContractId;
                    }
                    that.changeValue();
                }
            }
        });
    },
    computed:{
        password:function () {
            return numericKeypadComponent.parentNumericKeypad.keyWord.join('');;
        },
        totalNumber:function () {
            if(this.giftType==1){
                return Number(this.packetTotal)>0?this.packetTotal:0;
            }else{
                var total = this.singleTotal*this.packetNumber;
                return Number(total)>0?total:0;
            }
        },
        totalMoney:function () {
            if(this.giftType==1){
                return (this.packetTotal*this.product.lastUnitPrice/100).toFixed(2);
            }else{
                return (this.singleTotal*this.packetNumber*this.product.lastUnitPrice/100).toFixed(2);
            }
        },
        selectText:function () {
            return '['+this.product.typeName+']'+this.product.commodityName;
        }
    },
    methods:{
        changeValue:function () {
            this.getCommodity();
            var commodityType = this.product.typeName;
            if(commodityType.indexOf('白酒')>-1){
                $('body').removeClass().addClass('white-wine');
            }else if(commodityType.indexOf('红酒')>-1){
                $('body').removeClass().addClass('red-wine');
            }else if(commodityType.indexOf('茶')>-1){
                $('body').removeClass().addClass('tea');
            }
        },
        getCommodity:function () {
            var list = this.selectList;
            var index = this.activeIndex;
            for(var i=0;i<list.length;i++){
                if(index==list[i].commodityContractId){
                    this.product= {
                        commodityContractId:list[i].commodityContractId,
                        commodityType: list[i].subjectMatter,
                        typeName:list[i].typeName,
                        commodityName: list[i].commodityName,
                        holdCommodityQuantity: list[i].holdCommodityQuantity,
                        unit: list[i].unit,
                        standardUnitMultiple: list[i].standardUnitMultiple,
                        lastUnitPrice: list[i].lastUnitPrice,
                        standardUnitName:list[i].standardUnitName,
                        commodityTypeCode:list[i].commodityTypeCode
                    };
                    this.packetTotal = '';
                    this.singleTotal = '';
                    this.packetNumber = '';
                    if(list[i].typeName.indexOf('红酒')>-1){
                        this.placeholder = "窖藏红酒，如幽深时光来的老故事";
                    }else if(list[i].typeName.indexOf('茶')>-1){
                        this.placeholder = "茶香中，一颗心慢慢沉静下来";
                    }else if(list[i].typeName.indexOf('白酒')>-1){
                        this.placeholder = "酒醇人美，酒冽情真";
                    }else{
                        this.placeholder = "好东西需与朋友分享";
                    }
                    break;
                }
            }
        },
        changeInput:function () {
            var reg = new RegExp('^[0-9]*$');
            if(!reg.test(this.packetTotal)){
                if(this.packetTotal==''){
                }else{
                    var input = this.packetTotal.toString();
                    var arr = [];
                    for(var i=0;i<input.length;i++){
                        if(!isNaN(input[i])){
                            arr.push(input[i]);
                        }
                    }
                    var str = arr.join('');
                    this.packetTotal = str;
                }
            }
            if(!reg.test(this.singleTotal)){
                if(this.singleTotal==''){
                }else{
                    var input = this.singleTotal.toString();
                    var arr = [];
                    for(var i=0;i<input.length;i++){
                        if(!isNaN(input[i])){
                            arr.push(input[i]);
                        }
                    }
                    var str = arr.join('');
                    this.singleTotal = str;
                }
            }
            if(!reg.test(this.packetNumber)){
                if(this.packetNumber==''){
                }else{
                    var input = this.packetNumber.toString();
                    var arr = [];
                    for(var i=0;i<input.length;i++){
                        if(!isNaN(input[i])){
                            arr.push(input[i]);
                        }
                    }
                    var str = arr.join('');
                    this.packetNumber = str;
                }
            }
        },
        changeType:function () {
            if(this.giftType==1){
                this.giftType = 2;
            }else{
                this.giftType = 1;
            }
            this.packetTotal = '';
            this.singleTotal = '';
            this.packetNumber = '';
        },
        sendPacket:function () {
            var that = this;
            if(that.giftType==1){
                if(that.packetTotal==''){
                    dialogComponent.parentTipDialog={
                        show: true,
                        header: '信息提示',
                        body: '对不起，您设置的总量不能为空',
                        btnText:'确定'
                    }
                    return;
                }
                if(that.packetNumber==''){
                    dialogComponent.parentTipDialog={
                        show: true,
                        header: '信息提示',
                        body: '对不起，您设置的红包个数不能为空',
                        btnText:'确定'
                    }
                    return;
                }
                if(Number(that.packetTotal)==0){
                    dialogComponent.parentTipDialog={
                        show: true,
                        header: '信息提示',
                        body: '对不起，您设置的总量不能为0',
                        btnText:'确定'
                    }
                    return;
                }
                if(Number(that.packetNumber)==0){
                    dialogComponent.parentTipDialog={
                        show: true,
                        header: '信息提示',
                        body: '对不起，您设置的红包个数不能为0',
                        btnText:'确定'
                    }
                    return;
                }
                if(Number(that.packetNumber)>100){
                    dialogComponent.parentTipDialog={
                        show: true,
                        header: '信息提示',
                        body: '对不起，您设置的红包个数不能大于100',
                        btnText:'确定'
                    }
                    return;
                }
                if(Number(that.packetTotal)>Number(that.product.holdCommodityQuantity)){
                    dialogComponent.parentTipDialog={
                        show: true,
                        header: '信息提示',
                        body: '对不起，您设置的总数量不能超过您当前持有的数量，请重新设置',
                        btnText:'确定'
                    }
                    return;
                }
                if(Number(that.packetNumber)>Number(that.packetTotal)){
                    dialogComponent.parentTipDialog={
                        show: true,
                        header: '信息提示',
                        body: '对不起，您设置的红包个数不能超过总数量，请重新设置',
                        btnText:'确定'
                    }
                    return;
                }
                if(Number(that.packetTotal)/Number(that.product.standardUnitMultiple)>Number(that.packetNumber)){
                    dialogComponent.parentTipDialog={
                        show: true,
                        header: '信息提示',
                        body: '对不起，当前每人可领礼包数量超过'+that.product.standardUnitMultiple+that.product.unit+'，请重新设置',
                        btnText:'确定'
                    }
                    return;
                }
            }else{
                if(that.singleTotal==''){
                    dialogComponent.parentTipDialog={
                        show: true,
                        header: '信息提示',
                        body: '对不起，您设置的单个数量不能为空',
                        btnText:'确定'
                    }
                    return;
                }
                if(that.packetNumber==''){
                    dialogComponent.parentTipDialog={
                        show: true,
                        header: '信息提示',
                        body: '对不起，您设置的红包个数不能为空',
                        btnText:'确定'
                    }
                    return;
                }
                if(Number(that.singleTotal)==0){
                    dialogComponent.parentTipDialog={
                        show: true,
                        header: '信息提示',
                        body: '对不起，您设置的单个数量不能为0',
                        btnText:'确定'
                    }
                    return;
                }
                if(Number(that.packetNumber)==0){
                    dialogComponent.parentTipDialog={
                        show: true,
                        header: '信息提示',
                        body: '对不起，您设置的红包个数不能为0',
                        btnText:'确定'
                    }
                    return;
                }
                if(Number(that.packetNumber)>100){
                    dialogComponent.parentTipDialog={
                        show: true,
                        header: '信息提示',
                        body: '对不起，您设置的红包个数不能大于100',
                        btnText:'确定'
                    }
                    return;
                }
                if(Number(that.singleTotal)>Number(that.product.standardUnitMultiple)){
                    dialogComponent.parentTipDialog={
                        show: true,
                        header: '信息提示',
                        body: '对不起，您单个红包的数量不能大于'+that.product.standardUnitMultiple+that.product.unit,
                        btnText:'确定'
                    }
                    return;
                }
                if((Number(that.packetNumber)*Number(that.singleTotal))>Number(that.product.holdCommodityQuantity)){
                    dialogComponent.parentTipDialog={
                        show: true,
                        header: '信息提示',
                        body: '对不起，您设置的总数量不能超过您当前持有的数量，请重新设置',
                        btnText:'确定'
                    }
                    return;
                }
            }
            if(that.packetDesc ==''){
                that.packetDesc =that.placeholder;
            }else{
                var regx = /[\d|A-z|\，\,\.\。\!\！\?\？\u4E00-\u9FFF]+/;
                if(!regx.test(that.packetDesc)){
                    dialogComponent.parentTipDialog={
                        show: true,
                        header: '信息提示',
                        body: '对不起，礼包描述只能输入数字、字母和汉字',
                        btnText:'确定'
                    }
                    return;
                }
            }
            that.postPassword();
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
                this.postPassword();
                return;
            }
        },
        postPassword:function () {
            var that = this;
                $.ajax({
                    url: basePath + "gift/donateGift",
                    type: "POST",
                    data: {
                        "giftCount": that.packetNumber,
                        "giftNum": that.giftType==1?that.packetTotal:that.totalNumber,
                        "giftType": that.giftType,
                        "commodityId": that.product.commodityContractId,
                        "greeting": that.packetDesc,
                        "commodityTypeCode":that.product.commodityTypeCode,
                        "pwd":that.password
                    },
                    dataType: "json",
                    success: function (rsp) {
                        if(rsp.code=='2020'){
                            that.passwordShow = true;
                            numericKeypadComponent.parentNumericKeypad.show = true;
                        }else if(rsp.code=='2019'){
                            that.passwordShow = true;
                            that.passwordTip = "密码错误,请重试";
                            numericKeypadComponent.parentNumericKeypad.show = true;
                            numericKeypadComponent.parentNumericKeypad.keyWord = [];
                            setPacket.showPassword(numericKeypadComponent.parentNumericKeypad.keyWord);
                        }else if(rsp.msgCode) {
                            //包裹红包成功，跳转至准备分享的页面
                            window.location.href = basePath+'gift/sendPacket/' + rsp.commodityGiftInfoId + "/" + rsp.code;
                        }else{
                            dialogComponent.parentTipDialog={
                                show: true,
                                header: '信息提示',
                                body: rsp.errorMsg,
                                btnText:'确定'
                            }
                        }
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
            header: '信息提示',
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