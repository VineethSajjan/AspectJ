package org.example;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AspectJ {
    @Before("execution(* org.example.Execute.*(..))")
    public void before_aspect(){
        System.out.println("Executed before");
    }
    @After("execution(* org.example.Execute.*(..))")
    public void after_aspect(){
        System.out.println("Executed after");
    }

}