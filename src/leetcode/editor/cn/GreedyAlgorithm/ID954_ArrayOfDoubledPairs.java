package leetcode.editor.cn.GreedyAlgorithm;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 * @author LQZ
 * @date 2022-03-29 21:48:24
 */
 
//Java：二倍数对数组
public class ID954_ArrayOfDoubledPairs{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean canReorderDoubled(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        Integer[] res = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = arr[i];
        }
        Arrays.sort(res, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Math.abs(o1) - Math.abs(o2);
            }
        });
        for (int num : res) {
            if (map.getOrDefault(num, 0) != 0) {
                int value = map.get(num);
                int twice = map.getOrDefault(2 * num, 0);
                if (twice == 0) {
                    return false;
                }
                map.put(num, value - 1);
                map.put(2 * num, twice - 1);
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