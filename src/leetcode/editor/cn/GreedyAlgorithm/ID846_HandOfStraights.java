package leetcode.editor.cn.GreedyAlgorithm;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author LQZ
 * @date 2022-03-26 20:43:29
 */
 
//Java：一手顺子
public class ID846_HandOfStraights{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {

    public boolean isNStraightHand(int[] hand, int groupSize) {
        if (hand.length % groupSize != 0) {
            return false;
        }
        Arrays.sort(hand);

        Map<Integer, Integer> map = new HashMap<>();
        for (int num : hand) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int num : hand) {
            if (map.getOrDefault(num, 0) == 0) {
                continue;
            }
            for (int i = 0; i < groupSize; i++) {
                int value = map.getOrDefault(num + i, 0);
                if (value == 0) {
                    return false;
                } else {
                    map.put(num + i, value - 1);
                }
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