package com.test.递归测试;

import com.test.domain.ListNode;

public class 两两交换链表中的节点 {
    /**
     * 其中我们应该关心的主要有三点：
     * <p>
     * 返回值
     * 调用单元做了什么
     * 终止条件
     * 在本题中：
     * <p>
     * 返回值：交换完成的子链表
     * 调用单元：设需要交换的两个点为 head 和 next，head 连接后面交换完成的子链表，next 连接 head，完成交换
     * 终止条件：head 为空指针或者 next 为空指针，也就是当前无节点或者只有一个节点，无法进行交换
     * <p>
     * 作者：guanpengchn
     * 链接：https://leetcode-cn.com/problems/swap-nodes-in-pairs/solution/hua-jie-suan-fa-24-liang-liang-jiao-huan-lian-biao/
     * 来源：力扣（LeetCode）
     * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     */
    public ListNode swapPairs(ListNode head) {
        //终止条件
        if (head == null || head.next == null) {
            return head;
        }

        ListNode next = head.next;
        head.next = swapPairs(next.next);
        next.next = head;
        return next;
    }
}
