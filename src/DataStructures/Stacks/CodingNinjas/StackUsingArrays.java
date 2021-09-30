package DataStructures.Stacks.CodingNinjas;

public class StackUsingArrays {

    private int data[];
    private int topIndex;

    public StackUsingArrays() {
        data=new int[10];
        topIndex=-1;
    }

    public StackUsingArrays(int size) {
        data=new int[size];
        topIndex=-1;
    }

    // O(1)
    public int size(){
        return topIndex+1;
    }

    // O(1)
    public boolean isEmpty(){
        return topIndex==-1;
    }

    // O(1)
    public int top() throws StackEmptyException {
        if(isEmpty()){
            throw new StackEmptyException();
        }
        return data[topIndex];
    }

    // O(1)
    public void push(int elem) throws StackFullException {
        if(topIndex== data.length-1){

            doubleCapacity();

        }
        data[++topIndex]=elem;
    }

    private void doubleCapacity() {

        int temp[]=data; // copied data
        data=new int[data.length*2]; // created new array in memory
        for(int i=0;i< temp.length;i++){ // copied all values from temp array
            data[i]= temp[i];
        }

    }

    // O(1)
    public int pop() throws StackEmptyException {

        if(isEmpty()){
            throw new StackEmptyException();
        }

        int value=data[topIndex];
        topIndex-=1;
        return value;
    }

}
