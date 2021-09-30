package DataStructures.Stacks.CodingNinjas;

public class StackUsingLL {

    private Node<Integer> head;
    private int size;

    public StackUsingLL() {
        head=null;
        size=0;
    }


    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public int top() throws StackEmptyException {
        if(head==null){
            throw new StackEmptyException();
        }
        return head.data;
    }

    public void push(int data){
        Node<Integer> newNode=new Node<>(data);
        newNode.next=head;
        head=newNode;
        size++;
    }

    public int pop() throws StackEmptyException {
        if(head==null){
            throw new StackEmptyException();
        }

        int elem=head.data;
        head=head.next;
        size--;
        return elem;
    }

}
