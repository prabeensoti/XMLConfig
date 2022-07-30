package org.example;


import org.example.model.game.Game;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        xmlConfig();
//        classConfig();
    }

    private static void xmlConfig() {
        System.out.println("App Start");
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
//        context.getEnvironment().setActiveProfiles("development");
        context.load("config_*.xml");
        context.refresh();
        Game game = context.getBean("game", Game.class);
        game.play();
        context.close();
        System.out.println("App End");
    }
    private static void classConfig(){
        System.out.println("App Start");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
//        context.getEnvironment().setActiveProfiles("development");
        context.scan("org.example.config");
        context.refresh();
        Game game = context.getBean("game", Game.class);
        game.play();
        context.close();
        System.out.println("App End");
    }
}