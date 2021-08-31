package DataStructures.Stacks;

import java.util.Stack;

public class code1 {

    public static void main(String[] args) {

        Stack <Integer> stack=new Stack<>();

        // Check if stack is empty or not
        System.out.println(stack.isEmpty());

        stack.push(1);
        stack.push(2);
        stack.push(3);

        //Print stack
        System.out.print(stack);
        System.out.println();

        //Pop an element
        stack.pop();
        System.out.println(stack);

        // Peek
        System.out.println(stack.peek());

        //Size of stack
        System.out.println(stack.size());





    }

}
