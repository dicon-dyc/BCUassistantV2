package com.dicon.bcu.mapper;

import com.dicon.bcu.core.mapper.BaseMapperPlus;
import com.dicon.bcu.domain.KnowledgeInfo;
import com.dicon.bcu.domain.vo.KnowledgeInfoVo;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author: dyc
 * @Create: 2025/12/3 13:41
 */
@Mapper
public interface KnowledgeInfoMapper extends BaseMapperPlus<KnowledgeInfo, KnowledgeInfoVo> {

}
