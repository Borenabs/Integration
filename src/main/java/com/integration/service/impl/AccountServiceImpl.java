package com.integration.service.impl;

import com.integration.entity.Account;
import com.integration.mapper.AccountMapper;
import com.integration.service.AccountServiceInf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/*@Service("accountService")*/
@Service
public class AccountServiceImpl implements AccountServiceInf {
    @Autowired
    AccountMapper accountMapper;
    @Override
    public List<Account> selectAll() {
        System.out.println("调用全查方法");
        return accountMapper.selectAll();
    }

    @Override
    public void insert(Account account) {
        accountMapper.insert(account);
    }

    @Override
    public void delete(Integer id) {
        accountMapper.delete(id);
    }
}
