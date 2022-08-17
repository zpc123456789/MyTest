package com.zpc.customer.aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author Administrator
 */
@Component
@Aspect
public class MyAnnotationAspect {

    @Pointcut(value = "@annotation(com.zpc.customer.aop.MyAnnotation)")
    public void testBefore(){
        System.out.println("cut------");
    }

    @Before(value = "@annotation(com.zpc.customer.aop.MyAnnotation)")
    public void before() {
        System.out.println("before------");
    }

    @AfterReturning(returning = "data", pointcut = "@annotation(com.zpc.customer.aop.MyAnnotation)")
    public void afterRun(JoinPoint joinPoint, Object data) {
        Signature signature = joinPoint.getSignature();
        System.out.println(signature.getDeclaringTypeName());
        System.out.println(data);
    }

}
