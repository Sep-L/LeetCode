package leetcode.editor.cn.Stack;
import org.junit.Test;

import java.util.Stack;

/**
 * @author LQZ
 * @date 2022-02-27 12:52:42
 */
 
//Java：移除无效的括号
public class ID1249_MinimumRemoveToMakeValidParentheses{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> stack = new Stack<>();
        StringBuilder stringBuilder = new StringBuilder(s);
        int time = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(i);
            } else if (c == ')') {
                if (stack.isEmpty()) {
                    stringBuilder.deleteCharAt(i - time);
                    time++;
                } else {
                    stack.pop();
                }
            }
        }
        while (!stack.isEmpty()) {
            stringBuilder.deleteCharAt(stack.pop() - time);
        }
        return stringBuilder.toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
    
    
        Solution solution = new Solution();
        System.out.println(solution.minRemoveToMakeValid("a)b(c)d"));
    }
}