<template>
    <div id="profile" class="sns-config">
        <div class="sns-tab tab-app">
            <ul>
                <li class="selected">
                    <span>个人资料</span>
                </li>
            </ul>
        </div>
        <div class="sns-box box-detail">
            <div class="bd">
                <div class="sns-nf">
                    <div class="tips-box">亲爱的
                        <b>何凡</b>，填写真实的资料，有助于好友找到你哦。</div>
                    <form id="baseInfoForm" name="baseInfoForm" method="post" class="infoForm">
                        <div id="main-profile" class="parts">
                            <p>
                                <label>当前头像：</label>
                                <span class="pf-avatar-box">
                                    <a class="pf-avatar">
                                        <img src="//wwc.alicdn.com/avatar/getAvatar.do?userId=1020386848&amp;width=80&amp;height=80&amp;type=sns">
                                    </a>
                                </span>
                            </p>
                            <p>
                                <label>昵称：
                                    <em>*</em>
                                </label>
                                <input id="J_uniqueName-mask" class="f-txt" type="text" value="g*****4" maxlength="25">
                                <input id="J_uniqueName" name="_fm.b._0.u" type="hidden" value="grapes4" maxlength="25">
                            </p>
                            <p>
                                <label>真实姓名：</label>
                                <input id="J_realname-mask" class="f-txt" type="text" value="" maxlength="6">
                                <input id="J_realname" name="_fm.b._0.r" type="hidden" value="" maxlength="6">
                            </p>
                            <p>
                                <label>性别：
                                    <em>*</em>
                                </label>
                                <label for="J_gender1" class="except">
                                    <input id="J_gender1" type="radio" name="_fm.b._0.g" value="0" checked="checked">男</label>
                                <label for="J_gender2" class="except">
                                    <input id="J_gender2" type="radio" name="_fm.b._0.g" value="1">女</label>
                            </p>
                            <p>
                                <label>生日：</label>
                                <select id="J_Year" name="_fm.b._0.y">
                                    <option selected="selected">年</option>
                                    <option value="1940">1940</option>
                                    <option value="1941">1941</option>
                                    <option value="1942">1942</option>
                                    <option value="1943">1943</option>
                                    <option value="1944">1944</option>
                                    <option value="1945">1945</option>
                                    <option value="1946">1946</option>
                                    <option value="1947">1947</option>
                                    <option value="1948">1948</option>
                                    <option value="1949">1949</option>
                                    <option value="1950">1950</option>
                                    <option value="1951">1951</option>
                                    <option value="1952">1952</option>
                                    <option value="1953">1953</option>
                                    <option value="1954">1954</option>
                                    <option value="1955">1955</option>
                                    <option value="1956">1956</option>
                                    <option value="1957">1957</option>
                                    <option value="1958">1958</option>
                                    <option value="1959">1959</option>
                                    <option value="1960">1960</option>
                                    <option value="1961">1961</option>
                                    <option value="1962">1962</option>
                                    <option value="1963">1963</option>
                                    <option value="1964">1964</option>
                                    <option value="1965">1965</option>
                                    <option value="1966">1966</option>
                                    <option value="1967">1967</option>
                                    <option value="1968">1968</option>
                                    <option value="1969">1969</option>
                                    <option value="1970">1970</option>
                                    <option value="1971">1971</option>
                                    <option value="1972">1972</option>
                                    <option value="1973">1973</option>
                                    <option value="1974">1974</option>
                                    <option value="1975">1975</option>
                                    <option value="1976">1976</option>
                                    <option value="1977">1977</option>
                                    <option value="1978">1978</option>
                                    <option value="1979">1979</option>
                                    <option value="1980">1980</option>
                                    <option value="1981">1981</option>
                                    <option value="1982">1982</option>
                                    <option value="1983">1983</option>
                                    <option value="1984">1984</option>
                                    <option value="1985">1985</option>
                                    <option value="1986">1986</option>
                                    <option value="1987">1987</option>
                                    <option value="1988">1988</option>
                                    <option value="1989">1989</option>
                                    <option value="1990">1990</option>
                                    <option value="1991">1991</option>
                                    <option value="1992">1992</option>
                                    <option value="1993">1993</option>
                                    <option value="1994">1994</option>
                                    <option value="1995">1995</option>
                                    <option value="1996">1996</option>
                                    <option value="1997">1997</option>
                                    <option value="1998">1998</option>
                                    <option value="1999">1999</option>
                                    <option value="2000">2000</option>
                                    <option value="2001">2001</option>
                                    <option value="2002">2002</option>
                                    <option value="2003">2003</option>
                                    <option value="2004">2004</option>
                                    <option value="2005">2005</option>
                                    <option value="2006">2006</option>
                                    <option value="2007">2007</option>
                                    <option value="2008">2008</option>
                                    <option value="2009">2009</option>
                                    <option value="2010">2010</option>
                                    <option value="2011">2011</option>
                                    <option value="2012">2012</option>
                                    <option value="2013">2013</option>
                                    <option value="2014">2014</option>
                                    <option value="2015">2015</option>
                                    <option value="2016">2016</option>
                                    <option value="2017">2017</option>
                                </select>
                                <select id="J_Month" name="_fm.b._0.m">
                                    <option selected="selected">月</option>
                                    <option value="1">1</option>
                                    <option value="2">2</option>
                                    <option value="3">3</option>
                                    <option value="4">4</option>
                                    <option value="5">5</option>
                                    <option value="6">6</option>
                                    <option value="7">7</option>
                                    <option value="8">8</option>
                                    <option value="9">9</option>
                                    <option value="10">10</option>
                                    <option value="11">11</option>
                                    <option value="12">12</option>
                                </select>
                                <select id="J_Date" name="_fm.b._0.d">
                                    <option selected="selected">日</option>
                                    <option value="1">1</option>
                                    <option value="2">2</option>
                                    <option value="3">3</option>
                                    <option value="4">4</option>
                                    <option value="5">5</option>
                                    <option value="6">6</option>
                                    <option value="7">7</option>
                                    <option value="8">8</option>
                                    <option value="9">9</option>
                                    <option value="10">10</option>
                                    <option value="11">11</option>
                                    <option value="12">12</option>
                                    <option value="13">13</option>
                                    <option value="14">14</option>
                                    <option value="15">15</option>
                                    <option value="16">16</option>
                                    <option value="17">17</option>
                                    <option value="18">18</option>
                                    <option value="19">19</option>
                                    <option value="20">20</option>
                                    <option value="21">21</option>
                                    <option value="22">22</option>
                                    <option value="23">23</option>
                                    <option value="24">24</option>
                                    <option value="25">25</option>
                                    <option value="26">26</option>
                                    <option value="27">27</option>
                                    <option value="28">28</option>
                                    <option value="29">29</option>
                                    <option value="30">30</option>
                                    <option value="31">31</option>
                                </select>
                                <sub>（出生年份为保密）</sub>
                                <span>星座：</span>
                                <select id="astro" name="astro" disabled="disabled">
    
                                    <option value="">-------------</option>
                                </select>
                            </p>
                            <div class="sns-msg" id="J_birthdayTip" style="display:none;">
                                <p class="error">生日如果填写的话请填写完整！</p>
                            </div>
                            <p>
                                <label>居住地：</label>
                                <select name="_fm.b._0.p" id="J_redstar_province">
                                    <option value=""></option>
                                    <option value="110000">北京</option>
                                    <option value="120000">天津</option>
                                    <option value="130000">河北省</option>
                                    <option value="140000">山西省</option>
                                    <option value="150000">内蒙古自治区</option>
                                    <option value="210000">辽宁省</option>
                                    <option value="220000">吉林省</option>
                                    <option value="230000">黑龙江省</option>
                                    <option value="310000">上海</option>
                                    <option value="320000">江苏省</option>
                                    <option value="330000">浙江省</option>
                                    <option value="340000">安徽省</option>
                                    <option value="350000">福建省</option>
                                    <option value="360000">江西省</option>
                                    <option value="370000">山东省</option>
                                    <option value="410000">河南省</option>
                                    <option value="420000">湖北省</option>
                                    <option value="430000">湖南省</option>
                                    <option value="440000">广东省</option>
                                    <option value="450000">广西壮族自治区</option>
                                    <option value="460000">海南省</option>
                                    <option value="500000">重庆</option>
                                    <option value="510000">四川省</option>
                                    <option value="520000">贵州省</option>
                                    <option value="530000">云南省</option>
                                    <option value="540000">西藏自治区</option>
                                    <option value="610000">陕西省</option>
                                    <option value="620000">甘肃省</option>
                                    <option value="630000">青海省</option>
                                    <option value="640000">宁夏回族自治区</option>
                                    <option value="650000">新疆维吾尔自治区</option>
                                    <option value="710000">台湾省</option>
                                    <option value="810000">香港特别行政区</option>
                                    <option value="820000">澳门特别行政区</option>
                                    <option value="990000">海外</option>
                                </select>
                                <select name="_fm.b._0.c" id="J_redstar_city"></select>
                                <select name="_fm.b._0.a" id="J_redstar_area"></select>                            
                            </p>
                            <p>
                                <label>家乡：</label>
                                <select id="J_live_province" name="_fm.b._0.ho">
                                    <option value=""></option>
                                    <option value="110000">北京</option>
                                    <option value="120000">天津</option>
                                    <option value="130000">河北省</option>
                                    <option value="140000">山西省</option>
                                    <option value="150000">内蒙古自治区</option>
                                    <option value="210000">辽宁省</option>
                                    <option value="220000">吉林省</option>
                                    <option value="230000">黑龙江省</option>
                                    <option value="310000">上海</option>
                                    <option value="320000">江苏省</option>
                                    <option value="330000">浙江省</option>
                                    <option value="340000">安徽省</option>
                                    <option value="350000">福建省</option>
                                    <option value="360000">江西省</option>
                                    <option value="370000">山东省</option>
                                    <option value="410000">河南省</option>
                                    <option value="420000">湖北省</option>
                                    <option value="430000">湖南省</option>
                                    <option value="440000">广东省</option>
                                    <option value="450000">广西壮族自治区</option>
                                    <option value="460000">海南省</option>
                                    <option value="500000">重庆</option>
                                    <option value="510000">四川省</option>
                                    <option value="520000">贵州省</option>
                                    <option value="530000">云南省</option>
                                    <option value="540000">西藏自治区</option>
                                    <option value="610000">陕西省</option>
                                    <option value="620000">甘肃省</option>
                                    <option value="630000">青海省</option>
                                    <option value="640000">宁夏回族自治区</option>
                                    <option value="650000">新疆维吾尔自治区</option>
                                    <option value="710000">台湾省</option>
                                    <option value="810000">香港特别行政区</option>
                                    <option value="820000">澳门特别行政区</option>
                                    <option value="990000">海外</option>
                                </select>
                                <select id="J_live_city" name="_fm.b._0.hom"></select>
                                <select id="J_live_area" name="_fm.b._0.home"></select>
                            </p>
                        </div>
                        <div class="act skin-blue">
                            <span class="btn n-btn">
                                <button type="submit" id="J_saveProfile">保存</button>
                            </span>
                        </div>
                    </form>
                </div>
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
    }
