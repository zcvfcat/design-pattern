package behavior.iterator.tree;

public class TreeNode {
  public Integer value;
  public TreeNode left = null;
  public TreeNode right = null;

  public TreeNode(Integer x) {
    this.value = x;
  }

  public TreeNode setLeftNode(Integer value) {
    this.left = new TreeNode(value);
    return this.left;
  }

  public TreeNode setRightNode(Integer value) {
    this.right = new TreeNode(value);
    return this.right;
  }
}
