package leetcode.editor.cn;

import leetcode.editor.cn.custom.ListNode;
import org.junit.Test;

/**
 * @author LQZ
 * @date 2022-03-02 16:24:18
 */
 
//Java：链表最大孪生和
public class ID2130_MaximumTwinSumOfALinkedList{
    //leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    private ListNode curr;
    private int ans = 0;

    public int pairSum(ListNode head) {
        curr = head;
        dfs(head);
        return ans;
    }

    private void dfs(ListNode node) {
        if (node == null) {
            return;
        }
        dfs(node.next);
        System.out.println(node.val + "\t" + curr.val);
        ans = Math.max(ans, curr.val + node.val);
        curr = curr.next;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
    
    
        Solution solution = new Solution();
        System.out.println();
    }
}