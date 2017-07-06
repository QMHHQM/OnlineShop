<template>
    <div>
        <shortcut></shortcut>
        <head-top></head-top>
        <production-list></production-list>
        <buy-cart></buy-cart>
        <foot-guide></foot-guide>
    </div>
</template>
<script>
import headTop from '../../components/header/header'
import shortcut from '../../components/header/shortcut'
import footGuide from '../../components/footer/footer'
import productionList from '../../components/common/productionList'
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
        productionList,
        buyCart,
        shortcut
    }
}
</script>

<style scope>

</style>
