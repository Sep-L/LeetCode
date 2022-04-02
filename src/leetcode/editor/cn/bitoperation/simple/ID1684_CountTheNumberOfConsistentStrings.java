package leetcode.editor.cn.bitoperation.simple;

import org.junit.Test;

/**
 * @author LQZ
 * @date 2022-03-31 16:30:12
 */
 
//Java：统计一致字符串的数目
public class ID1684_CountTheNumberOfConsistentStrings{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int res = changeToNum(allowed), ans = 0;
        for (String word : words) {
            int cur = changeToNum(word);
            if ((cur & res) == cur) {
                ans++;
            }
        }
        return ans;
    }

    private int changeToNum(String str) {
        int ans = 0;
        for (char aChar : str.toCharArray()) {
            ans |= (1 << (aChar - 'a'));
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