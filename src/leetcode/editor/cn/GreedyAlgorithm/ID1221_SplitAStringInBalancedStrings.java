package leetcode.editor.cn.GreedyAlgorithm;
import org.junit.Test;

/**
 * @author LQZ
 * @date 2022-03-16 20:01:43
 */
 
//Java：分割平衡字符串
public class ID1221_SplitAStringInBalancedStrings{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int balancedStringSplit(String s) {
        char[] chars = s.toCharArray();
        int count = 0;
        int ans = 0;
        for (char c : chars) {
            if (c == 'R') {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                ans++;
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