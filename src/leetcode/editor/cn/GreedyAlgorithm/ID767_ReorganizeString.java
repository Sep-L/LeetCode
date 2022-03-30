package leetcode.editor.cn.GreedyAlgorithm;
import org.junit.Test;

/**
 * @author LQZ
 * @date 2022-03-25 09:08:18
 */
 
//Java：重构字符串
public class ID767_ReorganizeString{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String reorganizeString(String s) {
        char[] chars = s.toCharArray();
        int n = chars.length;

        // 每个字符出现的次数
        int[] count = new int[26];
        for (char aChar : chars) {
            count[aChar - 'a']++;
        }

        // 出现次数最多的字符的位置
        int maxIndex = 0;
        for (int i = 1; i < 26; i++) {
            if (count[i] > count[maxIndex]) {
                maxIndex = i;
            }
        }

        // 次数过半不可能重新排列
        if (count[maxIndex] > (n + 1) / 2) {
            return "";
        }

        // 把次数最多的字符隔空放在偶数位置上
        char[] res = new char[n];
        int i = 0;
        while (count[maxIndex] > 0) {
            res[i] = (char) (maxIndex + 'a');
            i += 2;
            count[maxIndex]--;
        }
        // 其他字符继续优先放偶数位
        for (int j = 0; j < 26; j++) {
            while (count[j] > 0) {
                // 偶数位放满了换奇数
                if (i >= n) {
                    i = 1;
                }
                res[i] = (char) ('a' + j);
                // System.out.println(res[i]);
                i += 2;
                count[j]--;
            }
        }
        // System.out.println(res);
        return new String(res);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
    
    
        Solution solution = new Solution();
        System.out.println();
    }
}