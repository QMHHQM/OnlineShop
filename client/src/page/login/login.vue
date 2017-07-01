<template>
    <div class="loginContainer">
        <form class="loginForm">
            <section class="input_container">
                <input type="text" placeholder="账号" v-model="userId" lazy>
            </section>
            <section class="input_container">
                <input v-if="!showPassword" type="password" placeholder="密码"  v-model="password">
                <input v-else type="text" placeholder="密码"  v-model="password">
                <div class="button_switch" :class="{change_to_text: showPassword}">
                    <div class="circle_button" :class="{trans_to_right: showPassword}" @click="changePassWordType"></div>
                    <span>abc</span>
                    <span>...</span>
                </div>
            </section>
        </form>
    </div>
</template>
<script>
export default {
    data() {
        return {
            showPassword: false,
            userId: null,
            password: null
        }
    },
    methods: {
            //是否显示密码
            changePassWordType(){
                this.showPassword = !this.showPassword;
            },
    }
}
</script>
<style>

</style>