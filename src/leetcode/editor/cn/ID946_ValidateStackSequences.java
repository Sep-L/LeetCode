package leetcode.editor.cn;
import org.junit.Test;

import java.util.Stack;

/**
 * @author LQZ
 * @date 2022-02-27 03:58:37
 */
 
//Java：验证栈序列
public class ID946_ValidateStackSequences{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int n = pushed.length;
        int i = 0, j = 0;
        while (j < n) {
            if (stack.isEmpty() || stack.peek() != popped[j]) {
                if (i == n) {
                    return false;
                }
                stack.push(pushed[i]);
                i++;
            } else {
                stack.pop();
                j++;
            }
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
    
    
        Solution solution = new Solution();
        System.out.println();
    }
}