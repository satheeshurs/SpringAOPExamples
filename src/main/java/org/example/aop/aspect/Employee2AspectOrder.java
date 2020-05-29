package org.example.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/** Instead of using @Ordered annotation Ordered interface can be used*/
//@Aspect
@Component
public class Employee2AspectOrder implements Ordered {

    @Before("execution(* org.example.aop.model.EmployeeModel.setEmployeeName(..))")
    public void setEmployeeNameBefore(){
        System.out.println("Employee2AspectOrder Aspect to set employee name : Before");
    }

    @After("execution(public void setEmployeeName(..))")
    public void setEmployeeNameAfter(){
        System.out.println(" Employee2AspectOrder Aspect to set employee name: after");
    }

    @After("execution(public * setEmployeeName(..))")
    public void setEmployeeNameAfter2(){
        System.out.println(" Employee2AspectOrder Aspect to set employee name: after2");
    }




    public int getOrder() {
        return 0;
    }
}
