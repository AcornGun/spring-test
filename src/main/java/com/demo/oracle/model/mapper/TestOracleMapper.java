package com.demo.oracle.model.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

public interface TestOracleMapper {
    //select * from Test_Table
    public List<Map<String, Object>> SelectExample() throws Exception;
}
