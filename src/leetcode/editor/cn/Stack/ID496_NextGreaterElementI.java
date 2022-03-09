package leetcode.editor.cn.Stack;

import java.util.*;

/**
 * @author LQZ
 * @date 2022-02-18 15:59:29
 */
 
//Java：下一个更大元素 I
public class ID496_NextGreaterElementI{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        for (int num : nums2) {
            while (!stack.isEmpty() && num > stack.peek()) {
                hashMap.put(stack.pop(), num);
            }
            stack.push(num);

        }
        int[] ans = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            ans[i] = hashMap.getOrDefault(nums1[i], -1);
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}