package leetcode.editor.cn.Stack;
import org.junit.Test;

/**
 * @author LQZ
 * @date 2022-02-28 10:27:45
 */
 
//Java：删除最短的子数组使剩余数组有序
public class ID1574_ShortestSubarrayToBeRemovedToMakeArraySorted{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findLengthOfShortestSubarray(int[] arr) {
        int n = arr.length;
        int left = 0, right = n - 1, count = 1;
        // 找到左边开始第一次递减的位置 [0, left] 有序
        while (left < n - 1 && arr[left] <= arr[left + 1]) {
            left++;
        }
        // 已经有序的情况
        if (left == n - 1) {
            return 0;
        }
        // 找到右边开始第一次递增的位置 [right, n - 1] 有序
        while (right >= 0 && arr[right - 1] <= arr[right]) {
            right--;
        }
        // 只保留左边或者右边的情况
        int ans = Math.min(n - left - 1, right);

        // 考虑左右两边各保留一部分的情况 [0, i], [j, n - 1] 的两部分合起来是有序的
        // System.out.println(left + "\t" + right);
        int i = 0, j = right;
        while (i <= left && j < n) {
            if (arr[i] <= arr[j]) {
                ans = Math.min(j - i - 1, ans);
                // 尝试继续增大 arr[i]
                i++;
            } else {
                // 尝试继续增大arr[j]
                j++;
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