package com.example.springclouddemoproviderapi.service;
/*
 * @author p78o2
 * @date 2021/10/27
 */

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

public interface ApiTestService {
    @RequestMapping(value="/test", method= RequestMethod.GET)
    String test(@RequestParam(value = "test") String test);
}
