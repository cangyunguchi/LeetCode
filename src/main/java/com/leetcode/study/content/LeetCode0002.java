package com.leetcode.study.content;

import com.leetcode.study.util.BaseClass;
import com.leetcode.study.util.Builder;
import com.leetcode.study.util.ListNode;

/**
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * 示例：
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 * @author bjzhaoyongli
 */
public class LeetCode0002{

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head=new ListNode();
        ListNode before=head;
        int promot=0;
        while (!(l1==null&&l2==null&&promot==0)){
            if (l2==null){
                l2=new ListNode(0);
            }
            if (l1==null){
                l1=new ListNode(0);
            }
            int val=(l1.val+l2.val+promot)%10;
            promot=(l1.val+l2.val+promot)/10;
            ListNode node=new ListNode(val);
            before.next=node;
            before=node;
            l1=l1.next;
            l2=l2.next;
        }
        return head.next;

    }

    public static void main(String[] args) {
        ListNode l1=Builder.builder(new int[]{1,2,3});
        ListNode l2=Builder.builder(new int[]{7,9,8});
        BaseClass.printLinkedList(addTwoNumbers(l1,l2));
    }


}
