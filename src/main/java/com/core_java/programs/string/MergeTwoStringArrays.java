package com.core_java.programs.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeTwoStringArrays {
    public static void main(String[] args) {
        String[] array1 = {"Java", "is", "fun"};
        String[] array2 = {"and", "powerful"};

//        String[] mergedArray = new String[array1.length + array2.length];
//        int index = 0;
//        for (String word : array1) {
//            mergedArray[index++] = word;
//        }
//        for (String word : array2) {
//            mergedArray[index++] = word;
//        }
//        for (String word : mergedArray) {
//            System.out.println(word);
//        }

//        List<String> list1 = new ArrayList<>(Arrays.asList(array1));
        List<String> list1 = Arrays.asList(array1);
        List<String> list2 = Arrays.asList(array2);
//        list1.addAll(list2);

        List<String> mergedList =new ArrayList<>();
        mergedList.addAll(list1);
        mergedList.addAll(list2);




       for (String word : mergedList){
           System.out.println(word);
       }


    }
}
