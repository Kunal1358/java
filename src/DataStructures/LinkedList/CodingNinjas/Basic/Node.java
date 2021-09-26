package DataStructures.LinkedList.CodingNinjas.Basic;

public class Node <T>{
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
        next = null;
    }
}
