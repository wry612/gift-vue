/**
 * Created by Administrator on 2017/8/2.
 */
var userSettings = new Vue({
    el:'#userSettings',
    data:{
        isBind:false,
        mobileData:''
    },
    beforeMount:function () {
        var that = this;
        $.ajax({
            url: basePath + "gift/getUserInfo?time="+new Date(),
            type: "GET",
            data: '',
            dataType: "json",
            success: function (rsp) {
                if (rsp.code == 0) {
                    if(rsp.body.mobilePhone != null && rsp.body.mobilePhone != ''){
                        that.mobileData = rsp.body.mobilePhone;
                        that.isBind=true;
                    }else{
                        that.isBind = false;
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
    computed:{
        mobile:function () {
            return this.mobileData.replace(/(\d{3})\d{4}(\d{4})/, '$1****$2');
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
