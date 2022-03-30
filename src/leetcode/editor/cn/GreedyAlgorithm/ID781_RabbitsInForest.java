package leetcode.editor.cn.GreedyAlgorithm;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author LQZ
 * @date 2022-03-26 14:53:59
 */
 
//Java：森林中的兔子
public class ID781_RabbitsInForest{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int numRabbits(int[] answers) {
        int n = answers.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int answer : answers) {
            answer++;
            map.put(answer, map.getOrDefault(answer, 0) + 1);
        }
        System.out.println(map);
        int ans = 0;
        for (int key : map.keySet()) {
            int value = map.get(key);
            System.out.println(value);
            ans += ((value - 1) / key + 1) * key;
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