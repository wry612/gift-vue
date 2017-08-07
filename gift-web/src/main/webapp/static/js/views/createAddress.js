/**
 * Created by Administrator on 2017/3/22.
 */
var check = true;
var createAddress = new Vue({
    el: '#createAddress',
    data:{
        title:'',
        isAdd:true,
        userDeliveryInfo:{
            userDeliveryInfoId:'',
            username:'',
            telNumber:'',
            proviceFirstStageName:'',
            addressCitySecondStageName:'',
            addressCountiesThirdStageName:'',
            addressDetailInfo:'',
            isDefault:false
        },
        saveInfo:null
    },
    computed:{
    },
    beforeMount:function () {
        var that = this;
        var id = getQueryString('userDeliveryInfoId');
        if(id){
            that.isAdd = false;
            that.title='编辑地址';
            $.ajax({
                url: basePath + "address/queryUserDeliveryInfo",
                type: "POST",
                data: {'userDeliveryInfoId':id},
                dataType: "json",
                success: function (rsp) {
                    if (rsp.code == 0) {
                        var data = rsp.body;
                        that.userDeliveryInfo = {
                            userDeliveryInfoId:data.userDeliveryInfoId,
                            username:data.username,
                            telNumber:data.telNumber,
                            proviceFirstStageName:data.proviceFirstStageName,
                            addressCitySecondStageName:data.addressCitySecondStageName,
                            addressCountiesThirdStageName:data.addressCountiesThirdStageName,
                            addressDetailInfo:data.addressDetailInfo,
                            isDefault:(!data.isDefault||data.isDefault=='false') ? false: true
                        };
                        var option = {
                            province:data.proviceFirstStageName,
                            city:data.addressCitySecondStageName,
                            district:data.addressCountiesThirdStageName
                        };
                        $('#distpicker').distpicker(option);
                        that.saveInfo = $.extend(true,{},that.userDeliveryInfo);
                    }
                }
            });
        }else{
            this.title='新建地址';
        }
        that.saveInfo = $.extend(true,{},that.userDeliveryInfo);
    },
    mounted:function () {
        var id = getQueryString('userDeliveryInfoId');
        if(!id){
            $('#distpicker').distpicker({'province':"省市",'city':"市区",'district':"区县"});
        }
    },
    methods:{
        save:function () {
            localStorage.refresh = true;
            this.saveAddress();
        },
        proviceChange:function () {
            this.userDeliveryInfo.addressCitySecondStageName = '';
            this.userDeliveryInfo.addressCountiesThirdStageName = '';
        },
        saveAddress:function () {
            var that = this;
            if(that.userDeliveryInfo.username==''){
                dialogComponent.parentTipDialog = {
                    show: true,
                    header: '消息提示',
                    body: '收件人不能为空',
                    btnText:'确定'
                };
                return;
            }else{
               var reg= new RegExp('^[\u4E00-\u9FA5A-Za-z0-9]+$');
               if(!reg.test(that.userDeliveryInfo.username)){
                   dialogComponent.parentTipDialog = {
                       show: true,
                       header: '消息提示',
                       body: '收件人不能含有非法字符',
                       btnText:'确定'
                   };
                   return;
               }
            }
            if(that.userDeliveryInfo.telNumber==''){
                dialogComponent.parentTipDialog = {
                    show: true,
                    header: '消息提示',
                    body: '手机号码不能为空',
                    btnText:'确定'
                }
                return;
            }else {
                var re = new RegExp("^1[0-9]*$");
                if (!re.test(that.userDeliveryInfo.telNumber) || that.userDeliveryInfo.telNumber.length!=11) {
                    dialogComponent.parentTipDialog = {
                        show: true,
                        header: '消息提示',
                        body: '请输入正确的手机号码',
                        btnText:'确定'
                    }
                    return;
                }
            }
            if(that.userDeliveryInfo.proviceFirstStageName==''||that.userDeliveryInfo.proviceFirstStageName=='省市'||that.userDeliveryInfo.proviceFirstStageName==undefined){
                dialogComponent.parentTipDialog = {
                    show: true,
                    header: '消息提示',
                    body: '省市不能为空',
                    btnText:'确定'
                }
                return;
            }
            if(that.userDeliveryInfo.addressCitySecondStageName==''||that.userDeliveryInfo.addressCitySecondStageName=='市区'||that.userDeliveryInfo.addressCitySecondStageName==undefined){
                dialogComponent.parentTipDialog = {
                    show: true,
                    header: '消息提示',
                    body: '市区不能为空',
                    btnText:'确定'
                }
                return;
            }
            if(that.userDeliveryInfo.addressCountiesThirdStageName==''||that.userDeliveryInfo.addressCountiesThirdStageName=='区县'||that.userDeliveryInfo.addressCountiesThirdStageName==undefined){
                if($('#countiesThirdStageName').children().length>1){
                    dialogComponent.parentTipDialog = {
                        show: true,
                        header: '消息提示',
                        body: '区县不能为空',
                        btnText:'确定'
                    }
                    return;
                }
            }
            if(that.userDeliveryInfo.addressDetailInfo==''){
                dialogComponent.parentTipDialog = {
                    show: true,
                    header: '消息提示',
                    body: '详细地址不能为空',
                    btnText:'确定'
                }
                return;
            }else{
                var reg= new RegExp('^[\u4E00-\u9FA5A-Za-z0-9_()（）]+$');
                if(!reg.test(that.userDeliveryInfo.addressDetailInfo)){
                    dialogComponent.parentTipDialog = {
                        show: true,
                        header: '消息提示',
                        body: '详细地址不能含有非法字符',
                        btnText:'确定'
                    };
                    return;
                }
            }
            if(that.userDeliveryInfo.addressDetailInfo.length<5){
                dialogComponent.parentTipDialog = {
                    show: true,
                    header: '消息提示',
                    body: '详细地址不少于5个字，请填写更详细的地址',
                    btnText:'确定'
                }
                return;
            }
            var ajaxUrl = null;
            if(that.isAdd){
                ajaxUrl = basePath + "address/insertAddress?time="+new Date();
            }else{
                ajaxUrl = basePath + "address/updateAddress?time="+new Date();
            }
            $.ajax({
                url: ajaxUrl,
                type: "POST",
                data: that.userDeliveryInfo,
                dataType: "json",
                success: function (rsp) {
                    if (rsp.code == 0) {
                        localStorage.check = false;
                        check = false;
                        if(localStorage.refresh && localStorage.refresh == 'true'){
                            window.location.href=basePath+'address/address';
                        }else{
                            window.history.go(-2);
                        }
                    }else{alert(1)
                        dialogComponent.parentTipDialog = {
                            show: true,
                            header: '地址信息',
                            body: rsp.body,
                            btnText:'确定'
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
            rightBtnText: '确定'
        },
        parentTipDialog: {
            show: false,
            header: '消息弹框',
            body: '消息弹框内容！',
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