package leetcode.editor.cn;

import org.junit.Test;

import java.util.Arrays;
import java.util.Stack;

/**
 * @author LQZ
 * @date 2022-02-23 14:01
 */


class Solution {
    public int minimumFinishTime(int[][] tires, int changeTime, int numLaps) {
        // 创建数组best, 统计在连续跑x圈时, 消耗的最短时间
        long[] best = new long[numLaps + 1];
        Arrays.fill(best, Integer.MAX_VALUE / 2);
        // Arrays.fill(best, Integer.MAX_VALUE);
        for (int i = 0; i < tires.length; i++) {
            // 每次花费的基础时间
            int cost = tires[i][0];
            // 每次增长的倍数
            int pow = tires[i][1];
            // 第0圈为0
            int sum = 0;
            // 计算第一圈开始
            for (int j = 1; j < numLaps + 1; j++) {
                sum += cost;
                best[j] = Math.min(best[j], sum);
                // 花费时间倍数增长
                cost *= pow;
                // 继续跑不如换轮胎时, 没必要继续算, 退出循环
                if (cost > changeTime + tires[i][0]) {
                    break;
                }
            }
        }

        // 动态规划
        long[] dp = new long[numLaps + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        // dp[i]表示第i圈的最短时间
        for (int i = 1; i < numLaps + 1; i++) {
            dp[i] = Math.min(dp[i], best[i]);
            // 计算中途换轮胎会不会更快
            for (int j = 1; j < i; j++) {
                dp[i] = Math.min(dp[i], dp[i - j] + best[j] + changeTime);
            }
        }
        return (int) dp[numLaps];
    }
}


public class _LeetCodeTest {
    @Test
    public void test() {
        int[][] tires = new int[][]{{2, 3}, {3, 4}};
        int changeTime = 5;
        int numLaps = 4;
        // tires = new int[][]{{99, 7}};
        // changeTime = 85;
        // numLaps = 95;
        // tires = new int[][]{{1, 2}};
        // changeTime = 1;
        // numLaps = 1;
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.add(1,3);
        System.out.println(Arrays.toString(stack.toArray()));

        // Solution solution = new Solution();
        // System.out.println(solution.minimumFinishTime(tires, changeTime, numLaps));
    }
}