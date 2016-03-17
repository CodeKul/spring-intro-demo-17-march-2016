/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codekul.simpleboot.configuration;

import com.codekul.simpleboot.domain.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author aniruddha
 */
@Configuration
public class AppConfig {
    
    @Bean
    public Car carMy(){
        Car car = new Car();
        return  car;
    }
}
