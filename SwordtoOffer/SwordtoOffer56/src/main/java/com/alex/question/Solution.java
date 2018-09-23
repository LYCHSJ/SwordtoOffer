package com.alex.question;

public class Solution {

    private static class ListNode{
        int val;
        ListNode next;
    }

    public ListNode FindCircleEntrance(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        while(fast.next !=null && fast.next.next!= null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                break;
            }
        }
        fast=head;
        while(fast!=slow){
            fast=fast.next;
            slow=slow.next;
        }
        return slow;
    }
}
