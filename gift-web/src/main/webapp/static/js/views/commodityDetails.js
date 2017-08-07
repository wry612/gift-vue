/**
 * Created by Administrator on 2017/3/22.
 */
var mySwiper = null;
var commodityDetails = new Vue({
    el:'#commodityDetails',
    data:{
        commodity:{
            commodityContractId:1,
          //  headImg:'http://wangruoyu.developer.jsdttec.com/static/images/commodity-img1.jpg',
            commodityType:'',
            typeName:'',
            commodityName:'',
            desc:'',
            unit:'',
            standardUnitName:"",
            standardUnitMultiple:'',
            unitPrice:0,
            validDate:''
        },
        imgList:[],
        isShow:false,
        inputNumber:'',
        chooseUnit:'',
        chooseUnitNumber:1,
        hasGift:false,
        commodityStock:1,
        properties:[]
    },
    computed:{
        unitMoney:function () {
            return (this.commodity.standardUnitMultiple*this.commodity.unitPrice).toFixed(2)
        },
        totalMoney:function () {
            if(this.inputNumber==''){
                return '0.00';
            }else{
                var num = 0;
                if(this.chooseUnitNumber==1){
                    num = this.inputNumber*this.commodity.unitPrice;
                }else{
                    num = this.inputNumber*this.commodity.standardPrice;
                }
                return num.toFixed(2);
            }
        },
        stock:function () {
            var max = Math.floor(this.commodityStock/this.chooseUnitNumber);
            return max;
        }
    },
    beforeMount:function () {
        var commodityId = getQueryString("commodityId");
        var that = this;
        $.ajax({
            url: basePath + "buyCommodity/queryCommodityDetail?time="+new Date(),
            type: "POST",
            cache: false,
            data: {'commodityId':commodityId},
            dataType: "json",
            success: function (rsp) {
                if(rsp.code == 0){
                    var data = rsp.body;
                    var picList = [];
                    var introDetailList = [];
                    if(data.picUrl){
                        var picUrl = data.picUrl.split(',');
                        for(var i=0;i<picUrl.length;i++){
                            picList.push({'src':staticPath +"static/images/view/"+picUrl[i]});
                        }
                    }
                    if(data.introDetailLink){
                        var introDetailUrl = data.introDetailLink.split(',');
                        for(var i=0;i<introDetailUrl.length;i++){
                            introDetailList.push({'src':staticPath +"static/images/view/"+introDetailUrl[i]});
                        }
                    }
                    that.commodity={
                        commodityContractId:data.commodityContractId,
                        headImg:that.getImg(data.iconUrl),
                        commodityType:data.subjectMatter,
                        typeName:data.typeName,
                        commodityName:data.commodityName,
                        desc:data.introBrief,
                        unit:data.unit,
                        company:data.company,
                        brand:data.brand,
                        packingType:data.packType,
                        packingSize:data.packSize,
                        standardUnitName:data.standardUnitName,
                        standardUnitMultiple:data.standardUnitMultiple,
                        unitPrice:Number(data.unitPrice)/100,
                        chooseUnitNumber:data.chooseUnitNumber,
                        validDate:(new Date(data.expireTime)).format('yyyy年MM月dd日'),
                        imgList:introDetailList,
                        standardPrice:Number(data.standardPrice)/100
                    }
                    if(data.properties){
                        that.properties = JSON.parse(data.properties);
                    }
                    that.imgList=picList;
                    that.chooseUnit = that.commodity.unit;
                    that.chooseUnitNumber = 1;
                    that.getStock();
                    that.isHasGift();
                    setTimeout(function () {
                        mySwiper = new Swiper('.swiper-container', {
                            pagination: '.swiper-pagination',
                            slidesPerView: 1,
                            loop: true,
                            autoplay:3000
                        });
                    },500);
                }
            }
        });
    },
    methods:{
        getImg:function(iconUrl){
            return staticPath +"static/images/view/"+iconUrl;
        },
        isHasGift:function () {
            var that = this;
            $.ajax({
                url: basePath + "gift/getGiftAccountData?time="+new Date(),
                type: "GET",
                data: '',
                dataType: "json",
                success: function (rsp) {
                    if(rsp.code == 0) {
                        var data = rsp.body;
                        for (var i = 0; i < data.length; i++) {
                            if(data[i].commodityContractId==that.commodity.commodityContractId){
                                if(Number(data[i].holdCommodityQuantity)>0){
                                    that.hasGift = true;
                                }else {
                                    that.hasGift = false;
                                }
                                break;
                            }
                        }
                        if(that.hasGift){
                            $('#sellIn').removeClass('width100');
                        }else{
                            $('#sellIn').addClass('width100');
                        }
                        var needUnitQuantity = getQueryString('needUnitQuantity');
                        if(needUnitQuantity){
                            that.setStandard(needUnitQuantity);
                        }
                    }
                }
            });
        },
        hide:function () {
          this.isShow = false;
          this.isHasGift();
          $('#sellIn').removeClass('gray');
          this.inputNumber = '';
        },
        setStandard:function (number) {
            this.isShow = true;
            this.hasGift = false;
            $('#sellIn').addClass('width100');
            if(number){
                this.inputNumber = number;
            }else{
                this.inputNumber = 1;
            }
            this.getStock();
        },
        minus:function () {
            var num = Number(this.inputNumber);
            if(num>1){
                this.inputNumber = num-1;
            }
        },
        plus:function () {
            var num = Number(this.inputNumber);
            this.inputNumber = num+1;
            if(this.inputNumber>this.stock){
                this.inputNumber = this.stock;
            }
        },
        inputChange:function () {
            var maxUnitMultiple = 100;
            var maxUnit = maxUnitMultiple*this.commodity.standardUnitMultiple;
            var reg = new RegExp('^[0-9]*$');
            if(!reg.test(this.inputNumber)){
                if(this.inputNumber==''){
                }else{
                    var input = this.inputNumber.toString();
                    var arr = [];
                    for(var i=0;i<input.length;i++){
                        if(!isNaN(input[i])){
                            arr.push(input[i]);
                        }
                    }
                    var str = arr.join('');
                    this.inputNumber = str;
                }
            }
            this.getStock();
            if(parseInt(this.inputNumber)==0){
                if(this.stock>0){
                    this.inputNumber = 1;
                }
            }
        },
        getStock:function (callback) {
            var that = this;
            $.ajax({
                url: basePath + "gift/queryOperaterInfo",
                type: "POST",
                data: {'commodityId': that.commodity.commodityContractId},
                dataType: "json",
                success: function (rsp) {
                    if (rsp.code == 0) {
                        var data = rsp.body;
                        that.commodityStock = data.availableUnitQuantity;
                        var maxUnitMultiple = 100;
                        var maxUnit = maxUnitMultiple*that.commodity.standardUnitMultiple;
                        if(that.stock==0){
                            $('#sellIn').addClass('gray');
                        }else {
                            $('#sellIn').removeClass('gray');
                        }
                        if(that.inputNumber>that.stock){
                            that.inputNumber = that.stock;
                        }
                        if(that.chooseUnitNumber==1){
                            if(that.stock>maxUnit){
                                if(that.inputNumber>maxUnit){
                                    that.inputNumber = maxUnit;
                                }
                            }else{
                                if(that.inputNumber>that.stock){
                                    that.inputNumber = that.stock;
                                }
                            }
                        }else{
                            if(that.stock>maxUnitMultiple){
                                if(that.inputNumber>maxUnitMultiple){
                                    that.inputNumber = maxUnitMultiple;
                                }
                            }else {
                                if(that.inputNumber>that.stock){
                                    that.inputNumber = that.stock;
                                }
                            }
                        }
                        if(callback){
                            callback();
                        }
                    }else{
                        if(callback && typeof callback == "function"){
                            dialogComponent.parentTipDialog = {
                                show: true,
                                header: '消息提示',
                                body: rsp.body,
                                btnText:'确定'
                            }
                        }
                    }
                }
            });
        },
        sellInPacket:function () {
            var that =this;
            if(!that.isShow){
                that.setStandard();
            }else{
                that.getStock(function () {
                    if($('#sellIn').hasClass('gray')){
                        return;
                    }
                    if(that.inputNumber==''){
                        dialogComponent.parentTipDialog = {
                            show: true,
                            header: '消息提示',
                            body: '购买数量不能为空',
                            btnText:'确定'
                        };
                        return;
                    }
                    var redirectUrl = getQueryString('redirectUrl');
                    if(redirectUrl){
                        window.location.href = basePath+'test/pay/sellInOrder?commodityId='+that.commodity.commodityContractId+'&quantity='+that.inputNumber+'&quantityType='+(that.chooseUnitNumber==1?1:2)+'&bizType=BUY_COMMODITY'+'&redirectUrl='+redirectUrl;
                    }else{
                        window.location.href = basePath+'test/pay/sellInOrder?commodityId='+that.commodity.commodityContractId+'&quantity='+that.inputNumber+'&quantityType='+(that.chooseUnitNumber==1?1:2)+'&bizType=BUY_COMMODITY';
                    }
                });
            }
        }
    }
});
$('.standard-box').on('click','span',function () {
    var idx = $(this).index();
    $('.standard-box span').removeClass('active');
        commodityDetails.inputNumber=1;
    $(this).addClass('active');
    commodityDetails.getStock();
    if(idx==0){
        commodityDetails.chooseUnit=commodityDetails.commodity.unit;
        commodityDetails.chooseUnitNumber=1;
    }else{
        commodityDetails.chooseUnit=commodityDetails.commodity.standardUnitName;
        commodityDetails.chooseUnitNumber=2;
    }
    if(commodityDetails.inputNumber>commodityDetails.stock){
        commodityDetails.inputNumber = commodityDetails.stock;
    }
    if(commodityDetails.stock==0){
        $('#sellIn').addClass('gray');
    }else {
        $('#sellIn').removeClass('gray');
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
function orientationChange(){
    setTimeout(function () {
        mySwiper.update()
    },500);
}
window.addEventListener("onorientationchange" in window ? "orientationchange" : "resize", orientationChange, false);

