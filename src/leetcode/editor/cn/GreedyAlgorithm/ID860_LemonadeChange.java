package leetcode.editor.cn.GreedyAlgorithm;
import org.junit.Test;

/**
 * @author LQZ
 * @date 2022-03-16 09:33:23
 */
 
//Java：柠檬水找零
public class ID860_LemonadeChange{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0, ten = 0, twenty = 0;
        for (int bill : bills) {
            if (bill == 5) {
                five++;
            } else if (bill == 10) {
                if (five == 0) {
                    return false;
                }
                ten++;
                five--;
            } else if (ten > 0) {
                if (five == 0) {
                    return false;
                }
                ten--;
                five--;
            } else {
                if (five < 3) {
                    return false;
                }
                five -= 3;
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