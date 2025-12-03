package com.dicon.bcu.mapper;

import com.dicon.bcu.core.mapper.BaseMapperPlus;
import com.dicon.bcu.domain.ChatMessage;
import com.dicon.bcu.domain.vo.ChatMessageVo;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author: dyc
 * @Create: 2025/12/2 23:43
 */
@Mapper
public interface ChatMessageMapper extends BaseMapperPlus<ChatMessage, ChatMessageVo> {

}
