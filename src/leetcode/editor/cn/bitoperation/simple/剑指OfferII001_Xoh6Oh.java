package leetcode.editor.cn.bitoperation.simple;
import org.junit.Test;

/**
 * @author LQZ
 * @date 2022-04-02 15:21:18
 */
 
//Java：整数除法
/*
a = 22, b = 3
首先 3 不断的乘 2 也就是自身相加
即 3+3 = 6 此时记录可除次数为 1+1 = 2，初始可除次数为 1
6+6 = 12 此时记录可除次数为 2+2 = 4
12+12 = 24 ，因为 24 > 22了 所以到此终止，回到上一步
此时我们得到了初始可除次数 4，相加的打底合为 12，当前递归内的 b的 n 次 2 倍的值为 6
尝试将 12+6 和 22 比较，我们知道了 12+6 = 18 < 22，那么说明可以加上这段值，
则得到新的打底合和 18， 当前可除次数为 4 + 2 = 6
继续退出递归, 回到上一层递归中的状态
同样用之前的打底和 18 + 3 和 22 尝试比较，得到 18 + 3 = 21 < 22
那么继续加上可除次数 6 + 1 = 7
继续退出递归
最终没有地方再能退了，即最终结果 22 / 3 = 7
*/
public class 剑指OfferII001_Xoh6Oh{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {

    private int sum = 0;

    public int divide(int a, int b) {
        // 0 除以任何数都是 0, a / 1 = a
        if (a == 0 || b == 1) {
            return a;
        }
        // 结果溢出
        if (a == Integer.MIN_VALUE && b == -1) {
            return Integer.MAX_VALUE;
        }
        // 判断两个数符号是否相同, 不同则最高位为 1, 即负数
        boolean flag = (a ^ b) < 0;
        // 转成负数是因为在计算过程中 2^31 会导致溢出
        a = a > 0 ? -a : a;
        b = b > 0 ? -b : b;
        int ans = toDivide(1, a, b);
        return flag ? -ans : ans;
    }

    private int toDivide(int divideTimes, int target, int cur) {
        // 防止溢出
        if (sum + cur > 0) {
            return 0;
        }
        // b > a, 结果为 0
        if (sum + cur < target) {
            return 0;
        } else if (sum + cur == target) {
            // b 刚好除尽了 a, 返回
            sum += cur;
            return divideTimes;
        }
        /*
        * 逆向思维, 考虑 b * n < a 的 n 的最大值
        * 每次先把 b * 2 快速得到逼近 a 的 n
        * 再回头判断 b * (2^t) + b * (2^(t-1)) 是否大于 a
        */
        // 将 cur 增大两倍, 看是否超过了 target, 没超过说明还可以多除 divideTimes
        int newDivideTimes = toDivide(divideTimes + divideTimes, target, cur + cur);
        // 注意 cur 和 target 都是负数, sum + cur > target, 说明还有增加可除次数的概率
        // sum + cur >= 0 时, 说明已经开始溢出了, 此时不能增加可除次数, 回退到上次递归
        if (sum + cur < 0 && sum + cur >= target) {
            sum += cur;
            newDivideTimes += divideTimes;
        }
        return newDivideTimes;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
    
    
        Solution solution = new Solution();
        System.out.println(solution.divide(-231, 3));
    }
}