<template>
    <div data-name="cart" class="toolbar-panel tbar-panel-cart">
        <h3 class="tbar-panel-header">
            <a href="//cart.jd.com/cart.action?r=0.9100038860775763" target="_blank" class="title">
                <i></i>
                <em class="title">购物车</em>
            </a>
            <span class="close-panel J-close"></span>
        </h3>
        <div class="tbar-panel-main">
            <div class="tbar-panel-content">
                <div class="tbar-tipbox2" v-if="hasPicked" style="height: 357px;">
                    <div class="tip-inner">
                        <i class="i-face-fd tip-face"></i>
                        <div class="tip-text"> 购物车空空的，赶快去挑选心仪的商品吧~
                            <br>
                            <a href="#">去首页看看</a>
                        </div>
                    </div>
                </div>
                <div class="tbar-cart-list">
                    <div class="tbar-cart-item" v-for="(item, index) in cartList">
                        <div class="jtc-item-goods">
                            <span class="p-img">
                                <a :href="item.src" target="_blank">
                                    <img :src="item.img" width="50" height="50" :alt="item.title"> </a>
                            </span>
                            <div class="p-name">
                                <a :href="item.src" :title="item.title" target="_blank">{{item.title}}</a>
                            </div>
                            <div class="p-price">
                                <strong>¥{{item.price}}</strong>×{{item.count}}</div>
                            <a href="#none" class="p-del" data-cid="4155894|199025630|13">删除</a>
                        </div>
                    </div>
                </div>
            </div>       
        </div>
        <div class="tbar-panel-footer">
            <div class="tbar-checkout">
                <div class="jtc-number">
                    <strong>{{totalCount}}</strong>件商品</div>
                <div class="jtc-sum">共计：
                    <strong>￥{{totalPrice}}</strong>
                </div>
                <a class="jtc-btn J-btn" href="//cart.jd.com/cart.action?r=0.5387784492421797" target="_blank" clstag="h|keycount|cebianlan_h_cart|gotocart">结算</a>
            </div>
        </div>
    </div>
</template>
<script>
export default {
    data() {
        return {
            hasPicked: false,
            cartList: [
                {
                    src: "//item.jd.com/4155894.html",
                    img: "//img14.360buyimg.com/n5/jfs/t4642/55/3978388666/72688/c8b2dcf/59080db2N7ae9168e.jpg",
                    title: "罗技（Logitech）G102 游戏鼠标 6000DPI RGB鼠标 黑色",
                    price: "139.00",
                    count: "1"
                },
                {
                    src: "//item.jd.com/4155894.html",
                    img: "//img14.360buyimg.com/n5/jfs/t4642/55/3978388666/72688/c8b2dcf/59080db2N7ae9168e.jpg",
                    title: "罗技（Logitech）G102 游戏鼠标 6000DPI RGB鼠标 黑色",
                    price: "139.00",
                    count: "1"
                },
                {
                    src: "//item.jd.com/4155894.html",
                    img: "//img14.360buyimg.com/n5/jfs/t4642/55/3978388666/72688/c8b2dcf/59080db2N7ae9168e.jpg",
                    title: "罗技（Logitech）G102 游戏鼠标 6000DPI RGB鼠标 黑色",
                    price: "139.00",
                    count: "1"
                },
                {
                    src: "//item.jd.com/4155894.html",
                    img: "//img14.360buyimg.com/n5/jfs/t4642/55/3978388666/72688/c8b2dcf/59080db2N7ae9168e.jpg",
                    title: "罗技（Logitech）G102 游戏鼠标 6000DPI RGB鼠标 黑色",
                    price: "139.00",
                    count: "1"
                },
                {
                    src: "//item.jd.com/4155894.html",
                    img: "//img14.360buyimg.com/n5/jfs/t4642/55/3978388666/72688/c8b2dcf/59080db2N7ae9168e.jpg",
                    title: "罗技（Logitech）G102 游戏鼠标 6000DPI RGB鼠标 黑色",
                    price: "139.00",
                    count: "1"
                }
            ]

        }
    },
    computed: {
        totalCount:function() {
            let count = 0;
            for(let i of this.cartList) {
                count += parseInt(i.count)
            }
            return count;
        },
        totalPrice:function() {
            let price = 0;
            for(let i of this.cartList) {
                price += Number(i.price) * parseInt(i.count)
            }
            return price.toFixed(2);
        }
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
.toolbar-panel a {
    text-decoration: none;
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
    height: 100%;
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
.tbar-cart-list {
    width: 100%;
}
.tbar-cart-item {
    padding: 0 5px;
    margin-bottom: 10px;
    background: #fff;
}
.jtc-item-goods {
    padding: 10px 0;
    position: relative;
    overflow: hidden;
}
.jtc-item-goods .p-img {
    float: left;
    width: 50px;
    height: 50px;
    border: 1px solid #ddd;
    padding: 0;
    margin-right: 5px;
}
.jtc-item-goods .p-img img {
    width: 50px;
    height: 50px;
}
.jtc-item-goods .p-name {
    height: 32px;
    line-height: 16px;
    margin-bottom: 4px;
    overflow: hidden;
}
.jtc-item-goods .p-name a {
    color: #333;
}
.jtc-item-goods .p-price {
    height: 16px;
    padding-right: 65px;
    overflow: hidden;
    font: 12px/16px verdana;
    color: #666;
}
.jtc-item-goods .p-price strong {
    color: #c81623;
    font-weight: 400;
}
.jtc-item-goods .p-del {
    position: absolute;
    right: 10px;
    top: 52px;
    width: 35px;
    height: 16px;
    line-height: 16px;
    color: #005aa0;
    text-align: right;
    display: none;
}
.jtc-item-goods:hover .p-del {
    display: block;
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