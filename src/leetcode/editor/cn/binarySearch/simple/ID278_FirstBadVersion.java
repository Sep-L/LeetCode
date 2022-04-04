package leetcode.editor.cn.binarySearch.simple;
import org.junit.Test;

/**
 * @author LQZ
 * @date 2022-04-03 16:49:07
 */
 
//Java：第一个错误的版本
public class ID278_FirstBadVersion{
    //leetcode submit region begin(Prohibit modification and deletion)
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int start = 1, end = n;
        while (start < end) {
            int middle = start + (end - start) / 2;
            if (isBadVersion(middle)) {
                end = middle;
            } else {
                start = middle + 1;
            }
        }
        return start;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

public class VersionControl {
    boolean isBadVersion(int version) {
        return false;
    };
}
    @Test
    public void test() {
    
    
        Solution solution = new Solution();
        System.out.println();
    }
}