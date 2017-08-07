//重写jquery的ajax方法
(function($){
    //首先备份下jquery的ajax方法
    var _ajax=$.ajax;

    //重写jquery的ajax方法
    $.ajax=function(opt){
        //备份opt中error和success方法
        var fn = {
            error:function(XMLHttpRequest, textStatus, errorThrown){},
            success:function(data, textStatus){}
        }
        if(opt.error){
            fn.error=opt.error;
        }
        if(opt.success){
            fn.success=opt.success;
        }

        //扩展增强处理
        var _opt = $.extend(opt,{
            error:function(XMLHttpRequest, textStatus, errorThrown){
                //错误方法增强处理
                fn.error(XMLHttpRequest, textStatus, errorThrown);
            },
            success:function(data, textStatus){
                //成功回调方法增强处理
                if(data.code && data.code.toString() =='502'){
                    window.location.reload();
                }
                fn.success(data, textStatus);
            },
            beforeSend:function(XHR){
                //提交前回调方法

            },
            complete:function(XHR, TS){
                //请求完成后回调函数 (请求成功或失败之后均调用)。
            }
        });
        return _ajax(_opt);
    };
})(jQuery);

//获取url参数
function getQueryString(name) {
    var r = window.location.search.substr(1);
    var arr = r.split('&');
    var obj = {};
    for(var i=0;i<arr.length;i++){
        var val = arr[i].split('=');
        obj[val[0]] = decodeURI(val[1]);
    }
    if(name){
        if(obj[name]) {
            return obj[name];
        }else{
            return "";
        }

    }
    return obj;
}

//日期格式化
Date.prototype.format = function(fmt) {
    var o = {
        "M+" : this.getMonth()+1,                 //月份
        "d+" : this.getDate(),                    //日
        "h+" : this.getHours(),                   //小时
        "m+" : this.getMinutes(),                 //分
        "s+" : this.getSeconds(),                 //秒
        "q+" : Math.floor((this.getMonth()+3)/3), //季度
        "S"  : this.getMilliseconds()             //毫秒
    };
    if(/(y+)/.test(fmt)) {
        fmt=fmt.replace(RegExp.$1, (this.getFullYear()+"").substr(4 - RegExp.$1.length));
    }
    for(var k in o) {
        if(new RegExp("("+ k +")").test(fmt)){
            fmt = fmt.replace(RegExp.$1, (RegExp.$1.length==1) ? (k=='S'?milliseconds(o[k]):o[k]) : (("00"+ o[k]).substr((""+ o[k]).length)));
        }
    }
    return fmt;
}

function milliseconds(num){
    var number = num.toString();
    var len = number.length;
    while(len<3){
        number = '0'+number;
        len++;
    }
    return number;
}
function timeToDate(time) {
    var date = new Date(time);
    return date.format('yyyy-MM-dd hh:mm:ss');
}

function GetDateStr(currDate,AddMonthCount) {
    var dd = new Date(currDate);
    var currMonth = parseInt(dd.getMonth(),10);
    var year =  parseInt(dd.getFullYear(),10);
    if(AddMonthCount==-1){
        if(currMonth==0){
            currMonth = 12;
            year-=1;
        }else{
            currMonth=currMonth+AddMonthCount+1;
        }
    }else if(AddMonthCount==1){
        if(currMonth==11){
            currMonth = 1;
            year+=1;
        }else{
            currMonth=currMonth+AddMonthCount+1;
        }
    }
    if(currMonth<10){
        currMonth='0'+currMonth;
    }
    return year+'-'+currMonth;
}

//写cookies

function setCookie(name,value)
{
    var Days = 90;
    var exp = new Date();
    exp.setTime(exp.getTime() + Days*24*60*60*1000);
    document.cookie = name + "="+ escape (value) + ";expires=" + exp.toGMTString();
}

//读取cookies
function getCookie(name)
{
    var arr,reg=new RegExp("(^| )"+name+"=([^;]*)(;|$)");

    if(arr=document.cookie.match(reg))

        return unescape(arr[2]);
    else
        return null;
}

//删除cookies
function delCookie(name)
{
    var exp = new Date();
    exp.setTime(exp.getTime() - 1);
    var cval=getCookie(name);
    if(cval!=null)
        document.cookie= name + "="+cval+";expires="+exp.toGMTString();
}

