package leetcode.editor.cn.bitoperation.simple;
import org.junit.Test;

/**
 * @author LQZ
 * @date 2022-03-31 21:07:21
 */
 
//Java：将数组划分成相等数对
public class ID2206_DivideArrayIntoEqualPairs{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean divideArray(int[] nums) {
        int[] res = new int[500];
        for (int num : nums) {
            res[num - 1]++;
        }
        for (int num : res) {
            if ((num & 1) == 1) {
                return false;
            }
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
    
    
        Solution solution = new Solution();
        System.out.println();
    }
}