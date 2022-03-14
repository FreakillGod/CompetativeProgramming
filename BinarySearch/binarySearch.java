public class binarySearch {

    public static int binary(int a[],int key){
        int low=0;
        int high=a.length-1;

        while(low<=high){
            int mid=(low+high)/2;
            if(a[mid]==key){
                return mid;
            }
            if(key>a[mid]){
                low=mid+1;
            }
            if(key<a[mid]){
                high=mid-1;
            }
        
        }

        return -1;
    }

    public static int recursiveBinary(int arr[],int low,int high,int key){
        if(low>high) return -1;
        int mid=(low+high)/2;

        if(arr[mid]==key) return mid;

        if(arr[mid]<key) return recursiveBinary(arr, mid+1, high, key);
        return recursiveBinary(arr, low, mid-1, key);
    }

    public static int infiniteSorted(int arr[],int k){
        int start=0;
        int finish=1;
        while(arr[finish]<k){
            start=finish;
            finish=finish*2;
        }
        return recursiveBinary(arr, start, finish, k);
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10,12,13,15,16,23,36,46,76,98,456};
        int k=76;
        int low=0;
        int high=arr.length-1;
       
        // System.out.println(binary(arr,k));
        // System.err.println(recursiveBinary(arr, low, high, k));
        System.out.println(recursiveBinary(arr, low, high, k));
    }
}
