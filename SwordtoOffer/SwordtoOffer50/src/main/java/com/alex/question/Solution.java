package com.alex.question;

public class Solution {

    private static class BinaryTreeNode{
        int val;
        BinaryTreeNode left;
        BinaryTreeNode right;
    }

    public BinaryTreeNode findLastCommonAncestor(BinaryTreeNode root, BinaryTreeNode node1,BinaryTreeNode node2){
        if(root == null){
            return null;
        }
        if(root == node1 || root == node2){
            return root;
        }
        BinaryTreeNode leftAncestor = findLastCommonAncestor(root.left, node1, node2);
        BinaryTreeNode rightAncestor = findLastCommonAncestor(root.right, node1, node2);
        if(leftAncestor != null && rightAncestor != null){
            return root;
        }
        return leftAncestor != null?leftAncestor:rightAncestor;
    }
}
