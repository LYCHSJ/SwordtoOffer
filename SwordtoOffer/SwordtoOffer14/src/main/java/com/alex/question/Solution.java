package com.alex.question;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Solution {

    public int[] groupIntoTwoPart(int[] nums){
        int p=0;
        int q=nums.length-1;
        while(p<q){
            while(nums[p]%2==1){
                p++;
            }
            while(nums[q]%2==0){
                q--;
            }
            int tmp = nums[p];
            nums[p] = nums[q];
            nums[q] = tmp;

        }
        return nums;
    }
}
