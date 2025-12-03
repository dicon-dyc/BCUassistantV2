package com.dicon.bcu.common.chat.openai.function;

import cn.hutool.core.util.RandomUtil;

import java.util.List;

/**
 * @Author: dyc
 * @Create: 2025/12/2 22:02
 */
public class KeyRandomStrategy implements KeyStrategyFunction<List<String>, String> {

    @Override
    public String apply(List<String> apiKeys) {
        return RandomUtil.randomEle(apiKeys);
    }
}
