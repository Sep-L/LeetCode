package leetcode.editor.cn.Stack;
/**
 * @author LQZ
 * @date 2022-02-20 18:15:35
 */
 
//Java：比较含退格的字符串
public class ID844_BackspaceStringCompare{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean backspaceCompare(String s, String t) {
        return getString(s).equals(getString(t));
    }
    private String getString(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != '#') {
                stringBuilder.append(ch);
            } else {
                if (stringBuilder.length() > 0) {
                    stringBuilder.deleteCharAt(stringBuilder.length() - 1);
                }
            }
        }
        return stringBuilder.toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}