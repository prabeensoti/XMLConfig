package org.example.config;

import org.example.PrototypeDestroyer;
import org.example.model.game.Game;
import org.example.model.vehicle.Bike;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Lazy;

@Configuration
@Import(ContextConfig2.class)
//@Lazy//make all beans lazy
public class ContextConfig {

//    @Bean
//    @Lazy(value = false)// male bean not lazy
//    public Game game1(Bike bikeSingleton1){
//        return new Game(bikeSingleton1);
//    }
//    @Bean
////    @Lazy// make lazy
//    public Game game2(Bike bikeSingleton2){
//        return new Game(bikeSingleton2);
//    }

    @Bean(destroyMethod = "destroy")
    public PrototypeDestroyer prototypeDestroyer(){
        return new PrototypeDestroyer();
    }

}
