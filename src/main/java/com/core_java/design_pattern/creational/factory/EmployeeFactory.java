package com.core_java.design_pattern.creational.factory;

public class EmployeeFactory {

    //get the employee
    public static Employee getEmployee(String empType){

        if(empType.trim().equalsIgnoreCase("android")){
            return new AndroidDeveloper();
        }else if(empType.trim().equalsIgnoreCase("web")) {
            return new WebDeveloper();
        }
        return null;


    }


}
