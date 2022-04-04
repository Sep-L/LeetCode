package leetcode.editor.cn.binarySearch.simple;
import org.junit.Test;

/**
 * @author LQZ
 * @date 2022-04-03 20:28:32
 */
 
//Java：山脉数组的峰顶索引
public class ID852_PeakIndexInAMountainArray{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int middle = left + (right - left) / 2;
            if (arr[middle] > arr[middle + 1]) {
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