package leetcode.editor.cn.GreedyAlgorithm;
import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author LQZ
 * @date 2022-03-26 20:29:41
 */
 
//Java：安排工作以达到最大收益
public class ID826_MostProfitAssigningWork{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int n = difficulty.length;
        int[][] res = new int[n][2];
        for (int i = 0; i < n; i++) {
            res[i][0] = difficulty[i];
            res[i][1] = profit[i];
        }
        Arrays.sort(res, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[1] - o1[1];
            }
        });
        // System.out.println(Arrays.deepToString(res));
        Arrays.sort(worker);
        int index = 0;
        int ans = 0;
        int i = worker.length - 1;
        while (i >= 0 && index < n) {
            if (worker[i] >= res[index][0]) {
                ans += res[index][1];
                i--;
            } else {
                index++;
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