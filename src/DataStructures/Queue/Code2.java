package DataStructures.Queue;

// changing the order of Queue

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Code2 {

    public static void main(String[] args) {

        Queue<Integer> q=new PriorityQueue<>(new CustomComparator());
        q.add(1);
        q.add(12);
        q.add(6);
        q.add(2);
        q.add(9);
        q.add(0);

        System.out.println(q);

    }

}

class CustomComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        int value=o1.compareTo(o2);

        if(value>0){
            return -1;
        }else if(value<0){
            return 1;
        }else
        return 0;
    }
}

