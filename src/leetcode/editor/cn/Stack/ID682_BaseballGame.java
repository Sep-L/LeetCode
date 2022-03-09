package leetcode.editor.cn.Stack;

/**
 * @author LQZ
 * @date 2022-02-18 16:22:44
 */
 
//Java：棒球比赛
public class ID682_BaseballGame{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int calPoints(String[] ops) {
        int[] array = new int[ops.length];
        int i = 0;
        for (String s : ops) {
            switch (s) {
                case "+":
                    array[i] = array[i - 1] + array[i - 2];
                    i++;
                    break;
                case "C":
                    array[i - 1] = 0;
                    i--;
                    break;
                case "D":
                    array[i] = 2 * array[i - 1];
                    i++;
                    break;
                default:
                    array[i] = Integer.parseInt(s);
                    i++;
            }
        }
        int sum = 0;
        for (int j = 0; j < array.length; j++) {
            sum += array[j];
        }
        return sum;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}