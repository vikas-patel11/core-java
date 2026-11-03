package com.core_java.design_pattern.creational.builder;

public class Company {

    private final String name;
    private final int regNo;
    private final String location;
    private final int emp;
    private final int gst;

    public Company(CompanyBuilder companyBuilder) {
        this.name = companyBuilder.getName();
        this.regNo = companyBuilder.getRegNo();
        this.location = companyBuilder.getLocation();
        this.emp = companyBuilder.getEmp();
        this.gst = companyBuilder.getGst();
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", regNo=" + regNo +
                ", location='" + location + '\'' +
                ", emp=" + emp +
                ", gst=" + gst +
                '}';
    }



    public String getName() {
        return name;
    }

    public int getRegNo() {
        return regNo;
    }

    public String getLocation() {
        return location;
    }

    public int getEmp() {
        return emp;
    }

    public int getGst() {
        return gst;
    }



    public static class CompanyBuilder{

        private String name;
        private int regNo;
        private String location;
        private int emp;
        private int gst;

        public CompanyBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public CompanyBuilder setRegNo(int regNo) {
            this.regNo = regNo;
            return this;

        }

        public CompanyBuilder setLocation(String location) {
            this.location = location;
            return this;

        }

        public CompanyBuilder setEmp(int emp) {
            this.emp = emp;
            return this;

        }

        public CompanyBuilder setGst(int gst) {
            this.gst = gst;
            return this;

        }

        public String getName() {
            return name;
        }

        public int getRegNo() {
            return regNo;
        }

        public String getLocation() {
            return location;
        }

        public int getEmp() {
            return emp;
        }

        public int getGst() {
            return gst;
        }

        public Company build(){
            return new Company(this);
        }
    }


}
