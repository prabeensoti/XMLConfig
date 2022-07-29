package org.example.model.vehicle;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;

public class Bike implements Vehicle, BeanNameAware, DisposableBean {

    private int tireSize;
    private String brand;


    public Bike() {
    }

    public int getTireSize() {
        return tireSize;
    }

    public void setTireSize(int tireSize) {
        this.tireSize = tireSize;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public void move() {
        System.out.println(brand+" bike with tire size "+tireSize+" moving at speed 10mph");
    }

    @Override
    public void setBeanName(String s) {
        System.err.println(s+" bean is created");
    }

    @Override
    public void destroy(){
        System.out.println(brand+" with tire size "+tireSize+" is destroy!");
    }
}
