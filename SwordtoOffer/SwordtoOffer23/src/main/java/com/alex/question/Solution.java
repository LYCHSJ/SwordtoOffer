package com.alex.question;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Solution {

    private static class BinaryTreeNode{
        int value;
        BinaryTreeNode left;
        BinaryTreeNode right;
        BinaryTreeNode(int x){
            this.value=x;
        }
    }

    public ArrayList<Integer> printFromToptoBottom(BinaryTreeNode root){
        ArrayList<Integer> list = new ArrayList<>();
        if(root == null){
            return list;
        }
        LinkedList<BinaryTreeNode> queue = new LinkedList<>();
        BinaryTreeNode node = root;
        queue.push(node);
        while(!queue.isEmpty()){
            node = queue.pop();
            list.add(node.value);
            if(node.left != null){
                queue.addLast(node.left);
            }
            if(node.right != null){
                queue.addLast(node.right);
            }
        }
        return list;
    }
}
// BFS