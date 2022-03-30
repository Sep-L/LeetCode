package leetcode.editor.cn.GreedyAlgorithm;
import org.junit.Test;

/**
 * @author LQZ
 * @date 2022-03-25 06:02:14
 */
 
//Java：Dota2 参议院
public class ID649_Dota2Senate{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {


    public String predictPartyVictory(String senate) {
        // 标识是否还有 R 和 D
        boolean Radiant = true, Dire = true;
        // 遇到 R +1, D -1
        int count = 0;
        char[] charArray = senate.toCharArray();
        while (Radiant && Dire) {
            // 默认没有
            Radiant = false; Dire = false;
            for (int i = 0; i < charArray.length; i++) {
                char c = charArray[i];
                // 如果遇到 R
                if (c == 'R') {
                    // R 之前有 D
                    if (count < 0) {
                        charArray[i] = '0';
                    } else {
                        // 没有可以保留, 即这一轮有 R
                        Radiant = true;
                    }
                    // 计数
                    count++;
                }
                if (c == 'D') {
                    if (count > 0) {
                        charArray[i] = '0';
                    } else {
                        Dire = true;
                    }
                    count--;
                }
            }
        }
        return Radiant ? "Radiant" : "Dire";
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
    
    
        Solution solution = new Solution();
        System.out.println();
    }
}