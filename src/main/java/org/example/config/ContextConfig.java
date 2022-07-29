package org.example.config;

import org.example.MyBeanPostProcessor;
import org.example.model.Book;
import org.example.model.game.Game;
import org.example.model.vehicle.Bike;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(ContextConfig2.class)
public class ContextConfig {

    @Bean
    public MyBeanPostProcessor myBeanPostProcessor(){
        return new MyBeanPostProcessor();
    }

    @Bean(initMethod = "init",destroyMethod = "destroyBean")
    public Game game(Bike bike){
        return new Game(bike);
    }

    @Bean(name = "myBook",initMethod = "init")
    public Book book(){
        return new Book();
    }
}
