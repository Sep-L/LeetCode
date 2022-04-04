package leetcode.editor.cn.binarySearch.simple;

import org.junit.Test;

/**
 * @author LQZ
 * @date 2022-04-03 17:18:56
 */

//Java：猜数字大小
public class ID374_GuessNumberHigherOrLower {
    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Forward declaration of guess API.
     *
     * @param 'num' your guess
     * @return -1 if num is lower than the guess number
     * 1 if num is higher than the guess number
     * otherwise return 0
     * int guess(int num);
     */

    public class Solution extends GuessGame {
        public int guessNumber(int n) {
            int start = 1, end = n;
            while (start <= end) {
                int middle = start + (end - start) / 2;
                if (guess(middle) == 1) {
                    start = middle + 1;
                } else if (guess(middle) == 0) {
                    return middle;
                } else {
                    end = middle - 1;
                }
            }
            return start;
        }
    }

    //leetcode submit region end(Prohibit modification and deletion)
    public class GuessGame {
        int guess(int num) {
            return 0;
        }
    }

    @Test
    public void test() {


        Solution solution = new Solution();
        System.out.println();
    }
}