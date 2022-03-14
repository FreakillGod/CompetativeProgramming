package Heap;

public class heapInsert {

    public static void swap(int arr[],int parent,int value){
        int temp=arr[parent];
        arr[parent]=value;
        value=temp;
    }
    
    public static void insert(int arr[],int n,int value){
        n=n+1;
        arr[n]=value;
        int i=n;
        while(i>1){
            int parent=(int) Math.floor(i/2);
            if(arr[parent]<value){
                swap(arr,parent,i);
                i=parent;
            }else{
                return;
            }
        }
    }

    public static void delete(int []arr,int n){
        arr[1]=arr[n];
        n=n-1;
        int i=1;
        while(i<n){
            int left=arr[i*2];
            int right=arr[(i*2+1)];
            int max=left>right?2*i:(2*i)+1;

            if(arr[i]<arr[max]){
                swap(arr, max, i);
                i=max;
            }else{
                return;
            }
        }
    }

    public static void main(String[] args) {
        // int arr[]={50,30,40,10,5,20,30,60};
        // int value=45;
        // int n=arr.length;
    }

}
