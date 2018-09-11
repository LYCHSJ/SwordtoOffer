package com.alex.question;

public class Solution {

    public double power(double base, int exponent) {
        double res = 0;
        if (equal(base,0)) {
            return 0;
        }
        if (exponent == 0) {
            return 1.0;
        }
        if (exponent > 0) {
            res = mutiply(base,exponent);
        }else {
            res = mutiply(1/base,-exponent);
        }
        return res;
    }

    private double mutiply(double base, int e) {
        double sum = 1;
        for (int i = 0; i < e; i++) {
            sum = sum * base;
        }
        return sum;
    }

    // 不能用==比较两浮点型的数值
    private boolean equal(double a, double b) {
        if (a - b < 0.000001 && a - b > -0.000001) {
            return true;
        }
        return false;
    }
}
