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
    @Scope(value = "prototype")
    public static Bike bikePrototype(){
        Bike bike = new Bike();
        bike.setBrand("BMX");
        bike.setTireSize(new Random().nextInt(15,25));
        return bike;
    }

}
