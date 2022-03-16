package leetcode.editor.cn;
import org.junit.Test;

/**
 * @author LQZ
 * @date 2022-03-16 21:23:58
 */
 
//Java：两栋颜色不同且距离最远的房子
public class ID2078_TwoFurthestHousesWithDifferentColors{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxDistance(int[] colors) {
        int color = colors[0];
        int n = colors.length;
        if (colors[n - 1] != color) {
            return n - 1;
        }
        int index = 1;
        while (index < n) {
            if (colors[index] != color || colors[n - 1 - index] != color) {
                index = Math.max(n - 1 - index, index);
                break;
            }
            index++;
        }
        return index;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
    
    
        Solution solution = new Solution();
        System.out.println();
    }
}