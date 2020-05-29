package org.example.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Order(2)
@Component
public class EmployeeAspectPointCut {

    /**
     * Execution - @Pointcut("execution(* org.example.aop.model.EmployeeModel.getEmployeeName())")
     * within - @Pointcut("within(org.example.aop.model.EmployeeModel)"), @Pointcut("within(org.example..*)")
     * target - @Pointcut("target(org.example.aop.model.EmployeeModel)")
     * this - @Pointcut("this(org.example.aop.model.EmployeeModel)")
     */

    @Pointcut("execution(* org.example.aop.model.EmployeeModel.getEmployeeName())")
    public void executionPointCut(){
    }

    @Before("executionPointCut()")
    public void advicePointCutExecution(){
        System.out.println("Point Cut Execution");
    }


    @Pointcut("within(org.example.aop.model.EmployeeModel)")
//    @Pointcut("within(org.example.aop.model.*)")
    public void withinPointCut(){
    }

    @Before("withinPointCut()")
    public void advicePointCutWithin(){
        System.out.println("point cut within");
    }

    @Pointcut("args(org.example.aop.model.EmployeeModel)")
    public void argsPointCut(){
    }

    @Before("argsPointCut()")
    public void advicePointCutArgs(JoinPoint joinPoint){
        System.out.println("point cut args : "/*+joinPoint.getArgs()[0]*/);
    }

    @Pointcut("bean(*employeeModel)")
    public void beanPointCut(){
    }

    @Before("beanPointCut()")
    public void advicePointCutbean(JoinPoint joinPoint){
        System.out.println("point cut Bean");
    }

}
