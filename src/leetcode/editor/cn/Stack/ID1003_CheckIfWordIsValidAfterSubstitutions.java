package leetcode.editor.cn.Stack;
import org.junit.Test;

import java.util.Stack;

/**
 * @author LQZ
 * @date 2022-02-27 05:04:57
 */
 
//Java：检查替换后的词是否有效
public class ID1003_CheckIfWordIsValidAfterSubstitutions{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == 'c') {
                if (stack.size() < 2 || stack.pop() != 'b' || stack.pop() != 'a') {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
    
    
        Solution solution = new Solution();
        System.out.println();
    }
}