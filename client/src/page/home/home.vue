<template>
    <div>
        <shortcut></shortcut>
        <head-top></head-top>
        <nav-title></nav-title>
        <router-view></router-view>
        <buy-cart v-if="isCartOpen"></buy-cart>
        <foot-guide></foot-guide>

        <div class="toolbar-tabs" :class="{'open-toolbar': isCartOpen}">
            <div class="toolbar-tab tbar-tab-cart" @click="taggleCart" :class="{'z-tbar-tab-selected': isCartOpen}">
                <i class="fa fa-shopping-cart"></i>
            </div>
            <div class="toolbar-tab tbar-tab-coupon">
                <a href="javascript:scroll(0,0)">
                    <i class="fa fa-angle-double-up"></i>
                </a>
            </div>
        </div>
    </div>
</template>
<script>
import headTop from '../../components/header/header'
import shortcut from '../../components/header/shortcut'
import navTitle from '../../components/header/nav'
import footGuide from '../../components/footer/footer'
import buyCart from '../../components/common/buyCart'
export default {
    name: 'home',
    data() {
        return {
            isCartOpen: false
        }
    },
    components: {
        headTop,
        footGuide,
        buyCart,
        shortcut,
        navTitle
    },
    methods: {
        taggleCart() {
            this.isCartOpen = !this.isCartOpen;
        }
    }
}
</script>

<style scope> 
    .toolbar-tabs {
        position: fixed;
        right: 0;
        bottom: 0;
        height: 100%;
        z-index: 3;
        border-right: 4px solid #7a6e6e;
    }
    .toolbar-tab {
        height: 40px;
        width: 40px;
        background-color: #7a6e6e;
        border-radius: 3px 0 0 3px;
        -webkit-border-radius: 3px 0 0 3px;
        -moz-border-radius: 3px 0 0 3px;
        cursor: pointer;
        text-align: center;
    }
    .tbar-tab-cart {
        position: absolute;
        right: 0;
        bottom: 40px;
    }
    .tbar-tab-coupon {
        position: absolute;
        right: 0;
        bottom: 85px;
    }
    .open-toolbar {
        right: 270px;
    }
    .z-tbar-tab-selected{
        background-color: #003664;
    }
    .toolbar-tab i {
        font-size: 24px;
        color: #fff;
        height: 40px;
        line-height: 40px;
    }
</style>
