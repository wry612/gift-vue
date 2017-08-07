<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<div id="numericKeypadComponent" v-cloak>
    <numeric-keypad v-bind:numeric-keypad="parentNumericKeypad"></numeric-keypad>
</div>
<script>
    // 注册数字键盘组件
    Vue.component('numeric-keypad', {
        props: {
            numericKeypad:{
                show:false,
                keyWord:[],
            }
        },
        template: '<table class="numeric-keypad" v-show="numericKeypad.show"><tr><td v-on:click="addValue(1)">1</td><td v-on:click="addValue(2)">2</td>' +
        '<td v-on:click="addValue(3)">3</td></tr><tr><td v-on:click="addValue(4)">4</td><td v-on:click="addValue(5)">5</td>' +
        '<td v-on:click="addValue(6)">6</td></tr><tr><td v-on:click="addValue(7)">7</td><td v-on:click="addValue(8)">8</td>' +
        '<td v-on:click="addValue(9)">9</td></tr><tr><td></td><td v-on:click="addValue(0)">0</td><td v-on:click="addValue(-1)" class="delete"></td></tr></table>',
        methods: {
            addValue:function (val) {
                if(Number(val)>0){
                    if(this.numericKeypad.keyWord.length==6){
                        return;
                    }
                    this.numericKeypad.keyWord.push(val);
                }else {
                    this.numericKeypad.keyWord.pop();
                }
            }
        }
    });
</script>