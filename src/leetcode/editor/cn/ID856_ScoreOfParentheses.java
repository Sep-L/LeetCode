package leetcode.editor.cn;

import org.junit.Test;

import java.util.Stack;

/**
 * @author LQZ
 * @date 2022-02-26 17:27:22
 */
 
//Java：括号的分数
public class ID856_ScoreOfParentheses{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {

    public int scoreOfParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(0);
            } else {
                int res = stack.pop();
                int peek = stack.pop();
                stack.push(peek + Math.max(2 * res , 1));
            }
        }
        return stack.pop();
    }

}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
        String s = "()";
        s = "(()(()))";
        // s = "()()";
    
        Solution solution = new Solution();
        System.out.println(solution.scoreOfParentheses(s));
    }
}