package leetcode.editor.cn.binarySearch.simple;
import org.junit.Test;

/**
 * @author LQZ
 * @date 2022-04-04 14:57:15
 */
 
//Java：稀疏数组搜索
public class 面试题10_05_SparseArraySearchLcci{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findString(String[] words, String s) {
        int left = 0, right = words.length - 1;
        while (left <= right) {
            int middle = left + (right - left) / 2;
            while (middle > left && "".equals(words[middle])) {
                middle--;
            }
            // 空字符串比任何字符串都小
            if (s.compareTo(words[middle]) == 0) {
                return middle;
            } else if (s.compareTo(words[middle]) < 0) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return -1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
        String[] words = new String[]{"at", "", "", "", "ball", "", "", "car", "", "", "dad", "", ""};
        String s = "ta";
    
        Solution solution = new Solution();
        System.out.println(solution.findString(words, s));
    }
}