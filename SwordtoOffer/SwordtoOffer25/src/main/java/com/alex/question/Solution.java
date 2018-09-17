package com.alex.question;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;

public class Solution {

    private static class BinaryTreeNode{
        int val;
        BinaryTreeNode left;
        BinaryTreeNode right;
        BinaryTreeNode(int x){
            this.val=x;
        }
    }

    // 存放所有路径
    ArrayList<ArrayList<Integer>> lists = new ArrayList<ArrayList<Integer>>();
    // 用于遍历
    ArrayList<Integer> list = new ArrayList<Integer>();
    // 用于保存路径节点值之和
    int num = 0;

    public ArrayList<ArrayList<Integer>> FindPath(BinaryTreeNode root, int target)
    {

        if (root == null)
        {
            return lists;
        }

        num += root.val;
        list.add(root.val);
        // 如果此时路径长度值刚好等于目标值，并且此时所在结点为叶子结点(路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径),路径存入lists
        if (num == target && root.left == null && root.right == null)
        {
            // 存放路径结点值
            ArrayList<Integer> path = new ArrayList<Integer>();
            for (int i = 0; i < list.size(); i++)
            {
                path.add(list.get(i));
            }
            lists.add(path);
        }
        // 先遍历左子树
        if (num < target && root.left != null)
        {
            FindPath(root.left, target);
        }
        // 左子树遍历结束，遍历右子树
        if (num < target && root.right != null)
        {
            FindPath(root.right, target);
        }
        // 去掉这个结点值
        num -= root.val;
        // 删除该结点，返回到父结点
        list.remove(list.size() - 1);
        return lists;
    }


}
