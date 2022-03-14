package Stack;


class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        next=null;
    }
}

class LinkedStack{
    Node head;
    int size;
    public LinkedStack(){
        head=null;
        size=0;
    }

    public void push(int data){
        Node temp=new Node(data);
        temp.next=head;
        size++;
        head=temp;
    }

    public int peek(){
        return head.data;
    }

    public int pop() throws Exception{
        if(head==null){
            throw new Exception("null");
        }
        int res=head.data;
        head=head.next;
        size--;
        return res;
    }

    public boolean isEmpty(){
        return head==null;
    }
    public int size(){
        return size;
    }

}

public class UsingLL {
    public static void main(String[] args) throws Exception {
        
        LinkedStack st= new LinkedStack();
        st.push(1);
        st.push(3);
        st.push(5);
        System.out.println(st.size());
    }
}
