package leetcode.editor.cn.binarySearch.simple;
import org.junit.Test;

/**
 * @author LQZ
 * @date 2022-04-03 17:25:04
 */
 
//Java：排列硬币
public class ID441_ArrangingCoins{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int arrangeCoins(int n) {
        int start = 0, end = n;
        while (start <= end) {
            int middle = start + (end - start) / 2;
            long count = (long) (middle + 1) * middle / 2;
            if (count < n) {
                start = middle + 1;
            } else if (count == n) {
                return middle;
            } else {
                end = middle - 1;
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