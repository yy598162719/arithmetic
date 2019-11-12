package com.test.剑指offer;

import java.util.Arrays;

public class 三数组中重复的数字 {
    public static boolean duplicate(int[] nums, int length) {
        if (nums == null || length <= 1) {
            return false;
        }
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] != i) {
                if (nums[i] == nums[nums[i]]) {
                    System.out.println("重复：" + nums[i]);
                    return true;
                }
                int temp = nums[i];
                nums[i] = nums[nums[i]];
                nums[temp] = temp;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] a = {2, 3, 1, 0, 2, 5};
        duplicate(a, 6);
    }
}
