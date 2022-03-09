package leetcode.editor.cn.Stack;

import leetcode.editor.cn.custom.ListNode;
import org.junit.Test;

/**
 * @author LQZ
 * @date 2022-02-25 14:45:34
 */
 
//Java：两数相加 II
public class ID445_AddTwoNumbersIi{
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
    private ListNode listNode;

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        listNode = dummy;
        int count = 1;
        int carry = 0;
        l1 = reverse(l1);
        l2 = reverse(l2);
        while (l1 != null && l2 != null) {
            int cur = carry + l1.val + l2.val;
            listNode.next = new ListNode(cur % 10);
            carry = cur / 10;
            l1 = l1.next;
            l2 = l2.next;
            listNode = listNode.next;
        }
        while (l1 != null) {
            int cur = carry + l1.val;
            listNode.next = new ListNode(cur % 10);
            carry = cur / 10;
            l1 = l1.next;
            listNode = listNode.next;
        }

        while (l2 != null) {
            int cur = carry + l2.val;
            listNode.next = new ListNode(cur % 10);
            carry = cur / 10;
            l2 = l2.next;
            listNode = listNode.next;
        }
        if (carry != 0) {
            listNode.next = new ListNode(carry);
        }
        return reverse(dummy.next);
    }
    private ListNode reverse(ListNode node) {
        ListNode prev = null;
        ListNode curr = node;
        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
    
    
        Solution solution = new Solution();
        System.out.println();
    }
}