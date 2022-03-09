package leetcode.editor.cn.Stack;

import leetcode.editor.cn.custom.ListNode;

/**
 * @author LQZ
 * @date 2022-02-22 20:34:02
 */
 
//Java：从尾到头打印链表
public class 剑指Offer06_CongWeiDaoTouDaYinLianBiaoLcof{
    //leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int[] reversePrint(ListNode head) {
        ListNode cur = head;
        int count = 0;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        int[] array = new int[count];
        cur = head;
        for (int i = 0; i < count; i++) {
            array[count - 1 - i] = cur.val;
            cur = cur.next;
        }
        return array;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
}