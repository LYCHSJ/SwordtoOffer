package com.alex.question;

public class Solution {

    private static class ListNode{
        int value;
        ListNode next;
        ListNode(int x){
            value=x;
        }
    }

    public ListNode merge(ListNode head1, ListNode head2){
        ListNode p = head1;
        ListNode q = head2;
        ListNode root = head1.value<=head2.value?head1:head2;
        ListNode node = root;
        while((p!=null)&&(q!=null)){
            if(p.value<=q.value){
                node=p;
                
            }
        }
        return root;
    }
}
