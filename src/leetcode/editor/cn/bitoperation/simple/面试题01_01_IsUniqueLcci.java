package leetcode.editor.cn.bitoperation.simple;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * @author LQZ
 * @date 2022-04-01 22:29:45
 */
 
//Java：判定字符是否唯一
public class 面试题01_01_IsUniqueLcci{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isUnique(String astr) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < astr.length(); i++) {
            set.add(astr.charAt(i));
        }
        return set.size() == astr.length();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
    
    
        Solution solution = new Solution();
        System.out.println();
    }
}