package Heap;

public class heap {

    public static void heapify(int arr[], int i, int n){
        int largest=i;
        int left=i*2;
        int right=(i*2)+1;

        if(left<n&& arr[left]>arr[largest]){
            largest=left;
        }
        if(right<n && arr[right]>arr[largest]){
            largest=right;
        }
        if(largest!= i){
            int swap=arr[largest];
            arr[largest]=arr[i];
            arr[i]=swap;

            heapify(arr, largest, n);
        }
    }

    public static void constructHeap(int arr[], int n) {
        for(int i=n/2;i>0;i--){
            heapify(arr, i, n);
        }
    }

    public static void swap(int []arr, int i, int n){
        int swap=arr[n];
            arr[n]=arr[i];
            arr[i]=swap;
    }

    public static void heapSort(int arr[],int n){
        for(int i=n;i>0;i--){
            swap(arr, 1, i);
            heapify(arr, 1, i-1);
        }
    }

    public static void main(String[] args) {
        

    }
    
}
