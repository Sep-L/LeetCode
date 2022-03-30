package leetcode.editor.cn.GreedyAlgorithm;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author LQZ
 * @date 2022-03-26 21:25:41
 */
 
//Java：优势洗牌
public class ID870_AdvantageShuffle{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] advantageCount(int[] nums1, int[] nums2) {
        int n = nums1.length;
        // 记录 nums2 中数字和索引的对应关系
        int[][] nums2Index = new int[n][2];
        for (int i = 0; i < n; i++) {
            nums2Index[i][0] = nums2[i];
            nums2Index[i][1] = i;
        }
        // 两个数组从小到大排序
        Arrays.sort(nums1);
        Arrays.sort(nums2Index, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        // ans保存答案
        int[] ans = new int[n];
        // 定义起始和终止位置, 指明 nums2Index 的数
        int start = 0, end = n - 1;
        // 当前元素所需要放在的索引位置
        int index;
        for (int i = 0; i < n; i++) {
            if (nums1[i] <= nums2Index[start][0]) {
                // 小了, 直接拿去和最大的比, 放在对应 nums2 最大值的索引的位置
                index = nums2Index[end][1];
                end--;
            } else {
                // 大了, 可以直接针对当前位置放
                index = nums2Index[start][1];
                start++;
            }
            ans[index] = nums1[i];
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