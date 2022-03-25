package leetcode.editor.cn;
import org.junit.Test;

/**
 * @author LQZ
 * @date 2022-03-24 22:26:42
 */
 
//Java：加油站
public class ID134_GasStation{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int save = 0, consume = 0, start = 0;
        int n = gas.length;
        for (int i = 0; i < n; i++) {
            save += gas[i];
            consume += cost[i];
        }
        if (save < consume) {
            return -1;
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += gas[i] - cost[i];
            if (sum < 0) {
                start = i + 1;
                sum = 0;
            }
        }
        return start;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
    
    
        Solution solution = new Solution();
        System.out.println();
    }
}