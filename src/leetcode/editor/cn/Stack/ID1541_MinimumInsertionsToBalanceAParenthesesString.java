package leetcode.editor.cn.Stack;
import org.junit.Test;

/**
 * @author LQZ
 * @date 2022-02-27 21:00:27
 */
 
//Java：平衡括号字符串的最少插入次数
public class ID1541_MinimumInsertionsToBalanceAParenthesesString{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minInsertions(String s) {
        int ans = 0;
        int left = 0, right = 0;
        char[] charArray = s.toCharArray();
        int i = 0;
        while (i < charArray.length) {
            char c = charArray[i];
            // 遇到左括号直接 +1
            if (c == '(') {
                left++;
                i++;
            } else {
                // 遇到时没有左括号, 补充一个
                if (left == 0) {
                    left++;
                    ans++;
                } else {
                    left--;
                    // 此时有左括号, 如果没有两个连续的右括号, 补充上
                    if (i == charArray.length - 1 || charArray[i + 1] != ')') {
                        ans++;
                        i++;
                    } else {
                        i += 2;
                    }
                }
            }
        }
        ans += 2 * left;
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
    
    
        Solution solution = new Solution();
        System.out.println(solution.minInsertions("(()))(()))()())))"));
    }
}