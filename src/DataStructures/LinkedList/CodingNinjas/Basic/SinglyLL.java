package DataStructures.LinkedList.CodingNinjas.Basic;

public class SinglyLL {

    public static void main(String[] args) {

        Node<Integer> node1=new Node<>(1);
        Node<Integer> node2=new Node<>(2);
        Node<Integer> node3=new Node<>(3);
        Node<Integer> node4=new Node<>(4);

        node1.next=node2;
        node2.next=node3;
        node3.next=node4;

//        System.out.println(node1.data);
//        System.out.println(node2.data);
//        System.out.println(node3.data);
//        System.out.println(node4.data);

        Node<Integer> head=node1;
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }

    }


}
