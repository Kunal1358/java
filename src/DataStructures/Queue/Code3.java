package DataStructures.Queue;

// Book example

import java.util.PriorityQueue;
import java.util.Queue;

class Book implements Comparable<Book>{

    int id;
    String publisher,name,author;
    int quantity;

    public Book(int id, String publisher, String name, String author, int quantity) {
        this.id = id;
        this.publisher = publisher;
        this.name = name;
        this.author = author;
        this.quantity = quantity;
    }

    @Override
    public int compareTo(Book b) {

        if(id>b.id)
            return 1;
        else if(id<b.id)
            return -1;
        else
            return 0;
    }
}


public class Code3 {

    public static void main(String[] args) {

        Queue<Book> queue= new PriorityQueue<>();

        Book b1=new Book(121,"Let us C","Yashwant Kanetkar","BPB",8);
        Book b2=new Book(233,"Operating System","Galvin","Wiley",6);
        Book b3=new Book(101,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);

        queue.add(b1);
        queue.add(b2);
        queue.add(b3);

        // Traversing
        for(Book b:queue){
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }
        System.out.println("----------------------");

        queue.remove();

        for(Book b:queue){
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }

    }

}
