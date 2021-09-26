package DataStructures.LinkedList.SinglyLL;

class Node{
    Node next;
    int data;

    // Constructor to initialize values
    Node(int data){
        this.data=data;
    }
}

class LinkedList{

    Node head;

    // To add at the last of linked list
    // or
    // To create Linked List if it is empty
    public void add(int data){

        if(head==null){
            head=new Node(data);
            return;
        }else{
            Node current=head;
            while(current.next!=null){
                current=current.next;
            }
            current.next=new Node(data);
        }
    }

    // Insert an element at a give position
    public void addAtPos(int data,int pos){

        //If Head is null and pos is not 0 then exit
        if(head==null){
            if(pos<0 || pos!=0){
                System.out.println("Invalid Operation");
                return;
            }else {
                head=new Node(data);
            }
        }

        // If Head != null and pos is 0
        if(head!=null && pos==0){
            Node new_Head=new Node(data);
            new_Head.next=head;
            head=new_Head;
        }

        Node current=head;
        Node prev=null;

        int i=0;
        while(i<pos){
            prev=current;
            current=current.next;
            if(current==null){
                break;
            }
            i++;
        }

            prev.next=new Node(data);
            prev.next.next=current;
    }

    // Adding element to start of LinkedList
    public void addBefore(int data){

        if(head==null){
            head=new Node(data);
            return;
        }else {
            Node new_head=new Node(data);
            new_head.next=head;
            head=new_head;
        }
    }

    // Delete a node with given value
    public void deleteWithValue(int data){

        if(head==null){
            return;
        }
        if(head.data==data){
            head=head.next;
            return;
        }
            Node current=head;
            while(current.next!=null){
                if(current.next.data==data){
                    current.next=current.next.next;
                    return;
                }
                current=current.next;
        }
    }

    // Delete an element at specific position
    public void deleteWithPos(int pos){

        // If head is null and pos is < 0 then return
        if(head==null || pos<0){
            System.out.println("Invalid Operation");
            return;
        }
        // If pos == 0 then point the head to next val
        if(pos==0){
            head=head.next;
            return;
        }
        // if pos is > 0 then delete with pos
        Node current=head;
        Node prev=null;
        int i=0;

        while(i<pos){
            prev=current;
            current=current.next;
            if(current==null){
                break;
            }
            i++;
        }
        prev.next= current.next;
    }

    // Print the List
    public void print(){

        Node current=head;
        while(current!=null){
            System.out.print(current.data + " ");
            current=current.next;
        }
    }

     public Node reverse() {

        // Method
        // Time Complexity - O(N)
        // Space Complexity - O(1)

         Node next = null;
         Node prev = null;

         Node current = head;

         while (current != null) {

             next = current.next;
             current.next = prev;
             prev = current;
             current = next;
         }
         head=prev;
         return prev;
     }

     public Node reverseReccursion(){

        Node prev=null;
        Node current=head;

        //check if head==null or head.next==null
         if(head==null)
             return head;
         if(current.next==null){
             current.next=prev;
             return head;
         }




        return head;
     }



}

public class SinglyLL {

    public static void main(String[] args) {

        LinkedList list=new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.reverse();
        list.print();

    }

}
