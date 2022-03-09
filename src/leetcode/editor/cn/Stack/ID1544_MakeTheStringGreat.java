package leetcode.editor.cn.Stack;
import org.junit.Test;

/**
 * @author LQZ
 * @date 2022-02-22 15:23:48
 */
 
//Java：整理字符串
public class ID1544_MakeTheStringGreat{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String makeGood(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i <s.length(); i++) {
            char ch = s.charAt(i);
            // 判断两个字符是否一个大写，一个小写. (c1 ^ c2) == 32
            // 因为小写字母的ASCII码值比大写字母大32=100000
            if (stringBuilder.length() != 0 && (ch ^ stringBuilder.charAt(stringBuilder.length() - 1)) == 32) {
                stringBuilder.deleteCharAt(stringBuilder.length() - 1);
            } else {
                stringBuilder.append(ch);
            }
        }
        return stringBuilder.toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
        String s = "leEeetcode";
    
        Solution solution = new Solution();
        System.out.println(solution.makeGood(s));
    }
}