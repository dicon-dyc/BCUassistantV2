package com.dicon.bcu.mapper;

import com.dicon.bcu.core.mapper.BaseMapperPlus;
import com.dicon.bcu.domain.ChatModel;
import com.dicon.bcu.domain.vo.ChatModelVo;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author: dyc
 * @Create: 2025/12/3 00:18
 */
@Mapper
public interface ChatModelMapper extends BaseMapperPlus<ChatModel, ChatModelVo> {

}

