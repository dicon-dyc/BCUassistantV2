package com.dicon.bcu.system.mapper;

import com.dicon.bcu.core.mapper.BaseMapperPlus;
import com.dicon.bcu.system.domain.ChatConfig;
import com.dicon.bcu.system.domain.vo.ChatConfigVo;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author: dyc
 * @Create: 2025/12/3 12:39
 */
@Mapper
public interface ChatConfigMapper extends BaseMapperPlus<ChatConfig, ChatConfigVo> {

}