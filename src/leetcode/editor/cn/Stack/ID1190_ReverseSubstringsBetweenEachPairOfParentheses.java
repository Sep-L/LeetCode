package leetcode.editor.cn.Stack;
import org.junit.Test;

/**
 * @author LQZ
 * @date 2022-02-27 12:15:12
 */
 
//Java：反转每对括号间的子串
public class ID1190_ReverseSubstringsBetweenEachPairOfParentheses{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    private int index = -1;
    private int length;
    public String reverseParentheses(String s) {
        length = s.length();
        return reverse(s).toString();
    }
    private StringBuilder reverse(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        while (index < length - 1) {
            index++;
            if (s.charAt(index) == '(') {
                stringBuilder.append(reverse(s).reverse());
            } else if (s.charAt(index) == ')') {
                return stringBuilder;
            } else {
                stringBuilder.append(s.charAt(index));
            }
        }
        return stringBuilder;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
    
    
        Solution solution = new Solution();
        System.out.println();
    }
}