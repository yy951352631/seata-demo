package com.seate.demo.service;

import com.seate.demo.entity.Account;

import java.util.List;

/**
 * @author Wtq
 * @date 2019/9/20 - 11:35
 */
public interface BankService {

    Account findById(Long id);

    List<Account> findAll();

    void updateBalance(Long id, Double money);
}
