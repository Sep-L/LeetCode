package leetcode.editor.cn.bitoperation.simple;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LQZ
 * @date 2022-03-30 20:00:03
 */

//Java：二进制手表
public class ID401_BinaryWatch {
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {

        private List<String> ans;
        private final int[] nums = new int[]{1, 2, 4, 8, 1, 2, 4, 8, 16, 32};

        public List<String> readBinaryWatch(int turnedOn) {
            ans = new ArrayList<>();
            backtrace(turnedOn, 0, 0, 0);
            return ans;
        }

        private void backtrace(int turnedOn, int hour, int minute, int index) {
            if (turnedOn == 0) {
                ans.add(hour + ":" + (minute > 9 ? minute : "0" + minute));
            }
            for (int i = index; i < 10 && turnedOn > 0; i++) {
                // 枚举每个小时灯亮的情况
                if (i < 4 && hour + nums[i] < 12) {
                    // 点亮第 i 个灯, turnedOn - 1
                    backtrace(turnedOn - 1, hour + nums[i], minute, i + 1);
                }
                // 枚举每个分钟灯亮的情况
                if (i >= 4 && minute + nums[i] < 60) {
                    // 点亮第 i 个灯, turnedOn - 1
                    backtrace(turnedOn - 1, hour, minute + nums[i], i + 1);
                }
            }
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {


        Solution solution = new Solution();
        System.out.println();
    }
}