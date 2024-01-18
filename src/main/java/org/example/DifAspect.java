package org.example;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class DifAspect {
    //    @Pointcut(value="execution(* org.example.ExeAspect.*(..))");
//    void lll(){
//
//    }
    @Before("execution(* org.example.ExeAspect.*(..))")
    public void vng(){
        System.out.println("Im Executed before");
    }

}