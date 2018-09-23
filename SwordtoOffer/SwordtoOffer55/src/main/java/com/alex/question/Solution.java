package com.alex.question;

public class Solution {

    public char findFirstAppearing(String str){
        char[] words = str.toCharArray();
        int[] appear = new int[256];
        for(char c : words){
            appear[c]++;
        }
        for(char c : words){
            if (appear[c]==1){
                return c;
            }
        }
        return '$';
    }
}
