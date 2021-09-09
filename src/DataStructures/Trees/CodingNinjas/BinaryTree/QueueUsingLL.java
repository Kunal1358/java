package DataStructures.Trees.CodingNinjas.BinaryTree;

public class QueueUsingLL <T> {

    private int size;
    private Node<T> front;
    private Node<T> rear;

    public QueueUsingLL() {
        this.size = 0;
        front=null;
        rear=null;
    }
    int size(){
        return size;
    }
    boolean isEmpty(){
        return size==0;
    }

    T front() throws Exception {
        if(size==0){
            throw new Exception("Queue Empty");
        }
        return front.data;
    }

    void enQueue(T element){

        Node<T> newNode=new Node<>(element);
        if(rear==null){
            front=newNode;
            rear=newNode;
        }else {
            rear.next = newNode;
            rear=newNode;
        }size++;
    }

    T deQueue() throws Exception {
        if(size==0){
            throw new Exception("Queue Empty");
        }
        T temp=front.data;
        front=front.next;
        if(size==1){
            rear=null;
        }
        size--;
        return temp;
    }

}
