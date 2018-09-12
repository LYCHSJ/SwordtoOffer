package com.alex.question;

public class Solution {

    private static class ListNode{
        int value;
        ListNode next;
        ListNode(int x){
            value=x;
        }
    }

    public ListNode findKthToTail(ListNode head, int k){
        // 忽略了倒数第k个元素超过头部
        if(head==null || k<=0){
            throw new RuntimeException();
        }
        ListNode p = head;
        for(int i=0;i<k;i++){
            p=p.next;
        }
        ListNode q = head;
        while(p!=null){
            q=q.next;
            p=p.next;
        }
        return q;
    }
}
