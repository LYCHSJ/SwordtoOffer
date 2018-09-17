package com.alex.question;

public class Solution {

    private static class RandomListNode{
        int label;
        RandomListNode next;
        RandomListNode random;
        RandomListNode(int x){
            this.label=x;
        }
    }

    public RandomListNode Clone2(RandomListNode pHead) {
        if(pHead == null) {
            return null;
        }
        RandomListNode head = new RandomListNode(pHead.label) ;
        RandomListNode temp = head ;

        while(pHead.next != null) {
            temp.next = new RandomListNode(pHead.next.label) ;
            if(pHead.random != null) {
                temp.random = new RandomListNode(pHead.random.label) ;
            }
            pHead = pHead.next ;
            temp = temp.next ;
        }
        return head ;
    }
}
