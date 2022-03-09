package leetcode.editor.cn.Stack;

import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/**
 * @author LQZ
 * @date 2022-02-25 16:17:41
 */
 
//Java：下一个更大元素 II
public class ID503_NextGreaterElementIi{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Deque<Integer> stack = new ArrayDeque<>();
        int n = nums.length;
        int[] ans = new int[n];
        Arrays.fill(ans, -1);
        for (int i = 0; i < 2 * n - 1; i++) {
            int num = nums[i % n];
            while (!stack.isEmpty() && num > nums[stack.peekLast()]) {
                ans[stack.pollLast()] = num;
            }
            stack.addLast(i % n);
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