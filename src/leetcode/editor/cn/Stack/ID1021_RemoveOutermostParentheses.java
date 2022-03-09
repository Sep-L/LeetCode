package leetcode.editor.cn.Stack;
import org.junit.Test;

/**
 * @author LQZ
 * @date 2022-02-21 16:52:00
 */
 
//Java：删除最外层的括号
public class ID1021_RemoveOutermostParentheses{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder ans = new StringBuilder();
        int count = 0, start = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                ans.append(s.substring(start + 1, i));
                start = i + 1;
            }
        }
        return ans.toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
    
    
        Solution solution = new Solution();
        System.out.println();
    }
}