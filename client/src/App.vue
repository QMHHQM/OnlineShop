<template>
    <div id="app">
        <router-view></router-view>
    </div>
</template>

<script>
    export default {
        name: 'app',
        data() {
            return {

            }
        }
    }
</script>

<style lang="scss">
    @import './style/common';
    #app {
        height: 100%;
    }
</style>