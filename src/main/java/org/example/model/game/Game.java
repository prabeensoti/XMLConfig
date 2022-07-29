package org.example.model.game;

import org.example.model.vehicle.Vehicle;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;

public class Game implements InitializingBean, DisposableBean {
    private Vehicle vehicle;
    public Game(Vehicle vehicle) {
        System.out.println("Dependency Injection by Constructor in Game Class!");
        this.vehicle= vehicle;
    }
    public void play() {
        vehicle.move();
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Game Class Initialization Method  by implementing InitializingBean!");
    }
    @PostConstruct
    private void initMethod(){
        System.out.println("Game post construct annotation");
    }
    public void init(){
        System.out.println("Game Initialization method without interface in config!");
    }
    public void destroyBean(){
        System.out.println("Game Destroy method without interface in config!");
    }


    @Override
    public void destroy() throws Exception {
        System.out.println("Game Destroy Method by implementing DisposableBean!");
    }
}
