package leetcode.editor.cn.binarySearch.simple;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author LQZ
 * @date 2022-04-04 11:59:29
 */
 
//Java：采购方案
public class LCP28_FourXy4Wx{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int purchasePlans(int[] nums, int target) {
        Arrays.sort(nums);
        int left = 0, right = nums.length - 1;
        int ans = 0, MOD = 1000000007;
        while (left < right) {
            int total = nums[left] + nums[right];
            if (total > target) {
                right--;
            } else {
                ans += right - left;
                ans %= 1000000007;
                left++;
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