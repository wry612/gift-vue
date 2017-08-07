/**
 * Created by Administrator on 2017/3/22.
 */
var $statu = $('.loading-warp .text');
var transactionDetails = new Vue({
    el: '#transactionDetails',
    data: {
        unit: '',
        url1: basePath + 'gift/setPacketDetails/',
        url2: basePath + 'test/pay/sellInDetails?bizType=BUY_COMMODITY&tradeOrderId=',
        url3: basePath + 'gift/getPacketDetails/',
        url4: basePath + 'test/pay/deliveryDetails?bizType=DELIVERY&deliveryDetailsId=',
        url5: basePath + 'conversion/orderDetailPage?convertObjOrderId=',
        url6: basePath + 'conversion/orderDetailPage?isDraw=true&orderGroupId=',
        url7: basePath + 'recommender/recommenderDetail?activityPresentId=',
        typeValue: "",
        typeList: [
            {text: '全部类型', value: ""},
            {text: '发礼包', value: 'GIVE_GIFT'},
            {text: '收礼包', value: 'ACCEPT_GIFT'},
            {text: '提货', value: 'DELIVERY'},
            {text: '买礼品', value: 'BUY_COMMODITY'},
            {text: '活动', value: 'CONVERSION'},
            {text: '赠礼', value: 'DONATE'}
        ],
        productValue: 0,
        productList: [],
        dateValue: '',
        giftList: null,
        subIndex:0
    },
    computed: {},
    beforeMount: function () {
        var that = this;
        $.ajax({
            url: basePath + "gift/queryCommodityTypeList?time="+new Date(),
            type: "GET",
            data: '',
            dataType: "json",
            success: function (rsp) {
                if (rsp.code == 0) {
                    var data = rsp.body;
                    var arr = [{code: 'all', commodityTypeId: 0, name: '全部品种'}];
                    for (var i = 0; i < data.length; i++) {
                        var obj = {
                            code: data[i].code,
                            commodityTypeId: data[i].commodityTypeId,
                            name: data[i].name
                        }
                        arr.push(obj);
                    }
                    that.productList = arr;
                    that.dateValue = (new Date()).format('yyyy-MM');
                    listPage = 1;
                    that.getList(that.typeValue, that.productValue, that.dateValue, listPage);
                    var pullRefresh = $(window).pPullRefresh({
                        $el: $('body'),
                        $loadingEl: $('.loading-warp'),
                        sendData: function () {
                            that.getList(that.typeValue, that.productValue, that.dateValue, listPage);
                        },
                        url: '',
                        autoHide: true,
                        callbacks: {
                            pullStart: function(){
                                $statu.text('松开开始刷新');
                            }
                        }
                    });
                }
            }
        });

    },
    mounted: function () {
        //scroll();
    },
    methods: {
        changeDate: function (num) {
            this.dateValue = GetDateStr(this.dateValue, num);
            listPage = 1;
            this.getList(this.typeValue, this.productValue, this.dateValue, listPage);
        },
        changeType: function () {
            listPage = 1;
            this.getList(this.typeValue, this.productValue, this.dateValue, listPage);
        },
        getList: function (type, product, date, page) {
            var that = this;
            $.ajax({
                url: basePath + "tradeDetail/record",
                type: "POST",
                data: {'bizType': type, 'commodityTypeId': product, "date": date},
                dataType: "json",
                success: function (rsp) {
                    if (rsp.code == 0) {
                        var jsonstr = rsp.body;
                        var data = eval(jsonstr);
                        var arr = [];
                        var orderGroupIdList =[];
                        that.subIndex = 0;
                        for (var i = 0; i < data.length; i++) {
                            var attach = data[i].attach?JSON.parse(data[i].attach):{quantityType:1};
                            var price = 0;
                            var showUnit = '';
                            if(data[i].bizType=='ACCEPT_GIFT'||data[i].bizType=='GIVE_GIFT'){
                                price = data[i].unitPrice;
                                showUnit = data[i].unit;
                            }else{
                                price = attach.quantityType=='1'?data[i].unitPrice:data[i].commodityStandardPrice;
                                showUnit = attach.quantityType=='1'?data[i].unit:data[i].standardUnitName;
                            }
                            var obj = {
                                commodityId:data[i].commodityContractId,
                                commodityTypeId: data[i].commodityTypeId,
                                bizId:data[i].bizId,
                                bizType: data[i].bizType,
                                name: data[i].commodityName,
                                type:data[i].subjectMatter,
                                typeName:data[i].typeName,
                                number: data[i].opCommodityUnitQuantity,
                                operateNum:data[i].operateNum,
                                ruleType:data[i].ruleType,
                                unit: showUnit,
                                money: (data[i].opCommodityUnitQuantity * price/100).toFixed(2),
                                state: data[i].bizType=='ACCEPT_GIFT'?'已领取':data[i].bizStatus,
                                date: (new Date(data[i].createTime)).format('yyyy-MM-dd hh:mm:ss'),
                                status:'',
                                win:'',
                                unitName:data[i].unitName?data[i].unitName:'',
                                orderGroupId:data[i].orderGroupId?data[i].orderGroupId:''
                            }

                            if(data[i].bizType=='GIVE_GIFT'){
                                //发红包的话，查询出红包明细，页面需要展示
                                that.queryCommodityGiftInfo(data[i].bizId,that.subIndex,obj.unit);
                            }

                            if(data[i].ruleType=='DRAW'||  data[i].ruleType=='IMMEDIATE'){
                                obj.money = (Number(data[i].operateNum) * Number(data[i].marketPrice)/100).toFixed(2);
                            }

                            if(obj.orderGroupId!=''){
                                var isHas = false;
                                for(var j=0;j<orderGroupIdList.length;j++){
                                    if(orderGroupIdList[j]==obj.orderGroupId){
                                        isHas = true;
                                        break;
                                    }
                                }
                                if(!isHas){
                                    orderGroupIdList.push(obj.orderGroupId);
                                    if(data[i].ruleType=='DRAW'){
                                        var list = [];
                                        for (var j = 0; j < data.length; j++) {
                                            if(obj.orderGroupId==data[j].orderGroupId){
                                                list.push(data[j]);
                                            }
                                        }
                                        var idx = 0;
                                        var len = 0;
                                        for(var m=0;m<list.length;m++){
                                            if(list[m].win=='TRUE' && list[m].convertStatus=='SUCCESS'){
                                                idx = m;
                                                len++;
                                            }
                                        }
                                        obj.status = list[idx].convertStatus;//ORDER、DRAW、SUCCESS
                                        if(len>0 && len<list.length){
                                            obj.win = 'NOT_ALL';
                                        }else{
                                            obj.win = list[idx].win;//是否中奖
                                        }
                                    }
                                    arr.push(obj);
                                    that.subIndex++;
                                }
                            }else{
                                arr.push(obj);
                                that.subIndex++;
                            }
                        }

                        that.giftList = arr;
                    }else {
                        toastComponent.parentToastMessage = {
                            show:true,
                            body:'数据刷新失败',
                            autoHide:true
                        };
                    }
                }
            });

        },
        queryCommodityGiftInfo:function(commodityGiftInfoId,i,unit){
            var that = this;
            $.ajax({
                url: basePath + "tradeDetail/queryCommodityGiftInfo",
                type: "POST",
                data: {'commodityGiftInfoId': commodityGiftInfoId},
                dataType: "json",
                success: function (rsp) {
                    if (rsp.code == 0) {
                        var num = rsp.body.doneeSurplus;
                        if(num == 0){
                            that.giftList[i].state="已领完";
                        }else{
                            if((new Date()).getTime()>=rsp.body.expiredTime){
                                // that.giftList[i].state="已过期";
                                that.giftList[i].state="已领"+(rsp.body.doneeQuota - rsp.body.doneeSurplus)+"/"+rsp.body.doneeQuota+'个，已退'+rsp.body.commoditySurplusQuantity+unit;
                            }else{
                                that.giftList[i].state="已领"+(rsp.body.doneeQuota - rsp.body.doneeSurplus)+"/"+rsp.body.doneeQuota+'个';
                            }
                        }
                    }else{
                        dialogComponent.parentTipDialog = {
                            show: true,
                            header: '消息提示',
                            body: '查询礼包信息异常',
                            btnText: '确定'
                        };
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
            rightBtnText: '去设置'
        },
        parentTipDialog: {
            show: false,
            header: '消息弹框',
            body: 'asfasf',
            btnText: '确定'
        }
    },
    computed: {},
    methods: {
        leftBtn: function () {
            this.parentModalDialog.show = false;
        },
        rightBtn: function () {
            this.parentModalDialog.show = false;
            window.location.href = basePath + 'setPassword';
        },
        enterBtn: function () {
            this.parentTipDialog.show = false
        }
    }
});

//上拉加载
// var listPage = 1;
// function scroll() {
//     var windowH = $(window).height();
//     var wrapperH = windowH;
//     $('#wrapper').css('height', wrapperH);
//     $('#scrollList').on('scroll', function () {
//         var scrollHeight = $('#scrollList ul').outerHeight() - 50;
//         var scrollTop = $('#scrollList').scrollTop();
//         var fixHeight = $('.fixed').outerHeight();
//         var scroll = wrapperH + scrollTop - fixHeight;
//         if (scroll > scrollHeight) {
//             listPage++;
//             transactionDetails.getList(transactionDetails.typeValue, transactionDetails.productValue, transactionDetails.dateValue, listPage);
//         }
//     });
// }


