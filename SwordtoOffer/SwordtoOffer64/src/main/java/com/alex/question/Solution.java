package com.alex.question;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {

    public int count =0;

    public PriorityQueue<Integer> minHeap = new PriorityQueue<>();

    public PriorityQueue<Integer> maxHeap = new PriorityQueue<>(16,new Comparator<Integer>(){
       @Override
       public int compare(Integer o1, Integer o2){
           return o2.compareTo(o1);
       }
    });

    public void Insert(Integer num) {
        count++;
        if(count % 2 == 1){
            maxHeap.add(num);
            minHeap.add(maxHeap.poll());
        }
        else{
            minHeap.add(num);
            maxHeap.add(minHeap.poll());
        }
    }

    public Double GetMedian() {

        return (count%2==1)?Double.valueOf(maxHeap.peek()):(Double.valueOf(minHeap.peek())+Double.valueOf(maxHeap.peek()))/2;
    }

}
