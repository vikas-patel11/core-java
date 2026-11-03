package com.core_java.Coding.Array.TwoPointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class TwoPointerNormalDemo {

    public static void main(String[] args) {

        int[] num = {2, 4, 6, 7, 8, 9, 5, 3};
        Arrays.sort(num);

        List<String> list = new ArrayList<>();

        int target = 12;

        for (int i = 0; i < num.length - 1; i++) {

            for (int j = i + 1; j < num.length; j++) {

                int sum = num[i] + num[j];

                if (sum == target) {
                    list.add("{" + num[i] + ":" + num[j] + "}");
                    // break;  // if need first only
                }
            }
        }

        System.out.println(list);



    }
}
