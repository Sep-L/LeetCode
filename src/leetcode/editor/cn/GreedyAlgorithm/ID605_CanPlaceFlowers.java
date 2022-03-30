package leetcode.editor.cn.GreedyAlgorithm;
import org.junit.Test;

/**
 * @author LQZ
 * @date 2022-03-16 09:09:40
 */
 
//Java：种花问题
public class ID605_CanPlaceFlowers{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        // 最左端补 0
        int count = 1;
        int ans = 0;
        for (int flower : flowerbed) {
            if (count == 3) {
                count = 1;
                ans++;
            }
            if (flower == 1) {
                count = 0;
            } else {
                count++;
            }
        }
        if (count >= 2) {
            ans++;
        }
        return ans >= n;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
    
    
        Solution solution = new Solution();
        System.out.println();
    }
}