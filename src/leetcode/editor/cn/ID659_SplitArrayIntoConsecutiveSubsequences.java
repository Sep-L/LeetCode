package leetcode.editor.cn;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author LQZ
 * @date 2022-03-25 06:32:17
 */
 
//Java：分割数组为连续子序列
public class ID659_SplitArrayIntoConsecutiveSubsequences{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isPossible(int[] nums) {
        // 统计每个数出现次数
        Map<Integer, Integer> count = new HashMap<>();
        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        Map<Integer, Integer> tail = new HashMap<>();
        for (int num : nums) {
            // 当前数用完了, 跳过
            if (count.getOrDefault(num, 0) == 0) {
                continue;
            }
            // 优先接到前一个子序列
            if (tail.getOrDefault(num - 1, 0) > 0) {
                // 以前一个数为结尾的子序列 -1
                tail.put(num - 1, tail.get(num - 1) - 1);
                // 以当前数为结尾的子序列 +1
                tail.put(num, tail.getOrDefault(num, 0) + 1);
                // 当前数个数 -1
                count.put(num, count.get(num) - 1);
            } else {
                // 找接下来的两个数
                int count1 = count.getOrDefault(num + 1, 0);
                int count2 = count.getOrDefault(num + 2, 0);
                // 都存在, 构成新序列
                if (count1 > 0 && count2 > 0) {
                    // 三个数的个数都 -1
                    count.put(num, count.get(num) - 1);
                    count.put(num + 1, count.get(num + 1) - 1);
                    count.put(num + 2, count.get(num + 2) - 1);
                    // 以当前数结尾的子序列 +1
                    tail.put(num + 2, tail.getOrDefault(num + 2, 0) + 1);
                } else {
                    // 无法构成序列
                    return false;
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