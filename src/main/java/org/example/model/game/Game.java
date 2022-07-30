package org.example.model.game;

import org.example.model.vehicle.Bike;
import org.example.model.vehicle.Car;
import org.springframework.beans.factory.annotation.Autowired;

public class Game{
    @Autowired
    private Car car;
    @Autowired
    private Bike bike;
    public Game() {
    }
    public void play() {
        System.err.println("Game Start");
        car.move();
        bike.move();
        System.err.println("Game End");
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Bike getBike() {
        return bike;
    }

    public void setBike(Bike bike) {
        this.bike = bike;
    }
}
