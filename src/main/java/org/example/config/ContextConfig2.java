package org.example.config;

import org.example.vehicle.Bike;
import org.example.vehicle.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ContextConfig2 {
    @Bean
    public Car car(){
        return new Car();
    }

    @Bean
    public Bike bike(){
        return new Bike();
    }

}
