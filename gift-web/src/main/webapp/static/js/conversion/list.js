/**
 * Created by Administrator on 2017/3/22.
 */
var list = new Vue({
    el:'#list',
    data:{
        detailUrl:basePath+'conversion/detailPage',
        activityList:[
            {commodityId:1,'type':1,img:staticPath+'/static/images/activity1.jpg',startTime:'2017-06-12',endTime:'2017-06-14',overdue:false},
            {commodityId:2,'type':2,img:staticPath+'/static/images/activity2.jpg',startTime:'2017-06-12',endTime:'2017-06-14',overdue:false},
            {commodityId:3,'type':3,img:staticPath+'/static/images/activity1.jpg',startTime:'2017-06-12',endTime:'2017-06-14',overdue:false},
            {commodityId:4,'type':2,img:staticPath+'/static/images/activity2.jpg',startTime:'2017-06-12',endTime:'2017-06-14',overdue:true}
        ]
    },
    beforeMount:function () {
        var that = this;
        $.ajax({
            url: basePath + "conversion/getList?time="+new Date(),
            type: "GET",
            data: '',
            dataType: "json",
            success: function (rsp) {
                if(rsp.code == 0) {
                    var data = rsp.body;
                    var arr = [];
                    for (var i = 0; i < data.length; i++) {
                        var currTime = new Date().getTime();
                        var obj = {
                            commodityId: data[i].commodityContractId,
                            type:data[i].type,
                            img: that.getImg(data[i].img),
                            startTime: (new Date(data[i].startTime)).format('yyyy-MM-dd'),
                            endTime: (new Date(data[i].endTime)).format('yyyy-MM-dd'),
                            overdue: (data[i].endTime<=currTime)?true:false
                        }
                        arr.push(obj);
                    }
                    that.activityList = arr;
                }
            }
        });
    },
    computed:{

    },
    methods:{
        goUrl:function (overdue,type,index) {
            if(overdue){
                return;
            }else{
                window.location.href = this.detailUrl+'?commodityId='+this.activityList[index].commodityId+'&activityType='+type;
            }
        },
        getImg:function(iconUrl){
            return staticPath +"static/images/view/"+iconUrl;
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
