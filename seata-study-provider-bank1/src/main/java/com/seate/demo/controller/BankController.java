package com.seate.demo.controller;

import com.seate.demo.service.serviceimpl.BankServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author Wtq
 * @date 2019/9/20 - 11:43
 */
@RestController
@RequestMapping(value = "/bank")
public class BankController {
    @Autowired
    private BankServiceImpl service;


    @GetMapping(value = "/{id}")
    public String findById(@PathVariable("id") Long id){
        return service.findById(id).toString();
    }

    @GetMapping
    public String findAll(){
        return service.findAll().toString();
    }

    @GetMapping(value = "/updateBalance/{id}/{money}")
    public String updateBalance(@PathVariable("id") Long id,@PathVariable("money") Double money){
        service.updateBalance(id,money);
        return "success";
    }

}
