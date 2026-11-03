package com.core_java.bean;

import com.core_java.array.Array;
import netscape.javascript.JSObject;

import java.util.Arrays;

public class Demo_class {

    public static void main(String[] args) {

        Demo_bean demoBean = new Demo_bean();
        demoBean.setName1("vikas");
        demoBean.setName2("patel");


        







        String string = demoBean.toString();

        System.out.println(string);

        String[] demo =new String[5];
        demo[0] = "teknno";
        demo[1] = "point";
        demo[2] = "dept";

        System.out.println(Arrays.toString(demo));





    }

}
