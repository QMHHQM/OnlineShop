<template>
    <footer class="footer">
        <div class="container">
            <div class="row">
                <div class="col-md-4 col-sm-12 footer-info">
                    <div class="logo-wrapper">
                        <img class="logo" src="../../images/team.png">
                        <span class="name">OnlineShop制作团队</span>
                        <div class="slogan">为成为卓越的Web团队而奋斗！</div>
                        <div class="copyright">Copyright
                            <span style="margin:0 3px">©</span>
                            {{thisYear}}
                            <a href="#" target="_blank">Great Team</a>. All Rights Reserved.</div>
                    </div>
                </div>
                <div class="col-md-4 footer-links">
                    <h4>前端开发组(姓名-github账号)</h4>
                    <div class="links">
                        <a href="#" class="link-item">顾睿 - grapes4/gurui</a>
                        <a href="#" class="link-item">王舒洋 - WangDuDu</a>
                        <a href="#" class="link-item">王宁 - iqshen</a>
                        <a href="#" class="link-item">王龚龙 - Never_Later</a>
                    </div>
                </div>
                <div class="col-md-4 footer-links">
                    <h4>后端开发组(姓名-github账号)</h4>
                    <div class="links">
                        <a href="#" class="link-item">何凡 - QMHHQM</a>
                        <a href="#" class="link-item">贾音 - broccolimo</a> 
                        <a href="#" class="link-item">刘超 - T-M-L-C</a>
                        <a href="#" class="link-item">陈昱先 - chenyuxian</a>                        
                    </div>
                </div>
            </div>
        </div>
    </footer>
</template>

<script>
    export default {
    	data(){
            return{
                
            }
        },
        created(){
           
        },
        mounted(){
            
        },
        computed: {
            thisYear: function(){
                return  (new Date).getFullYear()
            }
        },
        methods: {
        	
        },

    }

</script>

<style  scoped>
    .footer {
        padding: 30px 0;
        background: #26282c;
    }
    .footer h4 {
        margin-top: 10px;
        margin-bottom: 10px;
    }
    .footer span,
    .footer h4 {
        color: rgba(255, 255, 255, 0.7);
    }
    .container {
        margin-right: auto;
        margin-left: auto;
        width: 1210px;
    }
    .row {
        margin-left: -15px;
        margin-right: -15px;
    }
    .footer .logo-wrapper {
        padding-left: 0;
        margin-top: 30px;
    }
    .footer .logo {
        width: 40px;
        height: 40px;
        border-radius: 20px;
        position: relative;
        top: -10px;
    }
    .footer .name {
        font-size: 30px;
        font-family: "Segoe UI Light";
    }
    .footer .slogan {
        font-size: 16px;
        margin-top: 5px;
        color: hsla(0,0%,100%,.4);
    }
    .footer .copyright {
        text-align: left;
        margin-top: 30px;
        color: hsla(0,0%,100%,.4);
    }
    .footer a {
        color: hsla(0,0%,100%,.4);
    }
    .footer .footer-links h4 {
        font-size: 14px;
    }
    .footer .links {
        text-align: left;
    }
    .footer .links .link-item {
        display: block;
        font-size: 14px;
        line-height: 24px;
    }
</style>
