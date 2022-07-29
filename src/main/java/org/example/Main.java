package org.example;


import org.example.model.game.Game;
import org.example.config.ContextConfig;
import org.example.model.vehicle.Bike;
import org.example.model.vehicle.Vehicle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        xmlConfig();
//        classConfig();
    }

    private static void xmlConfig() {
        System.out.println("App Start");
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Game gameLazyFalse = context.getBean("game1",Game.class);
        System.out.println("Game 2 is lazy init so created on demand!!!!!!!!!!!!!");
        Game gameLazyTrue = context.getBean("game2",Game.class);

        System.out.println("Prototype Bean Scope");
        Vehicle bikePrototype = context.getBean("bikePrototype", Bike.class);
        bikePrototype.move();
        Vehicle bikePrototype1 = context.getBean("bikePrototype",Bike.class);
        bikePrototype1.move();

        context.close();
        System.out.println("App End");
    }
    private static void classConfig(){
        System.out.println("App Start");
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(ContextConfig.class);
        Game gameLazyFalse = context.getBean("game1",Game.class);
        System.out.println("Game 2 is lazy init so created on demand!!!!!!!!!!!!!");
        Game gameLazyTrue = context.getBean("game2",Game.class);


        System.out.println("Prototype Bean Scope");
        Vehicle bikePrototype = context.getBean("bikePrototype", Bike.class);
        bikePrototype.move();
        Vehicle bikePrototype1 = context.getBean("bikePrototype",Bike.class);
        bikePrototype1.move();

        context.close();
        System.out.println("App End");
    }
}