</script>
<style scoped>
    .sns-config {
        width: 1210px;
        margin: 0 auto;
        margin-top: 15px;
        margin-bottom: 15px;
    }
    .sns-tab {
        position: relative;
        z-index: 1;
        margin-top: 10px;
    }
    .tab-app ul {
        margin-bottom: -1px;
    }
    .sns-tab ul {
        position: relative;
        z-index: 10;
        overflow: hidden
    }
    .tab-app ul li {
        margin-bottom: -1px;
    }
    .sns-tab ul li {
        float: left;
        position: relative;
        z-index: 10;
    }
    .tab-app li.selected {
        border: 1px solid #DCDCDC;
        border-bottom: 0;
        background-color: #fff;
        padding: 0 5px;
    }
    .tab-app li.selected span {
        height: 24px;
        line-height: 23px;
        color: #333;
        text-decoration: none;
        font-weight: 700;
    }
    .sns-tab ul.tab-sub {
        border-top: 1px solid #dcdcdc;
        z-index: 1;
    }
    .sns-tab ul.tab-sub, .tab-sub ul {
        border-bottom: 1px solid #D1D1D1;
        padding: 5px 10px 4px;
        background-color: #fff;
    }
    .sns-config .sns-tab ul.tab-sub {
        border-left: 1px solid #DCDCDC;
        border-right: 1px solid #DCDCDC;
    }
    .mytaobao-v2 .box-detail .bd {
        min-height: 390px;
    }
    .box-detail .bd {
        border-top: 0;
    }
    .sns-box .bd {
        border: 1px solid #dcdcdc;
        padding: 10px;
        background-color: #fff;
        position: relative;
        zoom: 1;
    }
    .sns-config .sns-box .sns-nf, .sns-nf {
        width: 720px;
        margin: 0 auto;
        padding: 10px 0;
    }
    .sns-config .bd .tips-box {
        font-size: 15px;
        margin: 10px 0;
    }
    .sns-config .parts {
        border-bottom: 1px solid #dfdfdf;
        padding: 10px 0;
        margin-bottom: 10px;
        zoom: 1;
    }
    .sns-config .sns-nf p {
        line-height: 25px;
        position: relative;
        padding-left: 6em;
    }
    .sns-nf p {
        min-height: 25px;
        margin-bottom: 10px;
    }
    .sns-config .sns-nf label {
        position: absolute;
        vertical-align: middle;
        left: 0;
        height: 26px;
        line-height: 26px;
        display: block;
    }
    .sns-nf .label, .sns-nf label {
        width: 6em;
        color: #333;
    }
    .infoForm .pf-avatar-box {
        display: inline-block;
        position: relative;
        border: 3px solid #e6e6e6;
        width: 80px;
        height: 80px;
    }
    .infoForm .pf-avatar-box .pf-avatar {
        display: table-cell;
        width: 80px;
        height: 80px;
        vertical-align: middle;
        text-align: center;
    }
    .infoForm .pf-avatar-box .pf-avatar img {
        vertical-align: middle;
    }
    .input-1, .sns-nf .f-checkcode, .sns-nf .f-txt, .sns-nf textarea {
        padding: 5px;
        border: 1px solid #cecece;
        width: 320px;
        background: url(//assets.alicdn.com/app/sns/img/input_bg.png) no-repeat 0 0;
    }
    #J_uniqueName {
        width: 136px;
    }
    .sns-config .sns-nf label em {
        color: #999;
        position: absolute;
        left: -12px;
        top: 4px;
    }
    .sns-config .sns-nf label.except {
        width: auto;
        margin-right: 10px;
        position: static;
        display: inline;
    }
    .sns-config .sns-nf p select {
        font-size: 13px;
        color: #666;
        border-color: rgb(169, 169, 169);
        border: 1px solid;
    }
    .sns-config .sns-nf sub {
        margin-bottom: 0;
        font-size: 12px;
        bottom: 0;
    }
    .sns-nf p sub {
        font-style: normal;
        color: #989898;
        margin-left: 1em;
        position: relative;
    }
    .sns-config .sns-nf .act {
        padding: 0;
    }
    .sns-config .act .btn {
        margin-left: 6em;
    }
    .skin-blue .btn {
        background-position: 0 -53px;
    }
    .btn a, .btn button {
        display: block;
        color: #fff;
        padding: 0 11px;
        background-position: 100% -320px;
        border: 0;
        cursor: pointer;
        line-height: 22px;
        background-color: #FFAC00;
    }
</style>