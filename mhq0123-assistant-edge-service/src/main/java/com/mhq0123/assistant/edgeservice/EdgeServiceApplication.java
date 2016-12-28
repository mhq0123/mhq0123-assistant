package com.mhq0123.assistant.edgeservice;

import com.mhq0123.assistant.microservice.databank.invoker.MicroServiceDataBankClient;
import com.mhq0123.assistant.microservice.databank.invoker.bean.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * project: mhq0123-assistant
 * author:  mhq0123
 * date:    2016/12/26.
 * desc:
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@RestController
@ComponentScan("com.mhq0123.assistant") // TODO 要加入扫描路径
public class EdgeServiceApplication {

    private final static Logger logger = LoggerFactory.getLogger(EdgeServiceApplication.class);

    @Autowired
    private MicroServiceDataBankClient microServiceDataBankClient;

    @GetMapping("index")
    public User index() {
        logger.info(">>>>>>>>>>>>>>> index <<<<<<<<");

        return microServiceDataBankClient.selectUserByUserId();
    }

    public static void main(String[] args) {
        new SpringApplicationBuilder(EdgeServiceApplication.class).web(true).run(args);
    }
}
