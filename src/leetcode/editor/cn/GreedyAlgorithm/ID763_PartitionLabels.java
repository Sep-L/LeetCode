package leetcode.editor.cn.GreedyAlgorithm;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LQZ
 * @date 2022-03-25 08:53:47
 */
 
//Java：划分字母区间
public class ID763_PartitionLabels{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<Integer> partitionLabels(String s) {
        int[] res = new int[26];
        for (int i = 0; i < s.length(); i++) {
            res[s.charAt(i) - 'a'] = i;
        }
        int start = 0, end = 0;
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            end = Math.max(res[s.charAt(i) - 'a'], end);
            if (i == end) {
                ans.add(end - start + 1);
                start = end + 1;
            }
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