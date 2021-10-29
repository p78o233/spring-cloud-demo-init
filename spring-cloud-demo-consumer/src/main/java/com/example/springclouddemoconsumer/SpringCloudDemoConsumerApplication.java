package com.example.springclouddemoconsumer;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableTransactionManagement
@SpringBootApplication
@EnableEurekaClient
@ComponentScan
@EnableScheduling
@Configuration
@EnableWebMvc
@EnableDiscoveryClient
@EnableFeignClients
@MapperScan("com.example.springclouddemoconsumer.mapper")
@EnableAutoConfiguration
public class SpringCloudDemoConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudDemoConsumerApplication.class, args);
    }

}
