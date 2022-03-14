package leetcode.editor.cn;

import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author LQZ
 * @date 2022-03-03 9:23
 */

public class Main {

    private Deque<Integer> stack;
    private int ans = 0;
    private final int PUSH = 1;
    private final int POP = 0;
    private int n;

    public int maximumTop(int[] nums, int k) {
        n = nums.length;
        if (n == 1) {
            return -1;
        }
        stack = new ArrayDeque<>();

        for (int i = n - 1; i >= 0; i--) {
            stack.push(nums[i]);
        }
        back(POP, k % (2 * n));
        return ans;
    }

    private void back(int flag, int k) {
        if (stack.isEmpty()) {
            return;
        }
        if (k == 0) {
            ans = Math.max(ans, stack.peek());
            return;
        }
        if (flag == POP) {
            int num = stack.pop();
            back(POP, k - 1);
            stack.push(num);
        }
        back(PUSH, k - 1);
    }
    @Test
    public void test() {
        Main solution = new Main();
        int[] arr = new int[]{94,23,58,92,3,63,68,43,8,97,54,11,63,55,73,38,22,80,45,43,25,34,67,76,80,9,30,27,50,7,57,63,63,27,46,1,50,55,99,92,73,9,57,25,59,54,100,56,64,94,99};
        int i = solution.maximumTop(arr, 79);
        System.out.println(i);
    }
}

