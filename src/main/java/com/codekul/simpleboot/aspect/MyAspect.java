/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codekul.simpleboot.aspect;

import com.codekul.simpleboot.domain.Car;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 *
 * @author aniruddha
 */
@Component
@Aspect
public class MyAspect {

    // @Before - advice
    // afterGetCountry() - join point
    // pointCutAfterGetCountry() - point cut
    /*
        - DI
        - Boot
        - Gradle
        - core
        - aop
     */
    @Before("execution(* com.codekul.simpleboot.domain.Animal.getCountry())")
    public void beforeGetCountry() {

        System.out.println("Animal Get Country Executed  ...");
    }

    @Before("execution(* com.codekul.simpleboot.domain.Animal.setCarMy(com.codekul.simpleboot.domain.Car)) && args(car)")
    public void beforeSetCar(Car car) {

        System.out.println("Car in Advice - "+car.getCarCity());
    }

    @Before("bean(car*)")
    public void beforeCarBean() {

        System.out.println(" bean carMy Exetutde");
    }

    @Before("pointCutWithinAnything()")
    public void adviceWithingAnyThing() {

        System.out.println("You are in animal class");
    }

//    @After("execution(* com.codekul.simpleboot.domain.Animal.getCountry())")
//    public void afterGetCountry() {
//
//        System.out.println("After Executing getCountry ...");
//    }
//
//    @Before("pointCutAfterGetCountry()")
//    public void adviceAnotherGetCountry() {
//
//        System.out.println("Before Executing another getCountry ...");
//    }
//
//    @Before("pointCutAnyMethod()")
//    public void adviceBeforeAnyThing() {
//
//        System.out.println("com.codekul.simpleboot.aspect.MyAspect.adviceBeforeAnyThing()");
//    }
//
//    @Pointcut("execution(* com.codekul.simpleboot.domain.Animal.getCountry())")
//    public void pointCutAfterGetCountry() {
//
//    }
//
//    @Pointcut("execution(* com.codekul.simpleboot..*.*(..))")
//    public void pointCutAnyMethod() {
//
//    }
    @Pointcut("within(com.codekul.simpleboot.domain.Animal)")
    public void pointCutWithinAnything() {

    }
}
