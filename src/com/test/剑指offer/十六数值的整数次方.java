package com.test.剑指offer;

public class 十六数值的整数次方 {
    //递归法
    public static double Power(double base, int exponent) {
        if (exponent == 0)
            return 1;
        if (exponent == 1)
            return base;
        boolean isNegative = false;
        if (exponent < 0) {
            exponent = -exponent;
            isNegative = true;
        }
        double pow = Power(base * base, exponent / 2);
        if (exponent % 2 != 0)
            pow = pow * base;
        return isNegative ? 1 / pow : pow;
    }

    // 指数为正数的情况
    public double powerWithExponent(double base, int exponent) {
        double result = 1.0;
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        return result;
    }

    // 数值比较的方法
    public boolean equal(double num1, double num2) {
        if (Math.abs(num1 - num2) < 0.0000001) {
            return true;
        } else {
            return false;
        }
    }

    // 暴力破解法
    public double power(double base, int exponent) {
        double result = 0.0;
        // 首先比较底数为0,指数为负数的情况，这种情况没有意义
        if (this.equal(base, 0.0) && exponent < 0) {
            try {
                throw new Exception("没有意义");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        // exponent的三种情况
        if (exponent == 0) { // exponent为0的情况
            return 1.0;
        } else if (exponent < 0) { // exponent小于0的情况
            result = this.powerWithExponent(1 / base, -exponent);
        } else if (exponent > 0) { // exponent大于0的情况
            result = this.powerWithExponent(base, exponent);
        }
        return result;
    }

    public static void main(String[] args) {
        Power(2, 3);
    }
}
