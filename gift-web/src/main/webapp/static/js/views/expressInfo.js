/**
 * Created by Administrator on 2017/3/22.
 */
var expressInfo = new Vue({
    el:'#expressInfo',
    data:{
        expressInfo:{},
        datum:[]
    },
    beforeMount:function () {
        var that = this;
        var expressInfoId = getQueryString('expressInfoId');
        $.ajax({
            url: basePath + "express/expressInfo?expressInfoId="+expressInfoId+"&time="+new Date(),
            type: "GET",
            data: '',
            dataType: "json",
            success: function (rsp) {
                if(rsp.code == 0) {
                    var data = rsp.body;
                    that.expressInfo = data;
                    that.datum = data.data;
                }else{
                    dialogComponent.parentTipDialog = {
                        show: true,
                        header: '消息弹框',
                        body: rsp.msg,
                        btnText:'回首页'
                    };
                    dialogComponent.enterBtn = function () {
                        window.location.href = basePath+'gift/index';
                    };
                }
            }
        });
    },
    computed:{

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
