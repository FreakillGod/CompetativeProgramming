package Heap;

import java.util.PriorityQueue;

public class NRope {
    public static int rope(int []arr){
        int ans=0;

        PriorityQueue<Integer> pq= new PriorityQueue<>();

        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
        }

        while(pq.size()>1){
            int a=pq.poll();
            int b=pq.poll();
            int c=a+b;
            pq.add(c);
            ans+=c;
        }

         return ans;
    }
    public static void main(String[] args) {
        int arr[]={2,5,4,8,6,9};

        System.out.println(rope(arr));
    }
}
