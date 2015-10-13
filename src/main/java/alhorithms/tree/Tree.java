package alhorithms.tree;

public class Tree<T extends Comparable<T>> {
    private Node<T> root;

    public Tree(){
        this.root = null;
    }

    private boolean add(Node<T> index, T value) {
        if (root == null) {
            root = new Node<T>(value);
            return true;
        }

        int n = index.getValue().compareTo(value);
        if (n == 0) {
            return false;
        } else if (n > 0 && index.getLeftNode() == null) {
            index.setLeftNode(new Node<T>(value));
            return true;
        } else if (n < 0 && index.getRightNode() == null) {
            index.setRightNode(new Node<T>(value));
            return true;
        } else if (n > 0 && index.getLeftNode() != null) {
            add(index.getLeftNode(), value);
        } else {
            add(index.getRightNode(), value);
        }
        return false;
    }

    public boolean add(final T value) {
        return value != null && add(root, value);
    }

    public Node<T> getRoot() {
        return root;
    }

    public void setRoot(Node<T> root) {
        this.root = root;
    }
}