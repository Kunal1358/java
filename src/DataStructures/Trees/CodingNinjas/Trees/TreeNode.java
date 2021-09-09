package DataStructures.Trees.CodingNinjas.Trees;

import java.util.ArrayList;

class TreeNode<T> {

    T data;
    ArrayList<TreeNode<T>> children; // Type of data will be TreeNode and datatype is generics.

    public TreeNode(T data) {
        this.data = data;
        this.children=new ArrayList<>(); // Created arrayList
    }
}