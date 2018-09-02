package com.alex.question;

public class Solution {

    public int numberOfOne(int n){
        int count =0;
        while(n!=0){
            count++;
            n&=n-1;
        }
        return count;
    }
}
