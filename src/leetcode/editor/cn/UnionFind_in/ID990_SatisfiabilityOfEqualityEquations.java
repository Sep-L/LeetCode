package leetcode.editor.cn.UnionFind_in;
import org.junit.Test;

/**
 * @author LQZ
 * @date 2022-03-16 05:50:07
 */
 
//Java：等式方程的可满足性
public class ID990_SatisfiabilityOfEqualityEquations{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {

    private int[] parent;

    public boolean equationsPossible(String[] equations) {
        parent = new int[26];
        for (int i = 0; i < 26; i++) {
            parent[i] = i;
        }
        for (String equation : equations) {
            int first = equation.charAt(0) - 'a';
            int last = equation.charAt(3) - 'a';
            char flag = equation.charAt(1);
            if (flag == '=') {
                union(first, last);
            }
        }
        for (String equation : equations) {
            int first = equation.charAt(0) - 'a';
            int last = equation.charAt(3) - 'a';
            char flag = equation.charAt(1);
            if (flag == '!' && find(first) == find(last)) {
                return false;
            }
        }
        return true;
    }

    private int find(int val) {
        if (val != parent[val]) {
            val = find(parent[val]);
        }
        return val;
    }

    private void union(int a, int b) {
        int x = find(a);
        int y = find(b);
        if (x != y) {
            parent[x] = y;
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
    
    
        Solution solution = new Solution();
        System.out.println();
    }
}