package com.test.sort;

public class 插入 {
    // 插入排序，a表示数组，n表示数组大小
    public static void insertionSort(int[] a, int n) {
        if (n <= 1) {
            return;
        }
        for (int i = 1; i < n; ++i) {
            int value = a[i];
            int j = i - 1;
//            查找插入的位置
            for (; j >= 0; --j) {
                if (a[j] > value) {
                    // 数据移动
                    a[j + 1] = a[j];
                } else {
                    break;
                }
            }
            // 插入数据
            a[j + 1] = value;
        }
    }

    public static void main(String[] args) {
        int[] a={1,6,3,7,2};
        insertionSort(a,5);
        System.out.println(a);
    }
}
