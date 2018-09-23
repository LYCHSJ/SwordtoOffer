package com.alex.question;

public class Solution {

    public int lastRemain(int[] nums,int n){
        if(nums.length<1||n<1){
            return -1;
        }
        int last =0;
        for(int i=2;i<=nums.length;i++){
            last = (last+n)%i;
        }
        return nums[last];
    }
}
