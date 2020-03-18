package com.clz.demo.service;

import com.clz.demo.domain.ResidentAccount;

import java.util.List;

/**
 * Created by Luke 2020/3/16 10:32
 * 用户管理的业务接口
 */
public interface ResidentAccountService {
    /**
     *查询所有用户信息
     */
    public List<ResidentAccount> findAll();
}
