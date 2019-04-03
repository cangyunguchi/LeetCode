package com.leetcode.study.content;

/**
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。

 示例 1:

 输入: 123
 输出: 321
 示例 2:

 输入: -123
 输出: -321
 示例 3:

 输入: 120
 输出: 21
 * @author bjzhaoyongli
 */
public class LeetCode0007 {

    public static int reverse(int x) {
        boolean flag=true;
        if (x<0){
            flag=false;
        }
        if (x==Integer.MIN_VALUE){
            return 0;
        }
        int result=0;
        while (x!=0){
            int left=x%10;
            if (flag){
                if ((Integer.MAX_VALUE-left)/10<result){
                    return 0;
                }
                result=result*10+left;
                x/=10;
            }else{
                if ((Integer.MIN_VALUE-left)/10>result){
                    return 0;
                }
                result=result*10+left;
                x/=10;
            }

        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(reverse(-2147483412));
    }


}
