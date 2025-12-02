package com.dicon.bcu.common.core.service;

/**
 * 基于ThreadLocal封装工具类，用户保存和获取当前登录用户Sa-Token token值
 * @Author: dyc
 * @Create: 2025/11/25 18:10
 */
public class BaseContext {

    private static ThreadLocal<String> threadLocal = new ThreadLocal<>();

    /**
     * 设置值
     * @param token
     */
    public static void setCurrentToken(String token){
        threadLocal.set(token);
    }


    /**
     * 获取值
     * @return token
     */
    public static String getCurrentToken(){
        return threadLocal.get();
    }

}
