package leetcode.editor.cn.binarySearch.simple;
import org.junit.Test;

/**
 * @author LQZ
 * @date 2022-04-04 12:58:17
 */
 
//Java：魔术索引
public class 面试题08_03_MagicIndexLcci{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findMagicIndex(int[] nums) {
        return getAnswer(nums, 0, nums.length - 1);
    }

    public int getAnswer(int[] nums, int left, int right) {
        if (left > right) {
            return -1;
        }
        int middle = (right - left) / 2 + left;
        int leftAnswer = getAnswer(nums, left, middle - 1);
        // 说明左边有更小的
        if (leftAnswer != -1) {
            return leftAnswer;
        }
        // 左边没有更小的, 返回当前的
        if (nums[middle] == middle) {
            return middle;
        }
        // [0, middle] 都不符合, 查 mid + 1 到结尾
        return getAnswer(nums, middle + 1, right);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
    
    
        Solution solution = new Solution();
        System.out.println();
    }
}