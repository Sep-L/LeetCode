package leetcode.editor.cn;
import org.junit.Test;

/**
 * @author LQZ
 * @date 2022-03-16 20:45:29
 */
 
//Java：字符串中的最大奇数
public class ID1903_LargestOddNumberInString{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String largestOddNumber(String num) {
        int index = -1;
        char[] charArray = num.toCharArray();
        for (int i = charArray.length - 1; i >= 0; i--) {
            char c = charArray[i];
            if (((c - '0') & 1) == 1) {
                index = i;
                break;
            }
        }
        return num.substring(0, index + 1);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
    
    
        Solution solution = new Solution();
        System.out.println();
    }
}