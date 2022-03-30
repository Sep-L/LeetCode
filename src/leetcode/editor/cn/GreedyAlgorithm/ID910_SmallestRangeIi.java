package leetcode.editor.cn.GreedyAlgorithm;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author LQZ
 * @date 2022-03-27 20:02:47
 */
 
//Java：最小差值 II
public class ID910_SmallestRangeIi{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int smallestRangeII(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        if (n == 1 || nums[0] == nums[n - 1]) {
            return 0;
        }
        // 特殊情况, 所有数都 +k
        int ans = nums[n - 1] - nums[0];
        for (int i = 0; i < n - 1; i++) {
            int max = Math.max(nums[i] + k, nums[n - 1] - k);
            int min = Math.min(nums[0] + k, nums[i + 1] - k);
            ans = Math.min(ans, max - min);
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