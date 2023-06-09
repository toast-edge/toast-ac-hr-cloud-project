package com.toast.endpoint;

import com.toast.common.service.config.FeignConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author 土司先生
 * @time 2023/3/24
 * @describe
 */
@EnableBinding(Source.class)
@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan({"com.toast.common.service", "com.toast.endpoint"})
@EnableFeignClients(basePackages = {"com.toast.common.service"}, defaultConfiguration = FeignConfig.class)
public class StartHREndpointApplication {
    public static void main(String[] args) {
        SpringApplication.run(StartHREndpointApplication.class, args); // 服务运行
    }
}