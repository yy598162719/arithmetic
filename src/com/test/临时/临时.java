package com.test.临时;

class Solution {
    private static int res = Integer.MAX_VALUE;
    public static int minSubArrayLen(int s, int[] nums) {
        if(nums == null) return 0;
        int left = 0;//左边界
        int right = 0;//右边界
        int sum = 0;//和
        //当右指针小于长度
        while(right < nums.length){
//             和
            sum += nums[right];
//
            while(left <= right && sum >= s){
                res = Math.min(res,right - left + 1);
                sum -= nums[left];
                left++;
            }
            right++;
        }
        if(res == Integer.MAX_VALUE)
            return 0;
        return res;
    }

    public static void main(String[] args) {
        int[] a={2,3,1,2,4,3};
        int i = minSubArrayLen(7, a);
    }
}