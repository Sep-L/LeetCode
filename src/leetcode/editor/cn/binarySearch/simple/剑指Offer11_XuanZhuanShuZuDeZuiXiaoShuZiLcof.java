package leetcode.editor.cn.binarySearch.simple;
import org.junit.Test;

/**
 * @author LQZ
 * @date 2022-04-04 12:07:00
 */
 
//Java：旋转数组的最小数字
public class 剑指Offer11_XuanZhuanShuZuDeZuiXiaoShuZiLcof{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minArray(int[] numbers) {
        int n  = numbers.length;
        int left = 0, right = n - 1;
        while (left < right) {
            int middle = left + (right - left) / 2;
            if (numbers[middle] > numbers[right]) {
                left = middle + 1;
            } else if (numbers[middle] < numbers[right]) {
                right = middle;
            } else {
                right--;
            }
        }
        // System.out.println(left);
        // System.out.println(right);
        return numbers[left];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
    
    
        Solution solution = new Solution();
        System.out.println();
    }
}