<template>
    <div class="nav"> 
        <div class="content">
            <div class="mt"><h3 >商品列表</h3></div>
        </div>
    </div>
</template>
<script>
import _ from 'lodash'
export default {
    data() {
        return {
            
        }
    },
    components: {

    },
    computed: {
        
    }
}
</script>

<style scoped>
    .nav {
        width: 100%;
        border-bottom: 2px solid #003664;
    }
    .content {
        width: 1210px;
        margin: 0 auto;
    }
    .mt {
        font-size: 20px;
        line-height: 20px;
    }
    .mt h3 {
        padding: 10px 20px;
        display: table;
        color: #fff;
        background-color: #003664;
    }
</style>