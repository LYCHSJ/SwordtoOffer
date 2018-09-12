package com.alex.question;

public class Solution {

    private static class ListNode{
        int value;
        ListNode next;
        ListNode(int value){
            this.value = value;
        }
    }

    public ListNode removeNode(ListNode head, ListNode target){
        if(head == target){
            return head = head.next;
        }
        ListNode node = head.next;
        ListNode pre = head;
        while(node!=null){
            if(node == target){
                pre.next = node.next;
            }
            pre = pre.next;
            node = node.next;
        }
        return head;
    }
}
