package leetcode.editor.cn.GreedyAlgorithm;

import org.junit.Test;

/**
 * @author LQZ
 * @date 2022-03-25 07:04:56
 */
 
//Java：最大交换
public class ID670_MaximumSwap{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maximumSwap(int num) {
        String s = String.valueOf(num);
        char[] chars = s.toCharArray();

        // 记录每个数字最后出现的位置
        int[] res = new int[10];
        for (int i = 0; i < chars.length; i++) {
            res[chars[i] - '0'] = i;
        }

        // 从前向后遍历尝试交换
        for (int i = 0; i < chars.length; i++) {
            char aChar = chars[i];
            // 从大到小遍历, 要比当前数打
            for (int n = 9; n > aChar - '0'; n--) {
                // 存在下标比当前数大的数字
                if (res[n] > i) {
                    chars[i] = chars[res[n]];
                    chars[res[n]] = aChar;
                    return Integer.parseInt(new String(chars));
                }
            }
        }
        return num;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
    
    
        Solution solution = new Solution();
        System.out.println();
    }
}