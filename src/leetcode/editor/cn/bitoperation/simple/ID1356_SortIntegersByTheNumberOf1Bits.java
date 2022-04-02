package leetcode.editor.cn.bitoperation.simple;
import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author LQZ
 * @date 2022-03-31 16:23:00
 */
 
//Java：根据数字二进制下 1 的数目排序
public class ID1356_SortIntegersByTheNumberOf1Bits{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] sortByBits(int[] arr) {
        Integer[] res = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = arr[i];
        }
        Arrays.sort(res, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (count(o1) == count(o2)) {
                    return o1 - o2;
                }
                return count(o1) - count(o2);
            }
        });
        for (int i = 0; i < arr.length; i++) {
            arr[i] = res[i];
        }
        return arr;
    }

    private int count(int val) {
        return Integer.bitCount(val);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
    
    
        Solution solution = new Solution();
        System.out.println();
    }
}