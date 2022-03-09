package leetcode.editor.cn;

import leetcode.editor.cn.custom.ListNode;

/**
 * @author LQZ
 * @date 2022-02-18 14:41:47
 */
 
//Java：回文链表
public class ID234_PalindromeLinkedList{
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

    private ListNode newHead;

    public boolean isPalindrome(ListNode head) {
        newHead = head;
        return check(head);
    }

    private boolean check(ListNode node) {
        if (node != null) {
            boolean flag = check(node.next);
            // 回文判断有一次对不上就是false, 之后递归的结果都是false
            if (!flag) {
                return false;
            }
            // 首尾判断, 不要用相等来判断, 这个if没进入的话最后会返回true
            if (node.val != newHead.val) {
                return false;
            }
            // 递归向上一层, 即head倒序, newHead正序
            newHead = newHead.next;
        }
        // head遍历到空节点返回true
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}