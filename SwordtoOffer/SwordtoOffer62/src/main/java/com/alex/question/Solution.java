package com.alex.question;

import javax.swing.tree.TreeNode;
import java.io.Serializable;

public class Solution {

    private static class BinaryTreeNode{
        int val;
        BinaryTreeNode left;
        BinaryTreeNode right;
        BinaryTreeNode(int x){
            val=x;
        }
    }

    public String Serialize(BinaryTreeNode root){
        StringBuffer sb = new StringBuffer();
        if(root == null) {
            return "$";
        }
        sb.append(root.val+",");
        if(root.left != null){
            sb.append(Serialize(root.left));
        }
        else{
            sb.append("$,");
        }
        if(root.right !=null){
            sb.append(Serialize(root.right));
        }
        else{
            sb.append("$,");
        }
        return sb.toString();
    }
    //尾部会有一个$再处理下

    // Deserialize BFS用stack实现
    public int index = -1;
    public BinaryTreeNode Deserialize(String str) {
        index++;
        int len = str.length();
        String[] strr = str.split(",");
        BinaryTreeNode node = null;

        if (index >= len)
            return null;

        if (!strr[index].equals("#")){
            node = new BinaryTreeNode(Integer.valueOf(strr[index]));
            node.left = Deserialize(str);
            node.right = Deserialize(str);
        }
        return node;
    }
}
