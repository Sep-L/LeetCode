package leetcode.editor.cn;
import org.junit.Test;

import java.util.Stack;

/**
 * @author LQZ
 * @date 2022-03-02 16:49:17
 */
 
//Java：栈的压入、弹出序列
public class 剑指Offer31_ZhanDeYaRuDanChuXuLieLcof{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int pushIdx = 0, popIdx = 0;
        int n = pushed.length;
        Stack<Integer> stack = new Stack<>();
        while (popIdx < n) {
            if (stack.isEmpty() || stack.peek() != popped[popIdx]) {
                if (pushIdx == n) {
                    return false;
                }
                stack.push(pushed[pushIdx]);
                pushIdx++;
            } else {
                stack.pop();
                popIdx++;
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