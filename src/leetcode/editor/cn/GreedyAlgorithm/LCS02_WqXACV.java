package leetcode.editor.cn.GreedyAlgorithm;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author LQZ
 * @date 2022-03-17 16:59:56
 */
 
//Java：完成一半题目
public class LCS02_WqXACV{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int halfQuestions(int[] questions) {
        int[] res = new int[1000];
        for (int question : questions) {
            res[question - 1]++;
        }
        Arrays.sort(res);
        // System.out.println(Arrays.toString(res));
        int ans = 0, total = questions.length / 2, index = res.length - 1;
        while (total > 0) {
            total -= res[index--];
            ans++;
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