package leetcode.editor.cn.binarySearch.simple;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author LQZ
 * @date 2022-04-03 16:15:56
 */
 
//Java：早餐组合
public class LCP18_TwoVYnGI{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {

    private int[] drinks;
    private int target;

    public int breakfastNumber(int[] staple, int[] drinks, int x) {
        int MOD = 1000000007;
        Arrays.sort(drinks);
        this.drinks = drinks;
        target = x;
        int ans = 0;
        for (int num : staple) {
            ans = (ans + count(num)) % MOD;
            // System.out.println(ans);
        }
        return ans;
    }

    private int count(int num) {
        int left = 0, right = drinks.length;
        while (left < right) {
            int middle = left + (right - left) / 2;
            if (drinks[middle] + num > target) {
                right = middle;
            } else {
                left = middle + 1;
            }
        }
        return left;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
    
    
        Solution solution = new Solution();
        System.out.println();
    }
}