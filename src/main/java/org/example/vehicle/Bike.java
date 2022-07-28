package org.example.vehicle;

public class Bike implements Vehicle{

    private int tireSize;
    private String brand;

    public Bike() {
    }

    public Bike(String brand) {
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
}
