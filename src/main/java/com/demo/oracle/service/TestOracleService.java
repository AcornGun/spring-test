package com.demo.oracle.service;

import java.util.List;
import java.util.Map;

public interface TestOracleService {

    //select * from Test_Table
    public List<Map<String, Object>> SelectExample() throws Exception;

}
