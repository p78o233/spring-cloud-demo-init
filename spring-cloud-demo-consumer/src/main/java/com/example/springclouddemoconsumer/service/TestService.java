package com.example.springclouddemoconsumer.service;

import com.example.springclouddemoconsumer.service.fallback.TestServiceFallBack;
import com.example.springclouddemoproviderapi.service.ApiTestService;
import org.springframework.cloud.openfeign.FeignClient;

/*
 * @author p78o2
 * @date 2021/10/28
 */
// name: 生产者的配置文件中的spring.application.name
// fallback: 断路器执行方法，即方法执行失败调用
//继承的是写在provider-api的接口
@FeignClient(name = "spring-cloud-demo-provider",fallback = TestServiceFallBack.class)
public interface TestService extends ApiTestService {
}
