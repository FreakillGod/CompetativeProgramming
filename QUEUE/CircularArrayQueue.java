// queue is an interface in java and it is implemented by ArrayDeque and LinkedList


// dont throw exception return null
// q.offer(10);  pushing element    q.push();
// q.poll();   remove from the front
// q.peek();
// q.size();
// q.isEmpty();

//throws exception return exception
// element()   === peek()
// add() === offer()
// remove() === poll


package QUEUE;

public class CircularArrayQueue {
    static int a[];
    static int n;
    static int front;
    static int rear;
        CircularArrayQueue(int n){
            this.n=n;
            a=new int[n];
            this.front=-1;
            this.rear=-1;
        }

    public static void enqueue(int data)throws Exception{
        if((rear+1)%n==front){    
            throw new Exception("array is full");
        }
        if(front ==-1){
            front=0;
        }
        rear=(rear+1)%n;
        a[rear]=data;
    }
    
    public static int dequeue()throws Exception{
        if(front==-1){
            throw new Exception("array is empty");
        }
        int res=a[front];

        if(front==rear){
            front=-1;
            rear=-1;
        }else{
            front=(front+1)%n;
        }
        return res;
    }

    public static void main(String[] args) throws Exception {
        CircularArrayQueue q= new CircularArrayQueue(3);
        q.enqueue(3);
        q.enqueue(4);
        // q.enqueue(6);
        q.enqueue(2);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
    }
}
