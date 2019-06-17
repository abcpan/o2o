package com.imooc.o2o.dao;

import com.imooc.o2o.BaseTest;
import com.imooc.o2o.pojo.Area;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AreaMapperTest extends BaseTest {
            @Autowired
            private AreaMapper areaMapper;
            @Test
            public void testQueryAreaList(){
                List<Area> areaList = areaMapper.queryAreaList();
                System.out.println(areaList.size());
            }
}