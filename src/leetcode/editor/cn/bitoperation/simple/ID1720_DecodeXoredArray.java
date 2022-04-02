package leetcode.editor.cn.bitoperation.simple;
import org.junit.Test;

/**
 * @author LQZ
 * @date 2022-03-31 16:46:37
 */
 
//Java：解码异或后的数组
public class ID1720_DecodeXoredArray{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] decode(int[] encoded, int first) {
        int[] decoded = new int[encoded.length + 1];
        decoded[0] = first;
        for (int i = 0; i < encoded.length; i++) {
            decoded[i + 1] = decoded[i] ^ encoded[i];
        }
        return decoded;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
    
    
        Solution solution = new Solution();
        System.out.println();
    }
}