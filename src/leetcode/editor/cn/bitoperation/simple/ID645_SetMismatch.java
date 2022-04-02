package leetcode.editor.cn.bitoperation.simple;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author LQZ
 * @date 2022-03-30 20:41:04
 */
 
//Java：错误的集合
public class ID645_SetMismatch{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int repeat = 0, lost = 0;
        int a = 1, b = nums[0];
        boolean flag = false;
        for (int i = 1; i < nums.length; i++) {
            a ^= (i + 1);
            b ^= nums[i];
            if (nums[i] == nums[i - 1]) {
                repeat = nums[i];
            }
        }
        // a: [1, 2, 3, 4], b: [1, 2, 2, 4], repeat: 2
        // 除了丢失的元素, 其他元素都出现了偶数次
        lost = a ^ b ^ repeat;
        return new int[]{repeat, lost};
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
    
    
        Solution solution = new Solution();
        System.out.println();
    }
}