package org.example.model.vehicle;

public class Bike implements Vehicle{

    private int tireSize;
    private String brand;


    public Bike(String brand) {
        System.out.println("Bike Constructor injection");
        this.brand = brand;
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

    //Initialization and Destroy method can't have argument
    public void init(){
        System.out.println("Bike Initialization method without interface in config!");
    }

    private void destroy() {
        System.out.println("Bike destroy method without interface in config!");
    }
}
