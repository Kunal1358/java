package DataStructures.Stacks;

import java.util.Stack;

public class reverseStack {

    public static void reverSatack(Stack<Integer> stack){
        reverseStackHelper(stack,new Stack<>());
    }

//    public static void reverseStackHelper(Stack<Integer> input, Stack<Integer> extra){
//
//        if(input.size()<=1){
//            return;
//        }
//
//        int lastElement=input.pop();
//        reverseStackHelper(input,extra);
//
//        while (!input.isEmpty()){
//            int top=input.pop();
//            extra.push(top);
//        }
//        input.push(lastElement);
//        while (!extra.isEmpty()){
//            int top=extra.pop();
//            input.push(top);
//        }
//    }

    public static void reverseStackHelper(Stack<Integer> input, Stack<Integer> extra){

        if(input.size()<=1){
            return;
        }
        int lastElement=input.pop();
        reverseStackHelper(input,extra);

        while(!input.isEmpty()){
            int top=input.pop();
            extra.push(top);
        }
        extra.push(lastElement);

        while(!extra.isEmpty()){
            int top=extra.pop();
            input.push(top);
        }
    }

    public static void main(String[] args) {

        Stack<Integer> stack=new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        reverSatack(stack);

        while (!stack.isEmpty()){
            System.out.print(stack.pop()+ " ");
        }
    }

}
