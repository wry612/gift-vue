/**
 * Created by Administrator on 2017/3/22.
 */
var orderDetail = new Vue({
    el: '#orderDetail',
    data:{
        convertObjOrderDetailInfo: {
            commodityName:'',
            unitPrice:'',
            convertObjOrderId:'',
            convertObjId:'',
            conversionTypeName:'',
            conversionNumber:'',
            money:'',
            drawTime:'',
            limitNumber:0,
            timeStart:'',
            timeMid:'',
            timeSed:'',
            timeEnd:'',
            step:1,
            company:'',
            logisticsId:'',
            state:'',
            vrtualOrActual:'VRTUAL',
            unitName:'',
            doller:[],
            multiObjDetail:[],
            drawedDetail:[]
        },
        username:'',
        telNumber:'',
        proviceFirstStageName:'',
        addressCitySecondStageName:'',
        addressCountiesThirdStageName:'',
        addressDetailInfo:'',
        isDraw:'',
        conversionType:1,
        sellerInfo:null,
        isQuanShow:false,
        expressAll:true
    },
    beforeMount:function () {
        var isDraw = getQueryString('isDraw');
        if(isDraw=='true'){
            this.getDrawDetail();
        }else{
            this.getConversionDetail();
        }
    },
    computed:{
        address:function () {
            return this.proviceFirstStageName+this.addressCitySecondStageName+this.addressCountiesThirdStageName+this.addressDetailInfo;
        }
    },
    methods:{
        getConversionDetail:function () {
            var that = this;
            var convertObjOrderId = getQueryString('convertObjOrderId');
            $.ajax({
                url: basePath + 'conversion/queryConvertObjOrderId',
                type: "POST",
                data: {'convertObjOrderId':convertObjOrderId},
                dataType: "json",
                success: function (rsp) {
                    if(rsp.code == 0){
                        var data = rsp.body;
                        var state = '';
                        that.conversionType = 2;
                        if(data.convertObjOrder.finishTime == '' || null == data.convertObjOrder.finishTime){
                            that.convertObjOrderDetailInfo.step = 1;
                            state = '待发货';
                        }else if(data.convertObjOrder.finishTime != ''){
                            that.convertObjOrderDetailInfo.step = 2;
                            state = '已发货';
                        }
                        that.convertObjOrderDetailInfo={
                            commodityName:data.convertObj.fullName,
                            unitPrice:data.convertObj.marketPrice/100,
                            convertObjOrderId:data.convertObjOrder.convertObjOrderId,
                            convertObjId:data.convertObj.convertObjId,
                            conversionTypeName:data.convertRule.comodityObjRatio + data.commodityVo.unit+ data.commodityVo.commodityName,
                            conversionNumber:data.convertObjOrder.convertObjQuantity,
                            commodityTotalPrice:data.commodityVo.unitPrice*data.convertObjOrder.consumeCommodityQuantity,
                            money:data.convertObjOrder.convertObjQuantity*data.convertObj.marketPrice/100,
                            drawTime:(new Date(data.convertObj.drawTime)).format('yyyy-MM-dd hh:mm:ss'),
                            limitNumber:data.convertObj.totalQuantity,
                            timeStart:(new Date(data.convertObjOrder.orderTime)).format('yyyy-MM-dd hh:mm:ss'),
                            timeMid:(new Date(data.convertObjOrder.deliveryTime)).format('yyyy-MM-dd hh:mm:ss'),
                            timeSed:(new Date(data.convertObjOrder.deliveryTime)).format('yyyy-MM-dd hh:mm:ss'),
                            timeEnd:(new Date(data.convertObjOrder.finishTime)).format('yyyy-MM-dd hh:mm:ss'),
                            step: that.convertObjOrderDetailInfo.step,
                            company:data.convertObjOrder.logisticsOperator,
                            logisticsId:data.convertObjOrder.logisticsOrderId,
                            state:state,
                            vrtualOrActual:data.convertObj.vrtualOrActual,
                            unitName:data.convertObj.unitName,
                            remark:data.convertObjOrder.remark,
                            signSeq:data.convertObjOrder.signSeq,
                            doller:[data.convertObjOrder.signSeq],
                            multiObjDetail:eval(data.convertObj.multiObjDetail),
                            drawedDetail:[],
                            expressInfoId:data.convertObjOrder.expressInfoId?data.convertObjOrder.expressInfoId:''
                        };
                        that.sellerInfo = data.convertObjOrder.sellerDeliveryInfo?JSON.parse(data.convertObjOrder.sellerDeliveryInfo):null;
                        that.username = data.convertObjOrder.addresseeName;
                        that.telNumber = data.convertObjOrder.addresseeMobilePhone;
                        that.proviceFirstStageName=data.convertObjOrder.proviceFirstStageName;
                        that.addressCitySecondStageName = data.convertObjOrder.addressCitySecondStageName;
                        that.addressCountiesThirdStageName = data.convertObjOrder.addressCountiesThirdStageName;
                        that.addressDetailInfo = data.convertObjOrder.addressDetailInfo;
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
        getDrawDetail:function () {
            var that = this;
            var orderGroupId = getQueryString('orderGroupId');
            $.ajax({
                url: basePath + 'conversion/queryAllConvertOrderListByOrderGroupId',
                type: "POST",
                data: {'orderGroupId':orderGroupId},
                dataType: "json",
                success: function (rsp) {
                    if(rsp.code == 0){
                        var idx = 0;
                        var num = 0;
                        for(var i=0;i<rsp.body.length;i++){
                            if(rsp.body[i].convertObjOrder.win =='' || rsp.body[i].convertObjOrder.win == null || rsp.body[i].convertObjOrder.win ==undefined||rsp.body[i].convertObjOrder.win =='NOT_DRAW'||rsp.body[i].convertObjOrder.win == 'TRUE'){
                                idx = i;
                                num++;
                            }
                        }
                        var data = rsp.body[idx];
                        var state = '';
                        that.conversionType = 1;
                        if(data.convertObjOrder.win =='' || data.convertObjOrder.win == null || data.convertObjOrder.win ==undefined){
                            that.convertObjOrderDetailInfo.step = 1;
                            that.isDraw = '';
                            state = '等待开奖';
                        }else if(data.convertObjOrder.win =='FALSE'){
                            that.convertObjOrderDetailInfo.step = 1;
                            that.isDraw = 'false';
                            state = '未中奖';
                        }else if(data.convertObjOrder.win == 'TRUE'){
                            that.convertObjOrderDetailInfo.step = 1;
                            that.isDraw = 'true';
                            state = '已中奖';
                            if(data.convertObjOrder.status =='SUCCESS'){
                                that.convertObjOrderDetailInfo.step = 2;
                                that.isDraw = 'true';
                                if(num==rsp.body.length){
                                    that.expressAll = true;
                                    state = '已发货';
                                }else{
                                    that.expressAll = false;
                                    state = '部分发货';
                                }

                            }
                        }else if(data.convertObjOrder.win == 'NOT_DRAW'){
                            that.convertObjOrderDetailInfo.step = 1;
                            that.isDraw = 'not_draw';
                            state = '不予开奖';
                        }
                        that.convertObjOrderDetailInfo={
                            commodityName:data.convertObj.fullName,
                            unitPrice:data.convertObj.marketPrice/100,
                            convertObjOrderId:data.convertObjOrder.convertObjOrderId,
                            convertObjId:data.convertObj.convertObjId,
                            conversionTypeName:data.convertRule.comodityObjRatio + data.commodityVo.unit+ data.commodityVo.commodityName,
                            conversionNumber:data.convertObjOrder.convertObjQuantity,
                            commodityTotalPrice:data.commodityVo.unitPrice*data.convertObjOrder.consumeCommodityQuantity,
                            money:data.convertObjOrder.convertObjQuantity*data.convertObj.marketPrice/100,
                            drawTime:(new Date(data.convertObj.drawTime)).format('yyyy-MM-dd hh:mm:ss'),
                            limitNumber:data.convertObj.totalQuantity,
                            timeStart:(new Date(data.convertObjOrder.orderTime)).format('yyyy-MM-dd hh:mm:ss'),
                            timeMid:(new Date(data.convertObjOrder.deliveryTime)).format('yyyy-MM-dd hh:mm:ss'),
                            timeSed:(new Date(data.convertObjOrder.deliveryTime)).format('yyyy-MM-dd hh:mm:ss'),
                            timeEnd:(new Date(data.convertObjOrder.finishTime)).format('yyyy-MM-dd hh:mm:ss'),
                            step: that.convertObjOrderDetailInfo.step,
                            company:data.convertObjOrder.logisticsOperator,
                            logisticsId:data.convertObjOrder.logisticsOrderId,
                            state:state,
                            vrtualOrActual:data.convertObj.vrtualOrActual,
                            unitName:data.convertObj.unitName,
                            remark:data.convertObjOrder.remark,
                            signSeq:data.convertObjOrder.signSeq,
                            doller:[],
                            multiObjDetail:eval(data.convertObj.multiObjDetail),
                            drawedDetail:[]
                        };
                        for(var i=0;i<rsp.body.length;i++){
                            that.convertObjOrderDetailInfo.doller.push(rsp.body[i].convertObjOrder.signSeq);
                        }
                        that.sellerInfo = data.convertObjOrder.sellerDeliveryInfo?JSON.parse(data.convertObjOrder.sellerDeliveryInfo):null;
                        that.username = data.convertObjOrder.addresseeName;
                        that.telNumber = data.convertObjOrder.addresseeMobilePhone;
                        that.proviceFirstStageName=data.convertObjOrder.proviceFirstStageName;
                        that.addressCitySecondStageName = data.convertObjOrder.addressCitySecondStageName;
                        that.addressCountiesThirdStageName = data.convertObjOrder.addressCountiesThirdStageName;
                        that.addressDetailInfo = data.convertObjOrder.addressDetailInfo;
                        if(data.convertObjOrder.win == 'TRUE'){
                            that.getDrawed(rsp.body);
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
        getDrawed:function (detail) {
            var that = this;
            $.ajax({
                url: basePath + "conversion/queryDrawPeople?convertObjId="+that.convertObjOrderDetailInfo.convertObjId+"&type=true",
                type: "POST",
                data: '',
                dataType: "json",
                success: function (rsp) {
                    if(rsp.code == 0) {
                        var data = rsp.body;
                        var multiObjDetail = eval(data[0].convertObj.multiObjDetail);
                        for(var i=0;i<multiObjDetail.length;i++){
                            var first = true;
                            for(var j=0;j<data.length;j++){
                                var detail = JSON.parse(data[j].multiObjDetail);
                                if(detail[0].prizeLevel==multiObjDetail[i].prizeLevel){
                                    var obj = {
                                        prizeLevel:multiObjDetail[i].prizeLevel,
                                        prizeNum:multiObjDetail[i].prizeNum,
                                        prizeName:multiObjDetail[i].prizeName,
                                        price:(multiObjDetail[i].price/100).toFixed(2),
                                        signSeq:'',
                                        isFirst:first,
                                        step:1,
                                        expressInfoId:'',
                                        vrtualOrActual:''
                                    };
                                    obj.signSeq =data[j].signSeq;
                                    for(var m=0;m<that.convertObjOrderDetailInfo.doller.length;m++){
                                        if(data[j].signSeq ==that.convertObjOrderDetailInfo.doller[m]){
                                            if(data[j].win == 'TRUE') {
                                                if (data[j].status =='SUCCESS') {
                                                    obj.step = 2;
                                                    obj.vrtualOrActual = data[j].convertObj.vrtualOrActual;
                                                    obj.expressInfoId = data[j].expressInfoId;
                                                }
                                            }
                                            that.convertObjOrderDetailInfo.drawedDetail.push(obj);
                                            first = false;
                                        }
                                    }
                                }
                            }
                        }
                    }else{
                        dialogComponent.parentTipDialog = {
                            show: true,
                            header: '中奖信息',
                            body: "查询中奖信息失败",
                            btnText:'确定'
                        };
                    }
                },
                error:function(err){
                    dialogComponent.parentTipDialog = {
                        show: true,
                        header: '中奖信息',
                        body: "查询中奖信息请求异常",
                        btnText:'确定'
                    };
                }
            });
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
