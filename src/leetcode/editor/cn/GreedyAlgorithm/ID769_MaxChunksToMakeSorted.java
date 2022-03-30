package leetcode.editor.cn.GreedyAlgorithm;

import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author LQZ
 * @date 2022-03-25 09:08:17
 */
 
//Java：最多能完成排序的块
public class ID769_MaxChunksToMakeSorted{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxChunksToSorted(int[] arr) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < arr.length; i++) {
            // 遇到新的元素比栈顶大, 说明可以开新的分区
            if (stack.isEmpty() || arr[stack.peek()] < arr[i]) {
                stack.push(i);
                continue;
            }
            // 否则保存当前的最大值
            int max = stack.peek();
            // 去掉之前所有比新元素小的, 因为它们都需要调整
            while (!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
                stack.pop();
            }
            // 把最大值放回来代表这个分段
            stack.push(max);
        }
        return stack.size();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
    
    
        Solution solution = new Solution();
        System.out.println();
    }
}