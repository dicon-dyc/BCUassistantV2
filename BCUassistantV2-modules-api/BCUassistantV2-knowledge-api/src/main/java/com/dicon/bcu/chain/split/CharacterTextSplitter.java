package com.dicon.bcu.chain.split;

import com.dicon.bcu.common.core.utils.StringUtils;
import com.dicon.bcu.domain.vo.KnowledgeInfoVo;
import com.dicon.bcu.service.IKnowledgeInfoService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: dyc
 * @Create: 2025/12/3 13:44
 */
@Component
@Slf4j
@Primary
public class CharacterTextSplitter implements TextSplitter {

    @Lazy
    @Resource
    private IKnowledgeInfoService knowledgeInfoService;

    @Override
    public List<String> split(String content, String kid) {
        // 从知识库表中获取配置
        KnowledgeInfoVo knowledgeInfoVo = knowledgeInfoService.queryById(Long.valueOf(kid));
        String knowledgeSeparator = knowledgeInfoVo.getKnowledgeSeparator();
        int textBlockSize = knowledgeInfoVo.getTextBlockSize();
        int overlapChar = knowledgeInfoVo.getOverlapChar();
        List<String> chunkList = new ArrayList<>();
        if (content.contains(knowledgeSeparator) && StringUtils.isNotBlank(knowledgeSeparator)) {
            // 按自定义分隔符切分
            String[] chunks = content.split(knowledgeSeparator);
            chunkList.addAll(Arrays.asList(chunks));
        } else {
            int indexMin = 0;
            int len = content.length();
            int i = 0;
            int right = 0;
            while (true) {
                if (len > right) {
                    int begin = i * textBlockSize - overlapChar;
                    if (begin < indexMin) {
                        begin = indexMin;
                    }
                    int end = textBlockSize * (i + 1) + overlapChar;
                    if (end > len) {
                        end = len;
                    }
                    String chunk = content.substring(begin, end);
                    chunkList.add(chunk);
                    i++;
                    right = right + textBlockSize;
                } else {
                    break;
                }
            }
        }
        return chunkList;
    }
}
