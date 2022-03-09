package leetcode.editor.cn;

import org.junit.Test;

import java.util.Stack;

/**
 * @author LQZ
 * @date 2022-03-01 22:10:12
 */
 
//Java：判断一个括号字符串是否有效
public class ID2116_CheckIfAParenthesesStringCanBeValid{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean canBeValid(String s, String locked) {
        int n = s.length();
        if ((n & 1) == 1) {
            return false;
        }
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> unlock = new Stack<>();
        for (int i = 0; i < n; i++) {
            if (locked.charAt(i) == '0') {
                unlock.push(i);
            } else if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                if (!stack.isEmpty()) {
                    stack.pop();
                } else if (!unlock.isEmpty()) {
                    unlock.pop();
                } else {
                    return false;
                }
            }
        }
        while (!stack.isEmpty() && !unlock.isEmpty()) {
            if (stack.pop() > unlock.pop()) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {

    
        Solution solution = new Solution();
        System.out.println(solution.canBeValid("())(()(()(())()())(())((())(()())((())))))(((((((())(()))))(",
                "100011110110011011010111100111011101111110000101001101001111"));
    }
}