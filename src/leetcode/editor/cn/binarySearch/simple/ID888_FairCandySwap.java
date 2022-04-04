package leetcode.editor.cn.binarySearch.simple;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author LQZ
 * @date 2022-04-03 21:18:55
 */
 
//Java：公平的糖果交换
public class ID888_FairCandySwap{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        Arrays.sort(aliceSizes);
        Arrays.sort(bobSizes);
        int sumA = 0, sumB = 0;
        Set<Integer> res = new HashSet<>();
        for (int aliceSize : aliceSizes) {
            sumA += aliceSize;
            res.add(aliceSize);
        }
        for (int bobSize : bobSizes) {
            sumB += bobSize;
        }
        int diff = (sumA - sumB) / 2;
        for (int num : bobSizes) {
            if (res.contains(num + diff)) {
                return new int[]{num + diff, num};
            }
        }
        return null;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
    
    
        Solution solution = new Solution();
        System.out.println();
    }
}