import App from '../App'

const Home = r => require.ensure([], () => r(require('../page/home/home')), 'home')
// const home = resolve => require(['../page/home/home'], resolve)
const Login = r => require.ensure([], () => r(require('../page/login/login')), 'login')

export default [{
    path: '/',
    component: App,    //顶层路由，对应index.html
    children: [         //二级路由。对应App.vue
        //地址为空时跳转home页面
        {
            path: '',
            redirect: './home'
        },
        //首页城市列表页
        {
            path: '/home',
            component: Home
        },
        //登录注册页
        {
            path: '/login',
            component: Login
        }
    ]
}]