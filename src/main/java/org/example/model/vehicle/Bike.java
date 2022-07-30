package org.example.model.vehicle;

public class Bike implements Vehicle{

    private int tireSize;
    private String brand;


    public Bike() {
    }

    public Bike(int tireSize, String brand) {
        this.tireSize = tireSize;
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
