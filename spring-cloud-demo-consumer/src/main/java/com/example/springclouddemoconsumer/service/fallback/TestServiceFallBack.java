package com.example.springclouddemoconsumer.service.fallback;

import com.example.springclouddemoconsumer.service.TestService;
import org.springframework.stereotype.Component;

/*
 * @author p78o2
 * @date 2021/10/28
 */
@Component
public class TestServiceFallBack implements TestService {
    @Override
    public String test(String test) {
        return "生产者错误";
    }
}
