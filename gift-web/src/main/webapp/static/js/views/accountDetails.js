/**
 * Created by Administrator on 2017/3/22.
 */
var accountDetails = new Vue({
    el:'#accountDetails',
    data:{
        unit:'',
        url:basePath+'gift/commodityDetails?hasGift=true&commodityId=',
        giftList:[]
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
                        if(Number(data[i].holdCommodityQuantity)>0){
                            var mon = Number(data[i].holdCommodityQuantity) * Number(data[i].lastUnitPrice) / 100;
                            var obj = {
                                commodityId: data[i].commodityContractId,
                                type: data[i].subjectMatter,
                                typeName:data[i].typeName,
                                name: data[i].commodityName,
                                number: data[i].holdCommodityQuantity,
                                unit: data[i].unit,
                                money: mon.toFixed(2)
                            }
                            arr.push(obj);
                        }
                    }
                    that.giftList = arr;
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
    computed:{
        // totalNumber:function () {
        //     var list = this.giftList;
        //     var total = 0;
        //     for(var i=0;i<list.length;i++){
        //         total += parseFloat(list[i].number);
        //     }
        //     return total.toFixed(0);
        // },
        totalMoney:function () {
            var list = this.giftList;
            var total = 0;
            for(var i=0;i<list.length;i++){
                total += parseFloat(list[i].money);
            }
            return total.toFixed(2);
        }
    },
    methods:{

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
