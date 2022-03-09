package leetcode.editor.cn.Stack;
import leetcode.editor.cn.custom.TreeNode;
import org.junit.Test;

/**
 * @author LQZ
 * @date 2022-02-27 05:56:56
 */
 
//Java：前序遍历构造二叉搜索树
public class ID1008_ConstructBinarySearchTreeFromPreorderTraversal{
    //leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private int[] tree;
    public TreeNode bstFromPreorder(int[] preorder) {
        tree = preorder;
        return buildTree(0, tree.length - 1);
    }

    private TreeNode buildTree(int left, int right) {
        if (left > right) {
            return null;
        }
        TreeNode root = new TreeNode(tree[left]);
        if (left == right) {
            return root;
        }
        int index = findIndex(root.val, left + 1, right);
        root.left = buildTree(left + 1, index);
        root.right = buildTree(index + 1, right);
        return root;
    }
    private int findIndex(int value, int left, int right) {
        for (int i = left; i <= right; i++) {
            if (tree[i] > value) {
                return i - 1;
            }
        }
        return right;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
    
        int[] res = new int[]{8,5,1,7,10,12};
        Solution solution = new Solution();
        System.out.println(solution.bstFromPreorder(res));
    }
}