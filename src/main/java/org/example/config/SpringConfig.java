package org.example.config;

import org.example.aspects.AspectJLogger;
import org.example.aspects.AspectJLogger2;
import org.example.model.DatabaseService;
import org.example.model.EmailService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class SpringConfig {

    @Bean
    DatabaseService databaseService(){
        DatabaseService service =  new DatabaseService("mysql:localhost:3306");
        return service;
    }

    @Bean
    EmailService emailService(){
        return new EmailService("prabeen.soti@miu.edu");
    }

    @Bean
    AspectJLogger aspectJLogger(){
        return new AspectJLogger();
    }
    @Bean
    AspectJLogger2 aspectJLogger2(){
        return new AspectJLogger2();
    }
}
