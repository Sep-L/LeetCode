package leetcode.editor.cn.binarySearch.simple;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LQZ
 * @date 2022-04-03 16:54:53
 */
 
//Java：两个数组的交集
public class ID349_IntersectionOfTwoArrays{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] nums = new int[1001];
        for (int num : nums1) {
            nums[num] = 1;
        }
        List<Integer> res = new ArrayList<>();
        for (int num : nums2) {
            if (nums[num] == 1) {
                nums[num]--;
                res.add(num);
            }
        }
        // System.out.println(res);
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