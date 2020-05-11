package com.mastek.spring.bankapp.dao;


import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.mastek.spring.bankapp.model.BankAccount;


public class BankAccountRowMapper implements RowMapper<BankAccount> {


    @Override
    public BankAccount mapRow(ResultSet rs, int rowNum) throws SQLException {
        
        BankAccount account = new BankAccount();
        account.setAccNo(rs.getInt("accNo"));
        account.setAccName(rs.getString("accName"));
        account.setBalance(rs.getDouble("balance"));
        
        return account;
    }


}
 








