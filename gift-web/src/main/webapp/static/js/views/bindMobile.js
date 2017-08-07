/**
 * Created by Administrator on 2017/3/22.
 */
var bindMobile = new Vue({
    el: '#bindMobile',
    data:{
        firstPassword:'',
        secondPassword:'',
        telNumber:'',
        telCode:'',
        codeText:'获取验证码',
        isSending:false,
        bindOver:true
    },
    beforeMount:function () {
        this.getUserInfo();
    },
    computed:{
        isOk:function () {
            if(/*this.firstPassword != '' && this.secondPassword !='' && */this.telNumber != '' && this.telCode != ''){
                return true;
            }else{
                return false;
            }
        }
    },
    methods:{
        getCode:function () {
            var that = this;
            if(!that.isSending){
                $.ajax({
                    url: basePath+'smsSender/getBindMobileCode',
                    type: "POST",
                    data: {"mobile":that.telNumber},
                    dataType: "json",
                    success: function (rsp) {
                        if (rsp.code == 0) {
                            that.isSending = true;
                            var num = rsp.body.countDown;
                            that.codeText = num;
                            window.clearCode = setInterval(function () {
                                num--;
                                that.codeText = num;
                                if(num==0){
                                    that.codeText = '重新发送';
                                    that.isSending = false;
                                    clearInterval(window.clearCode);
                                }
                            },1000);
                        }else{
                            dialogComponent.parentTipDialog = {
                                show: true,
                                header: '获取验证码',
                                body: rsp.body,
                                btnText:'确定'
                            };
                        }
                    },
                    error:function (err){
                        alert("请求错误");
                    }
                });

            }
        },
        checkInit:function(countDown){
            var that = this;
            that.isSending = true;
            var num = countDown;
            that.codeText = num;
            window.clearCode = setInterval(function () {
                num--;
                that.codeText = num;
                if(num==0){
                    that.codeText = '重新发送';
                    that.isSending = false;
                    clearInterval(window.clearCode);
                }
            },1000);
        },
        getUserInfo:function(){
            var that = this;
            $.ajax({
                url: basePath + 'gift/getUserInfo',
                type: "GET",
                data: {},
                dataType: "json",
                success: function (rsp) {
                    if (rsp.code == 0) {
                        if(rsp.body.mobilePhone != null && rsp.body.mobilePhone != ''){
                            that.telNumber = rsp.body.mobilePhone;
                        }else{
                            if('undefined' != countDown && '' != countDown){
                                that.isSending = true;
                                that.checkInit(countDown);
                            }
                        }
                    }else{
                        dialogComponent.parentTipDialog = {
                                    show: true,
                                    header: '消息提示',
                                    body: '请求用户基本信息发生异常',
                                    btnText:'确定'
                                }
                    }
                },
                error:function(err) {
                    dialogComponent.parentTipDialog = {
                        show: true,
                        header: '错误提示',
                        body: '请求服务器失败',
                        btnText: '确定'
                    };
                }
            });
        },
        bind:function () {
            var that = this;
            if(!that.bindOver){
                return;
            }
            var re = new RegExp("^(1)\\d{10}$");
            var reCode = new RegExp("^[0-9]{6}$");
            // if (!reCode.test(that.firstPassword)){
            //     dialogComponent.parentTipDialog = {
            //         show: true,
            //         header: '消息提示',
            //         body: '请输入6位纯数字密码',
            //         btnText:'确定'
            //     }
            //     return;
            // }
            // if (!reCode.test(that.secondPassword)){
            //     dialogComponent.parentTipDialog = {
            //         show: true,
            //         header: '消息提示',
            //         body: '确认密码不符合，请输入6位纯数字密码',
            //         btnText:'确定'
            //     }
            //     return;
            // }
            // if(that.firstPassword!=that.secondPassword){
            //     dialogComponent.parentTipDialog = {
            //         show: true,
            //         header: '消息提示',
            //         body: '两次支付密码输入不一致，请重新输入',
            //         btnText:'确定'
            //     };
            //     that.firstPassword = '';
            //     that.secondPassword = '';
            //     return;
            // }
            if (!re.test(that.telNumber)){
                dialogComponent.parentTipDialog = {
                    show: true,
                    header: '消息提示',
                    body: '请输入正确的手机号码',
                    btnText:'确定'
                }
                return;
            }
            if (!reCode.test(that.telCode)){
                dialogComponent.parentTipDialog = {
                    show: true,
                    header: '消息提示',
                    body: '请输入6位数字验证码',
                    btnText:'确定'
                }
                return;
            }
            that.bindOver = false;
            $.ajax({
                url: basePath+'gift/bindMobile',
                type: "POST",
                data: {"mobile":that.telNumber,'code':that.telCode/*,'password':that.firstPassword*/},
                dataType: "json",
                success: function (rsp) {
                    if (rsp.code == 0) {
                        toastComponent.parentToastMessage = {
                            show:true,
                            body:'手机号绑定成功',
                            autoHide:true
                        };
                        that.bindOver = true;
                        setTimeout(function(){
                            if(null != redirecturl && '' != redirecturl){
                                window.location.href = redirecturl;
                            }else{
                                window.location.href = basePath+'gift/index';
                            }
                        },3000);
                    }else{
                        dialogComponent.parentTipDialog = {
                            show: true,
                            header: rsp.body ? rsp.body : '手机号绑定失败',
                            body: rsp.body,
                            btnText:'确定'
                        };
                        that.bindOver = true;
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

