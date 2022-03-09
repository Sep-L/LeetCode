package leetcode.editor.cn;
import org.junit.Test;

import java.util.Stack;

/**
 * @author LQZ
 * @date 2022-02-27 04:36:55
 */
 
//Java：最大宽度坡
public class ID962_MaximumWidthRamp{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxWidthRamp(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int ans = -1;
        for (int i = 0; i < nums.length; i++) {
            // 记录递减序列的下标, 最大宽度的左边肯定是这里面的某个值
            if (stack.isEmpty() || nums[i] < nums[stack.peek()]) {
                stack.push(i);
            }
        }
        // stack先pop出最小的, 找右边时比栈顶大的元素不一定比栈内其他元素大, 需要再向左继续找
        for (int i = nums.length - 1; i >= 0; i--) {
            // 找到了比栈顶大的, 计算宽度, 出栈
            while (!stack.isEmpty() && nums[i] >= nums[stack.peek()]) {
                ans = Math.max(i - stack.pop(), ans);
            }
            if (stack.isEmpty()) {
                break;
            }
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