package leetcode.editor.cn.bitoperation.simple;
import org.junit.Test;

/**
 * @author LQZ
 * @date 2022-03-31 16:21:07
 */
 
//Java：将数字变成 0 的操作次数
public class ID1342_NumberOfStepsToReduceANumberToZero{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int numberOfSteps(int num) {
        int ans = 0;
        while (num > 0) {
            if ((num & 1) == 0) {
                num >>= 1;
            } else {
                num--;
            }
            ans++;
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