package QUEUE;

import javax.swing.plaf.ColorUIResource;

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



public class FlattenLLbetter {
    
    public static Node flatten(Node head){

        Node curr = head;
        Node last=head;
        Node temp=head;

        if(curr==null){
            return curr;
        }

        while(last.next != null){
            last=last.next;
        }
        
        while(curr != last){
            if(curr.child!=null){
                last.next=curr.child;
                temp=curr.child;

                while(temp.next != null){
                    temp=temp.next;
                }
                last=temp;
            }
            System.out.println(curr);
            curr=curr.next;
        }

        return head;
    }


    public static void main(String[] args) {
        Node head= new Node(1);
    }

}
