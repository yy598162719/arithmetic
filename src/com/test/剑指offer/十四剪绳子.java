package com.test.剑指offer;

public class 十四剪绳子 {
    public static int integerBreak(int n) {
        if (n < 2)
            return 0;
        if (n == 2)
            return 1;
        if (n == 3)
            return 2;
        int timesOf3 = n / 3;
//        如果n是4则让timesOf为0，则切分为22
        if (n - timesOf3 * 3 == 1)
            timesOf3--;
        int timesOf2 = (n - timesOf3 * 3) / 2;
//        pow 计算前一个数的后一个数的平方
        return (int) (Math.pow(3, timesOf3)) * (int) (Math.pow(2, timesOf2));
    }

    public static void main(String[] args) {
        integerBreak(5);
    }
}
