package org.example.config;

import org.example.model.vehicle.Bike;
import org.example.model.vehicle.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import java.util.Random;

@Configuration
public class ContextConfig2 {
    @Bean
    public Car car(){
        return new Car(2020,"Toyota","Prius",55000);
    }

    @Bean(destroyMethod = "destroy")
    @Scope(value = "singleton")
    public Bike bikeSingleton1(){
        Bike bike = new Bike();
        bike.setBrand("BMX");
        bike.setTireSize(11);
        return bike;
    }

    @Bean(destroyMethod = "destroy")
    @Scope(value = "singleton")
    public Bike bikeSingleton2(){
        Bike bike = new Bike();
        bike.setBrand("BMX");
        bike.setTireSize(12);
        return bike;
    }
    @Bean(destroyMethod = "destroy")
    @Scope(value = "prototype")
    public Bike bikePrototype(){
        Bike bike = new Bike();
        bike.setBrand("BMX");
        bike.setTireSize(new Random().nextInt(15,25));
        return bike;
    }

}
