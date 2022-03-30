package leetcode.editor.cn.GreedyAlgorithm;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author LQZ
 * @date 2022-03-17 18:58:19
 */
 
//Java：跳跃游戏 II
public class ID45_JumpGameIi{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        int start = 0, end = 0, ans = 0;
        while (end < n - 1) {
            int maxJump = 0;
            // [start, end] 之间所能跳到的最远距离
            for (int i = start; i <= end; i++) {
                maxJump = Math.max(maxJump, nums[i] + i);
            }
            // 下一次从 [end + 1, maxJump] 中寻找能跳到的最远位置
            start = end + 1;
            end = maxJump;
            ans++;
            System.out.println();
            System.out.println(Arrays.toString(nums));
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