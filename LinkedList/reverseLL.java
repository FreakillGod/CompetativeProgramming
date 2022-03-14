package LinkedList;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        next=null;
    }
}


public class reverseLL {
    
    public static Node reverseLinkedList(Node head){
        Node curr=head;
        Node prev=null;

        while(curr != null){
            Node temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }

    public static Node recurseReverseLL(Node head){
        if(head== null || head.next ==null){
            return head;
        }
        
        Node newNode=recurseReverseLL(head.next);

        Node nextNode=head.next;
        nextNode.next=head;
        head.next=null;

        return newNode;
    }

    public static Node rabbiTortoise(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node faste=head;
        Node slow=head;

        while(faste.next != null && faste != null){
            faste=faste.next.next;
            slow=slow.next;
        }
        return slow;

    }

    public static Boolean palindromicLL(Node head){
        if(head==null || head.next==null){
            return true;
        }
        Node mid=rabbiTortoise(head);
        Node laste=recurseReverseLL(mid.next);

        Node curr=head;
        while(laste.next != null){
            if(curr.next != laste.next){
                return false;
            }
            curr=curr.next;
            laste=laste.next;
        }
        return true;
    }



    public static void main(String[] args) {
        Node n1=new Node(40);
        Node n2=new Node(20);
        Node n3=new Node(20);
        Node n4=new Node(40);

        Node head=n1;
        head.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=null;

        
        // System.out.println(palindromicLL(head));

    }
    
}
