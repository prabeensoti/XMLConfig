package org.example.config;

import org.example.model.game.Game;
import org.example.model.vehicle.Bike;
import org.example.model.vehicle.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;

import java.util.Random;

@Configuration
@Import(ContextConfig2.class)
public class ContextConfig {

    @Bean(name = "game")
    @Scope(value = "singleton")
    public static Game myGame(){
        return new Game() {
            @Override
            public Vehicle getVehicle1() {
                return ContextConfig2.bikePrototype();
            }
        };
    }

    // Tight coupling to spring
//    @Bean(name = "game")
//    @Scope(value = "singleton")
//    public static Game myGame(){
//        return new Game();
//    }


}
