package com.core_java.DSA.SlidingWindow;

public class ArrayDemo {
    public static void main(String[] args) {

        // Problem: Maximum Sum Subarray of Size K

       /* int[] nums = {2, 1, 5, 1, 3, 2};
        int k = 3;

        int windowSum = 0;

        for (int i = 0; i < k; i++) {
            windowSum = windowSum + nums[i];
        }
        System.out.println("windowSum :: " + windowSum);

        int maxSum = windowSum;
        for (int i = k; i < nums.length; i++) {

            windowSum = windowSum - nums[i - k] + nums[i];

//            maxSum = Math.max(maxSum, windowSum);
            if (windowSum > maxSum) {
                maxSum = windowSum;
            }

        }
        System.out.println("Maximum Sum = " + maxSum);*/


        //Problem: Find Average of All Subarrays of Size K

        int[] nums = {1, 3, 2, 6, -1, 4, 1, 8, 2};
        int k = 5;


        int sumWindow = 0;
        for (int i = 0; i < k ; i++) {
            sumWindow = sumWindow+nums[i];

        }
        double avg = (double) sumWindow / k;
        System.out.println("avg :: "+avg);

        for (int i = k; i < nums.length ; i++) {

            sumWindow = sumWindow-nums[i-k]+nums[i];

            System.out.println((double) sumWindow/k);
        }








    }

}
