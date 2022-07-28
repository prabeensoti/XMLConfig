package org.example.game;

import org.example.vehicle.Vehicle;

public class Game {
    private Vehicle vehicle;
    public Game(Vehicle vehicle) {
        this.vehicle= vehicle;
    }
    public void play() {
        vehicle.move();
    }

}
