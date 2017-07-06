<template>
    <div data-name="cart" class="toolbar-panel tbar-panel-cart toolbar-animate-in">
        <h3 class="tbar-panel-header J-panel-header">
            <a href="//cart.jd.com/cart.action?r=0.9100038860775763" target="_blank" class="title">
                <i></i>
                <em class="title">购物车</em>
            </a>
            <span class="close-panel J-close"></span>
        </h3>
        <div class="tbar-panel-main">
            <div class="tbar-panel-content" style="height: 357px;">
                <div class="tbar-tipbox2">
                    <div class="tip-inner">
                        <i class="i-face-fd tip-face"></i>
                        <div class="tip-text"> 购物车空空的，赶快去挑选心仪的商品吧~
                            <br>
                            <a href="//www.jd.com/">去首页看看</a>
                        </div>
                    </div>
                </div>
            </div>       
        </div>
        <div class="tbar-panel-footer">
            <div class="tbar-checkout">
                <div class="jtc-number">
                    <strong class="J-count">0</strong>件商品</div>
                <div class="jtc-sum">共计：
                    <strong class="J-total">￥0.00</strong>
                </div>
                <a class="jtc-btn J-btn" href="//cart.jd.com/cart.action?r=0.5387784492421797" target="_blank" clstag="h|keycount|cebianlan_h_cart|gotocart">去购物车结算</a>
            </div>
        </div>
    </div>
</template>
<script>
export default {
    data() {
        return {

        }
    },
    components: {
        
    }
}
</script>
<style>
.toolbar-panel {
    width: 270px;
    height: 100%;
    position: fixed;
    background: #eceaea;
    right: 0;
    top: 0;
    z-index: 2;
}  
.tbar-panel-header {
    position: relative;
    width: 270px;
    height: 40px;
    line-height: 40px;
    background: #eceaea;
    margin: 0;
}
.tbar-panel-header .title {
    display: inline-block;
    height: 40px;
    color: rgb(94, 80, 80);
    font: 16px/40px 微软雅黑;
}
.toolbar-wrap a {
    text-decoration: none;
}
.tbar-panel-cart .tbar-panel-header i {
    width: 20px;
    height: 18px;
    background-position: 0 0;
    margin-top: 11px;
}
.tbar-panel-header i {
    margin-right: 4px;
    margin-left: 10px;
    vertical-align: top;
}
.tbar-panel-header .title em {
    display: inline-block;
    vertical-align: top;
}
.tbar-panel-header .close-panel {
    width: 12px;
    height: 12px;
    background-position: 0 -250px;
    position: absolute;
    right: 8px;
    top: 16px;
    cursor: pointer;
    -webkit-transition: transform .2s ease-out 0s;
    -moz-transition: transform .2s ease-out 0s;
    transition: transform .2s ease-out 0s;
}
.tbar-panel-header .close-panel, .tbar-panel-header i, .toolbar-tab .tab-ico, .toolbar-tab .tab-tip, .toolbar-tabs .tabs-tip .ico {
    display: inline-block;
    background-image: url(//static.360buyimg.com/devfe/toolbar/1.0.0/css/i/toolbars.png);
    background-repeat: no-repeat;
}
.tbar-panel-main {
    position: relative;
    height: calc(100% - 90px);
}
.tbar-panel-content {
    width: 270px;
    overflow-y: auto;
    overflow-x: hidden;
    position: relative;
}
.tbar-panel-content .tbar-tipbox2 {
    width: 270px;
    position: absolute;
    left: 0;
    top: 50%;
    margin-top: -60px;
}
.tbar-tipbox2 {
    text-align: center;
}
.tbar-tipbox2 .tip-face {
    overflow: hidden;
}
.tbar-tipbox2 .tip-text {
    line-height: 20px;
}
.tbar-tipbox2 .tip-text a {
    color: #c81623;
}
.i-face-fd {
    width: 113px;
    height: 35px;
    background-position: 0 0;
}
.i-face-fd, .i-face-jk {
    display: inline-block;
    background-image: url("../../images/toolbar-face.png");
    background-repeat: no-repeat;
}
.tbar-panel-cart .tbar-panel-footer {
    height: 50px;
    background-color: #eceaea;
}
.tbar-checkout {
    height: 40px;
    padding: 5px 110px 5px 5px;
    position: relative;
}
.tbar-checkout .jtc-number {
    line-height: 20px;
}
.tbar-checkout .jtc-number strong {
    font-family: verdana;
    color: #c81623;
}
.tbar-checkout .jtc-sum {
    line-height: 20px;
}
.tbar-checkout .jtc-sum strong {
    font-family: verdana;
    color: #c81623;
}
.tbar-checkout .jtc-btn {
    position: absolute;
    right: 5px;
    top: 7px;
    width: 110px;
    height: 35px;
    text-align: center;
    color: rgb(255, 255, 255);
    font: 16px/35px 微软雅黑;
    background: rgb(200, 22, 35);
}
.toolbar-wrap a {
    text-decoration: none;
}
</style>