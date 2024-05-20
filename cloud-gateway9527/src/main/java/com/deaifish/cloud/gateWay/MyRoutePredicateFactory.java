package com.deaifish.cloud.gateWay;

import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;
import org.springframework.cloud.gateway.handler.predicate.AbstractRoutePredicateFactory;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.server.ServerWebExchange;

import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

/**
 * @description
 *  需求分析： 自定义配置会员等级userType，按照钻/金/银和yml配置的会员等级
 *
 * @author DEAiFISH
 * @date 2024/5/18 00:59
 */
@Component
public class MyRoutePredicateFactory extends AbstractRoutePredicateFactory<MyRoutePredicateFactory.Config> {
    public MyRoutePredicateFactory() {
        super(MyRoutePredicateFactory.Config.class);
    }

    /**
     * @description 开启短促配置
     *
     * @author DEAiFISH
     * @date 2024/5/18 01:28
     * @return java.util.List<java.lang.String>
     */
    public List<String> shortcutFieldOrder() {
        return Collections.singletonList("userType");
    }

    @Override
    public Predicate<ServerWebExchange> apply(MyRoutePredicateFactory.Config config) {
        return new Predicate<ServerWebExchange>() {
            @Override
            public boolean test(ServerWebExchange serverWebExchange) {
                //检查request的参数里面，userType是否为指定的值，符合配置就通过
                String userType = serverWebExchange.getRequest().getQueryParams().getFirst("userType");

                if (userType == null) return false;

                //如果说参数存在，就和config的数据进行比较
                if (userType.equals(config.getUserType())) {
                    return true;
                }

                return false;
            }
        };
    }

    @Validated
    public static class Config {
        @Setter
        @Getter
        @NotEmpty
        private String userType; //钻、金、银等用户等级
    }
}
