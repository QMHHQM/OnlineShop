<template>
    <div class="header">
        <div class="wrap">
            <ul class="fr">
                <li>1</li>
                <li class="spacer"></li>
            </ul>
        </div>
    </div>
</template>
<script>
export default {
    name: 'home',
    data() {
        return {

        }
    }
}
</script>

<style scoped>
    .header {
        border-bottom: 1px solid #ddd;
        background-color: #e3e4e5;
    }
    .header .wrap {
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
    .header li.spacer {
        overflow: hidden;
        margin: 11px 5px 0;
        width: 1px;
        height: 10px;
        background-color: #ccc;
    }
    .header li {
        float: left;
    }
    .header a {
        color: #999;
    }
</style>