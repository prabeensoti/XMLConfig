package org.example.config;

import org.example.vehicle.Bike;
import org.example.vehicle.Car;
import org.example.game.Game;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ContextConfig {

    @Bean
    public Car car(){
        return new Car();
    }

    @Bean
    public Bike bike(){
        return new Bike();
    }

    @Bean
    public Game game(){
        return new Game(bike());
    }
}
