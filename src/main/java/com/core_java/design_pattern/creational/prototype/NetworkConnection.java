package com.core_java.design_pattern.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class NetworkConnection implements Cloneable {

    private  String ip;
    private  String impData;
    private List<String> names = new ArrayList<>();

    public List<String> getGetName() {
        return names;
    }

    public void setGetName(List<String> names) {
        this.names = names;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getImpData() {
        return impData;
    }

    public void setImpData(String impData) {
        this.impData = impData;
    }


    public void getLargeData() throws InterruptedException {
        System.out.println("its take long time!!!");
        names.add("vikas");
        names.add("tekno");
        names.add("dept");
        Thread.sleep(5555);
    }


    @Override
    public String toString() {
        return "NetworkConnection{" +
                "ip='" + ip + '\'' +
                ", impData='" + impData + '\'' +
                ", getName=" + names +
                '}';
    }

//    @Override
//    public NetworkConnection clone() {
//        try {
//            return  (NetworkConnection) super.clone();
//        } catch (CloneNotSupportedException e) {
//            throw new AssertionError();
//        }
//    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
