package leetcode.editor.cn.Stack;

import org.junit.Test;

import java.util.Stack;

/**
 * @author LQZ
 * @date 2022-03-03 21:04:47
 */
 
//Java：小行星碰撞
public class 剑指OfferII037_XagZNi{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for (int i = asteroids.length - 1; i >= 0; i--) {
            boolean flag = true;
            // System.out.println(Arrays.toString(stack.toArray()));
            while (!stack.isEmpty() && asteroids[i] > 0 && stack.peek() < 0) {
                if (asteroids[i] + stack.peek() > 0) {
                    flag = true;
                    stack.pop();
                } else if (asteroids[i] + stack.peek() == 0) {
                    stack.pop();
                    flag = false;
                    break;
                } else {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                stack.push(asteroids[i]);
            }
        }
        int[] ans = new int[stack.size()];
        int i = 0;
        while (!stack.isEmpty()) {
            ans[i] = stack.pop();
            i++;
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