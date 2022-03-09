package leetcode.editor.cn;
import org.junit.Test;

/**
 * @author LQZ
 * @date 2022-02-27 03:53:00
 */
 
//Java：使括号有效的最少添加
public class ID921_MinimumAddToMakeParenthesesValid{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minAddToMakeValid(String s) {
        int ans = 0;
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                count += 1;
            } else {
                if (count == 0) {
                    ans += 1;
                } else {
                    count -= 1;
                }
            }
        }
        return ans + count;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
    
    
        Solution solution = new Solution();
        System.out.println();
    }
}