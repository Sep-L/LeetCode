package leetcode.editor.cn.GreedyAlgorithm;
import org.junit.Test;

/**
 * @author LQZ
 * @date 2022-03-25 00:38:12
 */
 
//Java：递增的三元子序列
public class ID334_IncreasingTripletSubsequence{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE, second = first;
        for (int num : nums) {
            // 等号原因: 下一个数不能和上一个数一样
            if (num <= first) {
                first = num;
            } else if (num <= second) {
                second = num;
            } else {
                return true;
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