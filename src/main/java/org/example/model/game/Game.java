package org.example.model.game;

import org.example.model.vehicle.Vehicle;
import org.springframework.beans.factory.BeanNameAware;

public class Game implements BeanNameAware {
    private Vehicle vehicle;
    public Game(Vehicle vehicle) {
        this.vehicle= vehicle;
    }
    public void play() {
        vehicle.move();
    }

    @Override
    public void setBeanName(String s) {
        System.out.println(s+ " bean created");
    }
}
