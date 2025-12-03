package com.dicon.bcu.mapper;

import com.dicon.bcu.core.mapper.BaseMapperPlus;
import com.dicon.bcu.domain.PromptTemplate;
import com.dicon.bcu.domain.vo.PromptTemplateVo;
import org.apache.ibatis.annotations.Mapper;


/**
 * 提示词模板Mapper接口
 *
 * @author dicon-dyc
 * @date 2025-06-12
 */
@Mapper
public interface PromptTemplateMapper extends BaseMapperPlus<PromptTemplate, PromptTemplateVo> {

}