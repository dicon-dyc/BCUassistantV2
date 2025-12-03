package com.dicon.bcu.mapper;

import com.dicon.bcu.core.mapper.BaseMapperPlus;
import com.dicon.bcu.domain.KnowledgeRoleRelation;
import com.dicon.bcu.domain.vo.KnowledgeRoleRelationVo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author: dyc
 * @Create: 2025/12/3 20:46
 */
@Mapper
public interface KnowledgeRoleRelationMapper extends BaseMapperPlus<KnowledgeRoleRelation, KnowledgeRoleRelationVo> {
    @Select("SELECT knowledge_id FROM knowledge_role_relation WHERE knowledge_role_id = #{knowledgeRoleId}")
    List<Long> selectKnowledgeIdsByRoleId(@Param("knowledgeRoleId") Long knowledgeRoleId);

    /**
     * 根据 roleId 删除所有关联
     */
    @Delete("DELETE FROM knowledge_role_relation WHERE knowledge_role_id = #{knowledgeRoleId}")
    void deleteByRoleId(@Param("knowledgeRoleId") Long knowledgeRoleId);

    @Delete({
            "<script>",
            "DELETE FROM knowledge_role_relation",
            "WHERE knowledge_role_id IN",
            "<foreach collection='knowledgeRoleIds' item='id' open='(' separator=',' close=')'>",
            "#{id}",
            "</foreach>",
            "</script>"
    })
    void deleteByRoleIds(@Param("knowledgeRoleIds") List<Long> knowledgeRoleIds);
}
