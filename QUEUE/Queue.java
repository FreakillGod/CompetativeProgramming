package QUEUE;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}

class Queue{
    
    static Node front,rear;

    public static void enque(int data)throws Exception{
        Node newNode= new Node(data);

        if(front==null){
            front = rear = newNode;
            return;
        }
        rear.next=newNode;
        rear=newNode;
    }
    public static int dequeue() throws Exception{
        if(front==null){
            throw new Exception("front is null");
        }
        int result = front.data;
        front=front.next;
        return result;
    }


    public static void main(String[] args) throws Exception {
        int n1=10;
        int n2=4;
        int n3=6;

        enque(n1);
        enque(n2);
        enque(n3);
        System.out.println(dequeue());
        System.out.println(dequeue());
        System.out.println(dequeue());
        System.out.println(dequeue());

    }
    public Node poll() {
        return null;
    }

}