package leetcode.editor.cn.binarySearch.simple;
import org.junit.Test;

/**
 * @author LQZ
 * @date 2022-04-04 12:28:30
 */
 
//Java：在排序数组中查找数字 I
public class 剑指Offer53I_ZaiPaiXuShuZuZhongChaZhaoShuZiLcof{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length;
        while (left < right) {
            int middle = left + (right - left) / 2;
            if (nums[middle] >= target) {
                right = middle;
            } else {
                left = middle + 1;
            }
        }
        int ans = 0;
        while (left < nums.length && nums[left] == target) {
            ans++;
            left++;
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