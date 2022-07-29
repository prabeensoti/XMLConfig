package org.example.model;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.ResourceLoader;

public class Book implements BeanNameAware, ResourceLoaderAware, ApplicationContextAware {

    private String beanName;
    private ResourceLoader resourceLoader;

    private ApplicationContext applicationContext;

    public Book(){
        System.out.println("Book construct!!!!!!!!!!!!!");
    }

    @Override
    public void setBeanName(String beanName) {
        System.out.println("BeanNameAware bean name is :"+beanName+"!!!!!!!!!!!!!!!");
        this.beanName = beanName;
    }
    public void init(){
        System.out.println("Book bean initialization!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.resourceLoader=resourceLoader;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
