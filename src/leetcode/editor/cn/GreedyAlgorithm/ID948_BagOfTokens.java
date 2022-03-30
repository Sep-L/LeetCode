package leetcode.editor.cn.GreedyAlgorithm;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author LQZ
 * @date 2022-03-29 21:26:26
 */
 
//Java：令牌放置
public class ID948_BagOfTokens{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int ans = 0, n = tokens.length;
        int left = 0, right = n - 1;
        while (left <= right) {
            if (power < tokens[left]) {
                if (ans == 0) {
                    return ans;
                } else {
                    power += tokens[right] - tokens[left];
                    left++;
                    right--;
                }
            } else {
                power -= tokens[left];
                left++;
                ans++;
            }
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
        int[] tokens = new int[]{100, 200, 300, 400};
        int power = 200;
    
        Solution solution = new Solution();
        System.out.println(solution.bagOfTokensScore(tokens, power));
    }
}