package org.example;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.util.ArrayList;
import java.util.List;

public class PrototypeDestroyer implements BeanPostProcessor, BeanFactoryAware {

    private List<Object> prototypeBeans;

    private BeanFactory beanFactory;

    public PrototypeDestroyer() {
        prototypeBeans = new ArrayList<>();
        System.out.println("Prototype Destroyer created!!!!!!");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if(beanFactory.isPrototype(beanName) && bean instanceof DisposableBean) {
            synchronized (prototypeBeans) {
                prototypeBeans.add(bean);
            }
        }
        return bean;
    }


    public void destroy() throws Exception {
        synchronized (prototypeBeans){
            for (Object obj: prototypeBeans){
                DisposableBean disposableBean = (DisposableBean) obj;
                disposableBean.destroy();
            }
            prototypeBeans.clear();
        }
    }
}
