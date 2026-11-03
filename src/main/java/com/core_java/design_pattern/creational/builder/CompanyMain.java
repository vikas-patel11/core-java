package com.core_java.design_pattern.creational.builder;

public class CompanyMain {

    public static void main(String[] args) {

        Company.CompanyBuilder companyBuilder = new Company.CompanyBuilder();
        Company tekno = companyBuilder.setName("tekno").setEmp(20).setRegNo(1).build();
        System.out.println("tekno::"+tekno.hashCode());

        Company dept = companyBuilder.setName("dept").setEmp(2000).setGst(564646).build();
        System.out.println("dept::"+dept.hashCode());


    }
}
