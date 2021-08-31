package DataStructures.Queue;

//Queue using Linked List

import java.util.LinkedList;
import java.util.Queue;

public class Code {

    public static void main(String[] args) {

        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);


        System.out.println(q);

        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q);

        q.offer(22);
        q.offer(11);
        q.offer(13);

        System.out.println(q);
        System.out.println(q.element());



    }

}
