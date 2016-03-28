/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codekul.simpleboot.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 *
 * @author aniruddha
 */
@Configuration
public class DbConfig {
    
    @Bean
    public DriverManagerDataSource dataSource(){
        
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/deepakdb");
        dataSource.setUsername("");
        dataSource.setUsername("");
        
        return dataSource;
    }
    
    @Bean
    public JdbcTemplate jdbcTemplate(){
        
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource());
        
        return jdbcTemplate;
    }
}
