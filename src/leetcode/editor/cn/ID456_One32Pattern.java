package leetcode.editor.cn;

import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author LQZ
 * @date 2022-02-25 15:08:48
 */
 
//Java：132 模式
public class ID456_One32Pattern{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {

    public boolean find132pattern(int[] nums) {
        Deque<Integer> stack = new ArrayDeque<>();
        int right = Integer.MIN_VALUE;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] < right) {
                return true;
            }
            while (!stack.isEmpty() && stack.peekLast() < nums[i]) {
                right = stack.pollLast();
            }
            stack.addLast(nums[i]);
        }
        return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
        int[] nums = new int[]{1,2,3,4};
        // nums = new int[]{3,1,4,2};
        // nums = new int[]{1,4,0,-1,-2,-3,-1,-2};
        nums = new int[]{3,5,0,3,4};
        nums = new int[]{1,3,2,4,5,6,7,8,9,10};

        Solution solution = new Solution();
        System.out.println(solution.find132pattern(nums));
    }
}