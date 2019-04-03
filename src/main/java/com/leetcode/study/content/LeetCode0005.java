package com.leetcode.study.content;


/**
 * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
 * 示例 1：
 * 输入: "babad"
 * 输出: "bab"
 * 注意: "aba" 也是一个有效答案。
 * 示例 2：
 * 输入: "cbbd"
 * 输出: "bb"
 * @author bjzhaoyongli
 */
public class LeetCode0005 {

    public static String longestPalindrome(String s) {
        if (s==null||s.length()==0){
            return s;
        }
        String str=s.substring(0,1);
        for (int i=1;i<s.length();i++){
            String result1=findMax(s,i,i);
            String result2=findMax(s,i-1,i);
            String temp=result1.length()>result2.length()?result1:result2;
            if (temp.length()>str.length()){
                str=temp;
            }
        }
        return str;
    }

    public static String findMax(String s,Integer pos1,Integer pos2){
        while (pos1>=0&&pos2<=s.length()-1&&s.charAt(pos1)==s.charAt(pos2)){
            pos1--;
            pos2++;
        }
        return s.substring(pos1+1,pos2);
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad"));
    }
}
