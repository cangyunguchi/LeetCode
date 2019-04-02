package com.leetcode.study.util;

public class Builder {

    public static ListNode builder(int[] array){
        ListNode head=new ListNode(array[0]);
        ListNode before=head;
        for (int i=1;i<array.length;i++){
            ListNode node=new ListNode(array[i]);
            before.next=node;
            before=node;
        }
        return head;
    }
}
