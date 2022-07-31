package org.example.aspects;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class LogBeforeAndAfter implements MethodBeforeAdvice, AfterReturningAdvice{

    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("Starting: "+target.getClass()+" : "+method.getName());
    }

    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("Ended: "+target.getClass()+" : "+method.getName());
    }
}
