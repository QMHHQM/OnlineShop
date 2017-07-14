<template>
    <div class="orderlist">
        <div class="mod-main mod-comm mod-order">
            <div class="mt">
                <h3>我的订单</h3>
            </div>
        </div>
        
        <div class="mod-main mod-comm lefta-box">
            <div class="mt">
                <ul class="extra-l">
                    <li class="fore1">
                        <a href="#" class="txt curr">全部订单</a>
                    </li>
                    <li>
                        <a href="#" id="ordertoPay"  class="txt">待付款</a>
                    </li>
                    <li>
                        <a href="#" id="ordertoReceive"  class="txt">待收货</a>
                    </li>
                    <li>
                        <a href="#" id="ordertoComment" target="_blank" class="txt">待评价</a>
                    </li>
                </ul>
                <div class="extra-r">
                    <div class="search">
                        <input id="ip_keyword" type="text" class="itxt" value="商品名称/商品编号/订单号" style="color: rgb(204, 204, 204);">
                        <a href="javascript:;" class="search-btn" >搜索
                            <b></b>
                        </a>
                    </div>
                </div>
            </div>

                <table class="td-void order-tb">
                     <thead>
                        <tr>
                            <th>
                                <div class="order-detail-txt ac">订单详情</div>
                            </th>
                            <th>收货人</th>
                            <th>金额</th>
                            <th>状态</th>
                            <th>操作</th>
                        </tr>
                    </thead>
                    <tbody v-for="(item, index) in orderList">
                         <tr class="sep-row">
                            <td colspan="5"></td>
                        </tr>

                       <tr class="tr-th">
                            <td colspan="5">
                                <span class="gap"></span>
                                <span class="dealtime" :title="item.dealtime">{{ item.dealtime }}</span>
                                <span class="number">
                                    订单号：
                                    <a href="#" >{{ item.orderNumber }}</a>
                                </span>

                                <div class="tr-operate">
                                    <span class="order-shop">
                                        <a href="#" class="shop-txt"  :title="item.shop">{{ item.shop }}</a>
                                    </span>
                                </div>
                            </td>
                        </tr>

                       <tr class="tr-bd">
                            <td>
                                <div class="goods-item">
                                    <div class="p-img">
                                        <a href="#">
                                            <img :src="item.img" :title="item.title" width="60" height="60">
                                        </a>
                                    </div>
                                    <div class="p-msg">
                                        <div class="p-name">
                                            <a href="#" class="a-link" :title="item.title">{{ item.title }}</a>
                                        </div>
                                    </div>
                                </div>
                                <div class="goods-number">
                                    x{{ item.count }}
                                </div>
                                <div class="clr"></div>
                            </td>

                            <td rowspan="1">
                                <div class="consignee tooltip">
                                    <span class="txt">{{ item.receiver}}</span>
                                    <b></b>
                                    <div class="prompt-01 prompt-02" style="display: none;">
                                        <div class="pc">
                                            <strong>{{ item.receiver}}</strong>
                                            <p>{{ item.address }}</p>
                                            <p>{{ item.phone }}</p>
                                        </div>
                                    </div>
                                </div>
                            </td>
                            <td rowspan="1">
                                <div class="amount">
                                    <span>总额 ¥{{ (item.account * item.count).toFixed(2) }}</span>
                                    <br>
                                    <strong>应付</strong>
                                    <br>
                                    <strong>¥{{ item.account }}</strong>
                                    <br>
                                    <span class="ftx-13">{{ item.paytype }}</span>
                                </div>
                            </td>
                            <td rowspan="1">
                                <div class="status">
                                    <span class="order-status ftx-02">
                                        {{ item.status }}
                                    </span>
                                    <br>
                                    <a href="#"  target="_blank">订单详情</a>
                                </div>
                            </td>
                            <td rowspan="1">
                                <div class="operate">
                                    <a href="#">{{ item.operate }}</a>
                                    <br>
                                </div>
                            </td>
                        </tr>

                    </tbody>
                </table> 

                <div class="mt20">
                    <div class="pagin fr">
                        <span class="prev-disabled">上一页
                            <b></b>
                        </span>
                        <a class="current">1</a>
                        <span class="next-disabled">下一页
                            <b></b>
                        </span>

                    </div>
                    <div class="clr"></div>
                </div>
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
            orderList() {
                return this.$store.state.orderList
            }
        }
    }
