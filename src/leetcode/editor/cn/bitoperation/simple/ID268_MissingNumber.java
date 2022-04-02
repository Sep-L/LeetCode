package leetcode.editor.cn.bitoperation.simple;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author LQZ
 * @date 2022-03-30 18:03:03
 */
 
//Java：丢失的数字
public class ID268_MissingNumber{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int left = 0, right = nums.length;
        while (left < right) {
            int middle = left + (right - left) / 2;
            if (nums[middle] == middle) {
                left = middle + 1;
            } else {
                right = middle;
            }
        }
        return left;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
        int[] nums = new int[]{0, 1};
    
        Solution solution = new Solution();
        System.out.println(solution.missingNumber(nums));
    }
}