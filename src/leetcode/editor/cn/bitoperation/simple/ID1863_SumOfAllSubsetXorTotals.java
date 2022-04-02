package leetcode.editor.cn.bitoperation.simple;
import org.junit.Test;

/**
 * @author LQZ
 * @date 2022-03-31 20:36:33
 */
 
//Java：找出所有子集的异或总和再求和
public class ID1863_SumOfAllSubsetXorTotals{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {

    private int[] nums;
    private int sum;

    public int subsetXORSum(int[] nums) {
        this.nums = nums;
        dfs(0, 0);
        return sum;
    }

    private void dfs(int index, int cur) {
        if (index == nums.length) {
            sum += cur;
            return;
        }
        dfs(index + 1, cur ^ nums[index]);
        dfs(index + 1, cur);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
    
    
        Solution solution = new Solution();
        System.out.println();
    }
}