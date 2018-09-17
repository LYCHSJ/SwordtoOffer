package com.alex.question;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution {

    public boolean VerifySquenceOfBST(int sequence[]){
        if(sequence == null){
            return false;
        }
        int length = sequence.length;
        int root = sequence[length-1];
        int i=0;
        for(; i<length-1;i++){
            if(sequence[i]>root){
                break;
            }
        }
        int j = i;
        for(;j<length-1;j++){
            if(sequence[j]<root){
                return false;
            }
        }

        boolean left=true;
        if(i>0){
            left=VerifySquenceOfBST(Arrays.copyOfRange(sequence,0,i));
        }

        boolean right = true;
        if(j<length-1){
            right=VerifySquenceOfBST(Arrays.copyOfRange(sequence,i,length-1));
        }

        return (left&right);

    }
}
