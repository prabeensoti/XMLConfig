package org.example.model.vehicle;

import org.springframework.beans.factory.BeanNameAware;

public class Car implements Vehicle, BeanNameAware {

    private int year;
    private String make;
    private String model;
    private int millage;

    public Car(int year, String make, String model, int millage) {
        this.year = year;
        this.make = make;
        this.model = model;
        this.millage = millage;
    }

    @Override
    public void move() {
        System.out.println(make+" "+model+" "+year+" has millage "+millage);
    }

    @Override
    public void setBeanName(String s) {
        System.out.println(s+" is constructed");
    }
}
