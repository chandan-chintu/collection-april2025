package listexamples;


import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stk1 = new Stack<>();
        stk1.push("Mango");
        stk1.push("Orange");
        stk1.push("Grapes");
        stk1.push("Mango");
        stk1.push("Guava");
        stk1.push(null);

        System.out.println("stk1 is : "+stk1);

        stk1.pop();
        stk1.pop();
        System.out.println("stk1 after 2 pop : "+stk1);

        System.out.println("stk1 travering");
        for(String s1 : stk1){
            System.out.println(s1);
        }

        int arr[]={10,3,23,44,12};
        for(int a1 : arr){
            System.out.println(a1);
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
