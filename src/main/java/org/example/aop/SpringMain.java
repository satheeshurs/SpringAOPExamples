package org.example.aop;

import org.example.aop.config.AppConfig;
import org.example.aop.model.EmployeeModel;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringMain {
    public static void main(String... arg){
        AnnotationConfigApplicationContext  applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(AppConfig.class);
        applicationContext.refresh();;
        EmployeeModel employeeModel = (EmployeeModel) applicationContext.getBean("employeeModel");
        employeeModel.setEmployeeName("satheesh");
        employeeModel.getEmployeeName();
        //Beans will get destroyed
        applicationContext.close();
    }
}
