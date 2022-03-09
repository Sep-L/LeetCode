package leetcode.editor.cn;
import org.junit.Test;

import java.util.Stack;

/**
 * @author LQZ
 * @date 2022-02-27 12:27:47
 */
 
//Java：删除字符串中的所有相邻重复项 II
public class ID1209_RemoveAllAdjacentDuplicatesInStringIi{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<pair> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (stack.isEmpty() || stack.peek().c != c) {
                stack.push(new pair(c, 1));
            } else {
                if (stack.peek().count == k - 1) {
                        stack.pop();
                } else {
                    stack.peek().count += 1;
                }
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        while (!stack.isEmpty()) {
            int count = stack.peek().count;
            char c = stack.pop().c;
            while (count > 0){
                stringBuilder.append(c);
                count--;
            }
        }
        return stringBuilder.reverse().toString();
    }
}

class pair {
    char c;
    int count;

    public pair(char c, int count) {
        this.c = c;
        this.count = count;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
        String s = "deeedbbcccbdaa";
        int k = 3;
    
        Solution solution = new Solution();
        System.out.println(solution.removeDuplicates(s,k));
    }
}