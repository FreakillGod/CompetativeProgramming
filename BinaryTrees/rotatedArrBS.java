public class rotatedArrBS {
    
    public static int binarySearch(int arr[],int k){
        int low=0;
        int high=arr.length-1;

        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==k){
                return mid;
            } 
            
            if(arr[mid]>arr[low]){
                if(k >= arr[low] && k < arr[mid]){
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }
            else{
                if(k>arr[mid] && k<=arr[high]){
                    low=mid+1;
                }else{
                    high=mid-1;
                }
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int a[]={20,30,40,50,60,5,10};
        int key=10;
        System.out.println(binarySearch(a, key)); 
    }

}
