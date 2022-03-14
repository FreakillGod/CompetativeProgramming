import java.util.ArrayDeque;

public class test {

    public static void display(int a){
    int k=3;
    int n=8;

    ArrayDeque<Integer> que= new ArrayDeque<>();
    int i=0;

    for(;i<k;i++){
        System.out.print(i);
        
    }

    System.out.println();


    for(;i<n;i++){
        System.out.print(i);
    }

    }
    
    

    public static void main(String[] args) {
        display(21);
    }
}
