package leetcode.editor.cn;

import leetcode.editor.cn.custom.TreeNode;
import org.junit.Test;

/**
 * @author LQZ
 * @date 2022-02-21 16:39:23
 */

//Java：递增顺序搜索树
public class ID897_IncreasingOrderSearchTree {
    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode() {}
     * TreeNode(int val) { this.val = val; }
     * TreeNode(int val, TreeNode left, TreeNode right) {
     * this.val = val;
     * this.left = left;
     * this.right = right;
     * }
     * }
     */
    class Solution {

        private TreeNode resNode;

        public TreeNode increasingBST(TreeNode root) {
            TreeNode dummyNode = new TreeNode(-1);
            resNode = dummyNode;
            inorder(root);
            return dummyNode.right;
        }

        private void inorder(TreeNode node) {
            if (node == null) {
                return;
            }
            inorder(node.left);

            resNode.right = node;
            node.left = null;
            resNode = node;

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