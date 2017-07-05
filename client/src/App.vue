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
    @import './lib/bootstrap';
    @import './lib/font-awesome/css/font-awesome.min.css';
    #app {
        height: 100%;
    }
</style>