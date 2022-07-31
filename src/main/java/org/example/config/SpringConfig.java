package org.example.config;

import org.example.aspects.LogBeforeAndAfter;
import org.example.model.DatabaseService;
import org.example.model.EmailService;
import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    DatabaseService databaseService(){
        DatabaseService service =  new DatabaseService();
        service.setDbUrl("mysql:localhost:3306");
        return service;
    }

    @Bean
    EmailService emailService(){
        return new EmailService("prabeen.soti@miu.edu");
    }
    @Bean
    LogBeforeAndAfter logAspect(){
        return new LogBeforeAndAfter();
    }

    @Bean
    ProxyFactoryBean databaseServiceProxy(){
        ProxyFactoryBean proxyFactoryBean = new ProxyFactoryBean();
        proxyFactoryBean.setTargetName("databaseService");
        proxyFactoryBean.setInterceptorNames(new String[]{"logAspect"});
        return proxyFactoryBean;
    }
}
