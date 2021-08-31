package DataStructures.LinkedList.CircularLL;

class Node{
    Node next;
    int data;
    Node(int data){
        this.data=data;
    }
}

class CircularLL{

    Node head=null;
    Node tail=null;


    public void addNode(int data){

        Node newNode=new Node(data);

        //If head is null create new Node
        //else insert the element at the tail of LL
        if(head==null){
            head=newNode;
            tail=newNode;
            newNode.next=head;
        }else{
            tail.next=newNode;
            tail=newNode;
            tail.next=head;
        }
    }

    public boolean ContainsValue(int value){
        Node current=head;

        if(head==null)
            return false;
        else {
            do{
                if(current.data==value){
                    return true;
                }current=current.next;
            }while(current!=head);
        }return false;

    }

    public void delete(int value){
        Node currentNode =head;

        if(head==null){
            return;
        }

        do{
            Node nextNode=currentNode.next;

            if(nextNode.data==value){
                if(head==tail){ // List contain only one element
                    head=null;
                    tail=null;
                }else {

                    currentNode.next=nextNode.next;
                    if(head==nextNode){ // We are deleting the head;
                        head=head.next;
                    }if(tail==nextNode){ // We are deleting the tail
                        tail=currentNode;
                    }
                }
                break;
            }currentNode=nextNode;
        }while (currentNode!=head);
    }


    public void print(){
        Node current=head;

        do {
            System.out.print(current.data+ " ");
            current=current.next;
        }while (current!=head);

    }

}


public class Code {
    public static void main(String[] args) {

        CircularLL list=new CircularLL();

        list.addNode(1);
        list.addNode(2);
        list.addNode(3);

        System.out.println(list.ContainsValue(0));
        list.delete(0);

        list.print();


    }
}
