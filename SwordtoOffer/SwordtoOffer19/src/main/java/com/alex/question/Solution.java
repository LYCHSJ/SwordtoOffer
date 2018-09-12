package com.alex.question;

import java.util.Stack;

public class Solution {

    private static class BinaryTreeNode{
        int value;
        BinaryTreeNode left;
        BinaryTreeNode right;
    }

    public void mirrorOfTree(BinaryTreeNode root){
        if(root == null){
            return;
        }
        BinaryTreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        if(root.left != null){
            mirrorOfTree(root.left);
        }
        if(root.right != null){
            mirrorOfTree(root.right);
        }
    }

    // 非递归方式
    public void mirrorOfTree2(BinaryTreeNode root){
        Stack<BinaryTreeNode> stack = new Stack<>();
        stack.push(root);
        if(root == null){
            return;
        }
        while(!stack.isEmpty()){
            BinaryTreeNode node = stack.pop();
            BinaryTreeNode tmp = node.left;
            node.right = node.left;
            node.left = tmp;
            if(node.left != null){
                stack.push(node.left);
            }
            if(node.right != null){
                stack.push(node.right);
            }

        }
    }
}
