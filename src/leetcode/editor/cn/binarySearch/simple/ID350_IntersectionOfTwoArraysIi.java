package leetcode.editor.cn.binarySearch.simple;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author LQZ
 * @date 2022-04-03 17:09:09
 */
 
//Java：两个数组的交集 II
public class ID350_IntersectionOfTwoArraysIi{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] nums = new int[1001];
        for (int num : nums1) {
            nums[num]++;
        }
        List<Integer> res = new ArrayList<>();
        Arrays.sort(nums2);
        for (int num : nums2) {
            if (nums[num] > 0) {
                nums[num]--;
                res.add(num);
            }
        }
        int[] ans = new int[res.size()];
        int index = 0;
        for (int num : res) {
            ans[index] = num;
            index++;
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