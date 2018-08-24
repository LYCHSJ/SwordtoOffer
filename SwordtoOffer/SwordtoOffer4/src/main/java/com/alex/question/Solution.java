package com.alex.question;

public class Solution {

    public String replcaeSpace(String str){
        StringBuffer sb = new StringBuffer();
        int i=0;
        while(i<str.length()){
            if(String.valueOf(str.charAt(i)).equals(" ")){
                sb.append("%20");
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
}
