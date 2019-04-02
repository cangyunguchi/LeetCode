package com.leetcode.study.content;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 * 示例 1:
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * 示例 2:
 * 输入: "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * 示例 3:
 * 输入: "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 * 请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 * @author bjzhaoyongli
 */
public class LeetCode0003 {

    public static int lengthOfLongestSubstring(String s) {
        if (s.length()<=1){
            return s.length();
        }
        int start=0;
        int end;
        int max=0;

        Map<Character,Integer> map=new HashMap<>();
        for (end=0;end<s.length();end++){
            if (map.get(s.charAt(end))==null||!(map.get(s.charAt(end))>=start)){
                map.put(s.charAt(end),end);
            }else{
                max=max>end-start?max:end-start;
                start=map.get(s.charAt(end))+1;
                map.put(s.charAt(end),end);
            }
        }
        max=max>end-start?max:end-start;
        return max;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring(" "));
    }
}
