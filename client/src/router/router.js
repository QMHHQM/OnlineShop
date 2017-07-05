import App from '../App'

const home = r => require.ensure([], () => r(require('../page/home/home')), 'home')
const login = r => require.ensure([], () => r(require('../page/login/login')), 'login')
const test = r => require.ensure([], () => r(require('../components/header/header')), 'test')

export default [         
    //地址为空时跳转home页面
    {
        path: '',
        redirect: './home'
    },
    //首页城市列表页
    {
        path: '/home',
        component: home
    },
    //登录注册页
    {
        path: '/login',
        component: login
    },
    //test
    {
        path: '/test',
        component: test
    }
]
