import Vue from 'vue'
import VueRouter from 'vue-router'
import routes from './router/router'
import store from './store/'
import App from './App.vue'

Vue.use(VueRouter)

const router = new VueRouter({
    routes,
    mode: 'history'
})

router.beforeEach((to, from, next) => {
    if (to.meta.requireAuth) {
        if(!isEmptyObject(store.state.user)) {   
             next();
         }
        else {
            next({
                path: '/login',
                query: { redirect: to.fullPath }
            })
        }
    }
    else {
        next();
    }
})

function isEmptyObject(obj) {
    console.log 
    for (let key in obj) {
        return false;
    }
    return true;
}

new Vue({
    el: '#app',
    router,
    store,
    render: h => h(App)
})