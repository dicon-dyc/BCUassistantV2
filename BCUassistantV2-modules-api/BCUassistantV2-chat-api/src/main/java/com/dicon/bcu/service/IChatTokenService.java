package com.dicon.bcu.service;

import com.dicon.bcu.domain.ChatUsageToken;

/**
 * @Author: dyc
 * @Create: 2025/12/2 23:48
 */
public interface IChatTokenService {

    /**
     * 查询用户token
     */
    ChatUsageToken queryByUserId(Long userId, String modelName);

    /**
     * 清空用户token
     */
    void resetToken(Long userId,String modelName);

    /**
     * 修改用户token
     */
    void editToken(ChatUsageToken chatToken);

}
