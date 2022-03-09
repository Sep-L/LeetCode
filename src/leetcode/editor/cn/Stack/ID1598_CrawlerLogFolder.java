package leetcode.editor.cn.Stack;

import org.junit.Test;

/**
 * @author LQZ
 * @date 2022-02-22 19:04:55
 */

//Java：文件夹操作日志搜集器
public class ID1598_CrawlerLogFolder {
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int minOperations(String[] logs) {
            int count = 0;
            for (String log : logs) {
                if (log.charAt(0) != '.') {
                    count += 1;
                } else if (count != 0 && log.equals("../")) {
                        count -= 1;
                }
            }
            return count;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
        String[] logs = new String[]{"d1/", "d2/", "../", "d21/", "./"};

        Solution solution = new Solution();
        System.out.println(solution.minOperations(logs));
    }
}