package leetcode.editor.cn;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author LQZ
 * @date 2022-03-25 03:22:54
 */
 
//Java：任务调度器
public class ID621_TaskScheduler{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] res = new int[26];
        int total = tasks.length;
        for (char task : tasks) {
            res[task - 'A']++;
        }
        Arrays.sort(res);
        // 最长的任务所要占用的时间
        int maxTime = res[25];
        int count = 1;
        for (int i = 25; i >= 1; i--) {
            // 和次数最多任务一样也需要等冷却
            if (res[i] == res[i - 1]) {
                count++;
            } else {
                break;
            }
        }
        // 如果其他任务种类非常多, count 为 1
        // 但其他任务并不能在 (maxTime - 1) * n 的时间内全部解决
        // 这时上面算法结果会偏小, 实际上需要用 task.length 的时间
        // 举例 ["A", "A", "B", "C", "D", "E"], n = 2
        return Math.max(total, (maxTime - 1) * (n + 1) + count);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
    
    
        Solution solution = new Solution();
        System.out.println();
    }
}