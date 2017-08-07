/**
 * Created by Administrator on 2017/3/22.
 */
var checkMobile = new Vue({
    el: '#checkMobile',
    data:{
        telNumber:'',
        telCode:'',
        isSending:false,
        codeText:'获取验证码'
    },
    beforeMount:function () {
       /* if('undefined' != countDown && '' != countDown){
            this.isSending = true;
            this.checkInit(countDown);
        }*/
    },
    computed:{
        isOk:function () {
            if(this.telNumber != '' && this.telCode != ''){
                return true;
            }else{
                return false;
            }
        }
    },
    methods:{
        changeMobile:function(){
            window.location.href = basePath+'gift/bindMobile';
        },
        getCode:function () {
            var that = this;
            if(!that.isSending){
                $.ajax({
                    url: basePath+'smsSender/getResetPwdMobileCode',
                    type: "POST",
                    data: {"mobile":that.telNumber},
                    dataType: "json",
                    success: function (rsp) {
                        if (rsp.code == 0) {
                            that.isSending = true;
                            var num =  rsp.body.countDown;
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
                                header: '忘记密码',
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
        check:function () {
            var that = this;
            var mobilePhone = that.telNumber;
            var code = that.telCode;
            var re = new RegExp("^(1)\d{10}$");
            var reCode = new RegExp("^[0-9]{6}$");
            if (!re.test(mobilePhone)){
                dialogComponent.parentTipDialog = {
                    show: true,
                    header: '消息提示',
                    body: '请输入正确的手机号码',
                    btnText:'确定'
                }
                return;
            }
            if (!reCode.test(code)){
                dialogComponent.parentTipDialog = {
                    show: true,
                    header: '消息提示',
                    body: '请输入6位数字验证码',
                    btnText:'确定'
                }
                return;
            }
            $.ajax({
                url: basePath+'password/checkMobile',
                type: "POST",
                data: {"mobile":mobilePhone,"code":code},
                dataType: "json",
                success: function (rsp) {
                    if (rsp.code == 0) {
                            toastComponent.parentToastMessage = {
                                show:true,
                                body:'手机号验证成功',
                                autoHide:true
                            };
                            setTimeout(function(){
                                window.location.href = basePath+'password/setPassword';
                            },1500);
                    }else{
                        dialogComponent.parentTipDialog = {
                            show: true,
                            header: '手机号验证失败',
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

