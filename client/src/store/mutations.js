import {
	ADD_CART,
    DELETE_CART_PRO,
    GET_USERINFO,
    BUY_CART,
} from './mutation-types.js'

export default {
    //加入购物车
    [ADD_CART](state, {
        cartList
    }) {
        let exist = false;
        for (let i of cartList) {
            for(let j of state.cartList) {
                if (i.id == j.id) {
                    exist = true;
                    j.count += i.count;
                    break;
                }
            }
            if (!exist) {
                state.cartList.push(i)
            }
            exist = false;
        }
    },

    //删除购物车某项商品
    [DELETE_CART_PRO](state, {
        proId
    }) {
        for (let i of state.cartList) {
            if (i.id == proId) {
                state.cartList.pop(i)
            }
        }
    }
}