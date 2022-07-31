package org.example.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;

@Aspect
@Order(1)
public class AspectJLogger {
    @Before("execution(* org.example.model.EmailService.*())")
    public void before(JoinPoint joinPoint) {
        System.out.println("Before : "+joinPoint.getSignature().getDeclaringTypeName()+" : "+joinPoint.getSignature().getName());
    }
    @After("execution(* org.example.model.*.*(..))")
    public void after(JoinPoint joinPoint) {
        System.out.println("After : "+joinPoint.getSignature().getDeclaringTypeName()+" : "+joinPoint.getSignature().getName());
    }
    @AfterReturning("execution(* org.example.model.EmailService.*(..))")
    public void afterReturn(JoinPoint joinPoint) {
        System.out.println("After Return : "+joinPoint.getSignature().getDeclaringTypeName()+" : "+joinPoint.getSignature().getName());
    }
    @AfterThrowing("execution(* org.example.model.EmailService.*(..))")
    public void afterThrow(JoinPoint joinPoint) {
        System.out.println("After Throw : "+joinPoint.getSignature().getDeclaringTypeName()+" : "+joinPoint.getSignature().getName());
    }

    @Around("execution(* org.example.model.EmailService.*(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        System.out.println("Before execution : "+proceedingJoinPoint.getSignature().getDeclaringTypeName()+" : "+proceedingJoinPoint.getSignature().getName());
        if (Math.random() > 0.5) {
            proceedingJoinPoint.proceed();
        }
        System.out.println("After execution : "+proceedingJoinPoint.getSignature().getDeclaringTypeName()+" : "+proceedingJoinPoint.getSignature().getName());
    }
}
