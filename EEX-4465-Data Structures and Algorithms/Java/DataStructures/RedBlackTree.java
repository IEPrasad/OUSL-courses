class Node {
    int data;
    Node left, right, parent;
    boolean isRed;

    Node(int data) {
        this.data = data;
        this.isRed = true; // New node always red
    }
}

public class RedBlackTree {
    private Node root;

    // Left rotate
    private void rotateLeft(Node x) {
        Node y = x.right;
        x.right = y.left;
        if (y.left != null) y.left.parent = x;

        y.parent = x.parent;
        if (x.parent == null) root = y;
        else if (x == x.parent.left) x.parent.left = y;
        else x.parent.right = y;

        y.left = x;
        x.parent = y;
    }

    // Right rotate
    private void rotateRight(Node y) {
        Node x = y.left;
        y.left = x.right;
        if (x.right != null) x.right.parent = y;

        x.parent = y.parent;
        if (y.parent == null) root = x;
        else if (y == y.parent.left) y.parent.left = x;
        else y.parent.right = x;

        x.right = y;
        y.parent = x;
    }

    public void insert(int data) {
        Node node = new Node(data);
        root = bstInsert(root, node);
        fixInsert(node);
    }

    private Node bstInsert(Node root, Node node) {
        if (root == null) return node;

        if (node.data < root.data) {
            root.left = bstInsert(root.left, node);
            root.left.parent = root;
        } else {
            root.right = bstInsert(root.right, node);
            root.right.parent = root;
        }

        return root;
    }

    private void fixInsert(Node z) {
        while (z.parent != null && z.parent.isRed) {
            Node grand = z.parent.parent;
            if (z.parent == grand.left) {
                Node uncle = grand.right;
                if (uncle != null && uncle.isRed) {
                    z.parent.isRed = false;
                    uncle.isRed = false;
                    grand.isRed = true;
                    z = grand;
                } else {
                    if (z == z.parent.right) {
                        z = z.parent;
                        rotateLeft(z);
                    }
                    z.parent.isRed = false;
                    grand.isRed = true;
                    rotateRight(grand);
                }
            } else {
                Node uncle = grand.left;
                if (uncle != null && uncle.isRed) {
                    z.parent.isRed = false;
                    uncle.isRed = false;
                    grand.isRed = true;
                    z = grand;
                } else {
                    if (z == z.parent.left) {
                        z = z.parent;
                        rotateRight(z);
                    }
                    z.parent.isRed = false;
                    grand.isRed = true;
                    rotateLeft(grand);
                }
            }
        }
        root.isRed = false;
    }

    public void inorder(Node node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.data + " ");
            inorder(node.right);
        }
    }

    public void printTree() {
        inorder(root);
    }

    public static void main(String[] args) {
        RedBlackTree rbt = new RedBlackTree();
        rbt.insert(10);
        rbt.insert(20);
        rbt.insert(30);
        rbt.insert(15);
        rbt.insert(25);
        rbt.printTree(); // Output: 10 15 20 25 30
    }
}
