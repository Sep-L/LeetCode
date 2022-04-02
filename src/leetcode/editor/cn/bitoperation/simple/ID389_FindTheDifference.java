package leetcode.editor.cn.bitoperation.simple;
import org.junit.Test;

/**
 * @author LQZ
 * @date 2022-03-30 19:57:42
 */
 
//Java：找不同
public class ID389_FindTheDifference{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public char findTheDifference(String s, String t) {
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            num ^= s.charAt(i) - 'a';
        }
        for (int i = 0; i < t.length(); i++) {
            num ^= t.charAt(i) - 'a';
        }
        return (char) ('a' + num);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
    
    
        Solution solution = new Solution();
        System.out.println();
    }
}