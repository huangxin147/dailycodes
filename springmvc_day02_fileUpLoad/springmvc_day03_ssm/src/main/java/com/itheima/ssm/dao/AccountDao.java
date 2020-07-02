package com.itheima.ssm.dao;

import com.itheima.ssm.domain.Account;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AccountDao {

    public List<Account> findAll();

    public void saveAccount(Account account);
}
