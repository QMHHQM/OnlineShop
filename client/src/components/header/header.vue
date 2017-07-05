<template>
    <div class="shorcut">
        <div class="wrap">
            <ul class="fr">
                <li>1</li>
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
</style>