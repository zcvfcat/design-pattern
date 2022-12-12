package behavior.iterator.tree;

import java.util.Stack;

import behavior.iterator.Iterator;

public class BinarySearchTree implements Iterator {
  public Stack<TreeNode> stack = new Stack<TreeNode>();

  public BinarySearchTree(TreeNode root) {
    while (root != null) {
      stack.push(root);
      root = root.left;
    }

  }

  public boolean hasNext() {
    return stack.size() != 0;
  }

  public Object next() {
    TreeNode result = stack.pop();
    TreeNode node = result.right;

    while (node != null) {
      stack.push(node);
      node = node.left;
    }

    return result.value;
  }

}
