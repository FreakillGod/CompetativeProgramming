package DEQUEUE;

import java.util.ArrayDeque;

import javax.management.Query;

public class SlidingWindowMaximum {
    
    public static void slide(int a[], int k, int n){

        int max;

        for(int i=0;i<=n-k;i++){
            max=a[i];
            for(int j=1;j<k;j++){
                if(a[i+j]>max){
                   max=a[j+i];
                }
            }
            System.out.println(max);
        }
  
    }

    public static void AVLtree() {
        
    }

    public static void usingArrayDeque(int arr[], int k, int n){

        ArrayDeque<Integer> que= new ArrayDeque<>();

        int i=0;

        for(;i<k;i++){
            while(!que.isEmpty() && arr[i]>=arr[que.peekLast()]){
                que.removeLast();
            }

            que.addLast(i);
            
        }

        for(;i<n;i++){
            System.out.println(arr[que.peek()]);

            // removing old elements out of the window

            while(!que.isEmpty() && arr[que.peek()]<=i-k){
                que.removeFirst();
            }

            while(!que.isEmpty() && arr[que.peek()]<=arr[i]){
                que.removeLast();
            }
            
            que.addLast(i);

        }
        //print max element of last window

        System.out.println(que.peek());
    }

    public static void main(String[] args) {
        
    }
}
