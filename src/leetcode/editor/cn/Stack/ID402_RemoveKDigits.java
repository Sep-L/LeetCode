package leetcode.editor.cn.Stack;
import org.junit.Test;

/**
 * @author LQZ
 * @date 2022-02-24 21:54:56
 */
 
//Java：移掉 K 位数字
public class ID402_RemoveKDigits{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String removeKdigits(String num, int k) {
        int len = num.length();
        if (len == k) {
            return "0";
        }
        char[] arr = num.toCharArray();
        char[] res = new char[len];
        int top = -1;
        int n = len - k;
        for(char c : arr){
            // 后面的数比栈顶元素小, 更换栈顶元素
            while(k > 0 && top != -1 && res[top] > c){
                top--;
                k--;
            }

            res[++top] = c;
        }
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < n; i++){
            // 去掉前导0
            if(ans.length() == 0 && res[i] == '0'){
                continue;
            }
            ans.append(res[i]);
        }
        return ans.length() == 0 ? "0" : ans.toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
    
    
        Solution solution = new Solution();
        System.out.println();
    }
}