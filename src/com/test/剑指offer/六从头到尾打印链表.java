package com.test.剑指offer;

import com.test.domain.ListNode;

import java.util.ArrayList;

public class 六从头到尾打印链表 {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> ret = new ArrayList<>();
        if (listNode != null) {
            ret.addAll(printListFromTailToHead(listNode.next));
            ret.add(listNode.val);
        }
        return ret;
    }

}
