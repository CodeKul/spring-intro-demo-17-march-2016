/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codekul.simpleboot;

import com.codekul.simpleboot.domain.Animal;
import com.codekul.simpleboot.domain.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 *
 * @author aniruddha
 */
@SpringBootApplication
public class Main {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(Main.class, args);

        for (String bean : context.getBeanDefinitionNames()) {

            System.out.println("com.codekul.simpleboot.Main.main() Beans -> " + bean);
        }

        Car car = (Car) context.getBean("carMy");
        car.setCarCity("Pune");

        Animal animal = (Animal) context.getBean("animal");
        animal.setCarMy(car);
        
       animal.setCountry("india");
        System.out.println("Animal Country - "+animal.getCountry());
    }
}
