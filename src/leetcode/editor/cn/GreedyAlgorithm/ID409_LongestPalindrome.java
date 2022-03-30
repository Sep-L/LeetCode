package leetcode.editor.cn.GreedyAlgorithm;
import org.junit.Test;

/**
 * @author LQZ
 * @date 2022-03-16 08:19:16
 */
 
//Java：最长回文串
public class ID409_LongestPalindrome{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int longestPalindrome(String s) {
        int[] arr = new int[52];
        for (char c : s.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                arr[c - 'A']++;
            } else {
                arr[c - 'a' + 26]++;
            }
        }
        int flag = 0;
        int ans = 0;
        for (int num : arr) {
            if ((num & 1) == 1) {
                flag = 1;
            }
            ans += (num / 2) * 2;
        }
        return ans + flag;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
    
    
        Solution solution = new Solution();
        System.out.println();
    }
}