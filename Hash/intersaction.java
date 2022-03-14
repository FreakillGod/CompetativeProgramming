import java.util.*;

public class intersaction {
    public static int intersactionOfArray(int arr1[], int arr2[]){
        Set <Integer> set= new HashSet<>();
        int count=0;
        for(int element: arr1){
            set.add(element);
        }

        for(int element:arr2){
            if(set.contains(element)){
                count++;
                set.remove(element);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr1[]={12,23,24,25,5};
        int arr2[]={12,23,54,43,5};

        System.out.println(intersactionOfArray(arr1, arr2));
    }
}
