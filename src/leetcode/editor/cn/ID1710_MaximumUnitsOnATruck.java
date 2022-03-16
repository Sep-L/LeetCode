package leetcode.editor.cn;
import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author LQZ
 * @date 2022-03-16 20:19:40
 */
 
//Java：卡车上的最大单元数
public class ID1710_MaximumUnitsOnATruck{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[1] - o1[1];
            }
        });
        int index = 0;
        int ans = 0;
        while (index < boxTypes.length && truckSize > 0) {
            int size = boxTypes[index][0];
            int capacity = boxTypes[index][1];
            if (size >= truckSize) {
                ans += truckSize * capacity;
                break;
            } else {
                ans += size * capacity;
                truckSize -= size;
            }
            index++;
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
    
    
        Solution solution = new Solution();
        System.out.println();
    }
}