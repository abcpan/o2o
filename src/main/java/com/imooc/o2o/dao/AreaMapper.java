package com.imooc.o2o.dao;

import com.imooc.o2o.pojo.Area;

import java.util.List;

public interface AreaMapper {
    /**
     * 列出区域列表
     * @return
     */
    List<Area> queryAreaList();
}
