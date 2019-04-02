package com.leetcode.study.util;

/**
 * @author bjzhaoyongli
 */
public class BaseClass {

    public static <T> void  printArray(T[] objectArray){
        StringBuilder builder=new StringBuilder("[");
        for (T t:objectArray){
            builder.append(t.toString()).append(",");
        }
        builder.setCharAt(builder.length()-1,']');
        System.out.println(builder.toString());
    }

    public static void printArray(int[] objectArray){
        StringBuilder builder=new StringBuilder("[");
        for (int t:objectArray){
            builder.append(t).append(",");
        }
        builder.setCharAt(builder.length()-1,']');
        System.out.println(builder.toString());
    }

    public static void printLinkedList(ListNode node){
        StringBuilder builder=new StringBuilder();
        while (node!=null){
            builder.append(node.val).append("-");
            node=node.next;
        }
        builder.deleteCharAt(builder.length()-1);
        System.out.println(builder.toString());
    }
}
