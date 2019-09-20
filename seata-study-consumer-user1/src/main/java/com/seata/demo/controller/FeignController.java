package com.seata.demo.controller;

import com.seata.demo.service.Bank1Service_feign;
import com.seata.demo.service.Bank2Service_feign;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Wtq
 * @date 2019/9/20 - 12:17
 */
@RestController
@RequestMapping("/consumer")
public class FeignController {

    @Autowired
    private Bank1Service_feign bank1Service_feign;
    @Autowired
    private Bank2Service_feign bank2Service_feign;

    @GetMapping
    public String findAll() {
        return bank1Service_feign.findAll();
    }

    @GetMapping(value = "/updateBalance/{id}/{money}")
    @Transactional
    @GlobalTransactional //开启全局事务管理器
    public String updateBalance(@PathVariable("id") Long id, @PathVariable("money") Double money) {
        //调用转账服务，从银行1转账 money金额到 bank2
        String result1 = bank1Service_feign.updateBalance(id, -1 * money);
        String result2 = bank2Service_feign.updateBalance(1L, money);
        if("error".equals(result1)  || "error".equals(result2)){
            throw new RuntimeException("call server error......");
        }
        return "success";
    }
}
