package leetcode.editor.cn.Stack;

import org.junit.Test;

import java.util.Stack;

/**
 * @author LQZ
 * @date 2022-02-24 09:41:07
 */

//Java：去除重复字母
public class ID316_RemoveDuplicateLetters {
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String removeDuplicateLetters(String s) {
            int[] count = new int[26];
            for (int i = 0; i < s.length(); i++) {
                count[s.charAt(i) - 'a']++;
            }

            boolean[] inStack = new boolean[26];
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                count[ch - 'a']--;
                if (!inStack[ch - 'a']) {
                    while (!stack.isEmpty() && stack.peek() > ch && (count[stack.peek() - 'a'] > 0)) {
                        inStack[stack.pop() - 'a'] = false;
                    }
                    stack.push(ch);
                    inStack[ch - 'a'] = true;
                }
            }
            StringBuilder stringBuilder = new StringBuilder();
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
            System.out.println(solution.removeDuplicateLetters("acdb"));
        }
    }
