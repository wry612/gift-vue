/**
 * Created by Administrator on 2017/3/22.
 */
var first = getCookie('isFirst');
var isFirst = (first=='false') ? false : true;
var getPacket = new Vue({
    el: '#getPacket',
    data:{
        detailUrl:basePath+'gift/commodityDetails?commodityId=',
        isOpen:false,
        packetFlag:1,
        isFirst:true,
        canOpen:true,
        overDate:false,
        getOver:false,
        tip:'',
        packet:{
            commodityId:1,
            type:1,
            name:'',
            commodityMatter:'',
            img:'',
            commodityName:'',
            desc:'',
            commodityUnitName:'',
            number:0,
            money:0,
            receive:0,
            doneeQuota:0,
            receiveNumber:0,
            commodityTotalQuantity:0,
            packetList:[
                {img:'',name:'',time:'',product:'',number:''}
            ]
        },
        isGetPacket:false
    },
    computed:{
        bgClass:function () {
            var commodityMatter = this.packet.typeName;
            if(commodityMatter.indexOf('白酒')>-1){
                return {tea:false,"white-wine":true,"red-wine":false}
            }else if(commodityMatter.indexOf('红酒')>-1){
                return {tea:false,"white-wine":false,"red-wine":true}
            }else if(commodityMatter.indexOf('茶')>-1){
                return {tea:true,"white-wine":false,"red-wine":false}
            }
        }
    },
    beforeCreate:function () {
        this.isFirst = isFirst;
        var giftInfoId =  $('#giftInfoId').val();
        var giftInfoCode = $('#giftInfoCode').val();
        var that = this;
        $.ajax({
            url:basePath+'gift/status/'+giftInfoId+'/'+giftInfoCode+"?time="+new Date(),
            data:'',
            type:'GET',
            dataType:'json',
            success:function(response){
                var code = response.code;
                switch (code){
                    // case "1007":
                    //     dialogComponent.parentTipDialog={
                    //         show:true,
                    //         header:'礼包信息',
                    //         body:response.msg,
                    //         btnText:'确定'
                    //     }
                    //     dialogComponent.enterBtn=function () {
                    //         wx.closeWindow();
                    //     };
                    //     break;
                    case "1001":
                        var data = response.body;
                        that.queryPacket('query',function () {
                            that.packet.img= that.getImg(data.headImgPath);
                            that.packet.name= data.nickname;
                            that.canOpen = false;
                            that.overDate = true;
                            if(that.packet.receive==that.packet.doneeQuota){
                                that.tip = '手慢了，礼包派完了';
                            }else{
                                that.tip = '礼包已过期';
                            }
                            $('.packet-wrap').show();
                        });
                        break;
                    case '1002':
                        var data = response.body;
                        that.packet.img= that.getImg(data.headImgPath);
                        that.packet.name= data.nickname;
                        that.canOpen = false;
                        that.getOver = true;
                        that.tip = '手慢了，礼包派完了';
                        $('.packet-wrap').show();
                        break;
                    case '1008':
                        dialogComponent.parentTipDialog={
                            show:true,
                            header:'礼包信息',
                            body:'礼包已指定受赠人,无权限操作'
                        }
                        dialogComponent.enterBtn=function () {
                            wx.closeWindow();
                        };
                        $('.packet-wrap').show();
                        break;
                    case '1010':
                        var data = response.body;
                        that.packetFlag = 3;
                        $('body').addClass('bg-white');
                        that.isOpen = true;
                        var list = [];
                        var unit = data.unit;
                        if(data.selfGrabInfo){
                            that.isGetPacket = true;
                            myself = {
                                img:that.getImg(data.selfGrabInfo.headImg),
                                name:data.selfGrabInfo.nickname,
                                time:timeToDate(data.selfGrabInfo.grabTime),
                                commodityName:data.commodityName,
                                number:data.selfGrabInfo.grabQtn.toString()+unit
                            };
                            list.push(myself);
                        }else {
                            that.isGetPacket = false;
                        }
                        var othersGrabInfoList = data.othersGrabInfoList;
                        for(var i=0;i<othersGrabInfoList.length;i++){
                            var item = {
                                img:that.getImg(othersGrabInfoList[i].headImg),
                                name:othersGrabInfoList[i].nickname,
                                time:timeToDate(othersGrabInfoList[i].grabTime),
                                commodityName:data.commodityName,
                                number:othersGrabInfoList[i].grabQtn+data.unit
                            }
                            list.push(item);
                        }
                        that.packet = {
                            commodityId:data.commodityId,
                            type:1,
                            name:data.nickname,
                            commodityMatter:data.commodityMatter,
                            typeName:data.typeName,
                            img:that.getImg(data.headImg),
                            desc:data.greeting,
                            commodityName:data.commodityName,
                            commodityUnitName:data.unit,
                            number:data.selfGrabInfo.grabQtn,
                            money:(Number(data.commodityPrice)*Number(data.selfGrabInfo.grabQtn)/100).toFixed(2),
                            receive:Number(data.doneeQuota)-Number(data.doneeSurplus),
                            doneeQuota:data.doneeQuota,
                            receiveNumber:Number(data.commodityTotalQuantity)-Number(data.commoditySurplusQuantity),
                            commodityTotalQuantity:data.commodityTotalQuantity,
                            packetList:list
                        };
                        break;
                    case "1011":
                        var data = response.body;
                        that.packet.name = data.donatorNickname;
                        that.packet.img = that.getImg(data.donatorHeadImg);
                        that.packet.desc = data.greeting;
                        $('.packet-wrap').show();
                        break;
                }
            }
        });
    },
    methods:{
        queryPacket:function (isCall,callBack) {
            var giftInfoId =  $('#giftInfoId').val();
            var giftInfoCode = $('#giftInfoCode').val();
            var that = this;
            $.ajax({
                url:basePath+'gift/detail/'+giftInfoId+'/'+giftInfoCode,
                data:'',
                type:'POST',
                dataType:'json',
                success:function(response){
                    // if(response.code == '1007'){
                    //     dialogComponent.parentTipDialog={
                    //         show:true,
                    //         header:'礼包信息',
                    //         body:response.msg,
                    //         btnText:'确定'
                    //     }
                    //     dialogComponent.enterBtn=function () {
                    //         wx.closeWindow();
                    //     }
                    // }else{
                        var data = response.body;
                        dialogComponent.parentTipDialog.show = false;
                        var list = [];
                        var myself = {};
                        var unit = data.unit;
                        if(data.selfGrabInfo){
                            myself = {
                                img:that.getImg(data.selfGrabInfo.headImg),
                                name:data.selfGrabInfo.nickname,
                                time:timeToDate(data.selfGrabInfo.grabTime),
                                commodityName:data.commodityName,
                                number:data.selfGrabInfo.grabQtn.toString()+unit
                            };
                            list.push(myself);
                        }else {
                            that.isGetPacket = false;
                        }
                        var othersGrabInfoList = data.othersGrabInfoList;
                        for(var i=0;i<othersGrabInfoList.length;i++){
                            var item = {
                                img:that.getImg(othersGrabInfoList[i].headImg),
                                name:othersGrabInfoList[i].nickname,
                                time:timeToDate(data.othersGrabInfoList[i].grabTime),
                                commodityName:data.commodityName,
                                number:othersGrabInfoList[i].grabQtn+data.unit
                            }
                            list.push(item);
                        }
                        var num = data.selfGrabInfo?data.selfGrabInfo.grabQtn:0;
                        that.packet = {
                            commodityId:data.commodityId,
                            type:1,
                            commodityMatter:data.commodityMatter,
                            typeName:data.typeName,
                            name:data.nickname,
                            img:that.getImg(data.headImg),
                            desc:data.greeting,
                            commodityName:data.commodityName,
                            commodityUnitName:data.unit,
                            number:num,
                            money:(Number(data.commodityPrice)*Number(num)/100).toFixed(2),
                            receive:Number(data.doneeQuota)-Number(data.doneeSurplus),
                            doneeQuota:data.doneeQuota,
                            receiveNumber:Number(data.commodityTotalQuantity)-Number(data.commoditySurplusQuantity),
                            commodityTotalQuantity:data.commodityTotalQuantity,
                            packetList:list
                        };
                        if(isCall=='query'){
                            if(data.selfGrabInfo){
                                that.isGetPacket = true;
                                that.packetFlag = 3;
                                $('body').addClass('bg-white');
                                that.isOpen = true;
                            }else{
                                callBack();
                            }
                        }else{
                            if(data.selfGrabInfo){
                                that.isGetPacket = true;
                                that.packetFlag = 3;
                                $('body').addClass('bg-white');
                                that.isOpen = true;
                            }else{
                                that.isGetPacket = false;
                                that.packetFlag = 3;
                                $('body').addClass('bg-white');
                                that.isOpen = true;
                            }
                        }
                   // }
                }
            });
        },
        openPacket:function () {
            var giftInfoId = $('#giftInfoId').val();
            var giftInfoCode = $('#giftInfoCode').val();
            var that = this;
            $.ajax({
                url: basePath + 'gift/open/' + giftInfoId + '/' + giftInfoCode,
                type: 'GET',
                data: '',
                dataType: 'json',
                success: function (response) {
                    var code = response.code;
                    switch (code){
                        // case "1007":
                        //     dialogComponent.parentTipDialog={
                        //         show:true,
                        //         header:'礼包信息',
                        //         body:response.msg,
                        //         btnText:'确定'
                        //     }
                        //     dialogComponent.enterBtn=function () {
                        //         wx.closeWindow();
                        //     };
                        //     break;
                        case "1001":
                            that.canOpen = false;
                            that.overDate = true;
                            that.tip = '礼包已过期';
                            break;
                        case '1002':
                            that.canOpen = false;
                            that.getOver = true;
                            that.tip = '手慢了，礼包派完了';
                            break;
                        case '1008':
                            dialogComponent.parentTipDialog={
                                show:true,
                                header:'礼包信息',
                                body:'礼包已指定受赠人,无权限操作'
                            }
                            dialogComponent.enterBtn=function () {
                                wx.closeWindow();
                            }
                            break;
                        case "1010":
                            that.queryPacket();
                            break;
                        case '0':
                            var data = response.body;
                            that.packetFlag = 3;
                            $('body').addClass('bg-white');
                            that.isOpen = true;
                            var list = [];
                            var unit = data.unit;
                            if(data.selfGrabInfo){
                                myself = {
                                    img:that.getImg(data.selfGrabInfo.headImg),
                                    name:data.selfGrabInfo.nickname,
                                    time:timeToDate(data.selfGrabInfo.grabTime),
                                    commodityName:data.commodityName,
                                    number:data.selfGrabInfo.grabQtn.toString()+unit
                                };
                                list.push(myself);
                                that.isGetPacket = true;
                            }else {
                                that.isGetPacket = false;
                            }
                            var othersGrabInfoList = data.othersGrabInfoList;
                            for(var i=0;i<othersGrabInfoList.length;i++){
                                var item = {
                                    img:that.getImg(othersGrabInfoList[i].headImg),
                                    name:othersGrabInfoList[i].nickname,
                                    time:timeToDate(othersGrabInfoList[i].grabTime),
                                    commodityName:data.commodityName,
                                    number:othersGrabInfoList[i].grabQtn+data.unit
                                }
                                list.push(item);
                            }
                            that.packet = {
                                commodityId:data.commodityId,
                                type:1,
                                name:data.nickname,
                                commodityMatter:data.commodityMatter,
                                typeName:data.typeName,
                                img:that.getImg(data.headImg),
                                desc:data.greeting,
                                commodityName:data.commodityName,
                                commodityUnitName:data.unit,
                                number:data.selfGrabInfo.grabQtn,
                                money:(Number(data.commodityPrice)*Number(data.selfGrabInfo.grabQtn)/100).toFixed(2),
                                receive:Number(data.doneeQuota)-Number(data.doneeSurplus),
                                doneeQuota:data.doneeQuota,
                                receiveNumber:Number(data.commodityTotalQuantity)-Number(data.commoditySurplusQuantity),
                                commodityTotalQuantity:data.commodityTotalQuantity,
                                packetList:list
                            };
                            break;
                    }
                },
                error: function (err) {
                    toastComponent.parentToastMessage = {
                        show: true,
                        body: err,
                        autoHide:true
                    }
                }
            });
        },
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
