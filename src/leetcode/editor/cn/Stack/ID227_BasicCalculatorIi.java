package leetcode.editor.cn.Stack;

import org.junit.Test;

import java.util.Stack;

/**
 * @author LQZ
 * @date 2022-02-23 19:09:14
 */

//Java：基本计算器 II
public class ID227_BasicCalculatorIi {
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {

        public int calculate(String s) {
            Stack<Integer> stack = new Stack<>();
            int num = 0;
            char preSign = '+';
            int n = s.length();
            for (int i = 0; i < n; i++) {
                char ch = s.charAt(i);
                if (Character.isDigit(ch)) {
                    num = num * 10 + ch - '0';
                }
                if (!Character.isDigit(ch) && ch!= ' ' || i == n - 1) {
                    switch (preSign) {
                        case '+':
                            stack.push(num);
                            break;
                        case '-':
                            stack.push(-num);
                            break;
                        case '*':
                            stack.push(stack.pop() * num);
                            break;
                        default:
                            stack.push(stack.pop() / num);
                    }
                    preSign = ch;
                    num = 0;
                }
            }
            int ans = 0;
            while (!stack.isEmpty()) {
                ans += stack.pop();
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