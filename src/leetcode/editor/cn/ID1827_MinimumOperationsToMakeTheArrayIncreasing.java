package leetcode.editor.cn;
import org.junit.Test;

/**
 * @author LQZ
 * @date 2022-03-16 20:41:32
 */
 
//Java：最少操作使数组递增
public class ID1827_MinimumOperationsToMakeTheArrayIncreasing{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minOperations(int[] nums) {
        int ans = 0;
        int pre = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= pre) {
                pre++;
                ans += pre - nums[i];
            } else {
                pre = nums[i];
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