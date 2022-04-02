package leetcode.editor.cn.bitoperation.simple;
import org.junit.Test;

/**
 * @author LQZ
 * @date 2022-03-30 20:25:16
 */
 
//Java：数字转换为十六进制数
public class ID405_ConvertANumberToHexadecimal{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String toHex(int num) {
        if (num == 0) {
            return "0";
        }
        String hex = "0123456789abcdef";
        StringBuilder ans = new StringBuilder();
        while (ans.length() < 8 && num != 0) {
            int cur = num & 15;
            ans.append(hex.charAt(cur));
            num >>= 4;
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