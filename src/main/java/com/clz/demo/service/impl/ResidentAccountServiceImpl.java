package com.clz.demo.service.impl;

import com.clz.demo.domain.ResidentAccount;
import com.clz.demo.service.ResidentAccountService;
import com.clz.demo.util.JDBCUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;


import java.util.List;

/**
 * Created by Luke 2020/3/16 10:34
 */
public class ResidentAccountServiceImpl implements ResidentAccountService {

    private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
    @Override
    public List<ResidentAccount> findAll() {
        // 调用Dao完成查询
        // 定义sql
        String sql = "SELECT * FROM dbo.Resident_Account";
        List<ResidentAccount> residentAccounts = template.query(sql,new BeanPropertyRowMapper<ResidentAccount>(ResidentAccount.class));
        return residentAccounts;
    }
}
