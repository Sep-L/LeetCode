package leetcode.editor.cn.GreedyAlgorithm;

import org.junit.Test;

/**
 * @author LQZ
 * @date 2022-03-25 08:04:50
 */

//Java：单调递增的数字
public class ID738_MonotoneIncreasingDigits {
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int monotoneIncreasingDigits(int n) {
            char[] chars = String.valueOf(n).toCharArray();
            int index = 0;
            while (index < chars.length - 1 && chars[index] <= chars[index + 1]) {
                index++;
            }
            if (index == chars.length - 1) {
                return n;
            }
            while (index > 0 && chars[index - 1] == chars[index]) {
                index--;
            }
            chars[index] -= 1;
            for (int i = index + 1; i < chars.length; i++) {
                chars[i] = '9';
            }
            return Integer.parseInt(new String(chars));
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {


        Solution solution = new Solution();
        System.out.println(solution.monotoneIncreasingDigits(10));
    }
}