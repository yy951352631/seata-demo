package com.seata.demo.component;

import com.seata.demo.service.Bank1Service_feign;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @author Wtq
 * @date 2019/9/20 - 12:42
 */
@Component
public class Bank1FallBackFactory implements FallbackFactory<Bank1Service_feign> {

    @Override
    public Bank1Service_feign create(Throwable throwable) {
        return new Bank1Service_feign() {
            @Override
            public String findById(Long id) {
                return null;
            }

            @Override
            public String findAll() {
                return null;
            }

            @Override
            public String updateBalance(Long id, Double money) {
                return "error";
            }
        };
    }
}
