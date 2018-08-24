package com.alex.question;

public class Solution {

    public boolean find(int[][] array, int target){
        // 判空校验
        if(array == null){
            return false;
        }

        int row = 0;
        int column = array[0].length-1;

        while(row<array.length && column>=0){
            if(array[row][column]==target){
                return true;
            }
            else if(array[row][column]>target){
                row++;
            }
            else{
                column--;
            }
        }
        return false;
    }
}
