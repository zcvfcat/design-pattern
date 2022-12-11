package behavioral.iterator;

import behavioral.iterator.tree.BinarySearchTree;
import behavioral.iterator.tree.TreeNode;

public class User {
  public static void main(String[] args) {
    TreeNode root = new TreeNode(7);
    root.setLeftNode(3);
    root.setRightNode(15);
    root.left.setLeftNode(null);
    root.left.setRightNode(null);
    root.right.setLeftNode(9);
    root.right.setRightNode(20);

    BinarySearchTree binarySearchTree = new BinarySearchTree(root);
    System.out.println(binarySearchTree.next());
    System.out.println(binarySearchTree.next());
    System.out.println(binarySearchTree.hasNext());
    System.out.println(binarySearchTree.next());
    System.out.println(binarySearchTree.hasNext());
    System.out.println(binarySearchTree.next());
    System.out.println(binarySearchTree.hasNext());
    System.out.println(binarySearchTree.next());
    System.out.println(binarySearchTree.next());
    System.out.println(binarySearchTree.next());
    System.out.println(binarySearchTree.hasNext());
  }
}
