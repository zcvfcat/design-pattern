package behavioral.iterator;

import behavioral.iterator.tree.InOrderTree;
import behavioral.iterator.tree.Node;

public class User {
  public static void main(String[] args) {
    Node<Integer> root = new Node<>(8);
    root.right = new Node<>(9);
    root.left = new Node<>(3);
    root.left.left = new Node<>(2);
    root.left.right = new Node<>(4);
    root.left.right.right = new Node<>(5);

    InOrderTree<Integer> iter = new InOrderTree<>(root);

    while (iter.hasNext()) {
      Node<Integer> node = iter.next();
      System.out.println(node.data);
    }
  }
}
