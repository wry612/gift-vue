/**
 * Created by Administrator on 2017/3/22.
 */
var recommenderDetail = new Vue({
    el: '#recommenderDetail',
    data:{
        recommender:{
            img:'',
            userName:'',
            name:'',
            number:3,
            unit:'',
            price:'',
            state:'',
            remark:''
        }
    },
    computed:{
    },
    beforeMount:function () {
        var that = this;
        var activityPresentId = getQueryString('activityPresentId');
        $.ajax({
            url: basePath + "recommender/getActivityPresent",
            type: "POST",
            data: {'activityPresentId':activityPresentId},
            dataType: "json",
            success: function (rsp) {
                if(rsp.code == 0){
                    var data = rsp.body;
                    that.recommender={
                        img:that.getImg(data.userInfo.headImgPath),
                        userName:data.userInfo.nickname,
                        name: data.commodityVo.commodityName,
                        number:data.activityPresent.quantity,
                        unit:data.commodityVo.unit,
                        price:(data.activityPresent.quantity*data.commodityVo.unitPrice/100).toFixed(2),
                        state:data.activityPresent.status=="PRESENTED"?'已收到':'尚未收到',
                        remark:data.activityPresent.remark
                    };
                }else{
                    dialogComponent.parentTipDialog = {
                        show: true,
                        header: '明细',
                        body: rsp.body,
                        btnText:'确定'
                    };
                }
            }
        });
    },
    methods:{
        getImg:function(fileName){
            return staticPath + "gift/downloadFile?fileName=" + fileName;
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
        },
        enterBtn:function () {
            this.parentTipDialog.show = false
        }
    }
});