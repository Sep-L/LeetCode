package leetcode.editor.cn;
import org.junit.Test;

/**
 * @author LQZ
 * @date 2022-02-27 07:40:01
 */
 
//Java：有效括号的嵌套深度
public class ID1111_MaximumNestingDepthOfTwoValidParenthesesStrings{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int size = 0;
        int[] ans = new int[seq.length()];
        for (int i = 0; i < seq.length(); i++) {
            char c = seq.charAt(i);
            if (c == '(') {
                size++;
                ans[i] = size % 2;
            } else{
                ans[i] = size % 2;
                size--;
            }
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