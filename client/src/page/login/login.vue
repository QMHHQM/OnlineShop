<template>
    <div class="loginContainer">
        <div class="logo"></div>
        <div class="loginArea">
            <div class="productTitle">
                <div class="mainTitle">OnlineShop简易购物系统</div>
            </div>
            <div class="splitLine"></div>
            <div class="subTitle">
                <span>一个神奇而简单的购物系统</span>
                <div class="triangle"></div>
            </div>
            <form class="loginForm">
                <div class="form-group">
                    <div class="username">
                        <input class="form-control" type="text" v-model="userId" placeholder="用户名">
                    </div>
                    <div class="password">
                        <input type="password" class="form-control" v-model="password" placeholder="密码">
                    </div>
                    <div class="loginButton">
                        <button type="button" class="btn" @click="accountLogin">登录</button>
                        <!--<button type="button" class="btn" ng-show="processed" ng-bind="'login.btn.loading'|translate"></button>-->
                    </div>
                </div>
                <!--<div class="loginOnErr" v-show="loginOnErr">
                    <span class="fa fa-exclamation-triangle"></span>
                    <span ng-bind="loginOnErrInfo | translate" class="ng-binding">用户名或密码不能为空</span>
                </div>-->
                <div class="loginOnErr" v-show="loginOnErr">
                    <span class="fa fa-exclamation-triangle"></span>
                    <span>用户名或密码不能为空</span>
                </div>
            </form>

        </div>
        <div class="loginPicture"></div>
    </div>
</template>
<script>
import {userLogin} from '../../service/getData'
export default {
    data() {
        return {
            userId: null,           //用户ID
            password: null,          //用户密码
            loginOnErr: false
        }
    },
    methods: {
        //发送登录信息
            async accountLogin(){
                if (!this.userId) {
                    this.showAlert = true;
                    this.alertText = '请输入手机号/邮箱/用户名';
                    return
                }else if(!this.password){
                    this.showAlert = true;
                    this.alertText = '请输入密码';
                    return
                }
                //用户名登录
                this.userInfo = await userLogin(this.userId, this.password);
            }
    }
}
</script>
<style scoped>
    .loginContainer {
        padding: 0;
        margin: 0;
        overflow-y: auto;
        background:url("../../images/login/bg.png");
        height: 100%;
        min-width: 1192px;
    }
    .loginPicture {
        position: absolute;
        background-image: url("../../images/login/lg.png");
        background-repeat: no-repeat;
        background-size: 100% 100%;
        bottom: 0;
        left: 0;
        width: 294px;
        height: 170px;
    }
    .logo {
        position: absolute;
        background-repeat: no-repeat;
        background-size: 100% 100%;
        top: 58px;
        left: 70px;
        background-image: url("../../images/logo.png");
        width: 280px;
        height: 45px;
    }
    .loginArea {
        position: absolute;
        top: 30%;
        right: 160px;
        display: block;
        float: right;
        line-height: 1;
    }
    .loginArea .productTitle {
        border-top: 2px solid #c1c1c1;
        padding-top: 15px;
    }
    .loginArea .splitLine {
        border-bottom: 2px solid #c1c1c1;
        margin: 20px 0;
    }
    .loginArea .subTitle .triangle {
        display: inline-block;
        float: right;
        background-image: url("../../images/login/triangle.png");
        background-repeat: no-repeat;
        background-size: 100% 100%;
        vertical-align: middle;
        height: 24px;
        width: 36px;
        margin-top: 6px;
    }
    .loginArea .mainTitle {
        color: #c1c1c1;
        font-family: 'Microsoft Yahei';
        font-size: 70px;
    }
    .loginArea .subTitle {
        border-bottom: 2px solid #c1c1c1;
        padding-bottom: 20px;
    }
    .loginArea .subTitle span {
        color: #c1c1c1;
        font-family: 'Arial';
        font-size: 32px;
    }
    .loginForm {
        margin-top: 20px;
    }
    .loginForm .form-group {
        margin-right: 0;
        margin-left: 0;
        display: flex;
        flex-direction: row;
        flex-wrap: nowrap;
        justify-content: center;
        align-items: center;
        align-content: stretch;
        margin-bottom: 15px;
    }
    .loginForm .form-group > div {
        position: relative;
    }
    .loginForm .username {
        flex: 1 1 150px;
    }
    .loginForm .password {
        flex: 1 1 150px;
        margin-left: 10px;
    }
    .loginForm .loginButton {
        flex: 1 1 40px;
        margin-left: 10px;
    }
    .loginForm .form-group input {
        height: 36px;
        font-size: 14px;
    }
    .loginForm input {
        background-color: rgba(255, 255, 255, 0.1);
        border: 1px solid rgba(255, 255, 255, .3);
        padding-left: 12px;
        color: #fff;
    }
    .loginButton .btn {
        color: #333;
        display: block;
        width: 100%;
        background: linear-gradient(#9ecf39, #68b92e);
        background: -moz-linear-gradient(#9ecf39, #68b92e);
        background: -webkit-linear-gradient(#9ecf39, #68b92e);
        background: -o-linear-gradient(#9ecf39, #68b92e);
        box-shadow: 0 0 30px 5px rgba(0, 0, 0, 0.3);
    }
    .loginButton .btn {
        height: 36px;
        font-size: 16px;
    }
    .loginOnErr span {
        color: #ff5500;
        font-size: 12px;
        font-weight: 600;
    }
</style>