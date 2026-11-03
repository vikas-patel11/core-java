package com.core_java.java8.comparable_and_comparator;

public class Emp  implements Comparable<Emp>{
    private String name;
    private String phone;
    private int id;

    public Emp(String name, String phone, int id) {
        this.name = name;
        this.phone = phone;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

//
//    @Override
//    public int compareTo(Emp o) {
//        return this.getId()-o.getId();
//    }


    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public int compareTo(Emp empObj) {
        return this.getId()- empObj.getId();
//        return this.name.compareTo(empObj.name);
    }
}
