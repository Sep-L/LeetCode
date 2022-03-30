package leetcode.editor.cn.GreedyAlgorithm;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LQZ
 * @date 2022-03-30 15:30:45
 */
 
//Java：煎饼排序
public class ID969_PancakeSorting{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {

    private int[] arr;
    private int[] indexes;

    public List<Integer> pancakeSort(int[] arr) {
        this.arr = arr;
        int n = arr.length;

        List<Integer> ans = new ArrayList<>();

        indexes = new int[n + 1];
        for (int i = 0; i < n; i++) {
            // 记录 arr 中每个数的初始位置
            indexes[arr[i]] = i;
        }

        for (int i = n; i >= 1; i--) {
            // 查看原数组最大的数在什么位置
            int index = indexes[i];
            // 如果就在最后, 略过判断下一个最大的数
            if (index == i - 1) {
                continue;
            }
            // 不在最后则需要反转数组, 首先确定该数是否在数组头部
            if (index != 0) {
                // 不在的话需要先反转到头部
                ans.add(index + 1);
                reverse(0, index);
            }
            // 从头部反转到当前位置
            ans.add(i);
            reverse(0, i - 1);
        }
        return ans;
    }

    private void reverse(int left, int right) {
        while (left < right) {
            // 反转 indexes 数组
            indexes[arr[left]] = right;
            indexes[arr[right]] = left;

            // 反转 arr 数组
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
    
        int[] arr = new int[]{3, 2, 4, 1};
        Solution solution = new Solution();
        System.out.println(solution.pancakeSort(arr));
    }
}