package org.example.aop.model;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class EmployeeModel implements DisposableBean, InitializingBean {
    int employeeId;
    String employeeName;
    int employeeAge;

    public EmployeeModel(){
        System.out.println("Employee constructor");
    }
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmployeeAge() {
        return employeeAge;
    }

    public void setEmployeeAge(int employeeAge) {
        this.employeeAge = employeeAge;
    }

    public void destroy() throws Exception {
        System.out.println("destroy");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("After initilizing properties");
    }
}
