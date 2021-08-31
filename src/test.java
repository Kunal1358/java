class Node{
    Node next;
    int data;

    // Constructor to initialize values
    Node(int data){
        this.data=data;
    }
}

class LinkedList {

    Node head;

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

    public void print(){

        Node current=head;
        while(current!=null){
            System.out.print(current.data + " ");
            current=current.next;
        }
    }

    Node reverse(Node head) {
// if head is null or only one node, it's reverse of itself.
        if ( (head==null) || (head.next == null) ) return head;

        // reverse the sub-list leaving the head node.
        Node reverse = reverse(head.next);

        // head.next still points to the last element of reversed sub-list.
        // so move the head to end.

        head.next.next = head;

        // point last node to nil, (get rid of cycles)
        head.next = null;

        return reverse;
    }


}

    public class test {

    public static void main(String[] args) {

        LinkedList list=new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);

      list.head=  list.reverse(list.head);


     //   list.print();

    }

}
