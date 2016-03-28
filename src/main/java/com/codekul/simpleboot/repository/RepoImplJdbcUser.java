/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codekul.simpleboot.repository;

import com.codekul.simpleboot.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 *
 * @author aniruddha
 */
@Repository
public class RepoImplJdbcUser implements RepoUser{

    @Autowired
    private JdbcTemplate jdbcTemplate;
    
    @Override
    public Boolean login(User user) {

        BeanPropertyRowMapper<User> rowMapper = new BeanPropertyRowMapper<User>();
        
        User userFromDb = jdbcTemplate.queryForObject("select * from codekul_user where username = ? and password = ?", new Object[]{user.getUserName(), user.getPassword()}, rowMapper);
        
        //return user.getUserName().equals("android") && user.getPassword().equals("android");
        
        return userFromDb != null;
    }
}


