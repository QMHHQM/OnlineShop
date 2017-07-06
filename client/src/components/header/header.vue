<template>
    <div class="w">
        <div class="logo">
            <a href="#" class="logo-img">OnlineShop</a>
        </div>
        <div class="search">
            <div class="form">
                <input type="text" onkeydown="javascript:if(event.keyCode==13) search('key');" autocomplete="off" id="key" accesskey="s" class="text" clstag="shangpin|keycount|topitemnormal|b02">
                <button onclick="search('key');return false;" class="button cw-icon" clstag="shangpin|keycount|topitemnormal|b03">
                    <i></i>搜索</button>
            </div>
        </div>
        <div class="hotwords">
            <a target="_blank" href="#">京东之家</a>
            <a target="_blank" href="#">京东专卖店</a>
            <a target="_blank" href="#">平板</a>
            <a target="_blank" href="#">电脑</a>
            <a target="_blank" href="#">ipad</a>
        </div>
        <span class="clr"></span>
    </div>
</template>
<script>
    export default {
        name: 'shortcut',
        data() {
            return {

            }
        }
    }
</script>
<style scoped>
    .w {
        width: 1210px;
        margin: 0 auto;
        height: 100px;
    }
    .logo {
        position: relative;
        z-index: 12;
        float: left;
        width: 362px;
        height: 60px;
        margin: 20px 0;
    }
    .logo .logo-img {
        display: block;
        width: 270px;
        height: 60px;
        background: url("../../images/logo.png") no-repeat 0 0;
        background-size:270px 60px;
        text-indent: -20000px;
    }
    .search, .search .form {
        width: auto;
    }
    .search {
        position: relative;
        z-index: 11;
        float: left;
        margin-top: 25px;
    }
    .search .form {
        height: 36px;
    }
    .search .text {
        float: left;
        height: 36px;
        width: 446px;
        line-height: 36px;
        color: #666;
        padding: 4px;
        margin-bottom: 4px;
        border-width: 2px 0 2px 2px;
        border-color: #B61D1D;
        border-style: solid;
        outline: 0;
        font-size: 14px;
        font-family: "microsoft yahei"; 
    }
    .search .button {
        float: left;
        width: 82px;
        height: 36px;
        background: #B61D1D;
        border: none;
        line-height: 1;
        color: #fff;
        font-family: "Microsoft YaHei";
        font-size: 16px;
        cursor: pointer;
    }
    .hotwords {
        float: left;
        width: 518px;
        height: 20px;
        line-height: 20px;
        overflow: hidden;
    }
    .hotwords a {
        margin-right: 10px;
        color: #666;
    }
    
</style>
