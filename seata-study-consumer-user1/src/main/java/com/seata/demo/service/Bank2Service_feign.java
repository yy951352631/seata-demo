package com.seata.demo.service;

import com.seata.demo.component.Bank2FallBackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Wtq
 * @date 2019/9/20 - 12:15
 */
@Service
@FeignClient(name = "BANK2-SERVER",fallbackFactory = Bank2FallBackFactory.class)
@RequestMapping(value = "/bank2")
public interface Bank2Service_feign {

    @GetMapping(value = "/{id}")
    String findById(@PathVariable("id") Long id);

    @GetMapping
    String findAll();

    @GetMapping(value = "/updateBalance/{id}/{money}")
    String updateBalance(@PathVariable("id") Long id, @PathVariable("money") Double money);
}
