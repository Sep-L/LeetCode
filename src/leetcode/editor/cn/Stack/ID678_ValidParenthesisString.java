package leetcode.editor.cn.Stack;

import org.junit.Test;

import java.util.Stack;

/**
 * @author LQZ
 * @date 2022-02-25 19:57:30
 */
 
//Java：有效的括号字符串
public class ID678_ValidParenthesisString{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> star = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                stack.push(i);
            } else if (ch == '*') {
                star.push(i);
            } else {
                if (!stack.isEmpty()) {
                    stack.pop();
                } else {
                    if (!star.isEmpty()) {
                        star.pop();
                    } else  {
                        return false;
                    }
                }
            }
        }
        // System.out.println(stack.size() + "\t" + star.size());
        while (!stack.isEmpty() && !star.isEmpty()) {
            if (stack.pop() > star.pop()) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
    
        String s = "(((((*(()((((*((**(((()()*)()()()*((((**)())*)*)))))))(())(()))())((*()()(((()((()*(())*(()**)()(())";
        Solution solution = new Solution();
        System.out.println(solution.checkValidString(s));
    }
}