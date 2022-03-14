import java.util.HashMap;

public class findSubArray {
    
    public static int findSum(int arr[], int sum){

        int current_sum=0;
        int start=0;
        int end=-1;

        HashMap <Integer ,Integer> map=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            current_sum+=arr[i];

            if(current_sum==sum){
                start=0;
                end=i;
                break;
            }
            if(map.containsKey(current_sum-sum)){
                start=map.get(current_sum-sum)+1;
                end=i;
                break;                
            }
            map.put(current_sum, i);
            
        }
        if(end==-1){
            System.out.println("not found");
        }else{
            System.out.print(start+" "+end);
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[]={10,15,-5,15,-10,5};
        int key=5;

        findSum(arr, key);
    }
}
