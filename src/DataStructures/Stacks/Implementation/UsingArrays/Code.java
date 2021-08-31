package DataStructures.Stacks.Implementation.UsingArrays;

// Implemented stack using arrays

class Stack{
    private int arr[];
    private int capacity;
    private int top;

    //Constructor to initialize values
    Stack(int capacity){
        this.capacity=capacity;
        this.arr=new int[capacity];
        this.top=-1;
    }

    public void push(int data){

        if(isFull()){
            System.out.println("Stack is FUll");
            return;
        }else {
            arr[++top]=data;
            System.out.println("Element Pushed " + " ");
        }
    }

    public int pop(){

        if(isEmpty()){
            System.out.println("Stack is Empty");
        }
        System.out.println("Element popped -------");
        return arr[top--];
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
        }
        return arr[top];
    }

    public boolean isEmpty(){ // check if stack is empty or not

        if(top==-1){
            return true;
        }else {
            return false;
        }
    }

    public boolean isFull(){ // Check if stack is full or not
        if(top==capacity-1){
            return true;
        }else
            return false;
    }
}

public class Code {
    public static void main(String[] args) {

        Stack stack = new Stack(4);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        stack.pop();
        stack.pop();

        stack.push(2);
        stack.push(3);

        System.out.println(stack.peek());

        stack.push(4);
    }
}
