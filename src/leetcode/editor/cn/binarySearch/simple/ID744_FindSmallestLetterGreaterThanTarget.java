package leetcode.editor.cn.binarySearch.simple;
import org.junit.Test;

/**
 * @author LQZ
 * @date 2022-04-03 20:22:22
 */
 
//Java：寻找比目标字母大的最小字母
public class ID744_FindSmallestLetterGreaterThanTarget{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int left = 0, right = letters.length;
        if (letters[right - 1] <= target) {
            return letters[0];
        }
        while (left < right) {
            int middle = left + (right - left) / 2;
            if (letters[middle] > target) {
                right = middle;
            } else if (letters[middle] <= target) {
                left = middle + 1;
            }
        }
        return letters[left];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
    
    
        Solution solution = new Solution();
        System.out.println();
    }
}