package com.javarush.task.task36.task3604;

public class RedBlackTree {
    private static final com.javarush.task.task36.task3604.RedBlackTree.Node EMPTY = new com.javarush.task.task36.task3604.RedBlackTree.Node(0);

    static {
        EMPTY.left = EMPTY;
        EMPTY.right = EMPTY;
    }

    protected com.javarush.task.task36.task3604.RedBlackTree.Node current;
    private com.javarush.task.task36.task3604.RedBlackTree.Node parent;
    private com.javarush.task.task36.task3604.RedBlackTree.Node grand;
    private com.javarush.task.task36.task3604.RedBlackTree.Node great;
    private com.javarush.task.task36.task3604.RedBlackTree.Node header;

    public RedBlackTree() {
        header = new com.javarush.task.task36.task3604.RedBlackTree.Node(Integer.MIN_VALUE);
        header.left = EMPTY;
        header.right = EMPTY;
    }

    public boolean isEmpty() {
        return header.right == EMPTY;
    }

    public void clear() {
        header.right = EMPTY;
    }

    public void insert(int item) {
        current = grand = parent = header;
        EMPTY.element = item;
        while (current.element != item) {
            great = grand;
            grand = parent;
            parent = current;
            current = item > current.element ? current.right : current.left;

            if (current.left.color == com.javarush.task.task36.task3604.RedBlackTree.Color.RED && current.right.color == com.javarush.task.task36.task3604.RedBlackTree.Color.RED) {
                reorient(item);
            }
        }

        if (current != EMPTY) {
            return;
        }

        current = new com.javarush.task.task36.task3604.RedBlackTree.Node(item, EMPTY, EMPTY);

        if (item < parent.element) {
            parent.left = current;
        } else {
            parent.right = current;
        }

        reorient(item);
    }

    protected void reorient(int item) {
        current.color = com.javarush.task.task36.task3604.RedBlackTree.Color.RED;
        current.left.color = com.javarush.task.task36.task3604.RedBlackTree.Color.BLACK;
        current.right.color = com.javarush.task.task36.task3604.RedBlackTree.Color.BLACK;

        if (parent.color == com.javarush.task.task36.task3604.RedBlackTree.Color.RED) {
            grand.color = com.javarush.task.task36.task3604.RedBlackTree.Color.RED;
            if (item < grand.element != item < parent.element) {
                parent = rotate(item, grand);
            }
            current = rotate(item, great);
            current.color = com.javarush.task.task36.task3604.RedBlackTree.Color.BLACK;
        }

        header.right.color = com.javarush.task.task36.task3604.RedBlackTree.Color.BLACK;
    }

    private com.javarush.task.task36.task3604.RedBlackTree.Node rotate(int item, com.javarush.task.task36.task3604.RedBlackTree.Node parent) {
        if (item < parent.element) {
            com.javarush.task.task36.task3604.RedBlackTree.Node node = parent.left;
            com.javarush.task.task36.task3604.RedBlackTree.Node resultNode = item < node.element ? rotateWithLeftNode(node) : rotateWithRightNode(node);
            parent.left = resultNode;
            return parent.left;
        } else {
            com.javarush.task.task36.task3604.RedBlackTree.Node node = parent.right;
            com.javarush.task.task36.task3604.RedBlackTree.Node resultNode = item < node.element ? rotateWithLeftNode(node) : rotateWithRightNode(node);
            parent.right = resultNode;
            return parent.right;
        }
    }

    private com.javarush.task.task36.task3604.RedBlackTree.Node rotateWithLeftNode(com.javarush.task.task36.task3604.RedBlackTree.Node k2) {
        com.javarush.task.task36.task3604.RedBlackTree.Node k1 = k2.left;
        k2.left = k1.right;
        k1.right = k2;
        return k1;
    }

    private com.javarush.task.task36.task3604.RedBlackTree.Node rotateWithRightNode(com.javarush.task.task36.task3604.RedBlackTree.Node k1) {
        com.javarush.task.task36.task3604.RedBlackTree.Node k2 = k1.right;
        k1.right = k2.left;
        k2.left = k1;
        return k2;
    }

    public enum Color {
        BLACK,
        RED
    }

    public static class Node {
        private int element;
        private com.javarush.task.task36.task3604.RedBlackTree.Node left;
        private com.javarush.task.task36.task3604.RedBlackTree.Node right;
        private com.javarush.task.task36.task3604.RedBlackTree.Color color;

        public Node(int element) {
            this(element, null, null);
        }

        public Node(int element, com.javarush.task.task36.task3604.RedBlackTree.Node left, com.javarush.task.task36.task3604.RedBlackTree.Node right) {
            this.left = left;
            this.right = right;
            this.element = element;
            this.color = com.javarush.task.task36.task3604.RedBlackTree.Color.BLACK;
        }
    }
}
