package leetcode.editor.cn;
import org.junit.Test;

/**
 * @author LQZ
 * @date 2022-03-17 09:50:19
 */
 
//Java：蓄水
public class LCP33_O8SXZn{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {

    private int ans;

    public int storeWater(int[] bucket, int[] vat) {
        // 找到最大的蓄水量
        int maxVat = 0;
        for (int v : vat) {
            maxVat = Math.max(maxVat, v);
        }
        if (maxVat == 0) {
            return 0;
        }

        // 最差的操作数, 蓄水 10000 次倒 1 次
        ans = 10001;
        // 枚举倒水次数
        for (int pour = 1; pour <= 10000; pour++) {
            if (pour >= ans) {
                break;
            }
            operates(pour, bucket, vat);
        }
        return ans;
    }

    // 根据倾倒次数计算升级次数
    private void operates(int pour, int[] bucket, int[] vat) {
        int upgrade = 0;
        for (int i = 0; i < vat.length; i++) {
            // 当前桶的升级次数
            int cur = (int) Math.ceil((double) vat[i] / pour - bucket[i]);
            upgrade += Math.max(cur, 0);
            if (upgrade >= ans) {
                return;
            }
        }
        ans = Math.min(ans, upgrade + pour);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
    
    
        Solution solution = new Solution();
        System.out.println();
    }
}