package com.example.springclouddemoconsumer.controller;

import com.example.springclouddemoconsumer.service.TestService;
import com.example.springclouddemoproviderapi.service.ApiTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * @author p78o2
 * @date 2021/10/28
 */
@RestController
@RequestMapping(value = "/spring-cloud-consumer")
public class TestController {
    @Autowired
    private ApiTestService apiTestService;
    @Autowired
    private TestService testService;

    @GetMapping(value = "/test1")
    public String test1(String test){
        return apiTestService.test(test);
    }
    @GetMapping(value = "/test2")
    public String test2(String test){
        return testService.test(test);
    }
}
