// maximum number of nodes at level i is atmost 2^i
//number of nodes for height n is atmost 2^n -1
//left child =2*i right child 2*i+1





import java.util.Scanner;

public class BinaryTree{

    static class Node{
        Node left,right;
        int data;
        Node(int data){
            this.data=data;
            this.right=right;
            this.left=left;
        }
    }

    static Scanner sc=null;
    public static void main(String[] args) {
        sc=new Scanner(System.in);
        Node root=createTree();
    }
        static Node createTree(){
            Node root=null;
            System.out.println("enter data");
            int data=sc.nextInt();
            if(data==-1) return null;
            root=new Node(data);

            System.out.println("enter left node of"+data);
            root.left=createTree();

            System.out.println("enter right node of"+data);
            root.right=createTree();

            return root;

        }

}