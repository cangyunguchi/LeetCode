package com.leetcode.study.content;

import java.util.Stack;

public class LeetCode0020 {


    public static boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        for (Character c:s.toCharArray()){
            switch (c){
                case '(':
                case '[':
                case '{':
                    stack.push(c);
                    break;
                case ')':
                    if (stack.size()==0||!stack.pop().equals('(')){
                        return false;
                    }
                    break;
                case ']':
                    if (stack.size()==0||!stack.pop().equals('[')){
                        return false;
                    }
                    break;
                case '}':
                    if (stack.size()==0||!stack.pop().equals('{')){
                        return false;
                    }
                    break;
                default:
                    return false;
            }
        }
        return stack.size() <= 0;
    }


    public static void main(String[] args) {
        System.out.println(isValid("()[]{}"));
    }



}
