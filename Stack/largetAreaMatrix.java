package Stack;
import java.util.Stack;

public class largetAreaMatrix {
    
    public static int largestRectangleArea(int[] heights) {
        int arraySize =  heights.length;
        int[] left = new int[arraySize];
        int[] right = new int[arraySize];
        Stack<Integer> stack = new Stack<>();

        for (int i =0; i < arraySize; i++) {
            if (stack.isEmpty()) {
                left[i] = 0;
            } else {
                while (!stack.empty() && heights[stack.peek()] >= heights[i]) {
                    stack.pop();
                }
                left[i] = stack.empty() ? 0 : stack.peek() + 1;
            }
            stack.push(i);
        }

        stack.clear();

        for (int i = arraySize-1; i >= 0; i--) {
            if (stack.empty()) {
                right[i] = arraySize - 1;
            } else {
                while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]){
                    stack.pop();
                }
                right[i] = stack.isEmpty() ? arraySize - 1 : stack.peek() - 1;
            }
            stack.push(i);
        }

        int maxArea = 0;
        for (int i = 0; i < arraySize; i++) {
            int area = heights[i] * (right[i] - left[i] + 1);
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }

    public static int MaxSizeRectangleBinary(int arr[][]){
        int curr[]= arr[0];
        int max=largestRectangleArea(curr);

        for(int i=1;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i][j]==1){
                    curr[j]+=1;                
                }else{
                    curr[j]=0;
                }
            }
            int currentAns=largestRectangleArea(curr);
            max=Math.max(max,currentAns);
        }

        return max;
    }



    public static void main(String[] args) {
        int arr[][]={{1,2,3,4,},{1,2,5,3},{2,5,4,2}};
        System.out.println(MaxSizeRectangleBinary(arr)); 
    }

}
