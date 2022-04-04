package leetcode.editor.cn.tests;

/**
 * @author LQZ
 * @date 2022-04-03 11:16
 */

public class LeetcodeContest {
    class Solution {
        public int convertTime(String current, String correct) {
            int hour = 0, minute = 0;
            for (int i = 0; i < 5; i++) {
                if (i < 2) {
                    hour = 10 * hour + correct.charAt(i) - current.charAt(i);
                } else if (i > 2) {
                    minute = 10 * minute + correct.charAt(i) - current.charAt(i);
                }
            }
            int ans;
            if (minute < 0) {
                ans = hour - 1;
                minute += 60;
            } else {
                ans = hour;
            }
            while (minute != 0) {
                if (minute >= 15) {
                    minute -= 15;
                } else if (minute >= 5) {
                    minute -= 5;
                } else {
                    minute--;
                }
                ans++;
            }
            return ans;
        }
    }
}
