package com.mhq0123.assistant.microservice.databank.invoker;

import com.mhq0123.assistant.microservice.databank.invoker.bean.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * project: mhq0123-assistant
 * author:  mhq0123
 * date:    2016/12/25.
 * desc:    接口定义
 */
@FeignClient(value = MicroServiceDataBankPath.SERVICE_ID, fallback = MicroServiceDataBankHystrix.class)
public interface MicroServiceDataBankClient {

    @GetMapping(MicroServiceDataBankPath.SELECT_USER_BY_USER_ID)
    User selectUserByUserId();
}
