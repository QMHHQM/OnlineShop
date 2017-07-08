<template> 
    <div class="w">
       <div class="product-intro clearfix">
            <div class="preview-wrap">
                <div class="preview" id="preview">
                    <div class="jqzoom main-img">
                        <img id="spec-img" width="350" :alt="productionInfo.title" :src="productionInfo.image">
                    </div>
                </div>
            </div>
            <div class="itemInfo-wrap">   
                <div class="sku-name">
                    {{productionInfo.title}}
                </div>
                <div class="summary summary-first">
                    <div class="summary-price-wrap">
                        <div class="summary-price">
                            <div class="dt">惊 喜 价</div>
                            <div class="dd">
                                <span class="p-price">
                                    <span>￥</span>
                                    <span class="price">{{productionInfo.price}}</span>
                                </span>
                            </div>
                        </div>
                        <div class="summary-info clearfix">
                            <div id="comment-count" class="comment-count item fl">
                                <p class="comment">累计评价</p>
                                <a href="#none">3200+</a>
                            </div>
                        </div>
                    </div>
                </div>
                <div id="choose-btns" class="choose-btns clearfix">
                    <div class="choose-amount ">
                        <div class="wrap-input">
                            <input class="text buy-num" v-model="addCartData.count">
                            <a class="btn-reduce" :class="{'disabled': addCartData.count==1}" @click.prevent="countMinus">-</a>
                            <a class="btn-add" @click.prevent="countAdd">+</a>
                        </div>
                    </div>
                    <a class="btn-special1 btn-lg" @click.prevent="addToCart">加入购物车</a>
                    <div id="summary-tips" class="summary-tips">
                        <div class="dt">温馨提示</div>
                        <div class="dd">
                            ·支持7天无理由退货
                        </div>
                    </div>
                </div>
            </div>
       </div>
       
    <div class="ETab">
        <div class="tab-main large">
            <ul>
                <li :class="{'current': isCurr=='Des'}" @mouseover="isCurr='Des'">商品介绍</li>
                <li :class="{'current': isCurr=='Comm'}" @mouseover="isCurr='Comm'">商品评价</li>
            </ul>
        </div>
        <div class="tab-con">
            <div v-show="isCurr=='Des'">
                <div class="p-parameter">
                    {{productionInfo.describtion}}
                </div>
            </div>
            <div v-show="isCurr=='Comm'">
                <div class="m m-content comment" id="comment">
                    <div class="mt">
                        <h3>商品评价</h3>
                    </div>
                    <div class="mc">
                        <div class="comments-list ETab">
                            <div class="tab-con" v-for="(item, index) in productionInfo.commentList">
                                <div id="comment-0">
                                    <div class="comment-item clearfix">
                                        <div class="user-column">
                                            <div class="user-info">
                                                <img :src="item.avatar" width="25" height="25" :alt="item.userName" class="avatar"> 
                                                    {{item.userName}}
                                            </div>
                                        </div>
                                        <div class="comment-column">
                                            <div class="tag-list">
                                                <span>{{item.content}}</span>
                                            </div>
                                        </div>
                                        <div class="comment-time">
                                            <span>{{item.time}}</span>
                                        </div>
                                    </div>
                                    
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="com-table-footer">
                        <div class="ui-page-wrap clearfix">
                            <div class="ui-page">
                                <a rel="1" class="ui-page-curr" href="javascript:void(0)">1</a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

    </div>
</template>
<script>
export default {
    data() {
        return {
            isCurr: 'Des',
            addCartData: {
                proId: '',
                count: 1
            }
        }
    },
    components: {

    },
    computed: {
        productionInfo() {
            return this.$store.state.productionInfo
        }
    },
    methods: {
        countMinus() {
            if (this.addCartData.count>1) {
                this.addCartData.count--
            }
        },
        countAdd() {
            this.addCartData.count++
        },
        addToCart() {
            this.addCartData.proId = this.productionInfo.proId
            
        }
    },
    watch: {
        addCartData: {
            handler(){
                if (this.addCartData.count < 1) {
                    this.addCartData.count = 1
                }
                if(!Number.isInteger(this.addCartData.count)) {
                    this.addCartData.count = Math.floor(this.addCartData.count)
                }
            },
            deep: true
        }
    }
}
</script>

