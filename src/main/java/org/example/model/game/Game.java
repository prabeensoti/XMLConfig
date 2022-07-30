package org.example.model.game;

import org.example.model.vehicle.Bike;
import org.example.model.vehicle.Car;
import org.example.model.vehicle.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Game{
    private Car car;
    private Bike bike;

    // Annotation use field injection
    // bean Id must match to variable name
    // use qualifier to match bean Id
    @Autowired
    @Qualifier("vehicle1")
    private Vehicle vehicle;
    public Game() {
    }

//    Constructor autowire
//    If required false we don't need any bean of arguments
    @Autowired(required = false)
    public Game(Car car,@Qualifier("bike1") Bike bike) {
        this.car = car;
        this.bike = bike;
    }

    public void play() {
        System.err.println("Game Start");
        car.move();
        bike.move();
        System.err.println("Game End");
    }

    public void vehiclePlay(){
        vehicle.move();
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
