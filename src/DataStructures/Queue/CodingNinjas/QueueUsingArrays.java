package DataStructures.Queue.CodingNinjas;

public class QueueUsingArrays {

    private int data[];
    private int front;
    private int rear;
    private int size;

    public QueueUsingArrays() {
        data=new int[10];
        front=-1;
        rear=-1;
        size=0;
    }

    public QueueUsingArrays(int capacity) {
        data=new int[capacity];
        front=-1;
        rear=-1;
        size=0;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public int front() throws QueueEmptyException {
        if(size==0){
            throw new QueueEmptyException();
        }
        return data[front];
    }

    public void enQueue(int elem) throws QueueFullException {

        if(size== data.length-1){
            doubleCapacity();
        }
        if(size==0){
            front=0;
        }
        size++;
        rear=(rear+1)%data.length;

//        rear++;
//        if(rear==data.length){ // Sorting data in circular manner
//            rear=0;
//        }
        data[rear]=elem;
    }

    private void doubleCapacity() {

        int temp[]=data;
        data=new int[data.length * 2];

        int index=0;
        for(int i=front; i<temp.length ;i++){
            data[index]=temp[i];
            index++;
        }
        for(int i=0;i<=front-1;i++){
            data[index]=temp[i];
            index++;
        }
    }

    public int deQueue() throws QueueEmptyException {
        if(size==0){
            throw new QueueEmptyException();
        }
        int temp=data[front];
//        front++;
//        if(front==data.length){
//            front=0;
//        }
        front=(front+1)%data.length;

        size--;
        if(size==0){
            front=-1;
            rear=-1;
        }
        return temp;


    }



}
