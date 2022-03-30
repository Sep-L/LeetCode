package leetcode.editor.cn.GreedyAlgorithm;

import org.junit.Test;

/**
 * @author LQZ
 * @date 2022-03-29 22:08:39
 */

//Java：删列造序 II
public class ID955_DeleteColumnsToMakeSortedIi {
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int minDeletionSize(String[] strs) {
            int ans = 0;
            int m = strs[0].length(), n = strs.length;
            boolean[] flag = new boolean[n];

            // 对每个字符串, 比较第 i 个字符的大小关系
            for (int i = 0; i < m; i++) {
                // 这列是否需要删除
                boolean needDelete = false;

                // 枚举所有字符串
                for (int j = 1; j < n; j++) {
                    // 这个字符串在之前的判断中已经小于前面字符串了
                    if (flag[j]) {
                        continue;
                    }
                    // 当前字符串和上一个字符串在第 i 个位置的字符
                    char prev = strs[j - 1].charAt(i);
                    char curr = strs[j].charAt(i);
                    if (curr < prev) {
                        // 小于则直接删除, 开始判断字符串的下一个位置
                        needDelete = true;
                        break;
                    }
                }

                if (needDelete) {
                    ans++;
                } else {
                    // 大于说明一定比前一字符串大, 且该列确定不需要删除, flag 设置为 true
                    for (int j = 1; j < n; j++) {
                        if (strs[j].charAt(i) > strs[j - 1].charAt(i) && !flag[j]) {
                            flag[j] = true;
                        }
                    }
                }
            }
            return ans;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {

        String[] strs = new String[]{"xc", "yb", "za"};
        strs = new String[]{"vdy", "vei", "zvc", "zld"};
        strs = new String[]{"cczcaccz","cdccbccz","cdccbccx"};
        Solution solution = new Solution();
        System.out.println(solution.minDeletionSize(strs));
    }
}