import Vue from 'vue'
import Vuex from 'vuex'
import mutations from './mutations'
import actions from './action'
import getters from './getters'

Vue.use(Vuex)

const state = {
	cartList: [
		{
			id: "123",
			src: "//item.jd.com/4155894.html",
			img: "//img14.360buyimg.com/n5/jfs/t4642/55/3978388666/72688/c8b2dcf/59080db2N7ae9168e.jpg",
			title: "罗技（Logitech）G102 游戏鼠标 6000DPI RGB鼠标 黑色",
			price: "139.00",
			count: "1"
		},
		{
			id: "124",
			src: "//item.jd.com/4155894.html",
			img: "//img14.360buyimg.com/n5/jfs/t4642/55/3978388666/72688/c8b2dcf/59080db2N7ae9168e.jpg",
			title: "罗技（Logitech）G102 游戏鼠标 6000DPI RGB鼠标 黑色",
			price: "139.00",
			count: "1"
		},
		{
			id: "125",
			src: "//item.jd.com/4155894.html",
			img: "//img14.360buyimg.com/n5/jfs/t4642/55/3978388666/72688/c8b2dcf/59080db2N7ae9168e.jpg",
			title: "罗技（Logitech）G102 游戏鼠标 6000DPI RGB鼠标 黑色",
			price: "139.00",
			count: "1"
		},
		{
			id: "126",
			src: "//item.jd.com/4155894.html",
			img: "//img14.360buyimg.com/n5/jfs/t4642/55/3978388666/72688/c8b2dcf/59080db2N7ae9168e.jpg",
			title: "罗技（Logitech）G102 游戏鼠标 6000DPI RGB鼠标 黑色",
			price: "139.00",
			count: "1"
		},
		{
			id: "127",
			src: "//item.jd.com/4155894.html",
			img: "//img14.360buyimg.com/n5/jfs/t4642/55/3978388666/72688/c8b2dcf/59080db2N7ae9168e.jpg",
			title: "罗技（Logitech）G102 游戏鼠标 6000DPI RGB鼠标 黑色",
			price: "139.00",
			count: "1"
		},
		{
			id: "128",
			src: "//item.jd.com/4155894.html",
			img: "//img14.360buyimg.com/n5/jfs/t4642/55/3978388666/72688/c8b2dcf/59080db2N7ae9168e.jpg",
			title: "罗技（Logitech）G102 游戏鼠标 6000DPI RGB鼠标 黑色",
			price: "139.00",
			count: "1"
		},
		{
			id: "129",
			src: "//item.jd.com/4155894.html",
			img: "//img14.360buyimg.com/n5/jfs/t4642/55/3978388666/72688/c8b2dcf/59080db2N7ae9168e.jpg",
			title: "罗技（Logitech）G102 游戏鼠标 6000DPI RGB鼠标 黑色",
			price: "139.00",
			count: "1"
		},
		{
			id: "120",
			src: "//item.jd.com/4155894.html",
			img: "//img14.360buyimg.com/n5/jfs/t4642/55/3978388666/72688/c8b2dcf/59080db2N7ae9168e.jpg",
			title: "罗技（Logitech）G102 游戏鼠标 6000DPI RGB鼠标 黑色",
			price: "139.00",
			count: "1"
		},
		{
			id: "121",
			src: "//item.jd.com/4155894.html",
			img: "//img14.360buyimg.com/n5/jfs/t4642/55/3978388666/72688/c8b2dcf/59080db2N7ae9168e.jpg",
			title: "罗技（Logitech）G102 游戏鼠标 6000DPI RGB鼠标 黑色",
			price: "139.00",
			count: "1"
		},
	], //所有商品列表
	productionInfo: {
		proId: "123",
		title: "PLT 连衣裙2017春夏季新款韩版修身显瘦性感女装蕾丝雪纺夏天新品裙子 白色-1667 M",
		image: "//img10.360buyimg.com/n1/s350x449_jfs/t4561/77/2330070910/339017/fc1d6906/58edde72N5cedcfd5.jpg!cc_350x449.jpg",
		price: "179.00",
		describtion: "商品介绍商品介绍商品介绍商品介绍商品介绍商品介绍商品介绍商品介绍商品介绍商品介绍",
		commentList: [
			{
				userName: "刘***红 ",
				content: "穿上很舒服",
				avatar: "//misc.360buyimg.com/lib/img/u/b61.gif",
				time: "2017-04-07 00:14"
			},
			{
				userName: "刘***红 ",
				content: "穿上很舒服",
				avatar: "//misc.360buyimg.com/lib/img/u/b61.gif",
				time: "2017-04-07 00:14"
			},
			{
				userName: "刘***红 ",
				content: "穿上很舒服",
				avatar: "//misc.360buyimg.com/lib/img/u/b61.gif",
				time: "2017-04-07 00:14"
			},
			{
				userName: "刘***红 ",
				content: "穿上很舒服",
				avatar: "//misc.360buyimg.com/lib/img/u/b61.gif",
				time: "2017-04-07 00:14"
			},
			{
				userName: "刘***红 ",
				content: "穿上很舒服",
				avatar: "//misc.360buyimg.com/lib/img/u/b61.gif",
				time: "2017-04-07 00:14"
			}
		]
    }
}

export default new Vuex.Store({
	state,
	getters,
	actions,
	mutations,
})
