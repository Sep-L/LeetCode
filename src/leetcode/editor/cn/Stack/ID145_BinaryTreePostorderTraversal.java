package leetcode.editor.cn.Stack;

import leetcode.editor.cn.custom.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author LQZ
 * @date 2022-02-17 20:16:01
 */

//Java：二叉树的后序遍历
public class ID145_BinaryTreePostorderTraversal {
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
        public List<Integer> postorderTraversal(TreeNode root) {
            List<Integer> list = new ArrayList<>();
            Stack<TreeNode> stack = new Stack<>();
            TreeNode cur = root;
            TreeNode prev = null;
            while (!stack.isEmpty() || cur != null) {
                while (cur != null) {
                    stack.push(cur);
                    cur = cur.left;
                }

                cur = stack.pop();
                /*
                   注意：后序遍历此处与前、中序遍历不同
                   一个左子树为空，右子树存在的节点会重复来回打印根 -> 右 -> 根...
                   因此要记录之前弹出过的节点, 避免从根跳回右节点
                */
                if (cur.right == null || cur.right == prev) {
                    list.add(cur.val);
                    prev = cur;
                    // cur要置空, 不然新的循环开始会重复添加左节点
                    cur = null;
                } else {
                    stack.add(cur);
                    cur = cur.right;
                }
            }
            return list;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}