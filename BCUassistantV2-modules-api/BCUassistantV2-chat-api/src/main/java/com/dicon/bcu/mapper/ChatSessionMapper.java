package com.dicon.bcu.mapper;

import com.dicon.bcu.core.mapper.BaseMapperPlus;
import com.dicon.bcu.domain.ChatSession;
import com.dicon.bcu.domain.vo.ChatSessionVo;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author: dyc
 * @Create: 2025/12/3 13:28
 */
@Mapper
public interface ChatSessionMapper extends BaseMapperPlus<ChatSession, ChatSessionVo> {

}
