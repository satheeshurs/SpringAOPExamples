package org.example.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/** Aspects can be ordered, advice is not possible*/
//@Aspect
@Component
@Order(1)
public class EmployeeAspect {

    @Before("execution(* org.example.aop.model.EmployeeModel.setEmployeeName(..))")
    public void setEmployeeNameBefore(){
        System.out.println("Aspect to set employee name : Before");
    }

    @After("execution(public void setEmployeeName(..))")
    public void setEmployeeNameAfter(){
        System.out.println("Aspect to set employee name: after");
    }

    @Around("execution(public * getEmployeeName(..))")
    public Object setEmployeeAround(ProceedingJoinPoint proceedingJoinPoint){
        System.out.println("Aspect around employee name: start");
        Object value = null;
        try {
            value = proceedingJoinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("Aspect around employee name: end : "+value);
        return value;
    }

}
