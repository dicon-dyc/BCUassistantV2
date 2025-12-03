package com.dicon.bcu.mapper;

import com.dicon.bcu.core.mapper.BaseMapperPlus;
import com.dicon.bcu.domain.ChatUsageToken;
import com.dicon.bcu.domain.vo.ChatUsageTokenVo;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author: dyc
 * @Create: 2025/12/3 00:09
 */
@Mapper
public interface ChatUsageTokenMapper extends BaseMapperPlus<ChatUsageToken, ChatUsageTokenVo> {

}
