package org.example.vehicle;

public class Car implements Vehicle{



    @Override
    public void move() {
        System.out.println("Car moving at speed 45mph");
    }
}