//倒计时
function GetRTime(time,format){
    // var EndTime= new Date(time);
    // var NowTime = new Date();
    // var t =EndTime.getTime() - NowTime.getTime();
    var t =time;
    var d=0;
    var h=0;
    var m=0;
    var s=0;
    if(t>=0){
        d=Math.floor(t/1000/60/60/24);
        h=Math.floor(t/1000/60/60%24);
        m=Math.floor(t/1000/60%60);
        s=Math.floor(t/1000%60);
    }
    var str = '';
    // if(d!=0){
        str+=d + "天";
    // }
    // if(h!=0){
        str+=timeFormat(h) + "时";
    // }
    // if(m!=0){
        str+=timeFormat(m) + "分";
    // }
    // if(s!=0){
        str+=timeFormat(s) + "秒";
    // }
    if(str=='0天00时00分00秒'){
        str='';
    }
    if(format){
        if(format=='d'){
            return d;
        }else if(format=='h'){
            return timeFormat(h);
        }else if(format=='m'){
            return timeFormat(m);
        }else if(format=='s'){
            return timeFormat(s);
        }else{
            return str;
        }
    }else{
        return str;
    }
}

function timeFormat(time) {
    if(time.toString().length==1){
        time='0'+time;
    }
    return time;
}
var goBack = null;
var str= navigator.userAgent.toLowerCase();
var ver=str.match(/cpu iphone os (.*?) like mac os/);
if(ver){
    var version = ver[1].replace(/_/g,".").split('.')[0];
    if(Number(version)>9){
        window.removeEventListener('popstate',goBack);
        pushHistory();
        if(location.href.indexOf('address/createAddress')>-1){
            goBack=function() {
                if (check) {
                    $('input').blur();
                    $('textarea').blur();
                    $('select').blur();
                    var info1 = JSON.stringify(createAddress.userDeliveryInfo);
                    var info2 = JSON.stringify(createAddress.saveInfo);
                    if (info1 != info2) {
                        dialogComponent.parentModalDialog = {
                            show: true,
                            header: '信息提示',
                            body: '修改了信息还未保存，确认现在返回吗？',
                            leftBtnText: '返回',
                            rightBtnText: '保存'
                        };
                        dialogComponent.leftBtn = function () {
                            localStorage.check=false;
                            window.history.go(-2);
                        }
                        dialogComponent.rightBtn = function () {
                            dialogComponent.parentModalDialog.show = false;
                            createAddress.saveAddress();
                        }
                    } else {
                        localStorage.check=false;
                        window.history.go(-2);
                    }
                }
            };
        }else if(location.href.indexOf('gift/index')>-1){
            goBack = function(e) {
                wx.closeWindow();
            }
        }else if(location.href.indexOf('gift/getPacket/')>-1){
            goBack = function(e) {
                wx.closeWindow();
            }
        }else{
            goBack = function(e) {
                $('input').blur();
                $('textarea').blur();
                $('select').blur();
                if(localStorage.check&&localStorage.check=='false'){
                    localStorage.check=true;
                    if(localStorage.refresh&&localStorage.refresh=='true'){
                        localStorage.refresh=false;
                        window.history.go(-6);
                    }else{
                        window.history.go(-2);
                    }
                }else{
                    if(localStorage.refresh&&localStorage.refresh=='true'){
                        localStorage.refresh=false;
                        window.history.go(-6);
                    }else{
                        window.history.go(-2);
                    }

                }
            };
        }
        window.addEventListener('popstate',goBack,true);
        function pushHistory(){
            var state = {
                title:"",
                url: "#"
            };
            window.history.pushState(state, "", '');
        }
    }
}
//loading controller
function showLoading(){
    $('<div class="loading"></div>').appendTo('body');
}
function hideLoading() {
    $('.loading').remove();
}

//注册tip提示组件
var toastComponent = new Vue({
    el: '#toastComponent',
    data: {
        parentToastMessage: {
            show: false,
            body: '注意在 JavaScript 中对象和数组是引用类型，指向同一个内存空间，如果 prop 是一个对象或数组，在子组件内部改变它会影响父组件的状态',
            autoHide:true
        }
    }
});

//网络连接监控
window.addEventListener('load', function() {
    function updateOnlineStatus(event) {
        var condition = navigator.onLine;
        if(condition){
            toastComponent.parentToastMessage.show = false;
        }else{
            toastComponent.parentToastMessage= {
                show:true,
                body:'网络错误，请查看网络并刷新页面',
                autoHide:false
            };
        }
        console.log(event.type + "; Status: " + condition );
    }
    window.addEventListener('online',  updateOnlineStatus);
    window.addEventListener('offline', updateOnlineStatus);
});


//注销验证码定时器
clearInterval(window.clearCode);

//数组元素去重
function unique(arr){
    var newArr = [];//新建一个数组
    for(var i=0,len=arr.length;i<len;i++){
        if(newArr.indexOf(arr[i]) == -1){//若新数组中未包含该项则将其存入新数组
            newArr.push(arr[i]);
        }
    }
    return newArr;
}