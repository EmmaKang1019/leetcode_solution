package easy2;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        postOrder(list, root);
        return list;
    }
    private void postOrder(List<Integer> li, TreeNode node){
        if(node == null) return;
        postOrder(li, node.left);
        postOrder(li,node.right);
        li.add(node.val);
    }
}
