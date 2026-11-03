package com.core_java.leetCode.Array;

import java.util.ArrayList;
import java.util.List;

public class TwoSum {

    public static void main(String[] args) {
        // Call the method with the correct array syntax
        List<int[]> result = twoSum(new int[]{1, 5, 2, 4, 7}, 6);

        // Iterate over the result list and print each pair of indices
        for (int[] pair : result) {
            System.out.println("Indices: " + pair[0] + ", " + pair[1]);
        }
    }

    public static List<int[]> twoSum(int[] nums, int target) {
        List<int[]> list = new ArrayList<>();

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                // Check if the sum of nums[i] and nums[j] equals the target
                if (target == nums[i] + nums[j]) {
                    // Add the pair of indices as an array to the list
                    list.add(new int[]{i, j});
                }
            }
        }

        // Return the list of index pairs
        return list;
    }
}
