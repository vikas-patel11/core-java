package com.core_java.design_pattern.creational.prototype;

public class Main {

    public static void main(String[] args) throws InterruptedException, CloneNotSupportedException {

        NetworkConnection networkConnection =new NetworkConnection();

        networkConnection.setIp("142.152.14.5");
        networkConnection.setImpData("IMP");
        networkConnection.getLargeData();
        System.out.println(networkConnection);

//        networkConnection.setIp("142.152.14.5");
//        networkConnection.setImpData("IMP@");
//        networkConnection.getLargeData();

        // clone

        networkConnection.getGetName().remove(2);
        NetworkConnection clone1 = (NetworkConnection) networkConnection.clone();
        NetworkConnection clone2 = (NetworkConnection) networkConnection.clone();

        System.out.println(clone1.hashCode());
        System.out.println(clone2.hashCode());

    }
}
