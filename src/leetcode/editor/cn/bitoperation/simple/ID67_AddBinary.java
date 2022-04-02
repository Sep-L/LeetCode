package leetcode.editor.cn.bitoperation.simple;
import org.junit.Test;

/**
 * @author LQZ
 * @date 2022-03-30 17:07:51
 */
 
//Java：二进制求和
public class ID67_AddBinary{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String addBinary(String a, String b) {
        int indexA = a.length() - 1, indexB = b.length() - 1;
        StringBuilder ans = new StringBuilder();
        int carry = 0;
        while (indexA >= 0 || indexB >= 0) {
            char aChar = indexA < 0 ? '0' : a.charAt(indexA);
            char bChar = indexB < 0 ? '0' : b.charAt(indexB);
            int num = (aChar - '0') + (bChar - '0') + carry;
            // System.out.println(num);
            if (num < 2) {
                // ans.insert(0, num);
                ans.append(num);
                carry = 0;
            } else {
                // ans.insert(0, num & 1);
                ans.append(num & 1);
                carry = 1;
            }
            indexA--;
            indexB--;
        }
        if (carry == 1) {
            // ans.insert(0, "1");
            ans.append("1");
        }
        ans.reverse();
        return new String(ans);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
    
    
        Solution solution = new Solution();
        System.out.println(solution.addBinary("1010", "1011"));
    }
}