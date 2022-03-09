package leetcode.editor.cn.Stack;
import org.junit.Test;

import java.util.Stack;

/**
 * @author LQZ
 * @date 2022-02-23 18:44:24
 */
 
//Java：逆波兰表达式求值
public class ID150_EvaluateReversePolishNotation{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        String str = "+-*/";
        for (String s : tokens) {
            if (str.contains(s)) {
                int num2 = stack.pop();
                int num1 = stack.pop();
                switch (s) {
                    case "+":
                        stack.push(num1 + num2);
                        break;
                    case "-":
                        stack.push(num1 - num2);
                        break;
                    case "*":
                        stack.push(num1 * num2);
                        break;
                    case "/":
                        stack.push(num1 / num2);
                }
            } else {
                stack.push(Integer.parseInt(s));
            }
        }
        return stack.peek();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
    
    
        Solution solution = new Solution();
        System.out.println();
    }
}