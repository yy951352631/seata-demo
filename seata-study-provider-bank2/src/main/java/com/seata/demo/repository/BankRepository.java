package com.seata.demo.repository;

import com.seata.demo.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

/**
 * @author Wtq
 * @date 2019/9/20 - 11:06
 */
public interface BankRepository extends JpaRepository<Account,Long>,JpaSpecificationExecutor<Account>{

    @Query("update Account set balance = balance + ?2 where id = ?1")
    @Modifying
    void updataBalance(Long id, Double money);
}
