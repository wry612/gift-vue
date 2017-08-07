/**
 * Created by Administrator on 2017/3/22.
 */
var drawedDetail = new Vue({
    el:'#drawedDetail',
    data:{
        drawTime:'2017年06月13日 08:00:00',
        drawedList:[]
    },
    beforeMount:function () {
        var that = this;
        var convertObjId = getQueryString('convertObjId');
        $.ajax({
            url: basePath + "conversion/queryDrawPeople?convertObjId="+convertObjId+"&type=false",
            type: "POST",
            data: '',
            dataType: "json",
            success: function (rsp) {
                if(rsp.code == 0) {
                    var data = rsp.body;
                    that.drawTime = (new Date(data[0].convertObj.drawTime)).format('yyyy-MM-dd hh:mm:ss');
                    var multiObjDetail = eval(data[0].convertObj.multiObjDetail);
                    for(var i=0;i<multiObjDetail.length;i++){
                        var obj = {
                            prizeLevel:multiObjDetail[i].prizeLevel,
                            prizeNum:multiObjDetail[i].prizeNum,
                            prizeName:multiObjDetail[i].prizeName,
                            price:(multiObjDetail[i].price/100).toFixed(2),
                            list:[]
                        };
                        for(var j=0;j<data.length;j++){
                            var detail = eval(data[j].multiObjDetail);
                            if(detail[0].prizeLevel==multiObjDetail[i].prizeLevel){
                                var userObj =  {
                                    nickName:data[j].nickName,
                                    headImgPath:that.getImg(data[j].headImgPath),
                                    signSeq:data[j].signSeq};
                                obj.list.push(userObj);
                            }
                        }
                        that.drawedList.push(obj);
                    }
                }else{
                    dialogComponent.parentTipDialog = {
                        show: true,
                        header: '中奖信息',
                        body: "查询中奖信息失败",
                        btnText:'确定'
                    };
                }
            },
            error:function(err){
                dialogComponent.parentTipDialog = {
                    show: true,
                    header: '中奖信息',
                    body: "查询中奖信息请求异常",
                    btnText:'确定'
                };
            }
        });
    },
    computed:{

    },
    methods:{
        getImg:function(iconUrl){
            return staticPath + "gift/downloadFile?fileName=" + iconUrl;
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
