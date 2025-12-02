package com.dicon.bcu.common.excel.core;

import com.alibaba.excel.read.listener.ReadListener;

/**
 * @Author: dyc
 * @Create: 2025/11/27 14:51
 */
public interface ExcelListener<T> extends ReadListener<T> {

    ExcelResult<T> getExcelResult();
}
