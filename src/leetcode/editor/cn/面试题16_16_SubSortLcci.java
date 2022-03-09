package leetcode.editor.cn;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author LQZ
 * @date 2022-03-04 10:27:52
 */
 
//Java：部分排序
public class 面试题16_16_SubSortLcci{
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] subSort(int[] array) {
            int n = array.length;
            if (n <= 1) {
                return new int[]{-1, -1};
            }
            int left, right;
            int index = 0;
            while (index < n - 1 && array[index + 1] >= array[index]) {
                index++;
            }
            left = index;
            if (left == n - 1) {
                return new int[]{-1, -1};
            }
            index = n - 1;
            while (index > 0 && array[index] >= array[index - 1]) {
                index--;
            }
            right = index;

            // System.out.println(left + "\t" + right);

            for (int i = left + 1; i < right; i++) {
                while (left >= 0 && array[i] < array[left]) {
                    left--;
                }
                while (right < n && array[i] > array[right]) {
                    right++;
                }
            }
            return new int[]{left + 1, right - 1};
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
        int[] array = new int[]{1,2,4,7,10,11,7,12,6,7,16,18,19};
    
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.subSort(array)));
    }
}