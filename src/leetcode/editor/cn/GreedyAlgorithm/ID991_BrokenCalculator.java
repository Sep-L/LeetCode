package leetcode.editor.cn.GreedyAlgorithm;
import org.junit.Test;

/**
 * @author LQZ
 * @date 2022-03-30 16:32:13
 */
 
//Java：坏了的计算器
public class ID991_BrokenCalculator{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int brokenCalc(int startValue, int target) {
        int ans = 0;
        while (startValue < target) {
            if ((target & 1) == 1) {
                target++;
            } else {
                target /= 2;
            }
            ans++;
        }
        return ans + startValue - target;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
    
    
        Solution solution = new Solution();
        System.out.println(solution.brokenCalc(1231, 16513156));
    }
}