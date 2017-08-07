/**
 * Created by Administrator on 2017/3/22.
 */
var sellIn = new Vue({
    el: '#sellIn',
    data:{
        list:[],
        detailUrl:basePath+'gift/commodityDetails?commodityId=',
        typeList:[]
    },
    computed:{
    },
    beforeMount:function () {
        var that = this;
        $.ajax({
            url: basePath + "gift/queryCommodityTypeList?time="+new Date(),
            type: "GET",
            data: '',
            dataType: "json",
            success: function (rsp) {
                if(rsp.code == 0){
                    var data = rsp.body;
                    var arr = [];
                    for(var i=0;i<data.length;i++){
                        var obj = {
                            code:data[i].code,
                            commodityTypeId:data[i].commodityTypeId,
                            name:data[i].name
                        }
                        arr.push(obj);
                    }
                    that.typeList = arr;
                }
            }
        });

        $.ajax({
            url: basePath + "gift/queryCommodityContract",
            type: "POST",
            data: {commodityTypeId:0},
            dataType: "json",
            success: function (rsp) {
                if(rsp.code == 0){
                    var data = rsp.body;
                    var arr = [];
                    for(var i=0;i<data.length;i++){
                        var mon = Number(data[i].standardUnitMultiple)*Number(data[i].unitPrice)/100;
                        var obj = {
                            commodityContractId:data[i].commodityContractId,
                            img:that.getImg(data[i].iconUrl),
                            type:data[i].subjectMatter,
                            typeName:data[i].typeName,
                            name:data[i].commodityName,
                            unit:data[i].unit,
                            standardUnitMultiple:data[i].standardUnitMultiple,
                            standardUnitName:data[i].standardUnitName,
                            unitPrice:Number(data[i].unitPrice)/100,
                            money:mon
                        }
                        arr.push(obj);
                    }
                    that.list = arr;
                }
            }
        });
    },
    updated:function () {
        $('.search-box span').css('width',100/(this.typeList.length+1)+'%');
        $('.search-list .gift-info:even').addClass('no-left');
    },
    methods:{
        getImg:function(iconUrl){
            return staticPath +"static/images/view/"+iconUrl;
        },
        search:function (key) {
            var that = this;
            $.ajax({
                url: basePath + "gift/queryCommodityContract",
                type: "POST",
                data: {commodityTypeId:key},
                dataType: "json",
                success: function (rsp) {
                    if(rsp.code == 0){
                        var data = rsp.body;
                        var arr = [];
                        for(var i=0;i<data.length;i++){
                            var mon = Number(data[i].standardUnitMultiple)*Number(data[i].unitPrice)/100;
                            var obj = {
                                commodityContractId:data[i].commodityContractId,
                                img:that.getImg(data[i].iconUrl),
                                type:data[i].subjectMatter,
                                typeName:data[i].name,
                                name:data[i].commodityName,
                                unit:data[i].unit,
                                standardUnitMultiple:data[i].standardUnitMultiple,
                                standardUnitName:data[i].standardUnitName,
                                unitPrice:Number(data[i].unitPrice)/100,
                                money:mon
                            }
                            arr.push(obj);
                        }
                        that.list = arr;
                    }
                }
            });
        }
    }
});
$('.search-box').on('click','span',function () {
    $('.search-box span').removeClass('active');
    $(this).addClass('active');
    sellIn.search($(this).attr('id'));
})
$('.search-box span').css('width',100/(sellIn.typeList.length+1)+'%');
$('.search-list .gift-info:even').addClass('no-left');
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