package com.demo.oracle.service;

import com.demo.oracle.model.mapper.TestOracleMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

public class TestOracleServiceImpl implements TestOracleService {

    @Autowired
    TestOracleMapper testOracleMapper;

    @Override
    public List<Map<String, Object>> SelectExample() throws Exception {
        // TODO Auto-generated method stub
        return testOracleMapper.SelectExample();
    }

}

