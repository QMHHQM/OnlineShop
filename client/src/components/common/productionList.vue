<template>
    <div class="production-list"> 
        <div class="content">
            <h3 class="mt">商品列表</h3>
            <div class="tab-cont">
                <ul v-for="(groupItem, groupIndex) in tempList" class="p-group">
                    <ul class="p-list clearfix">
                        <li class="p-item" v-for="(item, index) in groupItem">
                            <div class="p-img">
                                <a :href="item.src" target="_blank" :title="item.title">
                                    <img width="180" height="180" :alt="item.title" :src="item.img">
                                </a>
                            </div>
                            <div class="p-name">
                                <a :href="item.src" target="_blank" :title="item.title">
                                    {{ item.title }}
                                </a>
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
            productList: [
                {
                    key: "1",
                    title: "360手机 N5 全网通 6GB+32GB 流光金 移动联通电信4G手机 双卡双待",
                    img: "//img10.360buyimg.com/n7/jfs/t3127/302/6759817728/310883/d8845fa8/58ad06d4N48f50019.jpg",
                    src: "//item.jd.com/3857525.html",
                    price: "1299"
                },
                {
                    key: "2",
                    title: "360手机 N5 全网通 6GB+32GB 流光金 移动联通电信4G手机 双卡双待",
                    img: "//img10.360buyimg.com/n7/jfs/t3127/302/6759817728/310883/d8845fa8/58ad06d4N48f50019.jpg",
                    src: "//item.jd.com/3857525.html",
                    price: "1299"
                },
                {
                    key: "3",
                    title: "360手机 N5 全网通 6GB+32GB 流光金 移动联通电信4G手机 双卡双待",
                    img: "//img10.360buyimg.com/n7/jfs/t3127/302/6759817728/310883/d8845fa8/58ad06d4N48f50019.jpg",
                    src: "//item.jd.com/3857525.html",
                    price: "1299"
                },
                {
                    key: "4",
                    title: "360手机 N5 全网通 6GB+32GB 流光金 移动联通电信4G手机 双卡双待",
                    img: "//img10.360buyimg.com/n7/jfs/t3127/302/6759817728/310883/d8845fa8/58ad06d4N48f50019.jpg",
                    src: "//item.jd.com/3857525.html",
                    price: "1299"
                },
                {
                    key: "5",
                    title: "360手机 N5 全网通 6GB+32GB 流光金 移动联通电信4G手机 双卡双待",
                    img: "//img10.360buyimg.com/n7/jfs/t3127/302/6759817728/310883/d8845fa8/58ad06d4N48f50019.jpg",
                    src: "//item.jd.com/3857525.html",
                    price: "1299"
                },
                {
                    key: "6",
                    title: "360手机 N5 全网通 6GB+32GB 流光金 移动联通电信4G手机 双卡双待",
                    img: "//img10.360buyimg.com/n7/jfs/t3127/302/6759817728/310883/d8845fa8/58ad06d4N48f50019.jpg",
                    src: "//item.jd.com/3857525.html",
                    price: "1299"
                },
                {
                    key: "1",
                    title: "360手机 N5 全网通 6GB+32GB 流光金 移动联通电信4G手机 双卡双待",
                    img: "//img10.360buyimg.com/n7/jfs/t3127/302/6759817728/310883/d8845fa8/58ad06d4N48f50019.jpg",
                    src: "//item.jd.com/3857525.html",
                    price: "1299"
                },
                {
                    key: "2",
                    title: "360手机 N5 全网通 6GB+32GB 流光金 移动联通电信4G手机 双卡双待",
                    img: "//img10.360buyimg.com/n7/jfs/t3127/302/6759817728/310883/d8845fa8/58ad06d4N48f50019.jpg",
                    src: "//item.jd.com/3857525.html",
                    price: "1299"
                },
                {
                    key: "3",
                    title: "360手机 N5 全网通 6GB+32GB 流光金 移动联通电信4G手机 双卡双待",
                    img: "//img10.360buyimg.com/n7/jfs/t3127/302/6759817728/310883/d8845fa8/58ad06d4N48f50019.jpg",
                    src: "//item.jd.com/3857525.html",
                    price: "1299"
                },
                {
                    key: "4",
                    title: "360手机 N5 全网通 6GB+32GB 流光金 移动联通电信4G手机 双卡双待",
                    img: "//img10.360buyimg.com/n7/jfs/t3127/302/6759817728/310883/d8845fa8/58ad06d4N48f50019.jpg",
                    src: "//item.jd.com/3857525.html",
                    price: "1299"
                },
                {
                    key: "5",
                    title: "360手机 N5 全网通 6GB+32GB 流光金 移动联通电信4G手机 双卡双待",
                    img: "//img10.360buyimg.com/n7/jfs/t3127/302/6759817728/310883/d8845fa8/58ad06d4N48f50019.jpg",
                    src: "//item.jd.com/3857525.html",
                    price: "1299"
                },
                {
                    key: "6",
                    title: "360手机 N5 全网通 6GB+32GB 流光金 移动联通电信4G手机 双卡双待",
                    img: "//img10.360buyimg.com/n7/jfs/t3127/302/6759817728/310883/d8845fa8/58ad06d4N48f50019.jpg",
                    src: "//item.jd.com/3857525.html",
                    price: "1299"
                },
                {
                    key: "1",
                    title: "360手机 N5 全网通 6GB+32GB 流光金 移动联通电信4G手机 双卡双待",
                    img: "//img10.360buyimg.com/n7/jfs/t3127/302/6759817728/310883/d8845fa8/58ad06d4N48f50019.jpg",
                    src: "//item.jd.com/3857525.html",
                    price: "1299"
                },
                {
                    key: "2",
                    title: "360手机 N5 全网通 6GB+32GB 流光金 移动联通电信4G手机 双卡双待",
                    img: "//img10.360buyimg.com/n7/jfs/t3127/302/6759817728/310883/d8845fa8/58ad06d4N48f50019.jpg",
                    src: "//item.jd.com/3857525.html",
                    price: "1299"
                },
                {
                    key: "3",
                    title: "360手机 N5 全网通 6GB+32GB 流光金 移动联通电信4G手机 双卡双待",
                    img: "//img10.360buyimg.com/n7/jfs/t3127/302/6759817728/310883/d8845fa8/58ad06d4N48f50019.jpg",
                    src: "//item.jd.com/3857525.html",
                    price: "1299"
                },
                {
                    key: "4",
                    title: "360手机 N5 全网通 6GB+32GB 流光金 移动联通电信4G手机 双卡双待",
                    img: "//img10.360buyimg.com/n7/jfs/t3127/302/6759817728/310883/d8845fa8/58ad06d4N48f50019.jpg",
                    src: "//item.jd.com/3857525.html",
                    price: "1299"
                },
                {
                    key: "5",
                    title: "360手机 N5 全网通 6GB+32GB 流光金 移动联通电信4G手机 双卡双待",
                    img: "//img10.360buyimg.com/n7/jfs/t3127/302/6759817728/310883/d8845fa8/58ad06d4N48f50019.jpg",
                    src: "//item.jd.com/3857525.html",
                    price: "1299"
                },
                {
                    key: "6",
                    title: "360手机 N5 全网通 6GB+32GB 流光金 移动联通电信4G手机 双卡双待",
                    img: "//img10.360buyimg.com/n7/jfs/t3127/302/6759817728/310883/d8845fa8/58ad06d4N48f50019.jpg",
                    src: "//item.jd.com/3857525.html",
                    price: "1299"
                },
            ]
        }
    },
    components: {

    },
    computed: {
        tempList: function() {
            return _.chunk(this.productList, 5)
        }
    }
}
</script>

<style scoped>
    .production-list {
        width: 1210px;
        margin: 0 auto 30px;
    }
    .content {
        width: 1210px;
        margin: 0 auto;
    }
    .mt {
        padding-bottom: 20px;
        font-size: 20px;
        line-height: 20px;
    }
    .tab-cont {
        border: 1px solid #ddd;
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