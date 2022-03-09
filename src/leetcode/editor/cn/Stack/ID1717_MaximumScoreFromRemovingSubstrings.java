package leetcode.editor.cn.Stack;

import org.junit.Test;

import java.util.Stack;

/**
 * @author LQZ
 * @date 2022-02-28 15:08:41
 */
 
//Java：删除子字符串的最大得分
public class ID1717_MaximumScoreFromRemovingSubstrings{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maximumGain(String s, int x, int y) {
        // 默认处理x > y
        if (x < y) {
            return maximumGain(new StringBuilder(s).reverse().toString(), y ,x);
        }
        Stack<Character> stack = new Stack<>();
        int ans = 0;
        // 栈内元素个数
        int size = 0;
        // 统计 ab 的个数并计分
        for (char c : s.toCharArray()) {
            if (stack.isEmpty() || c != 'b' || stack.peek() != 'a') {
                stack.push(c);
                size++;
            } else {
                stack.pop();
                ans += x;
                size--;
            }
        }
        // System.out.println(ans);
        // System.out.println(Arrays.toString(stack.toArray()));
        // 出栈并统计 ba 的个数, 栈内先出的元素是 a
        int count = 0;
        while (size > 0) {
            if (stack.peek() == 'a') {
                count++;
            } else if (stack.peek() == 'b') {
                if (count > 0) {
                    ans += y;
                    count--;
                }
            } else {
                    count = 0;
            }
            stack.pop();
            size--;
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {

        int x = 4, y = 5;
        Solution solution = new Solution();
        System.out.println(solution.maximumGain("cdbcbbaaabab", x, y));
    }
}