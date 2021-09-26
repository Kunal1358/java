package DataStructures.LinkedList.CodingNinjas.Main;

import java.util.Scanner;

public class NodeUse {

    public static Node<Integer> takeInput(){

        Node<Integer> head = null;
        Node<Integer> tail=null;

        Scanner sc=new Scanner(System.in);
        int data= sc.nextInt();
        while(data!=-1){
            Node<Integer> newNode=new Node<Integer>(data);
            if(head==null){
                head=newNode;
                tail=newNode;
            }else {
                tail.next=newNode;
                tail=newNode;
            }
            data=sc.nextInt();
        }
        return head;
    }

    public static void print(Node<Integer> head){
        Node<Integer> current=head;
        while(current!=null){
            System.out.print(current.data + " ");
            current=current.next;
        }
    }

    public static void replace(Node<Integer> head,int pos,int data){

        if(head==null || pos<0){
            return ;
        }
        if(pos==0){
            Node<Integer> newNode=new Node<>(data);
            newNode.next=head.next;
            head=newNode;
            return;
        }
        Node<Integer> newNode=new Node<>(data);
        int i=0;
        Node<Integer> temp=head;
        while(i<pos-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next.next;
        temp.next=newNode;
        return;
    }

    public static Node<Integer> delete(Node<Integer> head,int pos){

        if(head==null){
            return null;
        }
        if(pos==0){
            head=head.next;
            return head;
        }

        int i=0;
        Node<Integer> temp=head;
        while (i<pos-1){
            temp=temp.next;
            i++;
        }
        temp.next=temp.next.next;
        return head;

    }

    public static void reverse(Node<Integer> head){

        reversePrintHelper(head.next);
        System.out.print(head.data);

    }

    public static void reversePrintHelper(Node<Integer> head){
        while(head.next!=null){
            reversePrintHelper(head.next);
            System.out.print(head.data+" ");
            return;
        }

    }

    public static Node<Integer> appendNToFront(Node<Integer>head,int n){

        if(head==null){
            return null;
        }
        if(n==0){
            return head;
        }
        Node<Integer> head1 =head;
        Node<Integer> head2 =head;
        Node<Integer> initialHead=head;

        for(int i=0;i<n;i++){
            head1 = head1.next;
        }

        while (head1.next!=null){
            head2 = head2.next;
            head1 = head1.next;
        }

        Node<Integer> temp= head2.next;
        head2.next=null;
        head1.next=initialHead;
        head=temp;
        return head;

    }

    public static Node<Integer> removeDuplicate(Node<Integer> head){

        if(head==null){
            return null;
        }
        Node<Integer> current=head;
        while (current.next!=null){

            if(current.data==current.next.data){
                current.next=current.next.next;
            }
            else {
                current=current.next;
            }
        }
        return head;

    }

    public static void printReverse(Node<Integer> head){
        if(head==null){
            return;
        }
        printReverse(head.next);
        System.out.print(head.data+" ");
    }

    // is pallindrome


    public static void main(String[] args) {
        Node<Integer> head=takeInput();
        print(head);

//        System.out.println();
//        replace(head,2,100);
//        print(head);
//
//        System.out.println();
//        Node<Integer> head2=delete(head,2);
//        print(head2);

//        System.out.println();
//        reverse(head);

//        System.out.println();
//        Node<Integer> head3=appendNToFront(head,2);
//        print(head3);

//        System.out.println();
//        Node<Integer> head4=removeDuplicate(head);
//        print(head4);

        System.out.println();
        printReverse(head);

    }

}
