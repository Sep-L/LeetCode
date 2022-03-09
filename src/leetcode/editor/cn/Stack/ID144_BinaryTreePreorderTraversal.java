package leetcode.editor.cn.Stack;

import leetcode.editor.cn.custom.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author LQZ
 * @date 2022-02-17 17:47:34
 */

//Java：二叉树的前序遍历
public class ID144_BinaryTreePreorderTraversal {
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
        public List<Integer> preorderTraversal(TreeNode root) {
            ArrayList<Integer> list = new ArrayList<>();
            Stack<TreeNode> stack = new Stack<>();
            TreeNode cur = root;
            while (!stack.isEmpty() || cur != null) {
                while (cur != null) {
                    list.add(cur.val);
                    stack.push(cur);
                    cur = cur.left;
                }
                cur = stack.pop();
                cur = cur.right;
            }
            return list;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}