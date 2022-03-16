package leetcode.editor.cn;

import org.junit.Test;

/**
 * @author LQZ
 * @date 2022-03-16 10:00:37
 */
 
//Java：将数组分成和相等的三个部分
public class ID1013_PartitionArrayIntoThreePartsWithEqualSum{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int n = arr.length;
        int[] pre = new int[n + 1];
        for (int i = 0; i < n; i++) {
            pre[i + 1] = pre[i] + arr[i];
        }
        int sum = pre[n];
        if (sum % 3 != 0) {
            return false;
        }
        int avg = sum / 3;
        int i = 0, j = 1, res = 0;
        while (j < n) {
            if (pre[j] - pre[i] == avg) {
                i = j;
                res++;
            }
            j++;
            if (res == 2) {
                return true;
            }
        }
        return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
    
    
        Solution solution = new Solution();
        System.out.println();
    }
}