/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codekul.simpleboot.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 *
 * @author aniruddha
 */
@Configuration
public class MvcConfig {
    
    @Bean
    public InternalResourceViewResolver internalResourceViewResolver(){
        
       InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
       viewResolver.setPrefix("/WEB-INF/jsp/");
       viewResolver.setSuffix(".jsp");
       return  viewResolver;
    }
}
