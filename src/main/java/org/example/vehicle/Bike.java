package org.example.vehicle;

public class Bike implements Vehicle{

    @Override
    public void move() {
        System.out.println("Bike moving at speed 10mph");
    }
}
