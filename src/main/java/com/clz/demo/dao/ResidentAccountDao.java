package com.clz.demo.dao;

import com.clz.demo.domain.ResidentAccount;

import java.util.List;

/**
 * Created by Luke 2020/3/16 10:37
 * 用户操作Dao
 */
public interface ResidentAccountDao {
    public List<ResidentAccount> findAll();
}
