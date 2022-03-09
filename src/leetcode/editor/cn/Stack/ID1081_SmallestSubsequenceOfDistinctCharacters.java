package leetcode.editor.cn.Stack;
import org.junit.Test;

import java.util.Stack;

/**
 * @author LQZ
 * @date 2022-02-27 06:55:31
 */
 
//Java：不同字符的最小子序列
public class ID1081_SmallestSubsequenceOfDistinctCharacters{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String smallestSubsequence(String s) {
        int[] letters = new int[26];
        boolean[] visit = new boolean[26];
        for (char c : s.toCharArray()) {
            letters[c - 'a'] += 1;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            letters[c - 'a']--;
            if (visit[c - 'a']) {
                continue;
            }
            while (!stack.isEmpty() && c < stack.peek() && letters[stack.peek() - 'a'] > 0) {
                visit[stack.pop() - 'a'] = false;
            }
            stack.push(c);
            visit[c - 'a'] = true;
        }
        int size = stack.size();
        StringBuilder stringBuilder = new StringBuilder(size);
        while (!stack.isEmpty()) {
            stringBuilder.append(stack.pop());
        }
        return stringBuilder.reverse().toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
    
    
        Solution solution = new Solution();
        System.out.println(solution.smallestSubsequence("cbacdcbc"));
    }
}