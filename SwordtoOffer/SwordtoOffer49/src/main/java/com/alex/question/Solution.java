package com.alex.question;

public class Solution {

    public int StrToInt(String str) {
        if(str == null || str == ""){
            throw new RuntimeException("str error");
        }
        char[] words = str.toCharArray();
        boolean mark = false;
        int start = 0;
        int result=0;
        if(words[0]=='-'){
            mark = true;
            start = 1;
        }
        for(int i=start; i<words.length;i++){
            if(words[i]<48 || words[i]>57){
                throw new RuntimeException("str error");
            }
            result = result*10+words[i]-48;
        }
        return mark?-result:result;
    }
}
