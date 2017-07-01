import fetch from '../config/fetch'

/**
 * 提交注册信息
 */

export const regist = (userId, userName, password, realName, tel, address, zip, email) => fetch('user/regist.do', {
    userId,
    userName,
    password,
    realName,
    tel,
    address,
    zip,
    email
})

/**
 * 普通用户登录
 */

export const userLogin = (userName, password) => fetch('user/login.do', {
    userName,
    password
})

/**
 * 管理员登录
 */

export const adminLogin = (userName, password) => fetch('admin/login.do', {
    userName,
    password
})

