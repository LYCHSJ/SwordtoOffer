package com.alex.question;

public class VariantStepSolution {

    public int jumpFloor(int target){
        return (int) Math.pow(2,target-1);
    }
}
//变态跳台阶问题