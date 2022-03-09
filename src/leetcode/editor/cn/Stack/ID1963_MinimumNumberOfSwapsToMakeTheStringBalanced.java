package leetcode.editor.cn.Stack;
import org.junit.Test;

/**
 * @author LQZ
 * @date 2022-03-01 15:47:10
 */
 
//Java：使字符串平衡的最小交换次数
public class ID1963_MinimumNumberOfSwapsToMakeTheStringBalanced{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minSwaps(String s) {
        char[] chars = s.toCharArray();
        int left = 0;
        int count = 0, ans = 0;
        // 不能在 char.length / 2 的地方提前终止
        // 举例 "[][][][] ]]]][[[["
        while (left < chars.length) {
            if (chars[left] == '[') {
                count += 1;
            } else {
                if (count > 0) {
                    count--;
                } else {
                    // 只考虑左括号不足时需要交换
                    count++;
                    ans++;
                }
            }
            left++;
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
        String s = "[[[]]]][][]][[]]][[[";
        Solution solution = new Solution();
        System.out.println();
    }
}