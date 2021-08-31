package DataStructures.Queue.Implementation.UsingArray;

// Implementation of Queue Using Arrays

class Queue{
    int arr[]; // Array to store elements
    int front; // points to the front of Queue
    int rear; // points to the end of Queue
    int size; // Current size of Queue
    int capacity; // Maximum capacity of Queue

    // Constructor to create Queue
    Queue(int capacity){
        // Creating an empty Queue
        this.capacity=capacity;
        this.arr=new int[this.capacity];
        rear=capacity-1;
        front=this.size=0;
    }

    public boolean isFull(){
        return size==capacity;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public int size(){
        return size;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            System.exit(1);
        }
        return arr[front];
    }


    public void enqueue(int item){

        if(isFull()){
            System.out.println("Queue is Full");
            return;
        }
        rear=(rear+1)%capacity;
        arr[rear]=item;
        size++;
        System.out.println(item + " enqueued to queue");
    }

    public void dequeue(){

        if(isEmpty()){
            System.out.println("Queue is Empty");
            return;
        }
        int remove=arr[front];
        front=(front+1)%capacity;
        size--;
        System.out.println("Item dequeued " +remove);
        return;
    }
}

public class code {

    public static void main(String[] args) {

        Queue q=new Queue(5);

        System.out.println(q.size);
        System.out.println(q.isEmpty());
        System.out.println(q.isFull());

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.enqueue(6);

        q.dequeue();
        q.dequeue();
        q.dequeue();

    }

}
