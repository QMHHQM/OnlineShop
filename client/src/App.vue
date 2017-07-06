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
    @import './lib/bootstrap';
    @import './lib/font-awesome/css/font-awesome.min.css';
    @import './style/common';
    #app {
        height: 100%;
    }
</style>