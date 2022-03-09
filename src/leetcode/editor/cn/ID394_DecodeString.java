package leetcode.editor.cn;
import org.junit.Test;

/**
 * @author LQZ
 * @date 2022-02-24 21:15:54
 */
 
//Java：字符串解码
public class ID394_DecodeString{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {

    private int i = -1;
    private int length;

    public String decodeString(String s) {
        length = s.length();
        return getNextString(s)[0];
    }
    private String[] getNextString(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        int count = 0;
        while (i < length - 1) {
            i++;
            while (Character.isDigit(s.charAt(i))) {
                count = count * 10 + s.charAt(i) - '0';
                i++;
            }
            if (s.charAt(i) == '[') {
                String[] temp = getNextString(s);
                while (count > 0) {
                    stringBuilder.append(temp[1]);
                    count--;
                }
            } else if (s.charAt(i) == ']') {
                return new String[]{String.valueOf(count), stringBuilder.toString()};
            } else {
                stringBuilder.append(s.charAt(i));
            }
        }
        return new String[]{stringBuilder.toString(), "0"};
    }

}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
    
    
        Solution solution = new Solution();
        System.out.println(solution.decodeString("3[a2[c]]"));
        solution = new Solution();
        System.out.println(solution.decodeString("3[a]2[bc]"));
        solution = new Solution();
        System.out.println(solution.decodeString("2[abc]3[cd]ef"));
    }
}