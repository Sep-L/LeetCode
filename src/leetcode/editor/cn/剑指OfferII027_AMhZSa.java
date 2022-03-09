package leetcode.editor.cn;

import leetcode.editor.cn.custom.ListNode;
import org.junit.Test;

/**
 * @author LQZ
 * @date 2022-02-22 21:49:15
 */

//Java：回文链表
public class 剑指OfferII027_AMhZSa {
    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    class Solution {
        public boolean isPalindrome(ListNode head) {
            if (head == null) {
                return true;
            }
            // 前半部分尾节点, 后半部分头节点
            ListNode firstEnd = findHalf(head);
            ListNode secondStart = reverseList(firstEnd.next);

            ListNode first = head;
            ListNode second = secondStart;
            boolean ans = true;
            while (ans && second != null) {
                if (first.val != second.val) {
                    ans = false;
                }
                first = first.next;
                second = second.next;
            }
            // 恢复链表顺序
            firstEnd.next = reverseList(secondStart);
            return ans;
        }

        private ListNode reverseList(ListNode head) {
            ListNode prev = null;
            ListNode curr = head;
            while (curr != null) {
                ListNode temp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = temp;
            }
            return prev;
        }

        private ListNode findHalf(ListNode head) {
            ListNode slow = head;
            ListNode fast = head;
            while (fast.next != null && fast.next.next != null) {
                fast = fast.next.next;
                slow = slow.next;
            }
            return slow;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {


        Solution solution = new Solution();
        System.out.println();
    }
}