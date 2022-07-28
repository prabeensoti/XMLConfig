package org.example.config;

import org.example.game.Game;
import org.example.vehicle.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@Import(ContextConfig2.class)
public class ContextConfig {

    @Bean
    public Game game(Car car){
        return new Game(car);
    }
}
