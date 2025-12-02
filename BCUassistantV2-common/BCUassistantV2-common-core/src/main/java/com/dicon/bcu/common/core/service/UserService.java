package com.dicon.bcu.common.core.service;

/**
 * @Author: dyc
 * @Create: 2025/12/2 14:15
 */
public interface UserService {

    /**
     * 通过用户ID查询用户账户
     *
     * @param userId 用户ID
     * @return 用户账户
     */
    String selectUserNameById(Long userId);

    /**
     * 通过用户名称查询余额
     *
     * @param userName
     * @return
     */
    String selectUserByName(String userName);
}
