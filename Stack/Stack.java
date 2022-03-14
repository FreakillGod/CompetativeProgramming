package Stack;

// .push //.pop //.peek

class Stack{
    static int capacity;
    int a[];
    int top;
    public Stack(int capacity){
        Stack.capacity=capacity;
        top=-1;
        a=new int[capacity];
    }

    public void push(int data) throws Exception{
        if(top==capacity-1){
            throw new Exception("overflow");
        }
        top++;
        a[top]=data;
    }

    public int pop() throws Exception{
        if(top==-1){
            throw new Exception("underflow");
        }
        int res=a[top];
        top--;
        return res;
    }

    public int peek(){
        if(top==-1){
            System.out.println("empty stack");
        }
        int res=a[top];
        return res;
    }

    public boolean isEmpty(){
        return top==-1;
    }
}


class MyStack{
    

    
    public static void main(String[] args) throws Exception {
        Stack arr=new Stack(3);
        arr.push(1);
        arr.push(3);
        arr.push(4);
        System.out.println(arr.peek()); 
        System.out.println(arr.pop()); 
        System.out.println(arr.peek()); 

    }

}