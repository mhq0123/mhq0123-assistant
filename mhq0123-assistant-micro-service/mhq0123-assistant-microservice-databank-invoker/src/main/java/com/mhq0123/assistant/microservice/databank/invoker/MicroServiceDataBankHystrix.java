package com.mhq0123.assistant.microservice.databank.invoker;

import com.mhq0123.assistant.microservice.databank.invoker.bean.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * project: mhq0123-assistant
 * author:  mhq0123
 * date:    2016/12/25.
 * desc:
 */
@Component
public class MicroServiceDataBankHystrix implements MicroServiceDataBankClient {

    private final static Logger logger = LoggerFactory.getLogger(MicroServiceDataBankHystrix.class);

    @Override
    public User selectUserByUserId() {
        logger.info(this.getClass() + " is error, hold on...");
        return null;
    }
}
