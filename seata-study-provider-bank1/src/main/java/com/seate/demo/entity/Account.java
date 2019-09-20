package com.seate.demo.entity;

import javax.persistence.*;

/**
 * @author Wtq
 * @date 2019/9/20 - 11:33
 */
@Entity
@Table(name = "T_SEATA_ACCOUNT")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String account;
    private String name;
    private Double balance;

    public Account(String account, String name, Double balance) {
        this.account = account;
        this.name = name;
        this.balance = balance;
    }

    public Account() {
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", account='" + account + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}
