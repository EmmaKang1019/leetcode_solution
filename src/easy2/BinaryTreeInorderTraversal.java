package easy2;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.List;

 class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
public class BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        inorder(root, res);
        return res;
    }
    private void inorder(TreeNode node, List<Integer> list){
        if(node == null) return;

        inorder(node.left, list);
        list.add(node.val);
        inorder(node.right, list);
    }
}
