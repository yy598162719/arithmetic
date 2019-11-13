package com.test.动态规划;

import java.util.ArrayList;
import java.util.List;

public class 杨辉三角 {
    public List<List<Integer>> generate(int numRows) {
        if (numRows <= 0) {
            return null;
        }
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());
        res.get(0).add(1);
//        每一行
        for (int i = 1; i < numRows; i++) {
//            新的一行
            List<Integer> row = new ArrayList<>();
//            前一行
            List<Integer> prevRow = res.get(i - 1);
            row.add(1);
            for (int j = 1; j < i; j++) {
                row.add(prevRow.get(j - 1) + prevRow.get(j));
            }
            row.add(1);
            res.add(row);
        }
        return res;
    }
}
