package leetcode.editor.cn;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author LQZ
 * @date 2022-03-13 08:34:38
 */

//Java：除法求值
public class ID399_EvaluateDivision {
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {

            Map<String, Integer> map = new HashMap<>();
            int index = 0;

            // 每个字符串映射一个索引
            for (List<String> equation : equations) {
                String a = equation.get(0);
                String b = equation.get(1);
                if (!map.containsKey(a)) {
                    map.put(a, index++);
                }
                if (!map.containsKey(b)) {
                    map.put(b, index++);
                }
            }

            int n = map.size();
            // 初始化图
            double[][] graph = new double[n][n];
            for (int i = 0; i < n; i++) {
                // Arrays.fill() 只能填充一维数组
                Arrays.fill(graph[i], -1.0);
            }

            // 根据 values 数组构建图
            index = 0;
            for (List<String> equation : equations) {
                // 获取字母的索引
                int a = map.get(equation.get(0));
                int b = map.get(equation.get(1));
                // 构建邻接矩阵
                double value = values[index++];
                graph[a][b] = value;
                graph[b][a] = 1.0 / value;
            }

            // Floyd 算法预处理得到任意两个节点间的值
            for (int k = 0; k < n; k++) {
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        if (graph[i][k] > 0 && graph[k][j] > 0) {
                            graph[i][j] = graph[i][k] * graph[k][j];
                        }
                    }
                }
            }

            // ans 数据保存结果
            double[] ans = new double[queries.size()];
            // 从邻接图中直接查询结果, map 不包含返回 -1
            for (int i = 0; i < queries.size(); i++) {
                List<String> query = queries.get(i);
                String a = query.get(0);
                String b = query.get(1);
                if (map.containsKey(a) && map.containsKey(b)) {
                    ans[i] = graph[map.get(a)][map.get(b)];
                } else {
                    ans[i] = -1.0;
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