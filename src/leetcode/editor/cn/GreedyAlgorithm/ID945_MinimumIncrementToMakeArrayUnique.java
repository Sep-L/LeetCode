package leetcode.editor.cn.GreedyAlgorithm;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author LQZ
 * @date 2022-03-27 21:49:32
 */
 
//Java：使数组唯一的最小增量
public class ID945_MinimumIncrementToMakeArrayUnique{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int prev = -1;
        int ans = 0;
        for (int num : nums) {
            if (num <= prev) {
                ans += prev + 1 - num;
                prev++;
            } else {
                prev = num;
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