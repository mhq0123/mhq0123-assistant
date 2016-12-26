package com.mhq0123.assistant.microservice.databank;

import com.mhq0123.assistant.microservice.databank.invoker.MicroServiceDataBankPath;
import com.mhq0123.assistant.microservice.databank.invoker.bean.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
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
@RestController
public class MicroServiceDataBankApplication {

    private final static Logger logger = LoggerFactory.getLogger(MicroServiceDataBankApplication.class);

    @GetMapping(MicroServiceDataBankPath.SELECT_USER_BY_USER_ID)
    public User selectUserByUserId() {
        User user = new User();

        user.setUserName("mhq0123");
        user.setPassword("123456");

        return user;
    }

    public static void main(String[] args) {
        SpringApplication.run(MicroServiceDataBankApplication.class, args);
    }
}
