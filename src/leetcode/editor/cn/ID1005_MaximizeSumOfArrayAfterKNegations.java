package leetcode.editor.cn;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author LQZ
 * @date 2022-03-16 09:49:24
 */
 
//Java：K 次取反后最大化的数组和
public class ID1005_MaximizeSumOfArrayAfterKNegations{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int index = 0;
        while (k > 0) {
            if (index < nums.length && nums[index] < 0) {
                nums[index] = -nums[index];
                k--;
                index++;
            } else {
                if ((k & 1) == 1) {
                    if (index < nums.length && (index == 0 || nums[index] < nums[index - 1])) {
                        nums[index] = -nums[index];
                    } else {
                        nums[index - 1] = -nums[index - 1];
                    }
                }
                break;
            }
        }
        int ans = 0;
        for (int num : nums) {
            ans += num;
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