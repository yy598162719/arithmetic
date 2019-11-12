package com.test.剑指offer;

import com.test.domain.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class 七重建二叉树 {
    // 缓存中序遍历数组每个值对应的索引
    private static Map<Integer, Integer> indexForInOrders = new HashMap<>();

    public static TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        for (int i = 0; i < in.length; i++)
//            缓存每个值索引
        {
            indexForInOrders.put(in[i], i);
        }
        return reConstructBinaryTree(pre, 0, pre.length - 1, 0);
    }

    private static TreeNode reConstructBinaryTree(int[] pre, int preL, int preR, int inL) {
        if (preL > preR) {
            return null;
        }
//        根节点
        TreeNode root = new TreeNode(pre[preL]);
//        根节点的值
        int inIndex = indexForInOrders.get(root.data);
//         左子树长度
        int leftTreeSize = inIndex - inL;
        root.left = reConstructBinaryTree(pre, preL + 1, preL + leftTreeSize, inL);
        root.right = reConstructBinaryTree(pre, preL + leftTreeSize + 1, preR, inL + leftTreeSize + 1);
        return root;
    }

    public static void main(String[] args) {
        int[] a = {3, 9, 20, 15, 7};
        int[] b = {9, 3, 15, 20, 7};
        TreeNode treeNode = reConstructBinaryTree(a, b);
        System.out.println(treeNode);

    }
}
