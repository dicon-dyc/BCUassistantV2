package com.dicon.bcu.system.mapper;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.dicon.bcu.system.domain.SysDictData;
import com.dicon.bcu.system.domain.vo.SysDictDataVo;
import com.dicon.bcu.common.core.constant.UserConstants;
import com.dicon.bcu.core.mapper.BaseMapperPlus;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: dyc
 * @Create: 2025/12/1 15:35
 */
@Mapper
public interface SysDictDataMapper extends BaseMapperPlus<SysDictData, SysDictDataVo> {

    default List<SysDictDataVo> selectDictDataByType(String dictType) {
        return selectVoList(
                new LambdaQueryWrapper<SysDictData>()
                        .eq(SysDictData::getStatus, UserConstants.DICT_NORMAL)
                        .eq(SysDictData::getDictType, dictType)
                        .orderByAsc(SysDictData::getDictSort));
    }
}
