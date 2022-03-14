package QUEUE;
import java.util.*;

public class usingStack {
    static Stack<Integer> s1= new Stack<>();
    static Stack<Integer> s2= new Stack<>();

    public static void push(int data){
        s1.push(data);
    }
    public static int pop(){
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        int data= s2.pop();
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
        return data;
    }


    public static void main(String[] args) {
        int n1=2;
        int n2=3;
        int n3=5;

        push(n1);
        push(n2);
        push(n3);

        System.out.println( pop());
        System.out.println( pop());
    }

}
