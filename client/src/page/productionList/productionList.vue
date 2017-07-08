<template>
    <div class="production-list"> 
        <div class="content">
            <div class="tab-cont">
                <ul v-for="(groupItem, groupIndex) in productionList" class="p-group">
                    <ul class="p-list clearfix">
                        <li class="p-item" v-for="(item, index) in groupItem">
                            <div class="p-img">
                                <router-link to="/home/production-info" :href="item.src" :title="item.title">
                                    <img width="180" height="180" :alt="item.title" :src="item.img">
                                </router-link>
                            </div>
                            <div class="p-name">
                                <router-link to="/home/production-info" :href="item.src":title="item.title">
                                    {{ item.title }}
                                </router-link>
                            </div>
                            <div class="p-price">¥{{item.price}}</div>
                        </li>
                    </ul>
                    <hr>
                </ul>
            </div>
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
        productionList() {
            return _.chunk(this.$store.state.productionList, 5)
        }
    }
}
</script>

<style scoped>
    .production-list {
        width: 1210px;
        margin: 30px auto;
    }
    .content {
        width: 1210px;
        margin: 0 auto;
    }
    .tab-cont {
        border: 1px solid #ddd;
        margin-top: 20px;
    }
    .tab-cont .p-group hr {
        height: 1px;
        border: none;
        border-top: 1px solid #ddd;
        margin: 0 80px;
    }
    .tab-cont .p-group:last-child hr {
        display: none;
    }
    .p-list.selected {
        display: block;
    }
    .p-list {
        width: 1208px;
        padding: 30px 0 25px;
        
    }
    .p-item {
        width: 241px;
        float: left;
        height: 100%;
        border-right: 1px solid #ddd;
        margin-bottom: 20px;
    }
    .p-item:nth-of-type(5n) {
        border-right: 0;
    }
    .p-img {
        width: 100%;
        height: 206px;
        line-height: 206px;
        text-align: center;
    }
    .p-name {
        width: 200px;
        height: 36px;
        margin: 8px 17px 15px;     
    }
    .p-name a {
        color: #666;
        text-decoration: none;
    }
    .p-name a:hover {
        color: #C81623;
    }
    .p-price {
        margin-left: 17px;
        font-size: 18px;
        line-height: 18px;
        color: #c61822;
    }
</style>