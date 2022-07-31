package org.example;



import org.example.config.SpringConfig;
import org.example.model.DatabaseService;
import org.example.model.EmailService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        xmlConfig();
        classConfig();
    }

    private static void xmlConfig() {
        System.out.println("App Start XML");
        AbstractApplicationContext context = new GenericXmlApplicationContext("config.xml");
        EmailService emailService = context.getBean("emailService", EmailService.class);
        try {
            emailService.sendEmail();
        }catch (Exception e){
        }
        context.close();
        System.out.println("App End XML");
    }
    private static void classConfig(){
        System.out.println("App Start Class");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        DatabaseService databaseService = context.getBean("databaseService", DatabaseService.class);
        databaseService.connect();
        context.close();
        System.out.println("App End Class");
    }
}