package leetcode.editor.cn.GreedyAlgorithm;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author LQZ
 * @date 2022-03-16 08:27:47
 */
 
//Java：分发饼干
public class ID455_AssignCookies{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findContentChildren(int[] g, int[] s) {

        Arrays.sort(g);
        Arrays.sort(s);

        int children = 0, cookie = 0;
        while (children < g.length && cookie < s.length) {
            if (g[children] <= s[cookie]) {
                children++;
            }
            cookie++;
        }
        return children;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
        int[] g = new int[]{1,2,3};
        int[] s = new int[]{1,1};
    
        Solution solution = new Solution();
        System.out.println(solution.findContentChildren(g, s));
    }
}