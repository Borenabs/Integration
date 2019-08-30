package com.integration.service;

import com.integration.entity.Account;

import java.util.List;

public interface AccountServiceInf {
    /*
     * 全查
     * */
    List<Account> selectAll();
    /*
     * 添加
     * */
    void insert(Account account);
    /*
     * 删除
     * */
    void delete(Integer id);
    /*
     * 修改
     * */
    void update(Account account);
}
