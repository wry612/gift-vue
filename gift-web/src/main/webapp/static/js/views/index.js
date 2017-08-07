/**
 * Created by Administrator on 2017/3/22.
 */
var first = getCookie('isFirst');
var isFirst = (first=='false') ? false : true;
var bannerSwiper = null;
var giftSwiper = null;
var index = new Vue({
    el:'#index',
    data:{
        isFirst:true,
        url:basePath+'gift/commodityDetails?commodityId=',
        giftList:[],
        urlId:'',
        noGift:false,
        maxUnit:100000,
        maxMoneyUnit:10000,
        bannerList:[]
    },
    beforeMount:function () {
        this.isFirst = isFirst;
        var that = this;
        $.ajax({
            url: basePath + "/static/images/queryAdvertisement?time=" + new Date(),
            type: "GET",
            data: '',
            dataType: "json",
            success: function (rsp) {
                if (rsp.code == 0) {
                    var data = rsp.body;
                    for(var i=0;i<data.length;i++){
                        that.bannerList.push({href:data[i].link,src:staticPath+"static/images/advert/"+data[i].icon});
                    }
                    setTimeout(function () {
                        bannerSwiper = new Swiper('#banner', {
                            pagination: '.swiper-pagination',
                            slidesPerView: 1,
                            loop: true,
                            autoplay:3000
                        });
                    },0);
                }
            }
        });
        $.ajax({
            url: basePath + "gift/getGiftAccountData?time="+new Date(),
            type: "GET",
            data: '',
            dataType: "json",
            success: function (rsp) {
                if(rsp.code == 0) {
                    var data = rsp.body;
                    var arr = [];
                    for (var i = 0; i < data.length; i++) {
                        if(Number(data[i].holdCommodityQuantity)>0){
                            var mon = Number(data[i].holdCommodityQuantity) * Number(data[i].lastUnitPrice) / 100;
                            var subjectMatter = data[i].typeName;
                            var iconSrc = '';
                            if(subjectMatter.indexOf('红酒')>-1){
                                iconSrc = staticPath+'/static/images/red-wine.png';
                            }else if(subjectMatter.indexOf('白酒')>-1){
                                iconSrc = staticPath+'/static/images/white-wine.png';
                            }else if(subjectMatter.indexOf('茶')>-1){
                                iconSrc = staticPath+'/static/images/icon-tea.png';
                            }
                            var obj = {
                                commodityId: data[i].commodityContractId,
                                type: subjectMatter,
                                typeName:data[i].typeName,
                                name: data[i].commodityName,
                                number: that.numChange(data[i].holdCommodityQuantity,data[i].standardUnitMultiple),
                                unit: that.changeUnit(data[i].holdCommodityQuantity,data[i].unit,data[i].standardUnitName),
                                money: that.numChange(mon,that.maxMoneyUnit),
                                icon:iconSrc,
                                moneyUnit:Number(mon)>that.maxMoneyUni?'万元':'元'
                            }
                            arr.push(obj);
                        }
                    }
                    that.giftList = arr;
                    if(that.giftList.length==0){
                        that.noGift = true;
                    }else{
                        that.noGift = false;
                        setTimeout(function(){
                            giftSwiper = new Swiper('#gift', {
                                centeredSlides: true,
                                slidesPerView: 'auto',
                                onSlideChangeEnd: function(swiper){
                                    if(that.giftList.length>0){
                                        that.urlId = that.giftList[swiper.activeIndex].commodityId;
                                    }
                                }
                            });
                            that.urlId = that.giftList[giftSwiper.activeIndex].commodityId;
                        },0);
                    }
                }else{
                    dialogComponent.parentTipDialog={
                        show:true,
                        header: '礼包消息',
                        body: '查询用户所属礼包账户发生异常!',
                        btnText:'确定'
                    }
                    dialogComponent.enterBtn = function () {
                        wx.closeWindow();
                    }
                }
            }
        });
    },
    computed:{
    },
    methods:{
        numChange:function (num,standardUnit) {
            if(Number(num)>this.maxUnit){
                return (Number(num)/standardUnit).toFixed(2);
            }else {
                return num;
            }
        },
        changeUnit:function (num,unit,standardUnit) {
            if(Number(num)>this.maxUnit){
                return standardUnit;
            }else {
                return unit;
            }
        },
        showQrcode:function () {
            this.isFirst = true;
        },
        closeQrcode:function () {
            this.isFirst = false;
            setCookie('isFirst','false');
        },
        goUrl:function (url) {
            if(this.giftList.length==0){
                dialogComponent.parentTipDialog={
                    show:true,
                    header: '礼包消息',
                    body: '请先购买礼品哦',
                    btnText:'确定'
                }
            }else{
                if(Number(this.giftList[giftSwiper.activeIndex].number)==0){
                    dialogComponent.parentTipDialog={
                        show:true,
                        header: '礼包消息',
                        body: '请先购买礼品哦',
                        btnText:'确定'
                    }
                }else{
                    window.location.href = url;
                }
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
function orientationChange(){
  setTimeout(function () {
      bannerSwiper.update();
      giftSwiper.update();
  },500);
}
window.addEventListener("onorientationchange" in window ? "orientationchange" : "resize", orientationChange, false);
window.removeEventListener("popstate", goBack);
