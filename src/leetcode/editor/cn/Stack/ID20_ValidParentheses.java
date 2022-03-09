package leetcode.editor.cn.Stack;

import java.util.Stack;

/**
 * @author LQZ
 * @date 2022-02-17 17:26:11
 */
 
//Java：有效的括号
public class ID20_ValidParentheses{
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean isValid(String s) {
            Stack<Character> stack = new Stack<>();
            if (s.length() % 2 != 0) {
                return false;
            }
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (ch == '(' || ch == '[' || ch == '{') {
                    stack.push(ch);
                } else {
                    if (stack.isEmpty()) {
                        return false;
                    }
                    if (!((ch == ')' && stack.pop() == '(') ||
                            (ch == ']' && stack.pop() == '[') ||
                            (ch == '}' && stack.pop() == '{'))) {
                        return false;
                    }
                }
            }
            return stack.isEmpty();
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}