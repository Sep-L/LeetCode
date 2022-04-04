package leetcode.editor.cn.binarySearch.simple;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author LQZ
 * @date 2022-04-03 21:29:04
 */
 
//Java：矩阵中战斗力最弱的 K 行
public class ID1337_TheKWeakestRowsInAMatrix{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int m = mat.length, n = mat[0].length;
        // 保存每行的战斗力和索引
        List<int[]> res = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            // 二分找第一个不是 1 的位置
            int left = 0, right = n;
            while (left < right) {
                int middle = left + (right - left) / 2;
                if (mat[i][middle] == 0) {
                    right = middle;
                } else {
                    left = middle + 1;
                }
            }
            res.add(new int[]{i, left});
        }
        // 按照战力排序, 同战力按索引
        res.sort(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] == o2[1]) {
                    return o1[0] - o2[0];
                }
                return o1[1] - o2[1];
            }
        });
        // 依次取出 res 中的元素
        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = res.remove(0)[0];
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