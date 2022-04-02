package leetcode.editor.cn.bitoperation.simple;
import org.junit.Test;

/**
 * @author LQZ
 * @date 2022-04-02 17:41:18
 */
 
//Java：整数转换
public class 面试题05_06_ConvertIntegerLcci{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int convertInteger(int A, int B) {
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            ans += (A & 1) ^ (B & 1);
            A >>= 1;
            B >>= 1;
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