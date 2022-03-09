package leetcode.editor.cn;

import leetcode.editor.cn.custom.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author LQZ
 * @date 2022-02-17 17:29:04
 */
 
//Java：二叉树的中序遍历
public class ID94_BinaryTreeInorderTraversal{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while (cur != null || !stack.isEmpty()) {
            if (cur != null) {
                stack.push(cur);
                cur = cur.left;
            } else {
                cur = stack.pop();
                list.add(cur.val);
                cur = cur.right;
            }

        }
        return list;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}