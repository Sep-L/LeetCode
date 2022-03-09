package leetcode.editor.cn.Stack;

import leetcode.editor.cn.custom.TreeNode;
import org.junit.Test;

/**
 * @author LQZ
 * @date 2022-02-25 19:57:30
 */
 
//Java：最大二叉树
public class ID654_MaximumBinaryTree{
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

    private int[] nums;

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        this.nums = nums;
        return buildTree(0, nums.length - 1);
    }
    private TreeNode buildTree(int left, int right) {
        if (left > right) {
            return null;
        }
        int index = findMax(left, right);
        TreeNode res = new TreeNode(nums[index]);
        res.left = buildTree(left, index - 1);
        res.right = buildTree(index + 1, right);
        return res;
    }

    private int findMax(int left, int right) {
        int max = nums[left];
        int index = left;
        for (int i = left; i <= right; i++) {
            if (max < nums[i]) {
                index = i;
                max = nums[i];
            }
        }
        return index;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
    
    
        Solution solution = new Solution();
        System.out.println();
    }
}