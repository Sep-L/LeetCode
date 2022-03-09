package leetcode.editor.cn.Stack;

import leetcode.editor.cn.custom.TreeNode;
import org.junit.Test;

/**
 * @author LQZ
 * @date 2022-02-23 16:54:12
 */

//Java：二叉树展开为链表
public class ID114_FlattenBinaryTreeToLinkedList {
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
        public void flatten(TreeNode root) {
            TreeNode curr = root;
            while (curr != null) {
                if (curr.left != null) {
                    TreeNode next = curr.left;
                    TreeNode prev = next;
                    while (prev.right != null) {
                        prev = prev.right;
                    }
                    prev.right = curr.right;
                    curr.left = null;
                    curr.right = next;
                }
                curr = curr.right;
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {


        Solution solution = new Solution();
        System.out.println();
    }
}