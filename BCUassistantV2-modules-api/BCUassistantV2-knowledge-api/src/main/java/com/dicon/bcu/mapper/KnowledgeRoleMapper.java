package com.dicon.bcu.mapper;

import com.dicon.bcu.core.mapper.BaseMapperPlus;
import com.dicon.bcu.domain.KnowledgeRole;
import com.dicon.bcu.domain.vo.KnowledgeRoleVo;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author: dyc
 * @Create: 2025/12/3 20:42
 */
@Mapper
public interface KnowledgeRoleMapper extends BaseMapperPlus<KnowledgeRole, KnowledgeRoleVo> {

}
