package com.example.springclouddemoprovider.controller;

import com.example.springclouddemoproviderapi.service.ApiTestService;
import org.springframework.web.bind.annotation.RestController;

/*
 * @author p78o2
 * @date 2021/10/29
 */
//实现api模块必须是在生产者用@RestController注解去实现
@RestController
public class ApiTestContoller implements ApiTestService {
    @Override
    public String test(String test) {
        return "生产者返回:"+test;
    }
}
