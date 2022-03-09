package leetcode.editor.cn.Stack;
import leetcode.editor.cn.custom.TreeNode;
import org.junit.Test;

/**
 * @author LQZ
 * @date 2022-02-23 15:06:47
 */
 
//Java：BiNode
public class 面试题17_12_BinodeLcci{
    //leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {

    private TreeNode treeNode;

    public TreeNode convertBiNode(TreeNode root) {
        TreeNode dummy = new TreeNode(-1);
        treeNode = dummy;
        inorder(root);
        return dummy.right;
    }

    private void inorder(TreeNode node) {
        if (node == null) {
            return;
        }
        inorder(node.left);
        node.left = null;
        treeNode.right = node;
        treeNode = node;
        inorder(node.right);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
    
    
        Solution solution = new Solution();
        System.out.println();
    }
}