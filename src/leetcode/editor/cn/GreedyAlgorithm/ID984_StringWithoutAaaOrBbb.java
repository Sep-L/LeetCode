package leetcode.editor.cn.GreedyAlgorithm;
import org.junit.Test;

/**
 * @author LQZ
 * @date 2022-03-30 16:21:13
 */
 
//Java：不含 AAA 或 BBB 的字符串
public class ID984_StringWithoutAaaOrBbb{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String strWithout3a3b(int a, int b) {
        StringBuilder ans = new StringBuilder();
        int countA = 0, countB = 0;
        while (a > 0 || b > 0) {
            boolean writeA = (countB == 2 || (countA != 2 && a >= b));
            if (writeA) {
                ans.append('a');
                a--;
                countA++;
                countB = 0;
            } else {
                b--;
                ans.append('b');
                countB++;
                countA = 0;
            }
        }
        return new String(ans);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
    
    
        Solution solution = new Solution();
        System.out.println();
    }
}