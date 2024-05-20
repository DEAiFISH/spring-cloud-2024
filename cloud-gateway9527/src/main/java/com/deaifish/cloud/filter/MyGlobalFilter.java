package com.deaifish.cloud.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * @description 自定义全局过滤器
 *
 * @author DEAiFISH
 * @date 2024/5/18 13:06
 */
@Slf4j
@Component
public class MyGlobalFilter implements GlobalFilter, Ordered
{
    private static final String BEGIN_VISIT_TIME = "beginVisitTime";
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain)
    {
        exchange.getAttributes().put(BEGIN_VISIT_TIME,System.currentTimeMillis());
        return chain.filter(exchange).then(Mono.fromRunnable(()->{
            Long beginVisitTime = exchange.getAttribute(BEGIN_VISIT_TIME);
            if (beginVisitTime != null){
                log.info("访问接口主机: " + exchange.getRequest().getURI().getHost());
                log.info("访问接口端口: " + exchange.getRequest().getURI().getPort());
                log.info("访问接口URL: " + exchange.getRequest().getURI().getPath());
                log.info("访问接口URL参数: " + exchange.getRequest().getURI().getRawQuery());
                log.info("访问接口时长: " + (System.currentTimeMillis() - beginVisitTime) + "ms");
                log.info("我是美丽分割线: ###################################################");
                System.out.println();
            }
        }));
    }

    /**
     * @description order越小，优先级越高
     *
     * @author DEAiFISH
     * @date 2024/5/18 13:08
     * @return int
     */
    @Override
    public int getOrder()
    {
        return 0;
    }
}
