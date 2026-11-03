package com.core_java.array;

public class Demoew {

    public static void main(String[] args) {

       int[] num = {4,5,8,2,6,3,7};

       int key = 6                   ;
       int pos= 1;
       boolean found= false;

       for (int i=0;i<num.length ; i++){
           if(num[i]==key){
               found =true;
               pos = pos+i;
           }
       }

       if(found){
           System.out.println("position ::: "+ pos);
       }else {
           System.out.println("key value not found!");
       }
    }
}
