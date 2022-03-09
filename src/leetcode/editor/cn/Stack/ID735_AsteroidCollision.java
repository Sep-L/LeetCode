package leetcode.editor.cn.Stack;

import org.junit.Test;

import java.util.Stack;

/**
 * @author LQZ
 * @date 2022-02-25 22:21:26
 */
 
//Java：行星碰撞
public class ID735_AsteroidCollision{
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] asteroidCollision(int[] asteroids) {
            Stack<Integer> stack = new Stack<>();
            for (int i = asteroids.length - 1; i >= 0; i--) {
                int num = asteroids[i];
                boolean addFlag = true;
                while (!stack.isEmpty() && stack.peek() < 0 && num > 0) {
                    if (num + stack.peek() < 0) {
                        addFlag = false;
                        break;
                    } else if (num + stack.peek() == 0) {
                        stack.pop();
                        addFlag = false;
                        break;
                    } else {
                        stack.pop();
                        addFlag = true;
                    }
                }
                if (addFlag) {
                    stack.push(num);
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