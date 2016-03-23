/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codekul.simpleboot.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 *
 * @author aniruddha
 */
@Component
public class Animal {
    
   // @Autowired // field injection
    private Car carMy;

    public Animal() {
        
    }
    
    //@Autowired // constructor injection
    public Animal(Car car) {
        
        carMy = car;
    }
    
    private String name;
    private String country;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        
        System.out.println("com.codekul.simpleboot.domain.Animal.getCountry() -> car city = "+carMy.getCarCity());
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Car getCarMy() {
        return carMy;
    }

    @Autowired // setter injection
    public void setCarMy(@Qualifier("car")/* this define to which bean autowire*/ Car abc) {
        this.carMy = abc;
    }
}
