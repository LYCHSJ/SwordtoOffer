package com.alex.question;

import java.util.Stack;

public class Solution {

    private Stack<Integer> stack1;

    private Stack<Integer> stack2;

    public void push(int node){
        stack1.push(node);
    }

    public int pop() throws Exception{
        if(stack1.isEmpty()&&stack2.isEmpty()){
            throw new Exception("栈为空");
        }

        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
}
//问题：怎么做保证线程安全？