package leetcode.editor.cn;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;

/**
 * @author LQZ
 * @date 2022-03-01 16:18:18
 */
 
//Java：游戏中弱角色的数量
public class ID1996_TheNumberOfWeakCharactersInTheGame{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int numberOfWeakCharacters(int[][] properties) {
        Arrays.sort(properties, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] - o2[0] == 0) {
                    return o2[1] - o1[1];
                }
                return o1[0] - o2[0];
            }
        });
        // System.out.println(Arrays.deepToString(properties));
        Stack<Integer> stack = new Stack<>();
        int ans = 0;
        for (int[] property : properties) {
            while (!stack.isEmpty() && stack.peek() < property[1]) {
                stack.pop();
                ans++;
            }
            stack.push(property[1]);
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