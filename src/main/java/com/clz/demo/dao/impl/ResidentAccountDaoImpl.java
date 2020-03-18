package com.clz.demo.dao.impl;

import com.clz.demo.dao.ResidentAccountDao;
import com.clz.demo.domain.ResidentAccount;

import java.util.List;

/**
 * Created by Luke 2020/3/16 11:00
 */
public class ResidentAccountDaoImpl implements ResidentAccountDao {
    private ResidentAccountDao dao = new ResidentAccountDaoImpl();
    @Override
    public List<ResidentAccount> findAll() {
        // 使用JDBC操作数据库
        return dao.findAll();
    }
}
