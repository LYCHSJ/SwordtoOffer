package com.alex.question;

public class Solution {

    private static class BinaryTreeNode{
        int value;
        BinaryTreeNode left;
        BinaryTreeNode right;
    }

    public boolean hasSubTree(BinaryTreeNode root1, BinaryTreeNode root2){

        boolean result = false;
        if(root1 == null){
            return false;
        }
        if(root1.left !=null || root1.right != null){
            if(root1.value == root2.value){
                result = isSubTree(root1,root2);
            }
            if(!result){
                result = hasSubTree(root1.left,root2)||hasSubTree(root1.right,root2);
            }
        }
        return result;
    }

    private boolean isSubTree(BinaryTreeNode root1, BinaryTreeNode root2){
        if (root2 == null){
            return true;
        }
        if (root1 == null){
            return false;
        }
        if(root1.value != root2.value){
            return false;
        }
        return isSubTree(root1.left,root2.left)&&isSubTree(root1.right,root2.right);
    }
}
