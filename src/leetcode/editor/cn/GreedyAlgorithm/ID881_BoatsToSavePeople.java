package leetcode.editor.cn.GreedyAlgorithm;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author LQZ
 * @date 2022-03-27 19:57:08
 */
 
//Java：救生艇
public class ID881_BoatsToSavePeople{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int n = people.length;
        int start = 0, end = n - 1;
        int ans = 0;
        while (start < end) {
            if (people[end] + people[start] > limit) {
                end--;
            } else {
                start++;
                end--;
            }
            ans++;
        }
        if (start == end) {
            ans++;
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