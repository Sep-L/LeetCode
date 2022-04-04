package leetcode.editor.cn.binarySearch.simple;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LQZ
 * @date 2022-04-03 23:00:26
 */
 
//Java：找出数组排序后的目标下标
public class ID2089_FindTargetIndicesAfterSortingArray{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int lessCount = 0, equalCount = 0;
        for (int num : nums) {
            if (num < target) {
                lessCount++;
            } else if (num == target) {
                equalCount++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < equalCount; i++) {
            ans.add(lessCount + i);
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