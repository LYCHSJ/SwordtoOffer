package com.alex.question;

import java.util.ArrayList;

public class Solution {

    public ArrayList<Integer> printMatrix(int[][] matrix){
        ArrayList<Integer> list = new ArrayList<>();
        if(matrix == null){
            return null;
        }
        int start = 0;
        while(matrix[0].length > start * 2 && matrix.length >start * 2){
            printOneCircle(matrix,start,list);
            start ++;
        }
        return list;
    }

    private void printOneCircle(int[][] matrix, int start, ArrayList<Integer> list){
        int endX = matrix[0].length - start - 1;//列
        int endY = matrix.length - start - 1;//行
        // 从左往右
        for(int i = start; i<=endY;i++){
            list.add(matrix[start][i]);
        }
        // 从上往下
        if(start <endY){
            for(int i = start + 1;i<=endY;i++){
                list.add(matrix[i][start]);
            }
        }
        if (start < endX && start < endY) {
            for (int i = endX - 1; i >= start; i--) {
                list.add(matrix[endY][i]);
            }
        }
        // 从下往上（判断是否会重复打印）
        if (start < endX && start < endY - 1) {
            for (int i = endY - 1; i >= start + 1; i--) {
                list.add(matrix[i][start]);
            }
        }
    }
}
