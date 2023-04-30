public class BinarySearchTree<T extends Comparable<T>> {
    private Node<T> root;

    public void insert(T data) {
        root = insert(root, data);
    }

    private Node<T> insert(Node<T> current, T data) {
        if (current == null) {
            return new Node<T>(data);
        }
        if (data.compareTo(current.data) < 0) {
            current.left = insert(current.left, data);
        } else if (data.compareTo(current.data) > 0) {
            current.right = insert(current.right, data);
        }
        return current;
    }

    public boolean search(T data) {
        return search(root, data);
    }

    private boolean search(Node<T> current, T data) {
        if (current == null) {
            return false;
        }
        if (data.compareTo(current.data) == 0) {
            return true;
        }
        if (data.compareTo(current.data) < 0) {
            return search(current.left, data);
        } else {
            return search(current.right, data);
        }
    }

    public void delete(T data) {
        root = delete(root, data);
    }

    private Node<T> delete(Node<T> current, T data) {
        if (current == null) {
            return null;
        }
        if (data.compareTo(current.data) == 0) {
            if (current.left == null && current.right == null) {
                return null;
            } else if (current.left == null) {
                return current.right;
            } else if (current.right == null) {
                return current.left;
            } else {
                T smallestValue = findSmallestValue(current.right);
                current.data = smallestValue;
                current.right = delete(current.right, smallestValue);
                return current;
            }
        }