import {
    addToCart,
    deleteCartPro,
    buyCart
} from '../service/getData'

import {
	DELETE_CART_PRO,
	GET_USERINFO,
    ADD_CART,
    BUY_CART
} from './mutation-types.js'

export default {
    async addToCart({ commit }) {
        let res = await addToCart();
        commit(ADD_CART, res);
    },

    async deleteCartPro({ commit }) {
        let res = await deleteCartPro();
        commit(DELETE_CART_PRO, res);
    }
}