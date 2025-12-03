package com.dicon.bcu.chat.config;

import com.dicon.bcu.common.chat.openai.OpenAiStreamClient;
import com.dicon.bcu.common.chat.openai.function.KeyRandomStrategy;
import com.dicon.bcu.common.core.service.ConfigService;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.dicon.bcu.common.chat.openai.interceptor.OpenAiLogger;

import java.util.Collections;
import java.util.concurrent.TimeUnit;

/**
 * @Author: dyc
 * @Create: 2025/12/3 12:14
 */
@Configuration
@RequiredArgsConstructor
public class ChatConfig {

    private final ConfigService configService;

    @Getter
    private OpenAiStreamClient openAiStreamClient;

    @Bean
    public OpenAiStreamClient openAiStreamClient() {
        String apiHost = configService.getConfigValue("chat", "apiHost");
        String apiKey = configService.getConfigValue("chat", "apiKey");
        openAiStreamClient = createOpenAiStreamClient(apiHost,apiKey);
        return openAiStreamClient;
    }

    public static OpenAiStreamClient createOpenAiStreamClient(String apiHost, String apiKey) {
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(new OpenAiLogger());
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.HEADERS);
        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .addInterceptor(httpLoggingInterceptor)
                .connectTimeout(30, TimeUnit.SECONDS)
                .writeTimeout(600, TimeUnit.SECONDS)
                .readTimeout(600, TimeUnit.SECONDS)
                .build();
        return OpenAiStreamClient.builder()
                .apiHost(apiHost)
                .apiKey(Collections.singletonList(apiKey))
                .keyStrategy(new KeyRandomStrategy())
                .okHttpClient(okHttpClient)
                .build();
    }
}
