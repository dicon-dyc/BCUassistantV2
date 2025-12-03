package com.dicon.bcu.chat.enums;

import lombok.Getter;

/**
 * @Author: dyc
 * @Create: 2025/12/3 12:08
 */
@Getter
public enum ChatModelType {
    OLLAMA("ollama", "本地部署模型"),
    CHAT("chat", "中转模型"),
    DIFY("dify", "DIFY"),
    COZE("coze", "扣子"),

    ZHIPU("zhipu", "智谱清言"),

    DEEPSEEK("deepseek", "深度求索"),

    QIANWEN("qianwen", "通义千问"),

    VECTOR("vector", "知识库向量模型"),

    IMAGE("image", "图片识别模型"),

    FASTGPT("fastgpt", "FASTGPT");

    private final String code;
    private final String description;

    ChatModelType(String code, String description) {
        this.code = code;
        this.description = description;
    }

}
