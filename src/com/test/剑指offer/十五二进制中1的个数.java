package com.test.剑指offer;

public class 十五二进制中1的个数 {
    public int NumberOf1(int n) {
        int cnt = 0;
        while (n != 0) {
            cnt++;
            n &= (n - 1);
        }
        return cnt;
    }
}
