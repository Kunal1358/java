package DataStructures.Stacks.Implementation.UsingLinkedList;

// Implementing Stack Using Linked List

class Node{

    Node next;
    int data;
}

class Stack{

    private Node top;

    // Constructor
    Stack(){
        this.top=null;
    }

    public void push(int data){

        Node node=new Node();

        if(node==null){
            System.out.print("\nHeap Overflow");
            return;
        }

        node.data=data;
        node.next=top;
        top=node;
        System.out.println("Element pushed");
    }

    public void pop(){

        if(top==null){
            System.out.println("Stack is Empty");
            return;
        }
        top=top.next;
    }

    public int peek(){

        if(!isEmpty())
            return top.data;
        else {
            System.out.println("Stack is Empty");
            return -1;
        }
    }

    public boolean isEmpty(){ // Method to check if Stack is empty or not
        return top==null;
    }

}

public class Code {

    public static void main(String[] args) {
        Stack stk=new Stack();

        stk.push(1);
        stk.push(2);
        stk.push(3);
        stk.push(4);
        stk.push(5);
        stk.pop();
        stk.pop();
        System.out.println(stk.peek());

    }

}
