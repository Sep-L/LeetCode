package leetcode.editor.cn.binarySearch.simple;
import org.junit.Test;

/**
 * @author LQZ
 * @date 2022-04-03 22:00:50
 */
 
//Java：第 k 个缺失的正整数
public class ID1539_KthMissingPositiveNumber{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findKthPositive(int[] arr, int k) {
        if (arr[0] > k) {
            return k;
        }
        int left = 0, right = arr.length;
        while (left < right) {
            int middle = left + (right - left) / 2;
            int lost = arr[middle] - middle - 1;
            // 找到第一个小于 k 的位置
            if (lost >= k) {
                right = middle;
            } else {
                left = middle + 1;
            }
        }
        // index 时缺失的数不到 k 个, 不用 left 是因为前面连续是会造成数组越界
        int index = left - 1;
        // cur: 当前数     lost: 当前缺失了几个数      k - lost: 还剩几个缺失的数字
        int cur = arr[index], lost = cur - index - 1;
        return cur + k - lost;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
    
    
        Solution solution = new Solution();
        System.out.println();
    }
}