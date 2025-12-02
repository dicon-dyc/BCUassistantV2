package com.dicon.bcu.common.excel.annotation;

import java.lang.annotation.*;

/**
 * excel 列单元格合并（合并列相同项）
 *
 * @Author: dyc
 * @Create: 2025/11/27 15:58
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface CellMerge {

    /**
     * col index
     */
    int index() default -1;
}
