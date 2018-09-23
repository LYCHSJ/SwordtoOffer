package com.alex.question;

import java.util.ArrayList;

public class Solution {

    private static class BinaryTreeNode{
        int val;
        BinaryTreeNode left;
        BinaryTreeNode right;
    }

    public BinaryTreeNode findKthNode(BinaryTreeNode root, int n){
        if(root ==null){
            return null;
        }
        ArrayList<BinaryTreeNode> list =middleOrder(root);
        return list.get(n);
    }

    private ArrayList<BinaryTreeNode> middleOrder (BinaryTreeNode node){
        ArrayList<BinaryTreeNode> order=new ArrayList<>();
        if(node == null){
            return order;
        }
        if(node.left !=null){
            order.addAll(middleOrder(node.left));
        }
        order.add(node);
        if(node.right != null){
            order.addAll(middleOrder(node.right));
        }
        return order;
    }
}
