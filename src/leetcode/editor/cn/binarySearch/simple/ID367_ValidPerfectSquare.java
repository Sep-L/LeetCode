package leetcode.editor.cn.binarySearch.simple;
import org.junit.Test;

/**
 * @author LQZ
 * @date 2022-04-03 17:13:13
 */
 
//Java：有效的完全平方数
public class ID367_ValidPerfectSquare{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isPerfectSquare(int num) {
        if (num == 1) {
            return true;
        }
        int start = 1, end = num;
        while (start < end) {
            int middle = start + (end - start) / 2;
            if (middle > num / middle) {
                end = middle;
            } else {
                if (num % middle == 0 && num / middle == middle) {
                    return true;
                }
                start = middle + 1;
            }
        }
        return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
    
    
        Solution solution = new Solution();
        System.out.println();
    }
}