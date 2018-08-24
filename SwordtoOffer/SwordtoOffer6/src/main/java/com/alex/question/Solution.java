package com.alex.question;

import java.util.Arrays;

public class Solution {

    private static class TreeNode {
        int value;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            value=x;
        }
    }

    public TreeNode reConstructBinaryTree(int [] pre, int [] in){
        if(pre.length==0 || in.length==0){
            return null;
        }
        TreeNode root = new TreeNode(pre[0]);

        for(int i=0;i<pre.length;i++){
            TreeNode node = new TreeNode(pre[i]);
            if(pre[0]==in[i]){
                root.left = reConstructBinaryTree(Arrays.copyOfRange(pre,1,i+1),Arrays.copyOfRange(in,0,i));
                root.right = reConstructBinaryTree(Arrays.copyOfRange(pre,i+1,pre.length),Arrays.copyOfRange(in,i+1,in.length));
            }
        }
        return root;
    }
}
