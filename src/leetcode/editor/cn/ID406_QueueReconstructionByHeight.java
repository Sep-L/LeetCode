package leetcode.editor.cn;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author LQZ
 * @date 2022-03-17 17:15:28
 */
 
//Java：根据身高重建队列
public class ID406_QueueReconstructionByHeight{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[][] reconstructQueue(int[][] people) {
        // 相同身高从大到小 ki 从小到大
        Arrays.sort(people, new Comparator<int[]>() {
            @Override
            public int compare(int[] person1, int[] person2) {
                if (person1[0] == person2[0]) {
                    return person1[1] - person2[1];
                }
                return person2[0] - person1[0];
            }
        });
        List<int[]> ans = new ArrayList<>();
        for (int[] res : people) {
            int k = res[1];
            // 新加入列表的元素一定更矮, 且对后入元素无影响, 只要放在比他高的人后面就可以
            ans.add(k, res);
        }
        return ans.toArray(new int[ans.size()][]);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
    
    
        Solution solution = new Solution();
        System.out.println();
    }
}