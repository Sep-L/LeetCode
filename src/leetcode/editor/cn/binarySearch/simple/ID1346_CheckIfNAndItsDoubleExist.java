package leetcode.editor.cn.binarySearch.simple;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * @author LQZ
 * @date 2022-04-03 21:45:08
 */
 
//Java：检查整数及其两倍数是否存在
public class ID1346_CheckIfNAndItsDoubleExist{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean checkIfExist(int[] arr) {
        Set<Integer> set = new HashSet<>();
        int count = 0;
        for (int num : arr) {
            if (num == 0) {
                count++;
                continue;
            }
            set.add(num);
        }
        if (count >= 2) {
            return true;
        }
        for (int num : arr) {
            if (set.contains(2 * num)) {
                return true;
            }
        }
        return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
    
    
        Solution solution = new Solution();
        System.out.println();
    }
}