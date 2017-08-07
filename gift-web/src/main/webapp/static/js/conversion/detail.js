/**
 * Created by Administrator on 2017/3/22.
 */
var selectListComponent = new Vue({
    el:'#selectListComponent',
    data:{
        parentSelectList:{
            show:false,
            bottom:'0',
            header: '请选择兑换方式',
            lists: [],
            activeIndex:-1,
            activeName: '',
            lastIndex:-1
        }
    },
    beforeMount:function () {
        var that = this;
        $.ajax({
            url: basePath + "conversion/findRuleVOByObjId/"+convertObjId+"?time="+new Date(),
            type: "GET",
            data: '',
            dataType: "json",
            success: function (rsp) {
                if(rsp.code == 0) {
                    var data = rsp.body;
                    var rulesList =[];
                    if(data){
                        for(var i=0;i<data.length;i++){
                            var convertRule = {
                                commodityContractId:data[i].commodityContractId,
                                comodityObjRatio:data[i].comodityObjRatio,
                                unit:data[i].commodityContract.unit,
                                commodityName:data[i].commodityContract.commodityName,
                                availableUnitQuantity:data[i].userOwned?data[i].userOwned.availableUnitQuantity:0
                            }
                            rulesList.push(convertRule);
                        }
                        var buzu = [];
                        var zero = [];
                        for(var j=0;j<rulesList.length;j++){
                            if(rulesList[j].availableUnitQuantity==0){
                                zero.push(rulesList.splice(j,1)[0]);
                            }else if(rulesList[j].availableUnitQuantity<rulesList[j].comodityObjRatio){
                                buzu.push(rulesList.splice(j,1)[0]);
                            }
                        }
                        var newList = rulesList.concat(buzu,zero);
                        that.parentSelectList.lists = newList;
                    }
                }else{
                    dialogComponent.parentTipDialog = {
                        show: true,
                        header: '中奖信息',
                        body: "查询以物换物规则详情发生异常",
                        btnText:'确定'
                    };
                }
            },
            error:function(err){

            }
        });
    },
    methods:{
        listHide:function () {
            this.parentSelectList.show = false;
        },
        listShow:function () {
            this.parentSelectList.show = true;
        }
    }
});
$('.list-wrap').on('click','.list-item',function () {
    detail.selectType();
})
var detail = new Vue({
    el:'#detail',
    data:{
        commodity:{
            convertObjId:'',//主键
            headImgs:'',//头部图片
            fullName:'',//兑换物品的全称
            marketPrice:'',//市场价
            totalQuantity:'',//总量
            availableQuantity:'',//库存
            alreadyReceive:'',//已兑换 = 总量-库存
            signQuantity:'',//已报名人数
            validDate:'',
            imgList:'',
            ruleType:'',
            endTime:'',
            startTime:'',
            drawed:'',
            drawTime:''
        },
        imgList:[],
        isDraw:false,
        countdown:{'day': '00',
            'hour': '00',
            'minute': '00',
            'second':'00'},
        conversionTypeText:'',
        conversionNumber:'',
        btnText:'',
        conversionUnitNumber:0,
        availableUnitQuantity:0,
        isOk:false,
        isNumberOk:false,
        isOver:false,
        countClear:null,
        isStart:true,
        processPercent:0,
        waitDraw:false,
        isQualified:false,
        isDisabled:false
    },
    beforeMount:function () {
        this.getDetail();
    },
    computed:{
        isCheck:function () {
            if(this.conversionTypeText!=''){
                return true;
            }else{
                return false;
            }
        }
        //,
        // isDisabled:function () {
        //     var bool = !this.isCheck || !this.isOk || this.isOver;
        //     return bool;
        // }
    },
    methods:{
        getImg:function(iconUrl){
            return staticPath + "gift/downloadFile?fileName=" + iconUrl;
        },
        getDetail:function () {
            var that = this;
            $.ajax({
                url: basePath + "conversion/detail/"+convertObjId+"?time="+new Date(),
                type: "GET",
                data: '',
                dataType: "json",
                success: function (rsp) {
                    if(rsp.code == 0) {
                        var data = rsp.body;
                        var picList = [];
                        var introDetailList = [];
                        if(data.headImgs){
                            var headImgsUrl = data.headImgs.split(',');
                            for(var i=0;i<headImgsUrl.length;i++){
                                picList.push({'src':staticPath +"static/images/view/"+headImgsUrl[i]});
                            }
                        }
                        if(data.introduceImgs){
                            var introDetailUrl = data.introduceImgs.split(',');
                            for(var i=0;i<introDetailUrl.length;i++){
                                introDetailList.push({'src':staticPath +"static/images/view/"+introDetailUrl[i]});
                            }
                        }
                        that.commodity={
                            convertObjId:data.convertObjId,//主键
                            headImgs:that.getImg(data.headImgs),//头部图片
                            fullName:data.fullName,//兑换物品的全称
                            marketPrice:Number(data.marketPrice)/100,//市场价
                            totalQuantity:data.totalQuantity,//总量
                            availableQuantity:data.availableQuantity,//库存
                            alreadyReceive:data.totalQuantity - data.availableQuantity,//已兑换 = 总量-库存
                            signQuantity:data.signQuantity?data.signQuantity:0,//已报名人数
                            signQuantityMax:data.signQuantityMax?data.signQuantityMax:0,//目前最大和最小是同一个值（总人数）
                            surplusNum:(data.signQuantityMax?data.signQuantityMax:0) -(data.signQuantity?data.signQuantity:0),
                            validDate:(new Date(data.expireTime)).format('yyyy年MM月dd日'),
                            imgList:introDetailList,
                            ruleType:data.ruleType,
                            endTime:data.endTime,
                            startTime:data.startTime,
                            drawed:data.drawed,
                            drawTime:(new Date(data.drawTime)).format('yyyy-MM-dd hh:mm:ss'),
                            drawHead:that.getImg(data.headImgs),
                            nickName:'',
                            quanCode:'',
                            headImg:'',
                            remark:'',
                            timeSlotEnd:data.timeSlotEnd,
                            timeSlotBegin:data.timeSlotBegin,
                            timeSlotDraw:data.timeSlotDraw,
                            maxConversionNumber:data.maxConversionDraw
                        };
                        that.imgList=picList;
                        if(that.commodity.ruleType =="DRAW"){
                            that.isDraw = true;
                        }
                        that.isDisabled = false;
                        that.commodity.remark = data.remark!=''?JSON.parse(data.remark):'';
                        if(that.isDraw){
                            that.conversionNumber = '';
                            that.processPercent = (that.commodity.signQuantity/that.commodity.signQuantityMax*100).toFixed(2)+'%';
                            if(data.timeSlotBegin<0){
                                that.isOver=true;
                                that.isQualified = true;
                                that.isStart = false;
                                that.waitDraw = false;
                                that.btnText = '活动未开始';
                                var countdownTime = Math.abs(data.timeSlotBegin);
                                that.countdown = {
                                    'day': GetRTime(countdownTime, 'd'),
                                    'hour': GetRTime(countdownTime, 'h'),
                                    'minute': GetRTime(countdownTime, 'm'),
                                    'second': GetRTime(countdownTime, 's')
                                };
                                clearInterval(that.countClear);
                                that.countClear = setInterval(function() {
                                    countdownTime-=1000;
                                    if(countdownTime<=0){
                                        clearInterval(that.countClear);
                                        that.getDetail();
                                    }
                                    that.countdown = {
                                        'day': GetRTime(countdownTime, 'd'),
                                        'hour': GetRTime(countdownTime, 'h'),
                                        'minute': GetRTime(countdownTime, 'm'),
                                        'second': GetRTime(countdownTime, 's')
                                    };
                                },1000);
                            }else if(data.timeSlotBegin>=0 && 0<=data.timeSlotEnd){
                                that.isStart = true;
                                if(that.commodity.surplusNum==0){
                                    that.isQualified = true;
                                    that.isOver = true;
                                    that.waitDraw = true;
                                    that.btnText = '等待开奖';
                                    var countdownTime = data.timeSlotDraw;
                                    that.countdown = {
                                        'day': GetRTime(countdownTime, 'd'),
                                        'hour': GetRTime(countdownTime, 'h'),
                                        'minute': GetRTime(countdownTime, 'm'),
                                        'second': GetRTime(countdownTime, 's')
                                    };
                                    clearInterval(that.countClear);
                                    that.countClear = setInterval(function() {
                                        countdownTime-=1000;
                                        if(countdownTime<=0){
                                            clearInterval(that.countClear);
                                            that.getDetail();
                                        }
                                        that.countdown = {
                                            'day': GetRTime(countdownTime, 'd'),
                                            'hour': GetRTime(countdownTime, 'h'),
                                            'minute': GetRTime(countdownTime, 'm'),
                                            'second': GetRTime(countdownTime, 's')
                                        };
                                    },1000);

                                }else{
                                    that.isQualified = false;
                                    that.waitDraw = false;
                                    that.isOver = false;
                                    that.btnText = '立即参加';
                                    var countdownTime = data.timeSlotEnd;
                                    that.countdown = {
                                        'day': GetRTime(countdownTime, 'd'),
                                        'hour': GetRTime(countdownTime, 'h'),
                                        'minute': GetRTime(countdownTime, 'm'),
                                        'second': GetRTime(countdownTime, 's')
                                    };
                                    clearInterval(that.countClear);
                                    that.countClear = setInterval(function() {
                                        countdownTime-=1000;
                                        if(countdownTime<=0){
                                            clearInterval(that.countClear);
                                            that.getDetail();
                                        }
                                        that.countdown = {
                                            'day': GetRTime(countdownTime, 'd'),
                                            'hour': GetRTime(countdownTime, 'h'),
                                            'minute': GetRTime(countdownTime, 'm'),
                                            'second': GetRTime(countdownTime, 's')
                                        };
                                    },1000);
                                }
                            }else{
                                that.isOver = true;
                                that.isStart = true;
                                //如果开奖了以及中奖的昵称
                                if(that.commodity.drawed == 'TRUE'){
                                    $.ajax({
                                        url: basePath + "conversion/queryDrawPeople?convertObjId="+convertObjId+"&type=false",
                                        type: "POST",
                                        data: '',
                                        dataType: "json",
                                        success: function (rsp) {
                                            var convertObjVo = rsp.body;
                                            if(rsp.code == 0) {
                                                that.isQualified = true;
                                                that.waitDraw = false;
                                                that.isDisabled = true;
                                                that.btnText = '活动已结束';
                                                var multiObjDetail = eval(convertObjVo[0].convertObj.multiObjDetail);
                                                for(var i=0;i<multiObjDetail.length;i++){
                                                    var has = false;
                                                    for(var j=0;j<convertObjVo.length;j++){
                                                        var detail = eval(convertObjVo[j].multiObjDetail);
                                                        if(detail[0].prizeLevel==multiObjDetail[i].prizeLevel){
                                                            that.commodity.nickName = convertObjVo[j].nickName;
                                                            that.commodity.quanCode = convertObjVo[j].signSeq;
                                                            that.commodity.headImg = that.getImg(convertObjVo[j].headImgPath);
                                                            has = true;
                                                            break;
                                                        }
                                                    }
                                                    if(has){
                                                        break;
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
                                }else{
                                    if(that.commodity.surplusNum>0){
                                        that.isQualified = false;
                                        that.waitDraw = false;
                                        that.btnText = '未到开奖条件';
                                    }else{
                                        that.isQualified = true;
                                        that.waitDraw = true;
                                        that.btnText = '等待开奖';
                                        if(data.timeSlotDraw>0){
                                            var countdownTime = data.timeSlotDraw;
                                            that.countdown = {
                                                'day': GetRTime(countdownTime, 'd'),
                                                'hour': GetRTime(countdownTime, 'h'),
                                                'minute': GetRTime(countdownTime, 'm'),
                                                'second': GetRTime(countdownTime, 's')
                                            };
                                            clearInterval(that.countClear);
                                            that.countClear = setInterval(function() {
                                                countdownTime-=1000;
                                                if(countdownTime<=0){
                                                    clearInterval(that.countClear);
                                                    that.getDetail();
                                                }
                                                that.countdown = {
                                                    'day': GetRTime(countdownTime, 'd'),
                                                    'hour': GetRTime(countdownTime, 'h'),
                                                    'minute': GetRTime(countdownTime, 'm'),
                                                    'second': GetRTime(countdownTime, 's')
                                                };
                                            },1000);
                                        }
                                    }
                                }
                            }
                        }else{
                            that.processPercent = (that.commodity.alreadyReceive/that.commodity.totalQuantity*100).toFixed(2)+'%';
                            if(data.timeSlotBegin<0){
                                that.isOver=true;
                                that.isStart = false;
                                that.btnText = '活动未开始';
                                var countdownTime = Math.abs(data.timeSlotBegin);
                                that.countdown = {
                                    'day': GetRTime(countdownTime, 'd'),
                                    'hour': GetRTime(countdownTime, 'h'),
                                    'minute': GetRTime(countdownTime, 'm'),
                                    'second': GetRTime(countdownTime, 's')
                                };
                                clearInterval(that.countClear);
                                that.countClear = setInterval(function() {
                                    countdownTime-=1000;
                                    if(countdownTime<=0){
                                        clearInterval(that.countClear);
                                        that.getDetail();
                                    }
                                    that.countdown = {
                                        'day': GetRTime(countdownTime, 'd'),
                                        'hour': GetRTime(countdownTime, 'h'),
                                        'minute': GetRTime(countdownTime, 'm'),
                                        'second': GetRTime(countdownTime, 's')
                                    };
                                },1000);
                            }else if(data.timeSlotBegin>=0 && 0<=data.timeSlotEnd){
                                that.isStart = true;
                                if(that.commodity.availableQuantity==0){
                                    that.isOver = true;
                                    that.btnText = '当前商品已兑换完';
                                }else{
                                    that.isOver = false;
                                    that.btnText = '立即兑换';
                                }
                            }else{
                                that.isOver = true;
                                that.isStart = true;
                                that.isDisabled = true;
                                that.btnText = '活动已结束';
                            }
                        }
                        setTimeout(function () {
                            mySwiper = new Swiper('.swiper-container', {
                                pagination: '.swiper-pagination',
                                slidesPerView: 1,
                                loop: true,
                                autoplay:3000
                            });
                        },500);
                    }else{
                        dialogComponent.parentTipDialog = {
                            show:true,
                            body:rsp.body,
                            btnText:'回首页'
                        };
                        dialogComponent.enterBtn = function () {
                            window.location.href = basePath+'gift/index';
                        }
                    }
                }
            });
        },
        selectShow:function () {
            if(this.isOver){
                return;
            }
            selectListComponent.listShow();
        },
        selectType:function () {
            if(selectListComponent.parentSelectList.activeIndex==-1){
                return;
            }
            if (selectListComponent.parentSelectList.lastIndex != selectListComponent.parentSelectList.activeIndex) {
                this.conversionNumber = '';
                this.checkNumber();
                if(this.isDraw){
                    this.btnText = '立即兑换';
                }else{
                    this.btnText = '立即参加';
                }
            }
            this.conversionTypeText = selectListComponent.parentSelectList.comodityObjRatio+selectListComponent.parentSelectList.activeName;
            this.conversionUnitNumber = selectListComponent.parentSelectList.lists[selectListComponent.parentSelectList.activeIndex].comodityObjRatio;
            this.availableUnitQuantity = selectListComponent.parentSelectList.lists[selectListComponent.parentSelectList.activeIndex].availableUnitQuantity;
        },
        checkNumber:function () {
            if(!this.isCheck && !this.isOver){
                this.btnText = '请选择活动参加方式';
                return;
            }
            if(this.conversionNumber == ''){
                this.isOk = false;
                this.isNumberOk = false;
                if(!this.isOver){
                    if (this.isDraw) {
                        this.btnText = '请输入参加次数';
                    }else{
                        this.btnText = '请输入兑换数量';
                    }
                }
                return;
            }else{
                var reCode = new RegExp("^[1-9][0-9]*$");
                if(!reCode.test(Number(this.conversionNumber))){
                    this.btnText = '兑换数量请输入大于0的数字';
                    this.isOk = true;
                    this.isNumberOk = false;
                    return;
                }
            }
            this.isOk = true;
            if (this.isDraw) {
                var needNumber = this.conversionUnitNumber*this.conversionNumber;
                if(needNumber>this.availableUnitQuantity){
                    this.btnText = '持仓不足，请更换兑换方式';
                    this.isNumberOk = false;
                    return;
                }
                if(this.conversionNumber>this.commodity.surplusNum){
                    this.btnText = '剩余参加名额不足，请重新选择参加次数';
                    this.isNumberOk = false;
                    return;
                }
                if(this.conversionNumber>this.commodity.maxConversionNumber){
                    this.btnText = '本次最多参加('+this.commodity.maxConversionNumber+'次)';
                    this.isNumberOk = false;
                    return;
                }
                this.btnText = '立即参加';
            } else {
                var needNumber = this.conversionUnitNumber*this.conversionNumber;
                if(needNumber>this.availableUnitQuantity){
                    this.btnText = '持仓不足，请更换兑换方式';
                    this.isNumberOk = false;
                    return;
                }
                if(this.conversionNumber>this.commodity.availableQuantity){
                    this.btnText = '库存不足，请更换兑换方式';
                    this.isNumberOk = false;
                    return;
                }
                if(this.conversionNumber>this.commodity.maxConversionNumber){
                    this.btnText = '本次最多兑换('+this.commodity.maxConversionNumber+'份)';
                    this.isNumberOk = false;
                    return;
                }
                this.btnText = '立即兑换';
            }
            this.isNumberOk = true;
        },
        goOrder:function () {
            this.checkNumber();
            if(this.isNumberOk && this.isCheck && !this.isOver){
                var that = this;
                $.ajax({
                    url: basePath + "conversion/detail/"+convertObjId+"?time="+new Date(),
                    type: "GET",
                    data: '',
                    dataType: "json",
                    success: function (rsp) {
                        if(rsp.code == 0) {
                            var data = rsp.body;
                            var picList = [];
                            var introDetailList = [];
                            if(data.headImgs){
                                var headImgsUrl = data.headImgs.split(',');
                                for(var i=0;i<headImgsUrl.length;i++){
                                    picList.push({'src':staticPath +"static/images/view/"+headImgsUrl[i]});
                                }
                            }
                            if(data.introduceImgs){
                                var introDetailUrl = data.introduceImgs.split(',');
                                for(var i=0;i<introDetailUrl.length;i++){
                                    introDetailList.push({'src':staticPath +"static/images/view/"+introDetailUrl[i]});
                                }
                            }
                            that.commodity={
                                convertObjId:data.convertObjId,//主键
                                headImgs:that.getImg(data.headImgs),//头部图片
                                fullName:data.fullName,//兑换物品的全称
                                marketPrice:Number(data.marketPrice)/100,//市场价
                                totalQuantity:data.totalQuantity,//总量
                                availableQuantity:data.availableQuantity,//库存
                                alreadyReceive:data.totalQuantity - data.availableQuantity,//已兑换 = 总量-库存
                                signQuantity:data.signQuantity?data.signQuantity:0,//已报名人数
                                signAvailable:(data.signQuantityMin?data.signQuantityMin:0)-data.signQuantity,//剩余报名人数
                                signQuantityMax:data.signQuantityMax?data.signQuantityMax:0,//目前最大和最小是同一个值（总人数）
                                signQuantityMin:data.signQuantityMin?data.signQuantityMin:0,//目前最大和最小是同一个值（总人数）
                                surplusNum:(data.signQuantityMax?data.signQuantityMax:0) -(data.signQuantity?data.signQuantity:0),
                                validDate:(new Date(data.expireTime)).format('yyyy年MM月dd日'),
                                imgList:introDetailList,
                                ruleType:data.ruleType,
                                endTime:data.endTime,
                                startTime:data.startTime,
                                drawed:data.drawed,
                                drawTime:(new Date(data.drawTime)).format('yyyy年MM月dd日 hh-mm-ss'),
                                drawHead:that.getImg(data.headImgs),
                                nickName:'',
                                quanCode:'',
                                remark:''
                            };
                            that.commodity.remark = data.remark!=''?JSON.parse(data.remark):'';
                            that.imgList=picList;
                            that.isDisabled = false;
                            if(that.commodity.ruleType =="DRAW"){
                                that.isDraw = true;
                            }
                            if(that.isDraw){
                                that.processPercent = (that.commodity.signQuantity/that.commodity.signQuantityMax*100).toFixed(2)+'%';
                                that.isNumberOk = true;
                                if(data.timeSlotBegin<0){
                                    that.isOver=true;
                                    that.isQualified = false;
                                    that.isStart = false;
                                    that.btnText = '活动未开始';
                                    var countdownTime = Math.abs(data.timeSlotBegin);
                                    that.countdown = {
                                        'day': GetRTime(countdownTime, 'd'),
                                        'hour': GetRTime(countdownTime, 'h'),
                                        'minute': GetRTime(countdownTime, 'm'),
                                        'second': GetRTime(countdownTime, 's')
                                    };
                                    clearInterval(that.countClear);
                                    that.countClear = setInterval(function() {
                                        countdownTime-=1000;
                                        if(countdownTime<=0){
                                            clearInterval(that.countClear);
                                            that.getDetail();
                                        }
                                        that.countdown = {
                                            'day': GetRTime(countdownTime, 'd'),
                                            'hour': GetRTime(countdownTime, 'h'),
                                            'minute': GetRTime(countdownTime, 'm'),
                                            'second': GetRTime(countdownTime, 's')
                                        };
                                    },1000);
                                }else if(data.timeSlotBegin>=0 && 0<=data.timeSlotEnd){
                                    that.isStart = true;
                                    if(that.commodity.surplusNum==0){
                                        that.isQualified = true;
                                        that.isOver = true;
                                        that.waitDraw = true;
                                        that.btnText = '等待开奖';
                                        var countdownTime = data.timeSlotDraw;
                                        that.countdown = {
                                            'day': GetRTime(countdownTime, 'd'),
                                            'hour': GetRTime(countdownTime, 'h'),
                                            'minute': GetRTime(countdownTime, 'm'),
                                            'second': GetRTime(countdownTime, 's')
                                        };
                                        clearInterval(that.countClear);
                                        that.countClear = setInterval(function() {
                                            countdownTime-=1000;
                                            if(countdownTime<=0){
                                                clearInterval(that.countClear);
                                                that.getDetail();
                                            }
                                            that.countdown = {
                                                'day': GetRTime(countdownTime, 'd'),
                                                'hour': GetRTime(countdownTime, 'h'),
                                                'minute': GetRTime(countdownTime, 'm'),
                                                'second': GetRTime(countdownTime, 's')
                                            };
                                        },1000);
                                    }else{
                                        that.isQualified = false;
                                        that.waitDraw = false;
                                        that.isOver = false;
                                        window.location.href = basePath+'conversion/orderConfirmPage?commodityContractId='
                                            +selectListComponent.parentSelectList.lists[selectListComponent.parentSelectList.activeIndex].commodityContractId
                                            +'&convertObjId='+that.commodity.convertObjId+'&conversionTypeText='+selectListComponent.parentSelectList.activeName+'&conversionNumber=' + that.conversionNumber
                                            +'&comodityObjRatio='+selectListComponent.parentSelectList.comodityObjRatio;
                                    }
                                }else{
                                    that.isOver = true;
                                    that.isStart = true;
                                    //如果开奖了，需要展示谁中奖了，以及中奖的昵称，目前适用于只产生一个奖品
                                    if(that.commodity.drawed == 'TRUE'){
                                        $.ajax({
                                            url: basePath + "conversion/queryDrawPeople?convertObjId="+convertObjId +"&type=false",
                                            type: "POST",
                                            data: '',
                                            dataType: "json",
                                            success: function (rsp) {
                                                var convertObjVo = rsp.body[0];
                                                if(rsp.code == 0) {
                                                    that.isQualified = true;
                                                    that.waitDraw = false;
                                                    that.isDisabled = true;
                                                    that.btnText = '活动已结束';
                                                    that.commodity.nickName = convertObjVo.nickName;
                                                    that.commodity.quanCode = convertObjVo.signSeq;
                                                    that.commodity.headImg = that.getImg(convertObjVo.headImgPath);
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
                                    }else{
                                        if(that.commodity.surplusNum>0){
                                            that.isQualified = false;
                                            that.waitDraw = false;
                                            that.btnText = '未到开奖条件';
                                        }else{
                                            that.isQualified = true;
                                            that.waitDraw = true;
                                            that.btnText = '等待开奖';
                                            if(data.timeSlotDraw>0){
                                                var countdownTime = data.timeSlotDraw;
                                                that.countdown = {
                                                    'day': GetRTime(countdownTime, 'd'),
                                                    'hour': GetRTime(countdownTime, 'h'),
                                                    'minute': GetRTime(countdownTime, 'm'),
                                                    'second': GetRTime(countdownTime, 's')
                                                };
                                                clearInterval(that.countClear);
                                                that.countClear = setInterval(function() {
                                                    countdownTime-=1000;
                                                    if(countdownTime<=0){
                                                        clearInterval(that.countClear);
                                                        that.getDetail();
                                                    }
                                                    that.countdown = {
                                                        'day': GetRTime(countdownTime, 'd'),
                                                        'hour': GetRTime(countdownTime, 'h'),
                                                        'minute': GetRTime(countdownTime, 'm'),
                                                        'second': GetRTime(countdownTime, 's')
                                                    };
                                                },1000);
                                            }
                                        }
                                    }
                                }
                            }else{
                                that.processPercent = (that.commodity.alreadyReceive/that.commodity.totalQuantity*100).toFixed(2)+'%';
                                if(data.timeSlotBegin<0){
                                    that.isOver=true;
                                    that.isStart = false;
                                    that.btnText = '活动未开始';
                                    var countdownTime = Math.abs(data.timeSlotBegin);
                                    that.countdown = {
                                        'day': GetRTime(countdownTime, 'd'),
                                        'hour': GetRTime(countdownTime, 'h'),
                                        'minute': GetRTime(countdownTime, 'm'),
                                        'second': GetRTime(countdownTime, 's')
                                    };
                                    clearInterval(that.countClear);
                                    that.countClear = setInterval(function() {
                                        countdownTime-=1000;
                                        if(countdownTime<=0){
                                            clearInterval(that.countClear);
                                            that.getDetail();
                                        }
                                        that.countdown = {
                                            'day': GetRTime(countdownTime, 'd'),
                                            'hour': GetRTime(countdownTime, 'h'),
                                            'minute': GetRTime(countdownTime, 'm'),
                                            'second': GetRTime(countdownTime, 's')
                                        };
                                    },1000);
                                }else if(data.timeSlotBegin>=0 && 0<=data.timeSlotEnd){
                                    that.isStart = true;
                                    if(that.commodity.availableQuantity==0){
                                        that.isOver = true;
                                        that.btnText = '当前商品已兑换完';
                                    }else{
                                        that.isOver = false;
                                        that.btnText = '立即兑换';
                                        window.location.href = basePath+'conversion/orderConfirmPage?commodityContractId='+selectListComponent.parentSelectList.lists[selectListComponent.parentSelectList.activeIndex].commodityContractId+'&convertObjId='+that.commodity.convertObjId+'&conversionNumber='+that.conversionNumber+'&conversionTypeText='+that.conversionTypeText;
                                    }
                                }else{
                                    that.isOver = true;
                                    that.isStart = true;
                                    that.isDisabled = true;
                                    that.btnText = '活动已结束';
                                }
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
        mySwiper.update()
    },500);
}
window.addEventListener("onorientationchange" in window ? "orientationchange" : "resize", orientationChange, false);