package com.test.剑指offer;

public class 五替换空格 {
    //A B -> A%20B
    //使用新的字符串，一直添加，遇到空格则添加%20
    public static String replaceSpace1(StringBuffer str) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                res.append("%20");
            } else {
                res.append(str.charAt(i));
            }
        }
        return res.toString();
    }

    public static String replaceSpace2(StringBuffer str) {
        //先遍历，遇到空格则增加两个空格
        //记录下原字符串最后一个指针位置
        int P1 = str.length() - 1;
        for (int i = 0; i <= P1; i++) {
            if (str.charAt(i) == ' ') {
                str.append("  ");
            }
        }
        //新字符串指针最后位置
        int P2 = str.length() - 1;
        //    从后往前遍历
        while (P1 < P2 && P1 > 0) {
            char a = str.charAt(P1--);
            if (a == ' ') {
                str.setCharAt(P2--, '0');
                str.setCharAt(P2--, '2');
                str.setCharAt(P2--, '%');
            } else {
                str.setCharAt(P2--, a);
            }
        }
        return str.toString();
    }

    public static void main(String[] args) {
        String a = "A   B CDAS QWE DAS DASDQWEQWE";
        System.out.println(replaceSpace1(new StringBuffer(a)));
    }
}
