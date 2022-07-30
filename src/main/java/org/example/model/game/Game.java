package org.example.model.game;

import org.example.model.vehicle.Bike;
import org.example.model.vehicle.Vehicle;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

//Tight couple to spring
//public class Game implements ApplicationContextAware {
public abstract class Game{
    private ApplicationContext applicationContext;

    public Game() {
    }
    public void play() {
        getVehicle1().move();
    }

    //P2C approach Tight coupling
//    public Vehicle getVehicle() {
//        this.vehicle=new Bike(23,"Hero");
//        return vehicle;
//    }

    //Tightly couple to spring
//    public Vehicle getVehicle() {
//        return applicationContext.getBean(Bike.class);
//    }
//
//    @Override
//    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
//        this.applicationContext = applicationContext;
//    }

    abstract public Vehicle getVehicle1();
}
