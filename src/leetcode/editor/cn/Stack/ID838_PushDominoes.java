package leetcode.editor.cn.Stack;

import org.junit.Test;

/**
 * @author LQZ
 * @date 2022-02-21 15:42:40
 */
 
//Java：推多米诺
public class ID838_PushDominoes{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String pushDominoes(String dominoes) {
        dominoes = "L" + dominoes + "R";
        StringBuilder ans = new StringBuilder();
        int left = 0, right = 1;
        while (left < dominoes.length()) {
            while (left < dominoes.length() && dominoes.charAt(left) != '.') {
                ans.append(dominoes.charAt(left));
                left++;
            }
            right = left;
            while (right < dominoes.length() && dominoes.charAt(right) == '.') {
                right++;
            }
            if (left >= dominoes.length()) {
                break;
            }
            char leftChar = dominoes.charAt(left - 1);
            char rightChar = dominoes.charAt(right);
            if (leftChar == rightChar) {
                for (int i = left; i < right; i++) {
                    ans.append(leftChar);
                }
            } else if (leftChar == 'L') {
                for (int i = left; i < right; i++) {
                    ans.append('.');
                }
            } else {
                int length = right - left;
                int middle = length / 2;
                for (int i = 0; i < middle; i++) {
                    ans.append(leftChar);
                }
                if (length % 2 != 0) {
                    ans.append('.');
                }
                for (int i = 0; i < middle; i++) {
                    ans.append(rightChar);
                }
            }
            ans.append(rightChar);
            left = right + 1;
        }
        return ans.substring(1, ans.length() - 1);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
        String dominoes = "RR.L";
        dominoes = ".L.R...LR..L.";

        Solution solution = new Solution();
        System.out.println(solution.pushDominoes(dominoes));
    }
}