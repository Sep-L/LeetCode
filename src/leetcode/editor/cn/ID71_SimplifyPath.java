package leetcode.editor.cn;

import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author LQZ
 * @date 2022-02-23 16:28:24
 */
 
//Java：简化路径
public class ID71_SimplifyPath{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String simplifyPath(String path) {
        String[] strings = path.split("/");
        Deque<String> stack = new ArrayDeque<>();
        for (String string : strings) {
            if (string.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pollLast();
                }
            } else if (!string.isEmpty() && !".".equals(string)) {
                stack.offerLast(string);
            }
        }
        StringBuilder ans = new StringBuilder();
        while (!stack.isEmpty()) {
            ans.append("/");
            ans.append(stack.pollFirst());
        }
        if (ans.length() == 0) {
            return "/";
        }
        return ans.toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
    
        String path = "/home//foo/";
        path = "/a/./b/../../c/";
        Solution solution = new Solution();
        System.out.println(solution.simplifyPath(path));
    }
}