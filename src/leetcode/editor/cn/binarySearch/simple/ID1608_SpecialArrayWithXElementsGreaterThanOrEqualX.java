package leetcode.editor.cn.binarySearch.simple;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author LQZ
 * @date 2022-04-03 22:22:02
 */
 
//Java：特殊数组的特征值
public class ID1608_SpecialArrayWithXElementsGreaterThanOrEqualX{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int specialArray(int[] nums) {
        int n = nums.length;
        int[] biggerCounts = new int[n];
        biggerCounts[0] = n;
        Arrays.sort(nums);
        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1]) {
                biggerCounts[i] = biggerCounts[i - 1];
            } else {
                biggerCounts[i] = n - i;
            }
        }
        // System.out.println(Arrays.toString(biggerCounts));
        int left = 0, right = n;
        while (left < right) {
            int middle = left + (right - left) / 2;
            // 当前位置右边有几个比它大的
            int biggerCount = biggerCounts[middle];
            if (biggerCount > nums[middle]) {
                left = middle + 1;
            } else if (biggerCount <= nums[middle]) {
                // 如果 biggerCount 小于等于当前数
                // 额外判断是否大于前一个数, 如果大于或者前面没有了
                // 就满足了 biggerCount 个元素大于等于 biggerCount
                if (middle == 0 || biggerCount > nums[middle - 1]) {
                    return biggerCount;
                }
                right = middle;
            }
        }
        return -1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
    
    
        Solution solution = new Solution();
        System.out.println();
    }
}