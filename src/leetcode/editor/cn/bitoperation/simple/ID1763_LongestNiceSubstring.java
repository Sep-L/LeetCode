package leetcode.editor.cn.bitoperation.simple;
import org.junit.Test;

/**
 * @author LQZ
 * @date 2022-03-31 16:48:49
 */
 
//Java：最长的美好子字符串
public class ID1763_LongestNiceSubstring{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String longestNiceSubstring(String s) {
        boolean[] lowerCase = new boolean[26];
        boolean[] upperCase = new boolean[26];
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (c >= 'a') {
                lowerCase[c - 'a'] = true;
            } else {
                upperCase[c - 'A'] = true;
            }
        }

        for (int i = 0; i < chars.length; i++) {
            char c = Character.toUpperCase(chars[i]);
            // 如果该字符的大小写都存在, 那就继续查找下个字符
            if (upperCase[c + 32 - 'a'] && lowerCase[c - 'A']) {
                continue;
            }
            // 只有落单的字符才会隔开美好字符串, 这时再寻找左右两个字串
            String s1 = longestNiceSubstring(s.substring(0, i));
            String s2 = longestNiceSubstring(s.substring(i + 1));
            return s1.length() >= s2.length() ? s1 : s2;
        }
        return s;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
    
        Solution solution = new Solution();
        System.out.println(solution.longestNiceSubstring("YayaAay"));
    }
}