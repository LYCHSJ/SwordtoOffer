package com.alex.question;

import static java.lang.Integer.max;

public class Solution {

    public int FindGreatestSumOfSubArray2(int[] arr,int n){
        int sum = arr[0];
        int maxPre = arr[0];
        for(int i = 1; i < n; i++){
            sum = max(sum+arr[i],arr[i]);
            if(sum >= maxPre)
                maxPre = sum;
        }

        return maxPre;
    }

}
