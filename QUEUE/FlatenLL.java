//flatten a multilevel linked list
package QUEUE;
import java.util.ArrayDeque;
import java.util.Queue;

class Node{
    int data;
    Node next;
    Node child;

    Node(int data){
        this.data=data;
        this.next=null;
        this.child=null;
    }
}

public class FlatenLL {

    static Queue<Node> q= new ArrayDeque<>();

    public static Node flatList(Node head){

        Node curr=head;

        while(curr != null){

            System.out.println(curr.data);
            
            if(curr.next==null){
                curr.next= q.poll();
            }

            if(curr.child != null){
                q.add(curr.child);
            }

            curr=curr.next;
        }
        return head;
    }
    
}
