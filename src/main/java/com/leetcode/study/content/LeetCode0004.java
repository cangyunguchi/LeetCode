package com.leetcode.study.content;

/**
 * 给定两个大小为 m 和 n 的有序数组 nums1 和 nums2。
 * 请你找出这两个有序数组的中位数，并且要求算法的时间复杂度为 O(log(m + n))。
 * 你可以假设 nums1 和 nums2 不会同时为空。
 * 示例 1:
 * nums1 = [1, 3]
 * nums2 = [2]
 * 则中位数是 2.0
 * 示例 2:
 * nums1 = [1, 2]
 * nums2 = [3, 4]
 * 则中位数是 (2 + 3)/2 = 2.5
 * @author bjzhaoyongli
 */
public class LeetCode0004 {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        return 0d;
    }

    public static double getMid(int[] num,int start,int end){
        int temp=(end+start)/2;
        if (temp%2!=0){
            return num[temp]+num[temp+1];
        }else{
            return num[temp];
        }
    }

    public static void main(String[] args) {
        int[] nums1={1,3};
        int[] nums2={2};
        System.out.println(findMedianSortedArrays(nums1,nums2));
    }
}
