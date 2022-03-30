package leetcode.editor.cn.GreedyAlgorithm;
import org.junit.Test;

/**
 * @author LQZ
 * @date 2022-03-17 16:54:22
 */
 
//Java：下载插件
public class LCS01_Ju9Xwi{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int leastMinutes(int n) {
        if (n == 1) {
            return 1;
        }
        int base = 1;
        int ans = 1;
        while (base * 2 < n) {
            base *= 2;
            ans++;
        }
        return ans + 1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
    
    
        Solution solution = new Solution();
        System.out.println();
    }
}