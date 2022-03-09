package leetcode.editor.cn;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * @author LQZ
 * @date 2022-03-09 10:33:00
 */
 
//Java：最长连续序列
public class ID128_LongestConsecutiveSequence{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int ans = 0;
        for (int cur : set) {
            // 如果有比它小的数, 不做判断, 等遇到更小的数时再判断
            if (!set.contains(cur - 1)) {
                int curNum = cur;
                int count = 1;
                // 递增算连续个数
                while (set.contains(curNum + 1)) {
                    curNum++;
                    count++;
                }
                ans = Math.max(ans, count);
            }
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
    
    
        Solution solution = new Solution();
        System.out.println();
    }
}