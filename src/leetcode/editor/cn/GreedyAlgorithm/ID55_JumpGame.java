package leetcode.editor.cn.GreedyAlgorithm;
import org.junit.Test;

/**
 * @author LQZ
 * @date 2022-03-24 22:12:59
 */
 
//Java：跳跃游戏
public class ID55_JumpGame{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int right = 0;
        for (int i = 0; i < n; i++) {
            if (i > right) {
                return false;
            }
            if ((nums[i] + i) >= right) {
                right = nums[i] + i;
                if (right >= n - 1) {
                    return true;
                }
            }
        }
        return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
    
    
        Solution solution = new Solution();
        System.out.println();
    }
}