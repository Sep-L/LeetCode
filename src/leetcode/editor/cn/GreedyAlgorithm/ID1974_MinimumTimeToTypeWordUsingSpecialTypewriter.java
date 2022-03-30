package leetcode.editor.cn.GreedyAlgorithm;
import org.junit.Test;

/**
 * @author LQZ
 * @date 2022-03-16 21:13:47
 */
 
//Java：使用特殊打字机键入单词的最少时间
public class ID1974_MinimumTimeToTypeWordUsingSpecialTypewriter{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minTimeToType(String word) {
        int ans = 0;
        char pre = 'a';
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            int count = Math.abs(c - pre);
            pre = c;
            ans += Math.min(count, 26 - count) + 1;
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