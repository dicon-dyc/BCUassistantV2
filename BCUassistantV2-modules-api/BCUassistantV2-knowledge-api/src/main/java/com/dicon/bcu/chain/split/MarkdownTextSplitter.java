package com.dicon.bcu.chain.split;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author: dyc
 * @Create: 2025/12/3 13:46
 */
@Component
@AllArgsConstructor
@Slf4j
public class MarkdownTextSplitter implements TextSplitter{
    @Override
    public List<String> split(String content, String kid) {
        return null;
    }
}