package com.alex.question;

public class Solution {

    private static class ListNode{
        int value;
        ListNode next;
        ListNode(int x){
            value=x;
        }
    }

    public ListNode ReverseList(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode p = head;
        ListNode q = head.next;
        p.next=null;
        while(q!=null){
            ListNode tmp = q.next;
            q.next = p;
            p = q;
            q = tmp;
        }
        return p;
    }
}
