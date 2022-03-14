import java.util.*;
public class BinaryTreeYT {

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class BinaryTree {
        static int idx =-1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }

            Node newNode=new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);

            return newNode;
        }
    }    

    public static void preOrder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void inOrder(Node root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.println(root.data+" ");
        inOrder(root.right);
    } 

    public static void postOrder(Node root){
        if(root==null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data);
    }
    
    public static void levelOrder(Node root){
        if(root==null){
            return;
        }
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node currNode=q.remove();
            if(currNode==null){
                System.out.println(' ');
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{System.out.print(currNode.data+" ");
            if(currNode.left!=null){
                q.add(currNode.left);
            }
            if(currNode.right!=null){
                q.add(currNode.right);
            }
        }
        }
    }

    public static int countNodes(Node root){
        if(root==null){
            return 0;
        }else{
            int leftNode=countNodes(root.left);
            int rightNodes=countNodes(root.right);
            return leftNode+rightNodes+1;
        }

    }

    public static int sumOfNodesData(Node root){
        if(root==null){
            return 0;
        }else{
            int leftSum=sumOfNodesData(root.left);
            int rightSum=sumOfNodesData(root.right);
            return leftSum+rightSum+root.data;
        }

    }
    public static int HeightOfTree(Node root){
        if(root==null){
            return 0;
        }else{
            int rightHeight=HeightOfTree(root.right);
            int leftHeight=HeightOfTree(root.left);

            int maxHeight=(Math.max(rightHeight,leftHeight))+1;
            return maxHeight;
        }
    }
    public static int maxValueNode(Node root){
        if(root==null){
            return Integer.MIN_VALUE;
        }
        return Math.max(root.data,Math.max(maxValueNode(root.left),maxValueNode(root.right)));
    }

    public static int diameter(Node root){
        if(root==null){
            return 0;
        }
        int diameter1=diameter(root.right);
        int diameter2=diameter(root.left);
        int diameter3=HeightOfTree(root.left)+HeightOfTree(root.right)+1;
        int maxDiameter=Math.max(diameter3,Math.max(diameter1,diameter2));
        return maxDiameter;
    }

    static class Treeinfo{
        int ht;
        int dia;
        Treeinfo(int ht,int dia){
            this.ht=ht;
            this.dia=dia;
        }
    }
    public static Treeinfo betterDia(Node root){
        if(root==null){
           return new Treeinfo(0,0);
        }
        Treeinfo left=betterDia(root.left);
        Treeinfo right=betterDia(root.right);

        int myHight=Math.max(left.ht,right.ht)+1;
    
        int dia1=left.dia;
        int dia2=right.dia;
        int dia3=left.ht+right.ht+1;

        int mydia=Math.max(Math.max(dia1,dia2),dia3);
        Treeinfo myinfo= new Treeinfo(myHight, mydia);
        return myinfo;
    }

    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);
        // System.out.println(root.right.data);
        // preOrder(root);
        // inOrder(root);
        // postOrder(root);
        // levelOrder(root);
        // System.out.println(countNodes(root));
        // System.out.println(sumOfNodesData(root));
        // System.out.println(HeightOfTree(root));
        // System.out.println(diameter(root));
        System.err.println(betterDia(root).dia);
    }
}