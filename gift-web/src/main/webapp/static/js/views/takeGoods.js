/**
 * Created by Administrator on 2017/3/22.
 */
var takeGoods = new Vue({
    el: '#takeGoods',
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
        inputNumber:'',
        expireTime:'',
        needMore:false
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
                    for (var i = 0; i < data.length; i++) {
                        if (Number(data[i].holdCommodityQuantity) > 0) {
                             var obj= data[i];
                             arr.push(obj);
                        }
                    }
                    that.selectList = arr;
                    var commodityId = getQueryString('commodityId');
                    if(commodityId!=''&&commodityId){
                        that.activeIndex = Number(commodityId);
                    }else{
                        that.activeIndex = data[0].commodityContractId;
                    }
                    takeGoods.getCommodity();
                }
            }
        });
    },
    computed:{
        moreNumber:function () {
            var num = this.inputNumber==''?0:this.inputNumber;
            var max = num*this.product.standardUnitMultiple;
            if(max>this.product.holdCommodityQuantity){
                this.needMore = true;
                return num*this.product.standardUnitMultiple-this.product.holdCommodityQuantity;
            }
            else{
                this.needMore = false;
                return 0;
            }
        },
        moreMoney:function () {
            if(this.needMore){
                var num = this.inputNumber==''?0:this.inputNumber;
                var moreNumber = num*this.product.standardUnitMultiple-this.product.holdCommodityQuantity;
                return (moreNumber*this.product.lastUnitPrice/100).toFixed(2);
            }
            else{
                return 0;
            }
        },
        selectText:function () {
            return '['+this.product.typeName+']'+this.product.commodityName;
        }
    },
    methods:{
        getCommodity:function () {
            var list = this.selectList;
            var index = this.activeIndex;
            var has = false;
            for(var i=0;i<list.length;i++){
                if(index==list[i].commodityContractId){
                    has = true;
                    this.product= {
                        commodityContractId:list[i].commodityContractId,
                        commodityType: list[i].subjectMatter,
                        commodityName: list[i].commodityName,
                        typeName: list[i].typeName,
                        holdCommodityQuantity: list[i].holdCommodityQuantity,
                        unit: list[i].unit,
                        standardUnitMultiple: list[i].standardUnitMultiple,
                        lastUnitPrice: list[i].lastUnitPrice,
                        standardUnitName:list[i].standardUnitName,
                        expireTime:list[i].expireTime
                    }
                    break;
                }
            }
            if(!has){
                this.activeIndex = list[0].commodityContractId;
                this.getCommodity();
            }
        },
        getStock:function () {
            var that = this;
            $.ajax({
                url: basePath + "gift/queryOperaterInfo",
                type: "POST",
                data: {'commodityId': that.product.commodityContractId},
                dataType: "json",
                success: function (rsp) {
                    if (rsp.code == 0) {
                        var data = rsp.body;
                        var availableUnitQuantity = data.availableUnitQuantity;
                        var availableNumber =availableUnitQuantity+that.product.holdCommodityQuantity;
                        var maxNumber = Math.floor(availableNumber/that.product.standardUnitMultiple);
                        if(Number(that.inputNumber)>maxNumber){
                            dialogComponent.parentTipDialog = {
                                show:true,
                                head:'提货信息',
                                body:'您的提货数超出当前库存，请重设提货数量，当前库存为'+maxNumber+that.product.standardUnitName,
                                btnText:'知道了'
                            }
                            return;
                        }else{
                            window.location.href=basePath+'test/pay/deliveryOrder?takeNumber='+that.inputNumber+'&commodityContractId='+that.product.commodityContractId+'&bizType=DELIVERY';
                        }
                    }
                }
            });
        },
        changeValue:function () {
            this.inputNumber='';
            this.getCommodity();
        },
        sellPacket:function () {
            if(this.inputNumber==0){
                dialogComponent.parentTipDialog = {
                    show:true,
                    body:'提货数量不能为0，请重新设置提货数量',
                    btnText:'确定'
                }
                return;
            }
            if(Number(this.inputNumber)>100){
                dialogComponent.parentTipDialog = {
                    show:true,
                    body:'最大提货数量为100，请重新设置提货数量',
                    btnText:'确定'
                }
                return;
            }
            if(this.product.expireTime<(new Date()).getTime()){
                dialogComponent.parentTipDialog = {
                    show:true,
                    body:'已超过提货日期，不能提货',
                    btnText:'确定'
                }
                return;
            }
            if(this.inputNumber.indexOf('+')>-1||this.inputNumber.indexOf('*')>-1||this.inputNumber.indexOf('#')>-1){
                dialogComponent.parentTipDialog = {
                    show:true,
                    body:'提货数量不符合要求，请输入纯数字',
                    btnText:'确定'
                }
                return;
            }
            this.getStock();
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
            alert('ok')
        },
        enterBtn:function () {
            this.parentTipDialog.show = false
        }
    }
});