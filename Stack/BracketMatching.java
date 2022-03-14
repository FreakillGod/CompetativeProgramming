package Stack;

import java.util.Stack;

public class BracketMatching {

    public static boolean isOpen(char c){
        return c=='(' || c=='{' || c=='[';
    }

    public static boolean isMatching(char a,char b){
        return (a=='(' || b==')') || (a=='['|| b==']') || (a=='{'|| b=='}');
    }

    public static boolean mathcBracket(String st){

        Stack <Character> St= new Stack<>();

        for(int i=0; i<st.length(); i++){

            char curr=st.charAt(i);
            
            if(isOpen(curr)){
                St.push(curr);
            }else{
                if(St.isEmpty()){
                    return false;
                }else if(!isMatching(St.peek(),curr)){
                    return false;
                }else{
                    St.pop();
                }
            }

        }
        return St.isEmpty();
    }

    public static void main(String[] args) {
        
        String st= "{{}{]}[]}";

        System.out.println(mathcBracket(st)); 
    }
    
}
