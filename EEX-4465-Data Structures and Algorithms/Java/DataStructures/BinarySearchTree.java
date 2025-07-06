public class BinarySearchTree {
  // Tree node
  class Node {
    int data;
    Node left, right;

    Node(int data) {
      this.data = data;
    }
  }

  Node root;

  // Insert value
  public Node insert(Node node, int data) {
    if (node == null) return new Node(data);

    if (data < node.data)
      node.left = insert(node.left, data);

    else if (data > node.data)
      node.right = insert(node.right, data);

    return node;
  }

  // Inorder traversal
  public void inorder(Node node) {
    if (node != null) {
      inorder(node.left);
      System.out.print(node.data + " ");
      inorder(node.right);
    }
  }

  // Search value
  public boolean search(Node node, int value) {
    if (node == null) return false;
    if (node.data == value) return true;
    return value < node.data
              ? search(node.left, value)
              : search(node.right, value);
  }

  // Main 
  public static void main(String[] args) {
    BinarySearchTree bst = new BinarySearchTree();
    int[] values = {50, 30, 70, 20, 40, 60, 80};

    for (int val : values) {
      bst.root = bst.insert(bst.root, val);
    }

    System.out.print("Inorder Traversal: ");
    bst.inorder(bst.root);  // Sorted output

    System.out.println("\nSearch 60: " + bst.search(bst.root, 60));
    System.out.println("Search 15: " + bst.search(bst.root, 15));
  }
}
