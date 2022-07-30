package org.example.config;

import org.example.model.vehicle.Bike;
import org.example.model.vehicle.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ContextConfig2 {
    @Bean
    public static Bike bike(){
        Bike bike = new Bike();
        bike.setBrand("BMX");
        bike.setTireSize(11);
        return bike;
    }
    @Bean
    public static Bike bike1(){
        Bike bike = new Bike();
        bike.setBrand("BMX");
        bike.setTireSize(12);
        return bike;
    }

    @Bean
    public static Car car(){
        return new Car(2020,"Honda","CR-V",35000);
    }

    @Bean
    public static Car vehicle(){
        return new Car(2020,"Honda","CR-V",35000);
    }
//    @Bean(autowireCandidate = false)
    @Bean
    public static Car vehicle1(){
        return new Car(2022,"Honda","CR-V",35000);
    }

}
