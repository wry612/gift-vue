<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<div id="toastComponent" v-cloak>
<toast v-bind:toast-message="parentToastMessage"></toast>
</div>
<script>
    var globalTimeout = null;
    // 注册消息提示框组件
    Vue.component('toast', {
        props: {
            toastMessage: {
                show: false,
                body: '',
                autoHide:true
            }
        },
        template: '<div class="toast-wrap" v-show="toastMessage.show">{{toastMessage.body}}' +
        '</div>',
        updated:function () {
            var that = this;
            if(that.toastMessage.show){
                if(that.toastMessage.autoHide){
                    clearTimeout(globalTimeout);
                    globalTimeout = setTimeout(function () {
                        that.toastMessage.show = false;
                    },3000);
                }
            }
        }
    });
</script>