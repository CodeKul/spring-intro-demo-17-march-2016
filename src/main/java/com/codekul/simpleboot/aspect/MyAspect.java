/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codekul.simpleboot.aspect;

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
    
    
    @Before("execution(* com.codekul.simpleboot.domain.Animal.getCountry())")
    public void beforeGetCountry() {

        System.out.println("Before Executing getCountry  ...");
    }

    @After("execution(* com.codekul.simpleboot.domain.Animal.getCountry())")
    public void afterGetCountry() {

        System.out.println("After Executing getCountry ...");
    }
    
    @Before("pointCutAfterGetCountry()")
    public void adviceAnotherGetCountry(){
        
        System.out.println("Before Executing another getCountry ...");
    }
    
    @Pointcut("execution(* com.codekul.simpleboot.domain.Animal.getCountry())")
    public void pointCutAfterGetCountry(){
        
    }

}
