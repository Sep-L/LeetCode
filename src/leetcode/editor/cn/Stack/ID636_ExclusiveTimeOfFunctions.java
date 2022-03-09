package leetcode.editor.cn.Stack;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * @author LQZ
 * @date 2022-02-25 19:57:30
 */
 
//Java：函数的独占时间
public class ID636_ExclusiveTimeOfFunctions{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {

    public int[] exclusiveTime(int n, List<String> logs) {
        Stack<int[]> stack = new Stack<>();
        int[] ans = new int[n];
        for (String log : logs) {
            String[] res = log.split(":");
            int func = Integer.parseInt(res[0]);
            String flag = res[1];
            int time = Integer.parseInt(res[2]);
            if ("start".equals(flag)) {
                stack.push(new int[]{func, time});
            } else {
                int[] temp = stack.pop();
                // time: end执行时的时间, temp[1]: 上次操作的结束时间
                int cost = time - temp[1] + 1;
                ans[temp[0]] += cost;
                if (!stack.isEmpty()) {
                    ans[stack.peek()[0]] -= cost;
                }
            }
        }
        return ans;
    }

}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {

        String[] strings = new String[]{"0:start:0","0:start:1","0:start:2","0:end:3","0:end:4","0:end:5"};
        List<String> list = new ArrayList<>(Arrays.asList(strings));
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.exclusiveTime(1, list)));
    }
}