package leetcode.editor.cn.binarySearch.simple;
import org.junit.Test;

/**
 * @author LQZ
 * @date 2022-04-04 12:48:19
 */
 
//Java：山峰数组的顶部
public class 剑指OfferII069_B1IidL{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int left = 1, right = arr.length - 1;
        while (left < right) {
            int middle = left + (right - left) / 2;
            if (arr[middle] > arr[middle - 1]) {
                left = middle + 1;
            } else {
                right = middle;
            }
        }
        return left - 1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
    
    
        Solution solution = new Solution();
        System.out.println();
    }
}