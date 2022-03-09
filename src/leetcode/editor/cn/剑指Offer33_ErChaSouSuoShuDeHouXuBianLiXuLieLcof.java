package leetcode.editor.cn;

import org.junit.Test;

import java.util.Stack;

/**
 * @author LQZ
 * @date 2022-03-02 17:00:11
 */
 
//Java：二叉搜索树的后序遍历序列
public class 剑指Offer33_ErChaSouSuoShuDeHouXuBianLiXuLieLcof{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean verifyPostorder(int[] postorder) {
        Stack<Integer> stack = new Stack<>();
        int parent = Integer.MAX_VALUE;
        // 倒序遍历
        for (int i = postorder.length - 1; i >= 0; i--) {
            int cur = postorder[i];
            // 出栈条件: 栈内非空且栈顶元素大于当前节点, 则向上寻找父节点并记录
            while (!stack.isEmpty() && stack.peek() > cur) {
                parent = stack.pop();
            }
            // parent 的记录条件时找到了左子节点, 即之后的节点都属于 parent 节点的左子树, 因此必须小于 parent
            if (cur > parent) {
                return false;
            }
            stack.push(cur);
            // System.out.println(Arrays.toString(stack.toArray()) + "\t" + parent);

        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
        int[] arr = new int[]{3,6,5,9,8,11,13,12,10};
    
        Solution solution = new Solution();
        System.out.println(solution.verifyPostorder(arr));
    }
}