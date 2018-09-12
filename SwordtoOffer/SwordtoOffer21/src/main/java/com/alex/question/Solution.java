package com.alex.question;

import java.util.Stack;

public class Solution {

    private Stack<Integer> saveStack=new Stack<>();

    private Stack<Integer> minStack=new Stack<>();

    public void pushMin(int node){
        if(saveStack.isEmpty()){
            saveStack.push(node);
            minStack.push(node);
            return;
        }
        if(node<minStack.peek()){
            saveStack.push(node);
            minStack.push(minStack.peek());
        }
    }

    public int popMin(int node){
        if(saveStack.isEmpty()){
            throw new RuntimeException();
        }
        saveStack.pop();
        return minStack.pop();
    }
}
