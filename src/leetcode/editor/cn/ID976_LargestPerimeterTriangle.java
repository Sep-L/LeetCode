package leetcode.editor.cn;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author LQZ
 * @date 2022-03-16 09:45:09
 */
 
//Java：三角形的最大周长
public class ID976_LargestPerimeterTriangle{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        for (int i = nums.length - 1; i >= 2; i--) {
            int first = nums[i];
            int second = nums[i - 1];
            int third = nums[i - 2];
            if (second + third > first) {
                return first + second + third;
            }
        }
        return 0;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
    
    
        Solution solution = new Solution();
        System.out.println();
    }
}