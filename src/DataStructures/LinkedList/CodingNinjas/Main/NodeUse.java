package DataStructures.LinkedList.CodingNinjas.Main;

import javax.management.modelmbean.ModelMBean;
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

    public static Node<Integer> insertRecursively(Node<Integer> head,int pos,int data){

        if(head==null && pos>0){
            return head;
        }
        if(pos==0){
            Node<Integer> newNode=new Node<>(data);
            newNode.next=head;
            return newNode;
        }else {
            head.next= insertRecursively(head.next,pos-1,data);
            return head;
        }


    }

    public static Node<Integer> deleteRecursively(Node<Integer> head,int pos){

        if(head==null && pos>0){
            return head;
        }
        if(pos==0){
            head=head.next;
            return head;
        }else {
            head.next=deleteRecursively(head.next, pos-1);
            return head;
        }
    }

    public static Node<Integer> reverseLL(Node<Integer> head){

        if(head==null || head.next==null){
            return head;
        }
        Node<Integer> smallHead=reverseLL(head.next);
        head.next.next=head;
        head.next=null;
        return smallHead;
    }

    public static Node<Integer> reverseLLBest(Node<Integer> head){

        if(head==null || head.next==null){
            return head;
        }
        Node<Integer> newHead=reverseLLBest(head.next);
        Node<Integer> reverseTail=head.next;
        reverseTail.next=head;
        head.next=null;
        return newHead;
    }

    public static Node<Integer> mid(Node<Integer> head){
        if(head==null || head.next==null){
            return head;
        }
        Node<Integer> slow=head;
        Node<Integer> fast=head;

        while (fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        return slow;
    }

    public static Node<Integer> mergeSortedLL(Node<Integer> head1,Node<Integer> head2){

        if(head1==null){
            return head2;
        }
        if(head2==null){
            return head1;
        }
        Node<Integer>t1=head1;
        Node<Integer> t2=head2;
        Node<Integer> head=null,tail=null;

        if(t1.data<=t2.data){
            head=t1;
            tail=t1;
            t1=t1.next;
        }
        else{
            head=t2;
            tail=t2;
            t2=t2.next;
        }

        while (t1 !=null && t2 !=null){
            if(t1.data<=t2.data){
                tail.next=t1;
                tail=t1;
                t1=t1.next;
            }else {
                tail.next=t2;
                tail=t2;
                t2=t2.next;
            }
        }
        if(t1!=null){
            tail.next=t1;
        }else{
            tail.next=t2;
        }
        return head;


    }

    // asignment 2








    public static void main(String[] args) {
        Node<Integer> head1=takeInput();
        Node<Integer> head2=takeInput();
        print(head1);
        System.out.println();

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

//        System.out.println();
//        printReverse(head);


//        Node<Integer> head5=insertRecursively(head,2,100);
//        print(head5);

//        Node<Integer> head6=reverseLLBest(head);
//        print(head6);

//        Node<Integer> head7=mid(head1);
//        System.out.println(head7.data);

        Node<Integer> head3=mergeSortedLL(head1,head2);
        print(head3);

    }

}
