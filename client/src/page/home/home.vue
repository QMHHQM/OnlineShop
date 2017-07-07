<template>
    <div>
        <shortcut></shortcut>
        <head-top></head-top>
        <nav-title></nav-title>
        <router-view></router-view>
        <buy-cart></buy-cart>
        <foot-guide></foot-guide>
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

        }
    },
    components: {
        headTop,
        footGuide,
        buyCart,
        shortcut,
        navTitle
    }
}
</script>

<style scope>

</style>
