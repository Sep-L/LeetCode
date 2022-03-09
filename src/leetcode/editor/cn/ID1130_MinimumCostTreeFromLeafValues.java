package leetcode.editor.cn;
import org.junit.Test;

import java.util.Stack;

/**
 * @author LQZ
 * @date 2022-02-27 11:32:48
 */
 
//Java：叶值的最小代价生成树
public class ID1130_MinimumCostTreeFromLeafValues{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {

    public int mctFromLeafValues(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        stack.push(Integer.MAX_VALUE);
        int ans = 0;
        // 用单调栈的原因: 小的元素要尽量往下放, 使相乘得到的结果较小
        for (int num : arr) {
            while (num >= stack.peek()) {
                // 这步决定了出栈的元素要和之前的节点放一起还是和新加入的节点放一起
                // 举例[6, 2, 4], 判断得出[2, 4]一组, 计算它们相乘结果
                ans += stack.pop() * Math.min(stack.peek(), num);
            }
            stack.push(num);
        }
        // stack.size() == 2时, 栈顶元素肯定不是单纯的添加, 而是参加过了pop * peek的运算
        while (stack.size() > 2) {
            // 单调递减栈内依次运算
            ans += stack.pop() * stack.peek();
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