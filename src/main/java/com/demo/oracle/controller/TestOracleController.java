package com.demo.oracle.controller;

import com.demo.oracle.service.TestOracleService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
public class TestOracleController {
    @Resource
    private TestOracleService testOracleService;

    @RequestMapping(value="list")
    public ModelAndView AllListView(Map<String, Object> map) throws Exception{
        ModelAndView mav = new ModelAndView();

        List<Map<String, Object>> exampleList = testOracleService.SelectExample();

        mav.addObject("exampleList", exampleList);
        mav.setViewName("list");

        return mav;
    }
}
