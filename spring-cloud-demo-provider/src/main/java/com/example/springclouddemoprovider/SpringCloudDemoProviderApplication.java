package com.example.springclouddemoprovider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableTransactionManagement
@SpringBootApplication
@ComponentScan
@EnableAutoConfiguration
@EnableScheduling
@Configuration
@EnableWebMvc
@EnableDiscoveryClient
@EnableEurekaClient
@MapperScan("com.example.springclouddemoprovider.mapper")
public class SpringCloudDemoProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudDemoProviderApplication.class, args);
    }

}
