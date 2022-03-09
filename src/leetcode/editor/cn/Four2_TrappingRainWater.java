package leetcode.editor.cn;
import org.junit.Test;

import java.util.Stack;

/**
 * @author LQZ
 * @date 2022-03-04 14:14:51
 */
 
//Java：接雨水
public class Four2_TrappingRainWater{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int trap(int[] height) {
        Stack<Integer> stack = new Stack<>();
        int ans = 0;
        for (int i = 0; i < height.length; i++) {
            // 出栈条件, 新元素大于栈顶元素, 形成一个可以接雨水的区域
            while (!stack.isEmpty() && height[i] > height[stack.peek()]) {
                int low = stack.pop();
                // 左边没有柱子挡住, 接不了雨水
                if (stack.isEmpty()) {
                    break;
                }
                // 接多少取决于左右柱子低的那个, 左柱子索引不用出栈, 还需要参与下次运算
                int left = stack.peek();
                int width = i - left - 1;
                int high = Math.min(height[left], height[i]) - height[low];
                ans += width * high;
            }
            stack.push(i);
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
    
    
        Solution solution = new Solution();
        System.out.println();
    }
}