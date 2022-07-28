package org.example.config;

import org.example.vehicle.Bike;
import org.example.vehicle.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ContextConfig2 {
    @Bean
    public Car car(){
        return new Car(2020,"Toyota","Prius",55000);
    }

    @Bean
    public Bike bike(){
        return new Bike();
    }

}
