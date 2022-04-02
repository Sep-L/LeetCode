package leetcode.editor.cn.bitoperation.simple;

import org.junit.Test;

/**
 * @author LQZ
 * @date 2022-03-31 15:58:32
 */
 
//Java：二进制表示中质数个计算置位
public class ID762_PrimeNumberOfSetBitsInBinaryRepresentation{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int countPrimeSetBits(int left, int right) {
        int ans = 0;
        for (int i = left; i <= right; i++) {
            if (isPrime(Integer.bitCount(i))) {
                ans++;
            }
        }
        return ans;
    }

    private boolean isPrime(int val) {
        return val == 2 || val == 3 || val == 5 || val == 7 || val == 11 || val == 13 || val == 17 || val == 19;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
    
    
        Solution solution = new Solution();
        System.out.println();
    }
}