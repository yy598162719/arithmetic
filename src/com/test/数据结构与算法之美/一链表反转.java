package com.test.数据结构与算法之美;

import com.test.domain.ListNode;

public class 一链表反转 {
    /**
     * 双指针遍历法
     * @param node
     * @return
     */
    public static ListNode reverseList(ListNode node) {
        ListNode pre = null;
        ListNode next = null;
        while (null != node.next) {
            next=node.next;
            node.next=pre;
            pre=node;
            node=next;
        }
        return pre;
    }
}
