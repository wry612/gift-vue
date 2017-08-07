/**
 * Created by Administrator on 2017/3/22.
 */
var address = new Vue({
    el: '#address',
    data:{
        isSetting:true,
        defaultSelect:0,
        addressList:[]
    },
    beforeMount:function () {
        this.updateAddress();
    },
    computed:{
    },
    methods:{
        updateAddress:function () {
            var that= this;
            $.ajax({
                url: basePath + "address/queryUserDeliveryInfoList?time="+new Date(),
                type: "POST",
                data: '',
                dataType: "json",
                success: function (rsp) {
                    if (rsp.code == 0) {
                        var data = rsp.body;
                        var arr = [];
                        for (var i = 0; i < data.length; i++) {
                            var obj = {
                                userDeliveryInfoId: data[i].userDeliveryInfoId,
                                telNumber: data[i].telNumber,
                                username: data[i].username,
                                address: data[i].proviceFirstStageName+data[i].addressCitySecondStageName+data[i].addressCountiesThirdStageName+data[i].addressDetailInfo,
                                isDefault:data[i].isDefault
                            }
                            if(data[i].isDefault =="true" || data[i].isDefault ==true){
                                that.defaultSelect = data[i].userDeliveryInfoId;
                            }
                            arr.push(obj);
                        }
                        that.addressList = arr;
                        if(that.addressList.length==0){
                            that.isSetting = false;
                        }else{
                            that.isSetting = true;
                        }
                    }
                }
            });
        },
        changeDefaultLi:function (e) {
            var that = this;
            var index = 0;
            that.defaultSelect = $(e.srcElement).parents('li').find('input[type="radio"]').attr('id');
            for(var i=0;i<that.addressList.length;i++){
                if(that.defaultSelect == that.addressList[i].userDeliveryInfoId){
                    that.addressList[i].isDefault=true;
                    index = i;
                }
            }
            $.ajax({
                url: basePath + "address/updateAddress",
                type: "POST",
                data: that.addressList[index],
                dataType: "json",
                success: function (rsp) {
                    if (rsp.code == 0) {
                        console.log('change default address success!');
                    }
                }
            });
        },
        changeDefault:function () {
            var that = this;
            var index = 0;
            for(var i=0;i<that.addressList.length;i++){
                if(that.defaultSelect == that.addressList[i].userDeliveryInfoId){
                    that.addressList[i].isDefault=true;
                    index = i;
                }
            }
            $.ajax({
                url: basePath + "address/updateAddress",
                type: "POST",
                data: that.addressList[index],
                dataType: "json",
                success: function (rsp) {
                    if (rsp.code == 0) {
                        console.log('change default address success!');
                    }
                }
            });
        },
        createAddress:function () {
            window.location.href = basePath+'address/createAddress';
        },
        deleteAddress:function (id) {
            var that = this;
            dialogComponent.parentModalDialog = {
                show: true,
                header: '提示信息',
                body: '确定删除当前选中的地址？',
                leftBtnText: '取消',
                rightBtnText: '确定'
            };
            dialogComponent.rightBtn=function () {
                dialogComponent.parentModalDialog.show = false;
                $.ajax({
                    url: basePath + "address/deleteUserDeliveryInfo",
                    type: "POST",
                    data:{'userDeliveryInfoId':id},
                    dataType: "json",
                    success: function (rsp) {
                        if (rsp.code == 0) {
                            dialogComponent.parentTipDialog.show = false
                            that.updateAddress();
                        }
                    }
                });
            };
        },
        editAddress:function (id) {
            window.location.href = basePath+'address/createAddress?userDeliveryInfoId='+id;
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
