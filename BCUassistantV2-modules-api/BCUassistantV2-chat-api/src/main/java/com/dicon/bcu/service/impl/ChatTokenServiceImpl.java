package com.dicon.bcu.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.dicon.bcu.domain.ChatUsageToken;
import com.dicon.bcu.mapper.ChatUsageTokenMapper;
import com.dicon.bcu.service.IChatTokenService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @Author: dyc
 * @Create: 2025/12/3 00:06
 */
@RequiredArgsConstructor
@Service
public class ChatTokenServiceImpl implements IChatTokenService {

    private final ChatUsageTokenMapper baseMapper;

    @Override
    public ChatUsageToken queryByUserId(Long userId, String modelName) {
        return baseMapper.selectOne(
                new LambdaQueryWrapper<ChatUsageToken>()
                        .eq(ChatUsageToken::getUserId, userId)
                        .eq(ChatUsageToken::getModelName, modelName)
                        .last("limit 1")
        );
    }

    /**
     * 清空用户token
     *
     */
    @Override
    public void resetToken(Long userId,String modelName) {
        ChatUsageToken chatToken = queryByUserId(userId, modelName);
        chatToken.setToken(0);
        baseMapper.updateById(chatToken);
    }

    /**
     * 增加用户token
     *
     */
    @Override
    public void editToken(ChatUsageToken chatToken) {
        if(chatToken.getId() == null){
            baseMapper.insert(chatToken);
        }else {
            baseMapper.updateById(chatToken);
        }
    }
}