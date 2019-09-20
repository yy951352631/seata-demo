package com.seata.demo.component;

import com.seata.demo.service.Bank2Service_feign;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @author Wtq
 * @date 2019/9/20 - 13:44
 */
@Component
public class Bank2FallBackFactory implements FallbackFactory<Bank2Service_feign> {
    @Override
    public Bank2Service_feign create(Throwable throwable) {
        return new Bank2Service_feign() {

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
