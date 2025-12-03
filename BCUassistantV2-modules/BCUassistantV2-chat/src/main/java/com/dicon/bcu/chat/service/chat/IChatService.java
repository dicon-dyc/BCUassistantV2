package com.dicon.bcu.chat.service.chat;

import com.dicon.bcu.common.chat.request.ChatRequest;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

/**
 * @Author: dyc
 * @Create: 2025/12/3 00:34
 */
public interface IChatService {

    /**
     * 客户端发送消息到服务端
     * @param chatRequest 请求对象
     */
    SseEmitter chat(ChatRequest chatRequest, SseEmitter emitter);
    /**
     * 获取此服务支持的模型类别
     */
    String getCategory();
}