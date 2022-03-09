package leetcode.editor.cn;

import leetcode.editor.cn.custom.ListNode;
import org.junit.Test;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author LQZ
 * @date 2022-03-02 22:24:25
 */
 
//Java：链表中的两数相加
public class 剑指OfferII025_LMSNwu{
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Deque<Integer> stack1 = new LinkedList<>();
        Deque<Integer> stack2 = new LinkedList<>();
        // int lengeh
        while (l1 != null) {
            stack1.addFirst(l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            stack2.addFirst(l2.val);
            l2 = l2.next;
        }
        // System.out.println(Arrays.toString(stack1.toArray()));
        // System.out.println(Arrays.toString(stack2.toArray()));
        ListNode newHead=new ListNode(-1);
        int carry = 0;
        ListNode ans = null;
        while (!stack1.isEmpty() || !stack2.isEmpty()) {
            int num1 = 0, num2 = 0;
            if (!stack1.isEmpty()) {
                num1 = stack1.pop();
            }
            if (!stack2.isEmpty()) {
                num2 = stack2.pop();
            }
            int sum = num1 + num2 + carry;
            // System.out.println(sum);
            carry = sum / 10;
            ans = new ListNode(sum % 10, ans);
        }
        if (carry == 1) {
            ans = new ListNode(1, ans);
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
    
    
        Solution solution = new Solution();
        System.out.println();
    }
}