package com.dicon.bcu.system.mapper;

import com.dicon.bcu.system.domain.SysPost;
import com.dicon.bcu.system.domain.vo.SysPostVo;
import com.dicon.bcu.core.mapper.BaseMapperPlus;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 岗位
 *
 * @Author: dyc
 * @Create: 2025/12/2 14:16
 */
@Mapper
public interface SysPostMapper extends BaseMapperPlus<SysPost, SysPostVo> {

    /**
     * 根据用户ID获取岗位选择框列表
     *
     * @param userId 用户ID
     * @return 选中岗位ID列表
     */
    List<Long> selectPostListByUserId(Long userId);

    /**
     * 查询用户所属岗位组
     *
     * @param userName 用户名
     * @return 结果
     */
    List<SysPostVo> selectPostsByUserName(String userName);

}
