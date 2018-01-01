package Crack6.Graphs;

public class Graph {
    public Node[] nodes;
}
class Node<E> {
    E value;
    public Node[] children;
    Node(E val) {
        value = val;
    }
    Node(E val, Node[] children) {
        value = val;
        this.children = children;
    }
    Node(E val, Node child) {
        this.children = new Node[1];
        children[0] = child;
    }
    void setChildren(Node[] children) {
        this.children = children;
    }
}
