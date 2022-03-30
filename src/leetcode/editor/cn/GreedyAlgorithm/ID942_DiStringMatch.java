package leetcode.editor.cn.GreedyAlgorithm;
import org.junit.Test;

/**
 * @author LQZ
 * @date 2022-03-16 09:39:33
 */
 
//Java：增减字符串匹配
public class ID942_DiStringMatch{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] diStringMatch(String s) {
        int n = s.length();
        int left = 0, right = n;
        int[] ans = new int[n + 1];
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c == 'I') {
                ans[i] = left++;
            } else {
                ans[i] = right--;
            }
        }
        ans[n] = left;
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