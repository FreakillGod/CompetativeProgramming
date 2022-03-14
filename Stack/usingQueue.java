package Stack;
import java.util.*;

public class usingQueue {
    static Queue<Integer> q1= new ArrayDeque<Integer>();
    static Queue<Integer> q2= new ArrayDeque<Integer>();

    public static void push(int data){
        while(!q1.isEmpty()){
            q2.offer(q1.poll());
        }
        q1.offer(data);

        while(!q2.isEmpty()){
            q1.offer(q2.poll());
        }
    }
    public static int pop(){
        int res=q1.poll();
        return res;
    }

    public static void main(String[] args) {
        int n1=3;
        int n2=2;
        int n3=4;
        push(n1);
        push(n2);
        push(n3);

        System.out.println(pop());
    }

}
