package leetcode.editor.cn;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author LQZ
 * @date 2022-03-16 21:41:39
 */

//Java：拆分数位后四位数字的最小和
public class ID2160_MinimumSumOfFourDigitNumberAfterSplittingDigits {
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int minimumSum(int num) {
            int[] arr = new int[4];
            int index = 0;
            while (num > 0) {
                arr[index] = num % 10;
                num /= 10;
                index++;
            }
            Arrays.sort(arr);
            return (arr[0] + arr[1]) * 10 + (arr[2] + arr[3]);
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {


        Solution solution = new Solution();
        System.out.println();
    }
}