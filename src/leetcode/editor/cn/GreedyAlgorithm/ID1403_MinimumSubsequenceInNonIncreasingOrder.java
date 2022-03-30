package leetcode.editor.cn.GreedyAlgorithm;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author LQZ
 * @date 2022-03-16 09:01:04
 */
 
//Java：非递增顺序的最小子序列
public class ID1403_MinimumSubsequenceInNonIncreasingOrder{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        List<Integer> ans = new ArrayList<>();
        int res = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            res += nums[i];
            sum -= nums[i];
            ans.add(nums[i]);
            if (res > sum) {
                break;
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