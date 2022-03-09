package leetcode.editor.cn.Stack;

import org.junit.Test;

import java.util.Stack;

/**
 * @author LQZ
 * @date 2022-03-03 21:02:36
 */
 
//Java：后缀表达式
public class 剑指OfferII036_EightZf90G{
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
        return stack.pop();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
    
    
        Solution solution = new Solution();
        System.out.println();
    }
}