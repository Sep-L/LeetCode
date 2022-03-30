package leetcode.editor.cn.GreedyAlgorithm;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author LQZ
 * @date 2022-03-17 16:21:54
 */
 
//Java：心算挑战
public class LCP40_UOAnQW{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxmiumScore(int[] cards, int cnt) {
        Arrays.sort(cards);
        int n = cards.length;
        int minOdd = Integer.MAX_VALUE, minEven = Integer.MAX_VALUE;
        int index = n - 1, sum = 0;
        while (cnt > 0) {
            if ((cards[index] & 1) == 1) {
                minOdd = cards[index];
            } else {
                minEven = cards[index];
            }
            sum += cards[index--];
            cnt--;
        }
        if ((sum & 1) == 0) {
            return sum;
        }
        int ans = 0;
        for (int i = index; i >= 0; i--) {
            if ((cards[i] & 1) == 0) {
                ans = Math.max(ans, sum - minOdd + cards[i]);
            } else {
                // 如果之前没找到偶数, 那么 minEven 会让右边小于 0
                ans = Math.max(ans, sum - minEven + cards[i]);
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