package leetcode.editor.cn.bitoperation.simple;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author LQZ
 * @date 2022-04-02 17:10:23
 */
 
//Java：回文排列
public class 面试题01_04_PalindromePermutationLcci{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean canPermutePalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int count = 0;
        for (int val : map.values()) {
            if ((val & 1) == 1) {
                if (count == 1) {
                    return false;
                }
                count++;
            }
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
    
    
        Solution solution = new Solution();
        System.out.println();
    }
}