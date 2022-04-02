package leetcode.editor.cn.bitoperation.simple;
import org.junit.Test;

/**
 * @author LQZ
 * @date 2022-04-02 16:52:58
 */
 
//Java：二进制加法
public class 剑指OfferII002_JFETK5{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String addBinary(String a, String b) {
        int aIndex = a.length() - 1, bIndex = b.length() -1;
        int carry = 0;
        StringBuilder ans = new StringBuilder();
        while (aIndex >= 0 || bIndex >= 0) {
            int numa = aIndex >= 0 ? a.charAt(aIndex) - '0' : 0;
            int numb = bIndex >= 0 ? b.charAt(bIndex) - '0' : 0;
            int num = numa + numb + carry;
            if (num < 2) {
                ans.append(num);
                carry = 0;
            } else {
                ans.append(num & 1);
                carry = 1;
            }
            aIndex--;
            bIndex--;
        }
        if (carry == 1) {
            ans.append("1");
        }
        return ans.reverse().toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
    
    
        Solution solution = new Solution();
        System.out.println();
    }
}