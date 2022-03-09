package leetcode.editor.cn.Stack;
import org.junit.Test;

/**
 * @author LQZ
 * @date 2022-02-28 12:39:54
 */
 
//Java：使字符串平衡的最少删除次数
public class ID1653_MinimumDeletionsToMakeStringBalanced{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minimumDeletions(String s) {
        int count = 0;
        int ans = 0;
        for (char c : s.toCharArray()) {
            if (c == 'b') {
                count++;
            } else {
                // 如果 a 的前面有 b, 删除 a 或者 b
                // b 的数量少于 a, 那么把 b 删完, 对应 count = 0
                // a 的数量少于 b, 那么把 a 删完, 对应 ans增加的次数
                if (count != 0) {
                    count--;
                    ans++;
                }
            }
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
    
    
        Solution solution = new Solution();
        System.out.println();
    }
}