package org.example;


import org.example.model.game.Game;
import org.example.config.ContextConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//        xmlConfig();
        classConfig();
    }

    private static void xmlConfig() {
        System.out.println("App Start");
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Game game = context.getBean(Game.class);
        game.play();
        context.close();
        System.out.println("App End");
    }
    private static void classConfig(){
        System.out.println("App Start");
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(ContextConfig.class);
        Game game = context.getBean(Game.class);
        game.play();
        context.close();
        System.out.println("App End");
    }
}