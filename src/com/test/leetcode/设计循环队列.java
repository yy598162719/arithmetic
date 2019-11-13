package com.test.leetcode;

public class 设计循环队列 {
}
class MyCircularQueue {
    private Integer []arr;
    private int head;
    private int tail;
    /** Initialize your data structure here. Set the size of the queue to be k. */
    public MyCircularQueue(int k) {
        arr=new Integer[k];
        head=0;
        tail=0;
    }

    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        if(isFull()) {
            return false;
        }else {
            arr[tail]=value;
            tail=(tail+1)%(arr.length);
            return true;
        }

    }

    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if(isEmpty()) {
            return false;
        }else {
            arr[head]=null;
            head=(head+1)%(arr.length);
            return true;
        }
    }

    /** Get the front item from the queue. */
    public int Front() {
        if(isEmpty()) {
            return -1;
        }else {
            return arr[head];
        }
    }

    /** Get the last item from the queue. */
    public int Rear() {
        if(isEmpty()) {
            return -1;
        }else {
            if(tail!=0)return arr[tail-1];
                //这里是如果tail为0，则最后一次添加的元素在末尾
            else return arr[arr.length-1];
        }
    }

    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        if(head==tail&&arr[head]==null) {
            return true;
        }else {
            return false;
        }
    }

    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        if(head==tail&&arr[head]!=null) {
            return true;
        }else {
            return false;
        }
    }
}
