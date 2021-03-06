import App from '../App'

const home = r => require.ensure([], () => r(require('../page/home/home')), 'home')
const login = r => require.ensure([], () => r(require('../page/login/login')), 'login')
const productionList = r => require.ensure([], () => r(require('../page/productionList/productionList')), 'productionList')
const productionInfo = r => require.ensure([], () => r(require('../page/productionInfo/productionInfo')), 'productionInfo')
const userInfo = r => require.ensure([], () => r(require('../page/userInfo/userInfo')), 'userInfo')
const orderList = r => require.ensure([], () => r(require('../page/orderList/orderList')), 'orderList')

export default [         
    //地址为空时跳转home页面
    {
        path: '',
        redirect: '/home'
    },
    //首页
    {
        path: '/home',
        component: home,
        children: [
            {
                path: '',
                component: productionList
            },
            {
                path: 'user-info',
                // meta: {
                //     requireAuth: true,
                // },
                component: userInfo
            },
            {
                path: 'production-info',
                component: productionInfo
            },
            {
                path: 'order-list',
                component: orderList
            }
        ]
    },
    //登录注册页
    {
        path: '/login',
        component: login
    }
]
