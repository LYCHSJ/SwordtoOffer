package com.alex.question;

import java.math.BigDecimal;

public class Solution {

    void output(int n){
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<n;i++){
            sb.append("9");
        }
        BigDecimal num = new BigDecimal(sb.toString());
        for(BigDecimal x = new BigDecimal("1");x.compareTo(num.add(new BigDecimal("1")))==-1;x=x.add(new BigDecimal("1"))){
            System.out.println(x);
        }
    }
}
// 用BigDecimal的问题在于超了32位长度会溢出