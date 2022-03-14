package Stack;


import java.util.ArrayList;
import java.util.Stack;

//nearest smaller element and previous sammest element

public class NSEandPSE {
    
    public static void PSE(int a[]){

        Stack<Integer> st= new Stack<>();
        
        System.out.println(-1);

            for(int i=0;i<a.length;i++){
                
                while(!st.isEmpty() && st.peek()>a[i]){
                    st.pop();
                }
                if(st.isEmpty()){
                    System.out.println(-1);
                }else{
                    System.out.println(st.peek());
                }
                st.push(a[i]);
            
            }
    }

    public static void NSE(int a[]){
        Stack<Integer> st=new Stack<>();
        
        ArrayList<Integer> arr= new ArrayList<>();

        for(int i=a.length-1;i>=0;i--){
            
            while(!st.isEmpty() && st.peek()>a[i]){
                st.pop();
            }
            if(st.isEmpty()){
                arr.add(-1);
                System.out.println(-1);
            }else{
                arr.add(st.peek());
                System.out.println(st.peek());
            }
            st.push(a[i]);
        }
        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i));
        }
    }

    public static void main(String[] args) {
        int arr[]={4,10,5,8,20,15,3,12};
        int a[]={3,10,5,1,15,10,7,6};
        
        PSE(arr);
        NSE(a);
    }
}
