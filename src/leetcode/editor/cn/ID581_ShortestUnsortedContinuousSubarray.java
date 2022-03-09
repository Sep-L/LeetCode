package leetcode.editor.cn;

import org.junit.Test;

/**
 * @author LQZ
 * @date 2022-02-25 16:48:30
 */
 
//Java：最短无序连续子数组
public class ID581_ShortestUnsortedContinuousSubarray{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int n = nums.length;
        int min = nums[n - 1], max = nums[0];
        int start = -1, end = -1;
        for (int i = 0; i < n; i++) {
            if (nums[n - i - 1] > min) {
                start = n - 1 - i;
            } else {
                min = nums[n - i - 1];
            }
            if (nums[i] < max) {
                end = i;
            } else {
                max = nums[i];
            }

        }
        return end == -1 ? 0 : end - start + 1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
    
    
        Solution solution = new Solution();
        System.out.println();
    }
}