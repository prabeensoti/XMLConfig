package org.example.config;

import org.example.model.game.Game;
import org.example.model.vehicle.Bike;
import org.example.model.vehicle.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile({"development", "default"})
public class ContextConfigDev {
    @Bean
    public static Bike bike(){
        Bike bike = new Bike();
        bike.setBrand("BMX");
        bike.setTireSize(11);
        return bike;
    }
    @Bean
    public static Car car(){
        return new Car(2020,"Honda","CR-V",35000);
    }
    @Bean
    public Game game(){
        return new Game();
    }

}
