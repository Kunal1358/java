package DataStructures.Queue.Implementation.UsingLinkedLisit;

class Node{
    Node next;
    int data;

    //Constructor
    Node(int data){
        this.data=data;
    }
}

class Queue{

    Node front,rear;

    // Constructor to create empty Queue
    Queue(){
        this.front=this.rear=null;
    }

    public void enQueue(int data){

        Node temp=new Node(data);

        if(rear==null){ // If queue is empty then new node is front and rear both
            rear=front=temp;
            System.out.println("Item Queued "+ data);
            return;
        }
        rear.next=temp;
        rear=temp;
        System.out.println("Item Queued "+ data);
    }

    public void deQueue(){

        if(front==null){
            System.out.println("Queue is Empty");
            return;
        }

        Node temp=front;
        front=front.next;
        System.out.println("Item dequeued "+ temp.data);

        if(front==null){
            rear=null;
        }
    }
}

public class Code {

    public static void main(String[] args) {

        Queue q=new Queue();
        q.enQueue(11);
        q.enQueue(2);
        q.enQueue(3);
        q.enQueue(4);

        q.deQueue();
        q.deQueue();
        q.deQueue();
    }

}
