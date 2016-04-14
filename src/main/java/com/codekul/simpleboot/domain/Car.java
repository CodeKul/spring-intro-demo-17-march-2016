/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codekul.simpleboot.domain;

/**
 *
 * @author aniruddha
 */
public class Car {
    
    private String carName;
    private String carCity;

    public Car() {
    }

    
    public Car(Car car) {
        this.carCity = car.getCarCity();
        this.carName = car.getCarName();
    }

    
    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarCity() {
        return carCity;
    }

    public void setCarCity(String carCity) {
        this.carCity = carCity;
    }

    @Override
    public String toString() {
        return "Car{" + "carName=" + carName + ", carCity=" + carCity + '}';
    }
}
