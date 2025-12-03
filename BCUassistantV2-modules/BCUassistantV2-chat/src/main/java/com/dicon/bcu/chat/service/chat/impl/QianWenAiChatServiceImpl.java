package com.dicon.bcu.chat.service.chat.impl;

import com.dicon.bcu.chat.enums.ChatModelType;
import com.dicon.bcu.chat.service.chat.IChatService;
import com.dicon.bcu.chat.support.ChatServiceHelper;
import com.dicon.bcu.chat.support.RetryNotifier;
import com.dicon.bcu.common.chat.request.ChatRequest;
import com.dicon.bcu.domain.vo.ChatModelVo;
import com.dicon.bcu.service.IChatModelService;
import dev.langchain4j.model.chat.StreamingChatModel;
import dev.langchain4j.model.chat.response.ChatResponse;
import dev.langchain4j.model.chat.response.StreamingChatResponseHandler;
import dev.langchain4j.community.model.dashscope.QwenStreamingChatModel;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

/**
 * @Author: dyc
 * @Create: 2025/12/3 00:35
 */
@Service
@Slf4j
public class QianWenAiChatServiceImpl  implements IChatService {

    @Autowired
    private IChatModelService chatModelService;


    @Override
    public SseEmitter chat(ChatRequest chatRequest, SseEmitter emitter) {
        ChatModelVo chatModelVo = chatModelService.selectModelByName(chatRequest.getModel());
        StreamingChatModel model = QwenStreamingChatModel.builder()
                .apiKey(chatModelVo.getApiKey())
                .modelName(chatModelVo.getModelName())
                .build();



        // 发送流式消息
        try {
            model.chat(chatRequest.getPrompt(), new StreamingChatResponseHandler() {
                @SneakyThrows
                @Override
                public void onPartialResponse(String partialResponse) {
                    emitter.send(partialResponse);
                    log.info("收到消息片段: {}", partialResponse);
                }

                @Override
                public void onCompleteResponse(ChatResponse completeResponse) {
                    emitter.complete();
                    log.info("消息结束，完整消息ID: {}", completeResponse);
                    RetryNotifier.clear(emitter);
                }

                @Override
                public void onError(Throwable error) {
                    error.printStackTrace();
                    ChatServiceHelper.onStreamError(emitter, error.getMessage());
                }
            });
        } catch (Exception e) {
            log.error("千问请求失败：{}", e.getMessage());
            ChatServiceHelper.onStreamError(emitter, e.getMessage());
        }

        return emitter;

    }

    @Override
    public String getCategory() {
        return ChatModelType.QIANWEN.getCode();
    }



}
