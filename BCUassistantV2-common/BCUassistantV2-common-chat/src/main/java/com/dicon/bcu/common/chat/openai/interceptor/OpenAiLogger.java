package com.dicon.bcu.common.chat.openai.interceptor;

import lombok.extern.slf4j.Slf4j;
import okhttp3.logging.HttpLoggingInterceptor;

/**
 * @Author: dyc
 * @Create: 2025/12/3 12:45
 */
@Slf4j
public class OpenAiLogger implements HttpLoggingInterceptor.Logger {
    @Override
    public void log(String message) {
        log.info("OkHttp-------->:{}", message);
    }
}
