package leetcode.editor.cn.Stack;

import org.junit.Test;

import java.util.Stack;

/**
 * @author LQZ
 * @date 2022-02-24 20:16:40
 */
 
//Java：文件的最长绝对路径
public class ID388_LongestAbsoluteFilePath{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    private Stack<Integer> stack;
    private int ans;
    private int count = 0;
    private int length;

    public int lengthLongestPath(String input) {
        stack = new Stack<>();
        String[] files = input.split("\n");
        stack.push(0);
        for (String file : files) {
            for (int i = 0; i < file.length(); i++) {
                if (file.charAt(i) == '\t') {
                    count++;
                    continue;
                }
                length = file.length() - count;
                while (count < stack.size() - 1) {
                    stack.pop();
                }
                int res = stack.peek()+ length;
                if (file.contains(".")) {
                    ans = Math.max(ans, res + count);
                }
                stack.push(res);
                break;
            }
            count = 0;
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
    
    
        Solution solution = new Solution();
        // System.out.println(solution.lengthLongestPath("file1.txt\nfile2.txt\nlongfile.txt"));
        System.out.println(solution.lengthLongestPath("dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext"));

        solution = new Solution();
        System.out.println(solution.lengthLongestPath("file1.txt\nfile2.txt\nlongfile.txt"));

    }
}