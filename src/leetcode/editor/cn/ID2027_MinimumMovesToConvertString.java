package leetcode.editor.cn;
import org.junit.Test;

/**
 * @author LQZ
 * @date 2022-03-16 21:17:29
 */
 
//Java：转换字符串的最少操作次数
public class ID2027_MinimumMovesToConvertString{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minimumMoves(String s) {
        int n = s.length();
        int index = 0, ans = 0;
        while (index < n) {
            if (s.charAt(index) == 'X') {
                index += 2;
                ans++;
            }
            index++;
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