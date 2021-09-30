package DataStructures.Queue.CodingNinjas;

public class QueueUse {
    public static void main(String[] args) throws QueueFullException, QueueEmptyException {
        //QueueUsingArrays queue=new QueueUsingArrays();
        QueueUsingLL<Integer> queue=new QueueUsingLL<>();

        for(int i=1;i<=5;i++){
            queue.enQueue(i);
        }

        while (!queue.isEmpty()){
            System.out.print(queue.deQueue()+" ");
        }

    }
}
