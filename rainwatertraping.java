public class rainwatertraping {

    public static int waterCollection(int arr[],int n){
        int right[]= new int[n];
        int left[]= new int[n];
        int waterCollected=0;

        right[0]=arr[0];
        for(int i=1;i<n;i++){
            right[i]=Math.max(arr[i],right[i-1]);
        }
        left[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            left[i]=Math.max(left[i+1],arr[i]);
        }
        
        for(int i=0;i<n;i++){
            waterCollected+=Math.min(right[i],left[i])-arr[i];
        }
        return waterCollected;
    }

    public static void main(String[] args) {
        int arr[]={3,1,2,4,0,1,3,2};
        int n=arr.length;
        int bucket=waterCollection(arr, n);
        System.out.println(bucket);
    }
}
