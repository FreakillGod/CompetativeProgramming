package QUEUE;

class Queue{
    int a[];
    int capacity;
    int rear;

    public Queue(int n){
        this.a=new int[n];
        this.capacity=n-1;
        this.rear=-1;
    }
}

public class UsingCircularArray {

    static Queue q= new Queue(4);

    public static void enqueue(int data)throws Exception{

        if(q.rear==q.capacity-1){
            throw new Exception("queue is full");
        }
        q.rear++;
        q.a[q.rear]=data;

    }

    public static int dequeue()throws Exception{
        if(q.rear==-1){
            throw new Exception("empty queue");
        }
        int result=q.a[0];

        for(int i=0;i<q.rear;i++){
            q.a[i]=q.a[i+1];
        }
        q.rear=-1;
        
        return result;
    }

    public static int getFront()throws Exception{
        if(q.rear==-1){
            throw new Exception("emoty queue");
        }
        return q.a[0];
    }


    public static void main(String[] args) {
        
    }
    
}
