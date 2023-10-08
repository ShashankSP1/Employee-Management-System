package com.web.mywebapp.employee;

public class EmployeeNotFoundException extends Throwable{
    public EmployeeNotFoundException(String message){
        super(message);
    }
}
