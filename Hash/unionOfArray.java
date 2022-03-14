import java.util.HashSet;
import java.util.Set;

public class unionOfArray {

    public static int union(int arr1[],int arr2[]){
        Set <Integer> set= new HashSet<>();
        for(int element:arr1){
            set.add(element);
        }
        for(int element: arr2){
            set.add(element);
        }
        return set.size();
    }

    public static void main(String[] args) {
        int []arr={5,10,15,5};
        int arr2[]={10,15,4};
        
        System.out.println(union(arr,arr2));
    }
}
