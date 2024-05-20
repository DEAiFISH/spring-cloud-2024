package com.deaifish.cloud.config;

import feign.Logger;
import feign.Retryer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description TODO
 *
 * @author DEAiFISH
 * @date 2024/5/16 16:43
 */
@Configuration
public class FeignConfig {
    @Bean
    public Retryer myRetryer() {
//        return Retryer.NEVER_RETRY; // 默认，不启动重试策略

        /*最大重试次数 3（1+2），重试间最大间隔时间 1s，初始间隔时间100ms */
        return new Retryer.Default(100,1,3);
    }

    @Bean
    Logger.Level feiLoggerLevel(){
        return Logger.Level.FULL;
    }
}