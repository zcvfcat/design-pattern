package behavioral.iterator.tree;

import java.util.NoSuchElementException;
import java.util.Stack;

import behavioral.iterator.Iterator;

public class InOrderTree<T> implements Iterator<Node<T>> {
  Stack<Node<T>> stack;

  public InOrderTree(Node<T> root) {
    stack = new Stack<Node<T>>();
  }

  public void moveLeft(Node<T> node) {
    while (node != null) {
      stack.push(node);
      node = node.left;
    }
  }

  @Override
  public boolean hasNext() {
    return !stack.empty();
  }

  @Override
  public Node<T> next() {
    if (!this.hasNext())
      throw new NoSuchElementException();

    Node<T> node = this.stack.pop();

    if (node.right != null)
      this.moveLeft(node.right);

    return node;
  }
}
