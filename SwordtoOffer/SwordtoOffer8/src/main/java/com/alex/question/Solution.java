package com.alex.question;

import java.util.HashMap;

public class Solution {

    public int findIndex(int[] array){
        if(array==null || array.length ==0){
            return 0;
        }
        int left = 0;
        int right = array.length-1;
        int index = 0;
        while(array[left]>=array[right]){
            if(right-left<=1){
                index = right;
                break;
            }

            if(array[(left+right)/2]==array[left]&&array[(left+right)/2]==array[right]){
                if(array[left+1] != array[right-1]){
                    index = array[left+1]<array[right-1]?array[left+1]:array[right-1];
                }
                else{
                    left++;
                    right--;
                }
            }
            else{
                if(array[(left+right)/2] < array[left]){
                    right = (left+right)/2;
                }
                else{
                    left = (left+right)/2;
                }
            }
        }
        return index;
    }
}

// 2017.04头条面试题