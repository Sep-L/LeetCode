package leetcode.editor.cn;

import org.junit.Test;

import java.util.Stack;

/**
 * @author LQZ
 * @date 2022-02-26 21:41:46
 */
 
//Java：子数组的最小值之和
public class ID907_SumOfSubarrayMinimums{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int sumSubarrayMins(int[] arr) {
        int MOD = 1000000007;
        int n = arr.length;
        int ans = 0, res = 0;
        Stack<int[]> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            int count = 1;
            while (!stack.isEmpty() && stack.peek()[0] >= arr[i]) {
                // 出栈的元素temp[0]表示自己是多少, temp[1]表示以自己为最小值的子数组个个数, 可以直接计算加到结果中
                int[] temp = stack.pop();
                // res 记录的是栈内元素的对应和, 有元素出栈了就要减掉
                res -= temp[0] * temp[1];
                // 新入栈的元素继承了前面大于该出栈元素的个数
                count += temp[1];
            }
            // pair[0]表示自己的值, pair[1]表示在自己入栈时大于等于自己的元素个数, 包括自己
            int[] pair = new int[]{arr[i], count};
            stack.push(pair);
            // 栈内的元素每次遇到新入栈的也要计算, 相当于子数组向右扩充一位
            // 例如[3, 1, 4, 2], 栈内为1时, 新入栈的元素为4, 这时不仅多了[1, 4], 还多了[3, 1, 4], 所以之前计算的结果也要保留
            res += arr[i] * count;
            ans = (ans + res) % MOD;

        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
        int[] res = new int[] {3,1,4,2};
        Solution solution = new Solution();
        System.out.println(solution.sumSubarrayMins(res));
    }
}