package leetcode.editor.cn;
import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author LQZ
 * @date 2022-03-16 08:27:47
 */
 
//Java：分发饼干
public class ID455_AssignCookies{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findContentChildren(int[] g, int[] s) {

        Arrays.sort(g, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        // Arrays.sort(s);
        // int ans = 0;
        // int index = 0;
        // while (ans < s.length) {
            // if (g[index])
        // }
        return 0;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
    
    
        Solution solution = new Solution();
        System.out.println();
    }
}