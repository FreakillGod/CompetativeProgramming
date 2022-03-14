package Heap;

import java.util.PriorityQueue;

public class priorityQueue {

    public static int findKthElement(int []arr,int k){

        PriorityQueue<Integer> queue=new PriorityQueue<>();

        for(int i=0;i<k;i++){
            queue.add(arr[i]);
        }
        for(int i=k;i<arr.length;i++){
            if(queue.peek()<arr[i]){
                queue.poll();
                queue.add(arr[i]);
            }
        }
        return queue.peek();

    }

    public static void main(String[] args) {

        PriorityQueue<Integer> pq=new PriorityQueue<>();

        pq.add(5);
        pq.add(15);
        pq.add(16);

        System.out.println(pq.size());


        while(!pq.isEmpty()){
            System.out.println(pq.peek());
            pq.poll();
        }
    }
    

}
