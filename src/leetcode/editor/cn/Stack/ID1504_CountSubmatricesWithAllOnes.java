package leetcode.editor.cn.Stack;
import org.junit.Test;

/**
 * @author LQZ
 * @date 2022-02-27 13:47:30
 */
 
//Java：统计全 1 子矩形
public class ID1504_CountSubmatricesWithAllOnes{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int numSubmat(int[][] mat) {
        int row = mat.length, col = mat[0].length;
        int[][] map = new int[row][col];

        // 第一个 for 循环, 统计每一行最长的连续为 1 的个数
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (mat[i][j] == 1) {
                    if (j == 0) {
                        map[i][j] = 1;
                    } else {
                        map[i][j] = map[i][j - 1] + 1;
                    }
                }
            }
        }

        int ans = 0;
        // 计算结果
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                // 数据限制不会大于 150
                int res = 150;
                // 在 k = i = 0 时, 统计的是第一行所包含的全为 1 的子矩形的个数
                // 在 k = i != 0 时, 统计的是自己这一行全为 1 的子矩形的个数, 以及和上一行为同一列的全为 1 的子矩形
                for (int k = i; k >= 0; k--) {
                    res = Math.min(res, map[k][j]);
                    ans += res;
                }
            }
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {

        int[][] res = new int[][]{{1,1,1,1,1,1}};
        Solution solution = new Solution();
        System.out.println(solution.numSubmat(res));
    }
}