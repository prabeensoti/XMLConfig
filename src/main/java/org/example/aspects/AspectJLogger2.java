package org.example.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;

@Aspect
@Order(2)
public class AspectJLogger2 {
    @Before("execution(* org.example.model.*.*())")
    public void before(JoinPoint joinPoint) {
        System.out.println("Before2 : "+joinPoint.getSignature().getDeclaringTypeName()+" : "+joinPoint.getSignature().getName());
    }
    @After("execution(* org.example.model.EmailService.*(..))")
    public void after(JoinPoint joinPoint) {
        System.out.println("After2 : "+joinPoint.getSignature().getDeclaringTypeName()+" : "+joinPoint.getSignature().getName());
    }
    @AfterReturning("execution(* org.example.model.EmailService.*(..))")
    public void afterReturn(JoinPoint joinPoint) {
        System.out.println("After Return2 : "+joinPoint.getSignature().getDeclaringTypeName()+" : "+joinPoint.getSignature().getName());
    }
    @AfterThrowing("execution(* org.example.model.EmailService.*(..))")
    public void afterThrow(JoinPoint joinPoint) {
        System.out.println("After Throw2 : "+joinPoint.getSignature().getDeclaringTypeName()+" : "+joinPoint.getSignature().getName());
    }

    @Around("execution(* org.example.model.EmailService.*(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        System.out.println("Before execution2 : "+proceedingJoinPoint.getSignature().getDeclaringTypeName()+" : "+proceedingJoinPoint.getSignature().getName());
        proceedingJoinPoint.proceed();
        System.out.println("After execution2 : "+proceedingJoinPoint.getSignature().getDeclaringTypeName()+" : "+proceedingJoinPoint.getSignature().getName());
    }
}
