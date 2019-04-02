package com.leetcode.study.content;

import com.leetcode.study.util.BaseClass;

import java.util.HashMap;
import java.util.Map;

/**
 * @author bjzhaoyongli
 */
public class LeetCode0001{

    private static int[] twoSum(int[] nums,int target){
        Map<Integer,Integer> map=new HashMap<>();
        for (int i=0;i<nums.length;i++){
            int result=target-nums[i];
            if (map.containsKey(result)){
                return new int[]{map.get(result),i};
            }
            map.put(nums[i],i);
        }
        return null;
    }


    public static void main(String[] args) {
        int[] input={3,3};
        int[] result=twoSum(input,6);
        BaseClass.printArray(result);
    }
}
