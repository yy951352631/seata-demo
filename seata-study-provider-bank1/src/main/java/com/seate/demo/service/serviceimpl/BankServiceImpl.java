package com.seate.demo.service.serviceimpl;

import com.seate.demo.entity.Account;
import com.seate.demo.repository.BankRepository;
import com.seate.demo.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Wtq
 * @date 2019/9/20 - 11:36
 */
@Service
public class BankServiceImpl implements BankService{
    @Autowired
    private BankRepository bankRepository;

    @Override
    public Account findById(Long id) {
        return bankRepository.findById(id).orElse(null);
    }

    @Override
    public List<Account> findAll() {
        return bankRepository.findAll();
    }

    @Override
    @Transactional //本地事物控制
    @Modifying //表明这是一个更新操作
    public void updateBalance(Long id, Double money) {
        bankRepository.updataBalance(id,money);
    }
}
