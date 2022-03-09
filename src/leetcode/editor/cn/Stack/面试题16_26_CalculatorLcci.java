package leetcode.editor.cn.Stack;

import org.junit.Test;

import java.util.Stack;

/**
 * @author LQZ
 * @date 2022-03-04 11:10:30
 */
 
//Java：计算器
public class 面试题16_26_CalculatorLcci{
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int calculate(String s) {
            Stack<Integer> stack = new Stack<>();
            int num = 0;
            // 设置上一个符号 默认成加
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
                        // 因为这里指的是上一个符号, '*' 后的数字已经在栈中了
                        case '*':
                            stack.push(stack.pop() * num);
                            break;
                        default:
                            stack.push(stack.pop() / num);
                    }
                    // 修改前置符号, num 清 0
                    preSign = ch;
                    num = 0;
                }
            }
            // 乘和除算完了算加减
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