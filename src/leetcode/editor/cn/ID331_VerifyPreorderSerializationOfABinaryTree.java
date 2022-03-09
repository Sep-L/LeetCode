package leetcode.editor.cn;

import org.junit.Test;

/**
 * @author LQZ
 * @date 2022-02-24 10:07:26
 */
 
//Java：验证二叉树的前序序列化
public class ID331_VerifyPreorderSerializationOfABinaryTree{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isValidSerialization(String preorder) {
            int diff = 1;
            int n = preorder.length();
            int i = 0;
            while (i < n) {
                if (diff == 0) {
                    return false;
                }
                if (preorder.charAt(i) == ',') {
                    i++;
                } else if (preorder.charAt(i) == '#') {
                    diff--;
                    i++;
                } else {
                    while (i < n && preorder.charAt(i) != ',') {
                        i++;
                    }
                    diff++;
                }
            }
            return diff == 0;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
    
    
        Solution solution = new Solution();
        System.out.println(solution.isValidSerialization("9,3,4,#,#,1,#,#,2,#,6,#,#"));
        System.out.println(solution.isValidSerialization("1,#"));
        System.out.println(solution.isValidSerialization("9,#,#,1"));
        System.out.println(solution.isValidSerialization("1,#,#,#,#"));
        System.out.println(solution.isValidSerialization("9,#,92,#,#"));
    }
}