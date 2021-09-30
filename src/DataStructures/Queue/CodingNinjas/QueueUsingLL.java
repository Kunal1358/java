package DataStructures.Queue.CodingNinjas;

public class QueueUsingLL<T> {

    private Node<T> front;
    private Node<T> rear;
    private int size;

    public QueueUsingLL() {
        front=null;
        rear=null;
        size=0;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public T front() throws QueueEmptyException {
        if(front==null){
            throw new QueueEmptyException();
        }
        return front.data;
    }

    public void enQueue(T data){

        Node<T> newNode=new Node<>(data);
        if(rear==null){
            rear=newNode;
            front=newNode;
        }else {
            rear.next=newNode;
            rear=newNode;
        }size++;
    }

    public T deQueue() throws QueueEmptyException {

        if(front==null){
            throw new QueueEmptyException();
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
