package leetcode.editor.cn.binarySearch.simple;
import org.junit.Test;

/**
 * @author LQZ
 * @date 2022-04-04 12:55:24
 */
 
//Java：求平方根
public class 剑指OfferII072_JJ0w9p{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int mySqrt(int x) {
        if (x < 2) {
            return x;
        }
        int start = 1, end = x / 2;
        while (start <= end) {
            int middle = start + (end - start) / 2;
            if (middle > x / middle) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }
        return start - 1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
    
    
        Solution solution = new Solution();
        System.out.println();
    }
}