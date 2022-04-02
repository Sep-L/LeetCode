package leetcode.editor.cn.bitoperation.simple;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author LQZ
 * @date 2022-04-02 18:04:34
 */
 
//Java：消失的数字
public class 面试题17_04_MissingNumberLcci{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if ((nums[i] ^ i) != 0) {
                return i;
            }
        }
        return nums.length;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
    
    
        Solution solution = new Solution();
        System.out.println();
    }
}