package leetcode.editor.cn.Stack;
import org.junit.Test;

/**
 * @author LQZ
 * @date 2022-02-26 19:55:36
 */
 
//Java：索引处的解码字符串
public class ID880_DecodedStringAtIndex{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String decodeAtIndex(String s, int k) {
        long size = 0;
        int index = -1;
        for (char c : s.toCharArray()) {
            index++;
            if (Character.isDigit(c)) {
                size *= c - '0';
            } else {
                size++;
            }
            if (size >= k) {
                break;
            }
        }
        for (int i = index; i >= 0; i--) {
            k %= size;
            char c = s.charAt(i);
            if (k == 0 && !Character.isDigit(c)) {
                return String.valueOf(c);
            }
            if (Character.isDigit(c)) {
                size /= c - '0';
            } else {
                size--;
            }
        }
        return null;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
    
        String s = "a2345678999999999999999";
        s = "ha22";
        s = "a23";
        // s = "leet2code3";
        s = "czjkk9elaqwiz7s6kgvl4gjixan3ky7jfdg3kyop3husw3fm289thisef8blt7a7zr5v5lhxqpntenvxnmlq7l34ay3jaayikjps";
        Solution solution = new Solution();
        System.out.println(solution.decodeAtIndex(s, 768077956));
    }
}