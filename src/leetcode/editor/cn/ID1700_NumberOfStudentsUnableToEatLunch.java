package leetcode.editor.cn;

import org.junit.Test;

/**
 * @author LQZ
 * @date 2022-02-22 19:45:59
 */

//Java：无法吃午餐的学生数量
public class ID1700_NumberOfStudentsUnableToEatLunch {
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int countStudents(int[] students, int[] sandwiches) {
            int count = sandwiches.length;
            int[] sum = new int[2];
            for (int student : students) {
                sum[student] += 1;
            }
            for (int sandwich : sandwiches) {
                if (sum[sandwich] == 0) {
                    break;
                }
                sum[sandwich] -= 1;
                count -= 1;
            }
            return count;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {


        Solution solution = new Solution();
        System.out.println();
    }
}