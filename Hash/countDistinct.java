import java.util.HashSet;
import java.util.Set;

public class countDistinct {
    public static int countItems(int arr[]){
        Set<Integer> set= new HashSet<>();

        for(int element: arr){
            set.add(element);
        }
        return set.size();
    }
    public static void main(String[] args) {
        
        int []arr={43,23,65,87,34,65,43,87,54};
        
        System.out.println(countItems(arr));

    }
}