<style scoped>
    .w {
        width: 1210px;
        margin: 0 auto;
    }
    .w a {
        text-decoration: none;
    }
    .product-intro {
        position: relative;
        margin-top: 30px;
        margin-bottom: 30px;
    }
    .product-intro .itemInfo-wrap {
        width: 858px;
        float: right;
        padding-left: 30px;
        min-height: 449px;
        padding-right: 24px;
        background: #f3f3f3;
        position: relative;
    }
    .sku-name {
        font: 700 16px Arial,"microsoft yahei";
        color: #666;
        padding-top: 20px;
        line-height: 28px;
        margin-bottom: 15px;
        text-align: center;
    }
    .preview-wrap {
        width: 352px;
        float: left;
        padding-bottom: 5px;
    }
    .summary {
        position: absolute;
        bottom: 250px;
        left: 150px;
        height: 35px;
        width: 500px;
    }
    .summary-price-wrap {
        padding: 10px 0 0;
    }
    .summary-price-wrap .summary-price {
        position: relative;
        margin-bottom: 5px;
    }
    .dt,
    .dd {
        line-height: 22px;
        float: left;
        padding-left: 10px;
        font-family: simsun;
        color: #999;
    }
    .summary-price .dd {
        margin-left: 70px;
    }
    .summary-price-wrap .summary-price .p-price {
        color: #003664;
        font-family: "microsoft yahei";
        margin-right: 5px;
    }
    .summary-price-wrap .summary-price .p-price span {
        font-size: 16px;
    }
    .summary-price-wrap .summary-price .p-price .price {
        font-size: 22px;
    }
    .p-price .price {
        color: #003664;
    }
    .summary-price-wrap .summary-info {
        position: absolute;
        z-index: 1;
        right: 10px;
        top: 8px;
        color: #999;
    }
    .summary-price-wrap .summary-info .item {
        border-left: solid 1px #e6e6e6;
        text-align: center;
        padding: 0 10px;
        line-height: 15px;
    }
    .summary-price-wrap .summary-info p {
        color: #999;
    }
    .summary-price-wrap .summary-info .count {
        font: 14px verdana;
        color: #005ea7;
    }
    .itemInfo-wrap .summary-price-wrap .summary-info a {
        margin-left: 5px;
    }
    .choose-btns {
        width: auto;
        position: absolute;
        bottom: 80px;
        left: 150px;
    }
    .choose-btns .choose-amount {
        width: 49px;
        height: 44px;
        overflow: hidden;
        border: 1px solid #ccc;
        position: relative;
        margin-right: 10px;
        float: left;
    }
    .choose-btns .choose-amount input {
        display: block;
        width: 31px;
        height: 42px;
        line-height: 42px;
        position: absolute;
        top: 1px;
        left: 0;
        border: none;
        border: 0;
        text-align: center;
    }
    .choose-btns .choose-amount a.btn-reduce {
        bottom: -1px;
    }
    .choose-btns .choose-amount a.btn-add {
        top: -1px;
    }
    .choose-btns .choose-amount a.disabled {
        color: #ccc;
        cursor: not-allowed;
    }
    .choose-btns .choose-amount a {
        display: block;
        width: 15px;
        text-align: center;
        height: 22px;
        line-height: 22px;
        color: #666;
        overflow: hidden;
        background: #f1f1f1;
        position: absolute;
        right: -1px;
        border: 1px solid #ccc;
    }
    .choose-btns .btn-lg {
        margin-right: 10px;
        float: left;
    }
    .btn-primary, .btn-special1 {
        background-color: #df3033;
        color: #fff;
    }
    .btn-def, .btn-primary, .btn-special1, .btn-special2, .btn-special3 {
        display: inline-block;
        text-align: center;
        vertical-align: middle;
        cursor: pointer;
        border-radius: 0;
    }
    .summary-tips {
        margin-left: 30px;
        margin-top: 15px;
        height: 22px;
        float: left;
    }
    .tips-list li {
        float: left;
        margin-right: 15px;
        font-family: simsun;
        color: #999;
    }
    .detail {
        width: 1210px;
        float: right;
        min-height: 220px;
    }
    .tab-main {
        position: relative;
        overflow: visible;
        background-color: #f7f7f7;
        border: 1px solid #eee;
        border-bottom: 1px solid #003664;
        display: block;
    }
    .tab-main ul {
        margin-top: -1px;
    }
    div.large li {
        padding: 10px 25px;
        font-size: 14px;
        position: relative;
        display: inline-block;
        font-family: "microsoft yahei";
        cursor: pointer;
    }
    .tab-main li.current {
        background-color: #003664;
        color: #fff;
        cursor: default;
    }
    .tab-con {
        overflow: hidden;
        padding: 20px 0;
        font: 12px/150% tahoma,arial,Microsoft YaHei,Hiragino Sans GB,"\u5b8b\u4f53",sans-serif;
        -webkit-font-smoothing: antialiased;
        color: #666;
    }
    .m-content {
        margin-bottom: 15px;
    }
    .m-content .mt {
        position: relative;
        padding: 10px;
        background-color: #f7f7f7;
        border: 1px solid #eee;
    }
    .m-content h3 {
        font: 700 14px "microsoft yahei";
    }
    .comment .comment-item {
        zoom: 1;
        border-bottom: 1px solid #ddd;
        position: relative;
        padding: 10px;
    }
    .comment .comment-item .user-column {
        width: 140px;
        float: left;
    }
    .comment .comment-item .user-info {
        white-space: nowrap;
        text-overflow: ellipsis;
        overflow: hidden;
    }
    .comment .comment-item .user-info img {
        border-radius: 50%;
        margin-right: 5px;
    }
    .comment .comment-item .comment-column {
        float: left;
        min-height: 50px;
        margin-left: 30px;
    }
    .comment-time {
        clear: both;
        float: right;
    }
</style>