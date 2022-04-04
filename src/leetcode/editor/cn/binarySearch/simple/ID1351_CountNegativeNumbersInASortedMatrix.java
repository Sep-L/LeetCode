package leetcode.editor.cn.binarySearch.simple;
import org.junit.Test;

/**
 * @author LQZ
 * @date 2022-04-03 21:50:54
 */
 
//Java：统计有序矩阵中的负数
public class ID1351_CountNegativeNumbersInASortedMatrix{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int countNegatives(int[][] grid) {
        int ans = 0;
        for (int i = 0; i < grid.length; i++) {
            ans += getIndex(grid[i]);
        }
        return ans;
    }

    private int getIndex(int[] arr) {
        int left = 0, right = arr.length;
        while (left < right) {
            int middle = left + (right - left) / 2;
            if (arr[middle] >= 0) {
                left = middle + 1;
            } else {
                right = middle;
            }
        }
        return arr.length - left;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
    
    
        Solution solution = new Solution();
        System.out.println();
    }
}