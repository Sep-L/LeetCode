package leetcode.editor.cn.Stack;
import org.junit.Test;

import java.util.Stack;

/**
 * @author LQZ
 * @date 2022-02-27 07:54:43
 */
 
//Java：表现良好的最长时间段
public class ID1124_LongestWellPerformingInterval{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int longestWPI(int[] hours) {
        int n = hours.length;
        // 大于8小时是1, 小于等于8小时是-1
        for (int i = 0; i < n; i++) {
            hours[i] = hours[i] > 8 ? 1 : -1;
        }
        // 计算前缀和数组preSum
        int[] preSum = new int[n + 1];
        for (int i = 0; i < n; i++) {
            preSum[i + 1] = preSum[i] + hours[i];
        }
        // stack存储递减序列的下标
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n + 1; i++) {
            if (stack.isEmpty() || preSum[i] < preSum[stack.peek()]) {
                stack.push(i);
            }
        }
        // 从右向左查询能使区间[i, j]为正数的最大区间
        int ans = 0;
        for (int i = n; i >= 0; i--) {
            while (!stack.isEmpty() && preSum[i] - preSum[stack.peek()] > 0) {
                ans = Math.max(ans, i - stack.pop());
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