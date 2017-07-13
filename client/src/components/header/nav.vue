<template>
    <div class="nav"> 
        <div class="content">
            <div class="mt"><h3 >{{ subTitle }}</h3></div>
        </div>
    </div>
</template>
<script>
export default {
    data() {
        return {
            
        }
    },
    computed: {
        subTitle() {
            let path = this.$route.path;
            let name = "";
            switch(path) {
                case "/home/user-info":
                    name = "个人信息";
                    break;
                case "/home/production-info":
                    name = "商品详情";
                    break;
                case "/home/order-list":
                    name = "订单信息";
                    break;
                default:
                    name = "商品列表";
            }
            return name;
        }
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