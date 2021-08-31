package DataStructures.Queue;

// Queue Using Priority Queue

import java.util.PriorityQueue;
import java.util.Queue;

public class code1 {

    public static void main(String[] args) {

        Queue<Integer> q=new PriorityQueue<>();
        q.add(1);
        q.add(12);
        q.add(6);
        q.add(2);
        q.add(9);
        q.add(0);
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.poll());

    }

}
