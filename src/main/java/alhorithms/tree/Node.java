package alhorithms.tree;

public class Node<T extends Comparable<T>>{
    private T value;
    private Node<T> leftNode;
    private Node<T> rightNode;

    public Node(T value) {
        this.value = value;
    }

    public Node(Node<T> node) {
        this.value = node.getValue();
        this.leftNode = node.getLeftNode();
        this.rightNode = node.getRightNode();
    }

    public boolean isLeaf() {
        return leftNode == null && rightNode == null;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(Node<T> leftNode) {
        this.leftNode = leftNode;
    }

    public Node<T> getRightNode() {
        return rightNode;
    }

    public void setRightNode(Node<T> rightNode) {
        this.rightNode = rightNode;
    }
}