package leetcode.editor.cn.binarySearch.simple;
import org.junit.Test;

/**
 * @author LQZ
 * @date 2022-04-04 12:41:34
 */
 
//Java：排序数组中两个数字之和
public class 剑指OfferII006_KLl5u1{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;
        while (left < right) {
            int total = numbers[left] + numbers[right];
            if (total > target) {
                right--;
            } else if (total < target) {
                left++;
            } else {
                return new int[]{left, right};
            }
        }
        return new int[]{};
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
    
    
        Solution solution = new Solution();
        System.out.println();
    }
}