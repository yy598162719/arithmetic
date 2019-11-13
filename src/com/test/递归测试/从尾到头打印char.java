package com.test.递归测试;

public class 从尾到头打印char {
    public static void main(String[] args) {
        char[] r={'a','b','c'};
        printReverse(r);
    }
    private static void printReverse(char [] str) {
        helper(0, str);
    }

    private static void helper(int i, char[] str) {
//        终止条件
        if(null==str||i>=str.length){
            return;
        }
        helper(i+1,str);
        System.out.println(str[i]);
    }

}
