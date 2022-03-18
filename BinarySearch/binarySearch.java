class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
        this.right=null;
        this.left=null;
    }
}



public class binarySearch {

    public static int binary(int a[],int key){
        int low=0;
        int high=a.length-1;

        while(low<=high){
            int mid=(low+high)/2;
            if(a[mid]==key){
                return mid;
            }
            if(key>a[mid]){
                low=mid+1;
            }
            if(key<a[mid]){
                high=mid-1;
            }
        
        }

        return -1;
    }

    public static int recursiveBinary(int arr[],int low,int high,int key){
        if(low>high) return -1;
        int mid=(low+high)/2;

        if(arr[mid]==key) return mid;

        if(arr[mid]<key) return recursiveBinary(arr, mid+1, high, key);
        return recursiveBinary(arr, low, mid-1, key);
    }

    public static int infiniteSorted(int arr[],int k){
        int start=0;
        int finish=1;
        while(arr[finish]<k){
            start=finish;
            finish=finish*2;
        }
        return recursiveBinary(arr, start, finish, k);
    }

    public static boolean treeSearch(Node root,int key){
        if(root==null) return false;

        if(root.data==key) return true;

        if(root.data>key){
            return treeSearch(root.left, key);
        }else{
            return treeSearch(root.right, key);
        }
    }

    public static Node insertNode(Node root,int n1){
        Node newNode= new Node(n1);
        if(root==null) return newNode;
        
        if(root.data>n1){
            root.left=insertNode(root.left, n1);
        }else if(root.data<n1){
            root.right=insertNode(root.right, n1);
        }

        return root;
    }

    public static Node insertNodeBetter(Node root, int n1) {
        Node newNode= new Node(n1);
        Node curr=root;
        Node parent=null;

        while(curr != null){
            parent=curr;
            if(curr.data>n1){
                curr=curr.left;
            }else{
                curr=curr.right;
            }
        }

        if(parent==null) return newNode;

        if(n1<parent.data){
            parent.left=newNode;
        }else{
            parent.right=newNode;
        }

        return newNode;
    }

    public static int findMinimum(Node root){
        int data=root.data;
        while(root.left !=null){
            data=root.left.data;
            root=root.left;
        }
        return data;
    }
    public static Node deleteNode(Node root, int k){
        if(root==null) return root;

        if(k< root.data){
            root.left=deleteNode(root.left, k);
        }else if(k> root.data){
            root.right=deleteNode(root.right, k);   
        }
        else{

            if(root.left==null){
                return root.right;
            }else if(root.right==null){
                return root.left;  
            }    
            root.data=findMinimum(root.right);
            root.right=deleteNode(root.right, root.data);
        
        }
        return root;
    }

    
    public static boolean isBst(Node root,int min,int max){
        if(root==null) return true;

        if(root.data<= min || root.data >=max) return false;

        return(isBst(root.left, min, root.data-1) && isBst(root.right, root.data+1, max));
    }
    public static boolean CheckTree(Node root){
        return isBst(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }


    static Node prev=null;
    public static boolean isBstBetter(Node root){
        if (root!=null){
            if(!isBstBetter(root.left)){
                return false;
            }
            if(prev!=null && prev.data>= root.data){
                return false;
            }
            prev=root;

            return isBstBetter(root.right);
        }
        return true;
        
    }   

    //FLoor value and Ceil value in BST
    public static int findCeil(Node root,int k){
        int floor=Integer.MAX_VALUE; 
        
        while(root != null){
            if(root.data==k) return root.data;
            if(root.data>k){
                floor=root.data;
                root=root.left;
            }else{
                root=root.right;
            }
        }
        return floor;
    }


    public static int findFLoor(Node root, int k){
        int ans=Integer.MIN_VALUE;
        
        while(root!= null){
            if(root.data==k) return root.data;
            if(root.data>k){
                root=root.left;
            }else{
                ans=root.data;
                root=root.right;
            }
        }
        return ans;
    }
    
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10,12,13,15,16,23,36,46,76,98,456};
        int k=76;
        int low=0;
        int high=arr.length-1;
       
        // System.out.println(binary(arr,k));
        // System.err.println(recursiveBinary(arr, low, high, k));
        // System.out.println(recursiveBinary(arr, low, high, k));
    }
}
