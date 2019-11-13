package com.test.leetcode;

public class 移动零 {
    //双指针法
    public void moveZeroes(int[] nums) {
        //j指针从头遍历，遇到0时停下，至到i指针指向大于0时交换
        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[j] != 0) {
                j++;
                continue;
            }
//            来到这的话nums[j]=0;
            if (nums[i]!=0){
                nums[j++]=nums[i];
                nums[i]=0;
            }
        }
    }
}
