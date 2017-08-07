<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<div id="dialogComponent" v-cloak>
<modal-dialog v-bind:modal-dialog="parentModalDialog">
    <div slot="dialog-footer" class="clearfix">
        <div class="left-btn" v-on:click="leftBtn">{{parentModalDialog.leftBtnText}}</div>
        <div class="right-btn" v-on:click="rightBtn">{{parentModalDialog.rightBtnText}}</div>
    </div>
</modal-dialog>
<tip-dialog v-bind:tip-dialog="parentTipDialog">
    <div slot="dialog-enter" class="clearfix">
        <div class="enter-btn" v-on:click="enterBtn">{{parentTipDialog.btnText}}</div>
    </div>
</tip-dialog>
</div>
<script>
    // 注册弹框组件
    Vue.component('modal-dialog', {
        props: {
            modalDialog: {
                show: false,
                header: '',
                headerShow:false,
                body: '',
                leftText:'取消',
                rightText:'确定'
            }
        },
        template: '<div class="dialog-cover" v-show="modalDialog.show">' +
        '<div class="dialog-wrap">' +
        '<div class="dialog-header" v-show="modalDialog.headerShow">{{modalDialog.header}}' +
        '<div class="dialog-close"></div>' +
        '</div>' +
        '<div class="dialog-body">{{modalDialog.body}}</div>' +
        '<div class="dialog-footer">' +
        '<slot name="dialog-footer"></slot>' +
        '</div></div>' +
        '</div>'
    });
    Vue.component('tip-dialog', {
        props: {
            tipDialog: {
                show: false,
                header: '',
                headerShow:false,
                body: '',
                btnText:'确定'
            }
        },
        template: '<div class="dialog-cover" v-show="tipDialog.show">' +
        '<div class="dialog-wrap tip-dialog">' +
        '<div class="dialog-header" v-show="tipDialog.headerShow">{{tipDialog.header}}' +
        '</div>' +
        '<div class="dialog-body">{{tipDialog.body}}</div>' +
        '<div class="dialog-footer">' +
        '<slot name="dialog-enter"></slot>' +
        '</div></div>' +
        '</div>'
    });
</script>