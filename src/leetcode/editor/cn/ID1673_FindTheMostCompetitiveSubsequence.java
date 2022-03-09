package leetcode.editor.cn;

import org.junit.Test;

import java.util.Arrays;
import java.util.Stack;

/**
 * @author LQZ
 * @date 2022-02-28 14:22:12
 */
 
//Java：找出最具竞争力的子序列
public class ID1673_FindTheMostCompetitiveSubsequence{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] mostCompetitive(int[] nums, int k) {
        Stack<Integer> stack = new Stack<>();
        stack.add(-1);
        int size = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            // System.out.println(num + " " + stack.size() + " " + i);
            while (stack.peek() > num && (i + k - size < nums.length)) {
                stack.pop();
                size--;
            }
            if (size != k) {
                stack.push(num);
                size++;
            }
            // System.out.println(Arrays.toString(stack.toArray()));
        }
        // System.out.println(stack.size());
        int[] ans = new int[k];
        while (k > 0) {
            k--;
            ans[k] = stack.pop();
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
        int[] nums = new int[]{3,5,2,6};
        int k = 2;
        // nums = new int[]{2,4,3,3,5,4,9,6};
        // k = 4;
        nums = new int[]{71,18,52,29,55,73,24,42,66,8,80,2};
        k = 3;

        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.mostCompetitive(nums, k)));
    }
}