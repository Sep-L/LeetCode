package leetcode.editor.cn;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LQZ
 * @date 2022-02-22 14:58:03
 */
 
//Java：用栈操作构建数组
public class ID1441_BuildAnArrayWithStackOperations{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<String> buildArray(int[] target, int n) {
        int i = 1;
        List<String> list = new ArrayList<>();
        for (int num : target) {
            while (num != i) {
                list.add("Push");
                list.add("Pop");
                i++;
            }
            list.add("Push");
            i++;
        }
        return list;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
    
    
        Solution solution = new Solution();
        System.out.println();
    }
}