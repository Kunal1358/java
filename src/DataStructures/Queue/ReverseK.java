package DataStructures.Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseK {

    public static Queue<Integer> reverseKElements(Queue<Integer> queue,int k){

        if(queue.isEmpty() || k> queue.size()){
            return queue;
        }
        if(k<=0){
            return queue;
        }
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<k;i++){
            stack.push(queue.poll());
        }
        while (!stack.isEmpty()){
            queue.add(stack.pop());
        }
        for(int i=0;i< queue.size()-k;i++) {
            queue.add(queue.poll());
        }
        return queue;
    }

    public static void main(String[] args) {

        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<5;i++){
            q.add(i+1);
        }
        Queue<Integer> reverseQueue=reverseKElements(q,3);

        while (!reverseQueue.isEmpty()){
            System.out.print(reverseQueue.poll()+" ");
        }

    }

}
