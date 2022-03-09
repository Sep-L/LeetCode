package leetcode.editor.cn.Stack;
import org.junit.Test;

import java.util.Arrays;
import java.util.Stack;

/**
 * @author LQZ
 * @date 2022-03-01 16:41:02
 */
 
//Java：子数组范围和
public class ID2104_SumOfSubarrayRanges{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public long subArrayRanges(int[] nums) {
        int n = nums.length;

        // 求每个数作为最大值时的左边界
        Stack<Integer> stack = new Stack<>();
        int[] leftMax = new int[n];
        Arrays.fill(leftMax, -1);
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && nums[stack.peek()] <= nums[i]) {
                leftMax[stack.pop()] = i;
            }
            stack.push(i);
        }
        // System.out.println(Arrays.toString(leftMax));

        // 求每个数作为最大值时的右边界
        stack.clear();
        int[] rightMax = new int[n];
        Arrays.fill(rightMax, n);
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && nums[stack.peek()] < nums[i]) {
                rightMax[stack.pop()] = i;
            }
            stack.push(i);
        }
        // System.out.println(Arrays.toString(rightMax));

        // 求每个数作为最小值时的左边界
        stack.clear();
        int[] leftMin = new int[n];
        Arrays.fill(leftMin, -1);
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && nums[stack.peek()] >= nums[i]) {
                leftMin[stack.pop()] = i;
            }
            stack.push(i);
        }
        // System.out.println(Arrays.toString(leftMin));

        // 求每个数作为最小值时的右边界
        stack.clear();
        int[] rightMin = new int[n];
        Arrays.fill(rightMin, n);
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && nums[stack.peek()] > nums[i]) {
                rightMin[stack.pop()] = i;
            }
            stack.push(i);
        }
        // System.out.println(Arrays.toString(rightMin));

        long ans = 0;
        // int res = 0;
        // 最大值的贡献的和 减去 最小值的贡献的和
        for (int i = 0; i < n; i++) {
            ans += (long) (i - (leftMax[i])) * (rightMax[i] - i) * nums[i];
            // System.out.println(i + "\t" + leftMin[i] + "\t" + rightMin[i] + "\t" + nums[i]);
            ans -= (long) (i - (leftMin[i])) * (rightMin[i] - i) * nums[i];
        }
        // System.out.println(ans + "\t" + res);
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
    
        int[] nums = new int[]{5,1,2,3,4,7,4,6,5};
        nums = new int[] {1,2,3};
        Solution solution = new Solution();
        System.out.println(solution.subArrayRanges(nums));
    }
}