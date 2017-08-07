/**
 * Created by Administrator on 2017/3/22.
 */
//注册数字键盘
var numericKeypadComponent = new Vue({
    el: '#numericKeypadComponent',
    data: {
        parentNumericKeypad:{
            show:true,
            keyWord:[]
        }
    }
});
$('.numeric-keypad').on('click',function () {
    checkPasswordComponent.showPassword(numericKeypadComponent.parentNumericKeypad.keyWord);
});
var checkPasswordComponent = new Vue({
    el: '#checkPasswordComponent',
    data:{
        passwordTip:'请输入6位纯数字密码',
        forgetPassword:false,
        errorShow:false,
        errorText:'',
        oldPassword:'',
        newPassword:'',
        step:1,
        passwordValue:{
            value1:'',
            value2:'',
            value3:'',
            value4:'',
            value5:'',
            value6:''
        }
    },
    computed:{
    },
    methods:{
        changeMobile:function(){
            window.location.href = basePath+'gift/bindMobile';
        },
        showPassword:function (arr) {
            var len = arr.length;
            switch(len){
                case 1:
                    this.passwordValue.value1 = '*';
                    this.passwordValue.value2 = '';
                    this.passwordValue.value3 = '';
                    this.passwordValue.value4 = '';
                    this.passwordValue.value5 = '';
                    this.passwordValue.value6 = '';
                    this.errorShow = false;
                    break;
                case 2:
                    this.passwordValue.value1 = '*';
                    this.passwordValue.value2 = '*';
                    this.passwordValue.value3 = '';
                    this.passwordValue.value4 = '';
                    this.passwordValue.value5 = '';
                    this.passwordValue.value6 = '';
                    break;
                case 3:
                    this.passwordValue.value1 = '*';
                    this.passwordValue.value2 = '*';
                    this.passwordValue.value3 = '*';
                    this.passwordValue.value4 = '';
                    this.passwordValue.value5 = '';
                    this.passwordValue.value6 = '';
                    break;
                case 4:
                    this.passwordValue.value1 = '*';
                    this.passwordValue.value2 = '*';
                    this.passwordValue.value3 = '*';
                    this.passwordValue.value4 = '*';
                    this.passwordValue.value5 = '';
                    this.passwordValue.value6 = '';
                    break;
                case 5:
                    this.passwordValue.value1 = '*';
                    this.passwordValue.value2 = '*';
                    this.passwordValue.value3 = '*';
                    this.passwordValue.value4 = '*';
                    this.passwordValue.value5 = '*';
                    this.passwordValue.value6 = '';
                    break;
                case 6:
                    this.passwordValue.value1 = '*';
                    this.passwordValue.value2 = '*';
                    this.passwordValue.value3 = '*';
                    this.passwordValue.value4 = '*';
                    this.passwordValue.value5 = '*';
                    this.passwordValue.value6 = '*';
                    break;
            }
            if(len==6){
                if(this.step == 2){
                    this.newPassword = arr;
                    if(this.checkPassword()){
                        this.postPassword();
                    }else{
                        this.errorShow = true;
                        this.errorText = '密码不匹配，请重新输入';
                        this.clearPassword();
                        this.step = 1;
                        this.passwordTip = '请输入6位纯数字密码';
                    }
                    return;
                }else{
                    this.step = 2;
                    this.oldPassword = arr;
                    this.clearPassword();
                    this.passwordTip = '请再输入一次';
                }
            }
        },
        clearPassword:function () {
            numericKeypadComponent.parentNumericKeypad.keyWord = [];
            this.passwordValue={
                value1:'',
                value2:'',
                value3:'',
                value4:'',
                value5:'',
                value6:''
            };
        },
        postPassword:function () {
            var that = this;
            $.ajax({
                url:basePath + 'password/resetPassword',
                type:'POST',
                data:{'pwd':that.newPassword.join("")},
                dataType:'json',
                success:function(response){
                    var data = response.body;
                    dialogComponent.parentTipDialog={
                        show:true,
                        body:'密码重置成功！',
                        btnText:'确定'
                    }
                    setTimeout(function () {
                        window.location.href = basePath+'gift/index';
                    },1500);
                },
                error:function (err) {
                    toastComponent.parentToastMessage = {
                        show:true,
                        body:err,
                        autoHide:true
                    }
                }
            });
        },
        checkPassword:function () {
            return this.oldPassword.toString() == this.newPassword.toString() ? true : false;
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