package com.leetcode.study.content;

/**
 * 将一个给定字符串根据给定的行数，以从上往下、从左到右进行 Z 字形排列
 * 比如输入字符串为 "LEETCODEISHIRING" 行数为 3 时，排列如下：

 L   C   I   R
 E T O E S I I G
 E   D   H   N
 之后，你的输出需要从左往右逐行读取，产生出一个新的字符串，比如："LCIRETOESIIGEDHN"。

 请你实现这个将字符串进行指定行数变换的函数：

 string convert(string s, int numRows);
 示例 1:

 输入: s = "LEETCODEISHIRING", numRows = 3
 输出: "LCIRETOESIIGEDHN"
 示例 2:

 输入: s = "LEETCODEISHIRING", numRows = 4
 输出: "LDREOEIIECIHNTSG"
 解释:

 L     D     R
 E   O E   I I
 E C   I H   N
 T     S     G

 * @author bjzhaoyongli
 */
public class LeetCode0006 {

    public static String convert(String s, int numRows) {
        StringBuilder str=new StringBuilder();
        int pos;
        for (int i=0;i<numRows;i++){
            boolean flag=true;
            pos=i;
            while (pos<s.length()){
                str.append(s.charAt(pos));
                if (i>0&&i<numRows-1){
                    if(flag){
                        pos+=2*(numRows-i-1);
                    }else{
                        pos+=2*i;
                    }
                }else{
                    pos+=2*(numRows-1)>0?2*(numRows-1):1;
                }

                flag=!flag;
            }
        }
        return str.toString();
    }


    public static void main(String[] args) {
        System.out.println(convert("LEETCODEISHIRING",3));
    }
}
