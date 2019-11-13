package com.test.leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class 翻转字符串里的单词 {
//    利用java方法的简单解法
    public static String reverseWords(String s) {
        String[] words = s.trim().split(" +");
        Collections.reverse(Arrays.asList(words));
        String join = String.join(" ", words);
        return join;
    }
//    利用栈的暴力解法
    public static String reverseWords1(String s) {
        Stack<String> stack = new Stack<>();
        StringBuilder temp = new StringBuilder();
        s += " ";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                if (temp.length() != 0) {
                    stack.push(temp.toString());
                    temp = new StringBuilder();
                }
            } else {
                temp.append(s.charAt(i));
            }
        }
        if (stack.isEmpty()) {
            return "";
        }
        StringBuilder res = new StringBuilder();
        res.append(stack.pop());
        while (!stack.isEmpty()) {
            res.append(" ");
            res.append(stack.pop());
        }
        return res.toString();
    }
    public static void main(String[] args) {
        String the_sky_is_blue = reverseWords1("the sky is blue");
        System.out.println(the_sky_is_blue);
    }
}
