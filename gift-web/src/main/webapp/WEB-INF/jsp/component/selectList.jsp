<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<div id="selectListComponent" v-cloak>
<select-list v-bind:select-list="parentSelectList">
</select-list>
</div>
<script>
    // 注册弹框和消息提示框组件
    Vue.component('select-list', {
        props: {
            selectList: {
                show:false,
                bottom:'0',
                header: '请选择兑换方式',
                lists: [],
                activeIndex:-1,
                activeName: 'XX普洱',
                lastIndex:-1,
                comodityObjRatio:0
            }
        },
        template: '<div class="page-cover" v-show="selectList.show" v-on:click.self="listHide" v-on:touchmove.self.prevent><div class="list-wrap" v-bind:style="{bottom:selectList.bottom}">' +
        '<div class="list-header"><div class="icon-close" v-on:click="listHide"></div>{{selectList.header}}</div>' +
        '<div class="list-body">' +
        '<div v-for="(item,index) in selectList.lists" v-bind:class="{active:selectList.activeIndex==index}" class="list-item clearfix" v-on:click="getSelected(index)"><div v-bind:class="{disabled:item.availableUnitQuantity<item.comodityObjRatio}">' +
        '<div class="float-left"><div class="name">{{item.comodityObjRatio}}{{item.unit}}{{item.commodityName}}</div>' +
        '<div class="tip">可用礼品{{item.availableUnitQuantity}}{{item.unit}}<span v-if="item.availableUnitQuantity<item.comodityObjRatio">（不足以兑换）</span></div></div>' +
        '<div class="float-right btn" v-on:click.stop="getMore(index)" v-if="item.availableUnitQuantity<item.comodityObjRatio">立即补足</div><i class="float-right icon-list-active" v-if="item.availableUnitQuantity>=item.comodityObjRatio"></i></div>' +
        '</div></div>' +
        '</div></div>',
        methods: {
            listHide:function () {
                this.selectList.show = false;
            },
            listShow:function () {
                this.selectList.show = true;
            },
            getMore:function (index) {
                var needUnitQuantity= Number(this.selectList.lists[index].comodityObjRatio)-Number(this.selectList.lists[index].availableUnitQuantity);
                var redirectUrl=window.location.href;
                window.location.href = basePath+'gift/commodityDetails?commodityId='+this.selectList.lists[index].commodityContractId+'&needUnitQuantity='+needUnitQuantity+'&redirectUrl='+redirectUrl;
            },
            getSelected:function (index) {
                if(this.selectList.lists[index].comodityObjRatio>this.selectList.lists[index].availableUnitQuantity){
                    return;
                }
                this.selectList.lastIndex = this.selectList.activeIndex;
                $('.list-wrap .list-item').removeClass('active');
                $('.list-wrap .list-item').eq(index).addClass('active');
                this.selectList.activeIndex = index;
                this.selectList.comodityObjRatio = this.selectList.lists[index].comodityObjRatio;
                this.selectList.activeName = this.selectList.lists[index].unit+this.selectList.lists[index].commodityName;
                this.listHide();
                this.$emit('getSelected');
            }
        }
    });
</script>