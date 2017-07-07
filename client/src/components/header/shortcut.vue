<template>
    <div class="shortcut">
        <div class="wrap">
            <ul class="fr">
                <li class="dt"><a target="_blank" href="#">你好，何凡</a></li>
                <li class="spacer"></li>
                <li class="dt"><router-link to="/home/user-info">个人信息</router-link></li>
                <li class="spacer"></li>
                <li class="dt"><a target="_blank" href="#">我的订单</a></li>
                <li class="spacer"></li>
                <li class="dt"><a target="_blank" href="#">退出登录</a></li>
            </ul>
        </div>
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
    .shortcut {
        border-bottom: 1px solid #ddd;
        background-color: #e3e4e5;
    }
    .shortcut .wrap {
        height: 30px;
        line-height: 30px;
        color: #999;
    }
    .wrap {
        margin: auto;
        width: 1190px;
    }
    .fr {
        float: right;
    }
    .shortcut li.spacer {
        overflow: hidden;
        margin: 11px 5px 0;
        width: 1px;
        height: 10px;
        background-color: #ccc;
    }
    .shortcut li {
        float: left;
    }
    .shortcut li.dt {
        padding: 0 8px;
    }
    .shortcut a {
        color: #999;
        text-decoration: none;
    }
    .shortcut a:hover {
        color: #c81623;
    }
</style>