package com.alex.question;

import java.util.ArrayList;
import java.util.Stack;

public class Solution {

    public ArrayList<Integer> printListFromTailtoHead(ListNode listNode){
        ArrayList<Integer> newlist = new ArrayList<>();

        // 判空处理
        if(listNode == null){
            return null;
        }

        Stack<Integer> stack = new Stack<>();
        while(listNode != null){
            stack.push(listNode.value);
            listNode = listNode.next;
        }

        while(!stack.empty()){
            newlist.add(stack.pop());
        }
        return newlist;
    }
}
