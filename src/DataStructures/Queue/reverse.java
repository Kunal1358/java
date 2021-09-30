package DataStructures.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class reverse {

    public static void reverse(Queue<Integer> queue){

        if(queue.size()<=1){
            return;
        }
        int front=queue.poll();
        reverse(queue);

        queue.add(front);

    }

    public static void main(String[] args) {

        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<5;i++){
            q.add(i+1);
        }
        reverse(q);
        for(int i=0;i<5;i++){
            System.out.print(q.poll() +" ");
        }



    }

}
