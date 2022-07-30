package org.example.config;

import org.example.model.game.Game;
import org.example.model.vehicle.Bike;
import org.example.model.vehicle.Vehicle;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;

import java.util.Random;

import static org.example.config.ContextConfig2.*;

@Configuration
@Import(ContextConfig2.class)
public class ContextConfig {

//    Need setter of variable in game and has same Bean name as variable name
//    @Bean(autowire = Autowire.BY_NAME)
//    public static Game game(){
//        return new Game();
//    }

//    Need setter of variable in game and has only one Bean of same Type
//    @Bean(autowire = Autowire.BY_TYPE)
//    public static Game game(){
//        return new Game();
//    }
//  Autowire field injection
//    @Bean
//    public Game game(){
//        return new Game();
//    }

//    Constructor autowire only for XML config
    @Bean
    public Game game(){
        return new Game(car(),bike1());
    }

}
