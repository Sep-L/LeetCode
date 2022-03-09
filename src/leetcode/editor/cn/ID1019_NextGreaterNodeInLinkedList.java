package leetcode.editor.cn;

import leetcode.editor.cn.custom.ListNode;
import org.junit.Test;

import java.util.Stack;

/**
 * @author LQZ
 * @date 2022-02-27 06:32:47
 */
 
//Java：链表中的下一个更大节点
public class ID1019_NextGreaterNodeInLinkedList{
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
    public int[] nextLargerNodes(ListNode head) {
        ListNode curr = head;
        int n = 0;
        while (curr != null) {
            curr = curr.next;
            n++;
        }

        int[] ans = new int[n];
        Stack<int[]> stack = new Stack<>();
        int index = 0;
        curr = head;
        while (curr != null) {
            while (!stack.isEmpty() && curr.val > stack.peek()[1]) {
                int[] pop = stack.pop();
                ans[pop[0]] = curr.val;
            }
            int[] push = new int[]{index, curr.val};
            stack.push(push);
            index++;
            curr = curr.next;
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