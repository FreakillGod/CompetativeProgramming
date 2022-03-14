package LinkedList;

public class DuplicateLL {
    
    static class Node{
        int data;
        Node next;
        Node random;
        Node(int data){
            this.data=data;
            next=null;
            random=null;
        }
    }

    public static Node duplicate(Node head){
        Node curr=head;

        while(curr != null){
            Node temp=curr.next;
            curr.next=new Node(curr.data);
            curr.next.next=temp;
            curr=temp;
        }
        while(curr != null){
            if(curr.next !=null){
                curr.next.random=(curr.random != null)?curr.random.next:null;
            }
            curr=curr.next.next;

        }
        Node orig=head;
        Node copy=head.next;
        Node temp=copy;
        
        while(orig != null){
            orig.next=orig.next.next;
            copy.next=copy.next.next;
            
            orig=orig.next;
            copy=copy.next;
        }
        return temp;
    }

    public static void main(String[] args) {
        
    }
}
