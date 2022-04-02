package leetcode.editor.cn.bitoperation.simple;
import org.junit.Test;

/**
 * @author LQZ
 * @date 2022-03-30 19:30:22
 */
 
//Java：比特位计数
public class ID338_CountingBits{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            ans[i] = count(i);
        }
        return ans;
    }

    private int count(int num) {
        int res = 0;
        while (num > 0) {
            num &= num - 1;
            res++;
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
    
    
        Solution solution = new Solution();
        System.out.println();
    }
}