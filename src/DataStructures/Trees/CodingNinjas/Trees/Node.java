package DataStructures.Trees.CodingNinjas.Trees;

public class Node <T> {

    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
        next=null;
    }
}