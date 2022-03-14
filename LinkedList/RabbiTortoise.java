package LinkedList;

public class RabbiTortoise {
    
    public static Node rabbiTortoise(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node faste=head;
        Node slow=head;

        while(faste.next != null){
            faste=faste.next.next;
            slow=slow.next;
        }
        return slow;

    }
}
