package com.core_java.DSA.TwoPointer;

import java.util.Arrays;
import java.util.HashSet;

public class TwoPointerDemo {

    public static void main(String[] args) {

        int[] nums = {1, 10, 2, 9, 3, 8};
        int target = 11;

        // ---------------- HASHSET ----------------

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {

            int need = target - num;

            if (set.contains(need)) {
                System.out.println("HashSet: " +
                        num + " + " + need + " = " + target);
//                break;
            }

            set.add(num);
        }

        // ---------------- TWO POINTER ----------------

        Arrays.sort(nums);

        int i = 0;
        int j = nums.length - 1;

        while (i < j) {

            int sum = nums[i] + nums[j];

            if (sum == target) {

                System.out.println("Two Pointer: " +
                        nums[i] + " + " + nums[j] + " = " + target);

                break;
            }

            else if (sum < target) {
                i++;
            }

            else {
                j--;
            }
        }
    }
}