package leetcode.editor.cn.GreedyAlgorithm;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author LQZ
 * @date 2022-03-25 02:08:23
 */
 
//Java：有效三角形的个数
public class ID611_ValidTriangleNumber{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int ans = 0;
        // 枚举最长边索引从 2 到 n - 1
        for (int i = n - 1; i >= 2; i--) {
            // 左右双指针
            int left = 0, right = i - 1;
            // 对每个固定的 right, 查找满足三角形时最小的 left
            while (left < right) {
                // 两边之和大于第三边, 则对于固定的 right 和 i
                // left 从 [left, right) 都满足条件, 加到结果中
                if (nums[left] + nums[right] > nums[i]) {
                    ans += right - left;
                    right--;
                } else {
                    // 两边之和小了, 说明 left 太小了, 右移
                    left++;
                }
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