</script>

<style scoped>
    .orderlist {
        width: 1210px;
        margin: 0 auto;
    }
    .mod-comm {
        padding: 10px 20px 20px;
    }
    .mod-main {
        padding: 10px;
        background-color: #fff;
        margin-bottom: 20px;
    }
    div.mod-order .mt {
        padding: 10px 0 0;
    }
    .mod-comm .mt h3 {
        font-size: 12px;
        color: #666;
        font-family: '\5b8b\4f53';
        line-height: 18px;
        font-weight: bold;
    }
    .mod-comm .mt {
         padding: 10px 0; 
    }
    .mod-main .mt {
        display: block;
         padding: 10px; 
    }
    .mod-main .mt .extra-l {
        float: left;
        display: block;
    }
    div.mod-main .mt .extra-l li {
        padding-right: 20px;
        float: left;
    }
    a:hover {
        text-decoration: none;
    }
    a:hover {
        color: #003664;
    }
    .mod-main .mt .extra-l li a {
        display: inline-block;
        vertical-align: middle;
        color: #333;
        text-decoration: none;
    }
    .mod-main .mt .extra-l li a:hover, .mod-main .mt .extra-l li a:hover em {
        color: #003664;
    }
    .mod-main .mt .extra-l li a.curr {
        padding-bottom: 0;
        color: #003664;
        border-bottom: 2px solid #003664;
        font-weight: 700;
        cursor: pointer;
        text-decoration: none;
    }
    .mod-main .mt .extra-r {
        float: right;
    }
    .mt .search {
        position: relative;
        top: -3px;
        overflow: hidden;
    }
    .mt .search .itxt {
        float: left;
        width: 158px;
        height: 25px;
        color: rgb(204, 204, 204);
        line-height: 18px;
        padding: 2px 5px 3px;
        border: 1px solid #ccc;
    }
    .mt .search .search-btn {
        position: relative;
        float: left;
        width: 52px;
        height: 25px;
        line-height: 99em;
        overflow: hidden;
        border: 1px solid #ddd;
        border-left: 0;
        text-align: center;
        background-color: #f7f7f7;
    }
    .mt .search .search-btn b {
        position: absolute;
        left: 17px;
        top: 3px;
        display: inline-block;
        vertical-align: middle;
        width: 18px;
        height: 16px;
        overflow: hidden;
        background: url(//misc.360buyimg.com/user/myjd/ordercenter/css/i/order-icons.png) -8px -58px;
    }
    .mod-comm .mc {
        line-height: 20px;
    }
    .mod-main .mc {
        overflow: visible;
    }
    .order-tb {
        width: 100%;
    }
    table {
        border-collapse: collapse;
    }
    .m, .mb, .mc, .mt, .sm, .smb, .smc, .smt {
        overflow: hidden;
        zoom: 1;
    }
    .order-tb thead th {
        height: 32px;
        line-height: 32px;
        text-align: center;
        background: #f5f5f5;
        color: #666;
        font-weight: 400;
    }
    .order-tb tbody {
        margin-bottom: 20px;
    }
    .order-tb .order-detail-txt {
        display: inline-block;
        vertical-align: middle;
    }
    .order-tb .tr-bd td {
        padding: 14px 0;
    }
    .order-tb tbody td {
        border: 1px solid #e5e5e5;
    }
    .order-tb .tr-th {
        background: #f5f5f5;
        height: 31px;
        line-height: 31px;
        color: #aaa;
        overflow: hidden;
    }
    .order-tb .tr-th td {
        border-bottom-color: #f5f5f5;
    }
    .order-tb tbody td {
        border: 1px solid #e5e5e5;
    }
    .order-tb .tr-th .dealtime {
        margin-right: 70px;
        font-family: verdana;
    }
    .order-tb .tr-th .number {
        width: 250px;
        font-family: verdana;
    }
    .order-tb .tr-th .order-shop {
        width: 178px;
    }
    .order-tb .tr-th span {
        float: left;
        height: 18px;
        line-height: 18px;
        padding: 2px 0 0;
    }
    .order-tb .goods-item {
        width: 340px;
        margin-right: 74px;
    }
    .order-tb .goods-item {
        display: block;
        float: left;
    }
    .order-tb .goods-item .p-img {
        float: left;
        width: 60px;
        height: 60px;
        border: 1px solid #efefef;
        margin: 0 14px;
    }
    .order-tb .goods-item .p-name {
        height: 36px;
        line-height: 18px;
        overflow: hidden;
        color: #333;
        text-align: left;
    }
    .order-tb .goods-number {
        width: 70px;
        float: left;
        text-align: left;
        color: #aaa;
        font-family: verdana;
    }
    .order-tb .tooltip {
        position: relative;
        width: 100px;
        margin: 0 auto;
        z-index: 2;
        cursor: pointer;
        opacity: 1;
    }
    .order-tb .consignee {
        color: #333;
    }
    .order-tb .consignee .txt {
        display: inline-block;
        white-space: nowrap;
        overflow: hidden;
        max-width: 72px;
        text-overflow: ellipsis;
        vertical-align: middle;
    }
    .clear, .clr {
        display: block;
        overflow: hidden;
        clear: both;
        height: 0;
        line-height: 0;
        font-size: 0;
    }
    .order-tb .amount {
        color: #AAA;
    }
    .order-tb .amount strong {
        font-family: verdana;
        color: #333;
    }
    .order-tb .tr-bd {
        text-align: center;
        vertical-align: top;
    }
    .order-tb .amount .ftx-13 {
        display: block;
        margin: 0 8px;
        margin-top: 5px;
        padding-top: 1px;
        border-top: solid 1px #E5E5E5;
        line-height: 19px;
        height: 19px;
        overflow: hidden;
    }
    .ftx-13 {
        color: #aaa;
    }
    .order-tb .status {
        position: relative;
        z-index: 5;
        color: #333;
        line-height: 22px;
    }
    .order-tb .status .bean-tips, .order-tb .status a:hover {
        color: #003664;
    }
    .order-tb .sep-row {
        height: 20px;
    }
    .order-tb .sep-row td {
        border: 0;
    }
    .mt20 {
        margin-top: 20px;
    }
    .fr {
        float: right;
    }
    .pagin .prev, .pagin .prev-disabled {
        padding-left: 12px;
    }
    .pagin .next-disabled, .pagin .prev-disabled {
        color: #ccc;
        cursor: default;
    }
    .pagin .next, .pagin .next-disabled, .pagin .prev, .pagin .prev-disabled {
        position: relative;
        padding-top: 5px;
        height: 18px;
        line-height: 18px;
    }
    .pagin .prev, .pagin .prev-disabled {
        padding-left: 12px;
    }
    .pagin .next-disabled, .pagin .prev-disabled {
        color: #ccc;
        cursor: default;
    }
    .pagin .next, .pagin .next-disabled, .pagin .prev, .pagin .prev-disabled {
        position: relative;
        padding-top: 5px;
        height: 18px;
        line-height: 18px;
        box-sizing: content-box; 
    }
    .pagin a:active, .pagin a:hover {
        background: #005aa0;
        color: #fff;
        text-decoration: none;
    }
    .pagin .next, .pagin .next-disabled {
        padding-right: 12px;
    }
    .pagin .next-disabled, .pagin .prev-disabled {
        color: #ccc;
        cursor: default;
    }
    .pagin .next, .pagin .next-disabled, .pagin .prev, .pagin .prev-disabled {
        position: relative;
        padding-top: 5px;
        height: 18px;
        line-height: 18px;
    }
    .pagin .current, .pagin .current:link, .pagin .current:visited {
        color: #f60;
        font-weight: 700;
        height: 28px;
    }
    .pagin .current, .pagin .text {
        border: 0;
        padding: 4px 11px;
    }
    .pagin a, .pagin span {
        float: left;
        padding: 3px 10px;
        border: 1px solid #ccc;
        margin-left: 2px;
        font-family: arial;
        font-size: 14px;
        overflow: hidden;
        -moz-border-radius: 5px;
        -webkit-border-radius: 5px;
    }
    .order-tb .tr-th .gap {
        width: 14px;
    }
</style>