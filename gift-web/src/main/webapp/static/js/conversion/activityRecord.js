/**
 * Created by Administrator on 2017/3/22.
 */
var activityRecord = new Vue({
    el:'#activityRecord',
    data:{
        recordList:[],
        signSeqFirst:''
    },
    beforeMount:function () {
        var that = this;
        var convertObjId = getQueryString("convertObjId");
        $.ajax({
            url: basePath + "conversion/queryConvertObjOrderList?convertObjId="+convertObjId,
            type: "POST",
            data: '',
            dataType: "json",
            success: function (rsp) {
                if(rsp.code == 0) {
                    var data = rsp.body;
                    var arr = [];
                    if(null != data){
                        var len = 0;
                        if(data.length>10){
                            len = 10;
                        }else{
                            len = data.length;
                        }
                        for(var i=0;i<len;i++){
                            var obj = {
                                commodityId: data[i].commodityContractId,
                                name: data[i].nickName,
                                orderTime: (new Date(data[i].orderTime)).format('MM/dd hh:mm:ss.S'),
                                signSeq:data[i].signSeq?data[i].signSeq:''
                            };
                            arr.push(obj);
                        }
                        that.recordList = arr;
                        if(data.length>0){
                            that.signSeqFirst = data[data.length-1].signSeq;
                        }
                    }
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
        },
        enterBtn:function () {
            this.parentTipDialog.show = false
        }
    }
});