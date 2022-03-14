class stocksbuysell
{   
    public static int maxProfit(int a[],int n){
        int profit=0;
        for(int i=1;i<n;i++){
            
            if(a[i]>a[i-1]){    
                profit+=(a[i]-a[i-1]);
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        int arr[]={5,2,6,1,4,7,3,6};
        int n=arr.length;
        int profit= maxProfit(arr,n);
        System.out.println(profit);
    }
}