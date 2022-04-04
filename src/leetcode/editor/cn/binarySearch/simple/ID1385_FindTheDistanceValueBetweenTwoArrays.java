package leetcode.editor.cn.binarySearch.simple;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author LQZ
 * @date 2022-04-03 21:53:40
 */
 
//Java：两个数组间的距离值
public class ID1385_FindTheDistanceValueBetweenTwoArrays{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int ans = 0;
        for (int num : arr1) {
            ans += isValid(num, arr2, d);
        }
        return ans;
    }

    private int isValid(int num, int[] arr, int d) {
        int left = 0, right = arr.length;
        while (left < right) {
            int middle = left + (right - left) / 2;
            int diff = arr[middle] - num;
            if (diff > d) {
                right = middle;
            } else if (diff < -d) {
                left = middle + 1;
            } else {
                return 0;
            }
        }
        return 1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
    
    
        Solution solution = new Solution();
        System.out.println();
    }
}