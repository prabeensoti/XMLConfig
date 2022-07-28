package org.example;


import org.example.game.Game;
import org.example.config.ContextConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//        xmlConfig();
        classConfig();
    }

    private static void xmlConfig() {
        System.out.println("AppStart");
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Game game = context.getBean(Game.class);
        game.play();
        System.out.println("AppEnd");
    }
    private static void classConfig(){
        System.out.println("AppStart");
        ApplicationContext context = new AnnotationConfigApplicationContext(ContextConfig.class);
        Game game = context.getBean(Game.class);
        game.play();
        System.out.println("AppEnd");
    }
}