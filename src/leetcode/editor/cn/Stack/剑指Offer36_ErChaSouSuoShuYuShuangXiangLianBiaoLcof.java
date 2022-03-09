package leetcode.editor.cn.Stack;


import org.junit.Test;

/**
 * @author LQZ
 * @date 2022-03-02 17:28:00
 */
 
//Java：二叉搜索树与双向链表
public class 剑指Offer36_ErChaSouSuoShuYuShuangXiangLianBiaoLcof{
    //leetcode submit region begin(Prohibit modification and deletion)
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val,Node _left,Node _right) {
        val = _val;
        left = _left;
        right = _right;
    }
};

class Solution {
    private Node head;
    private Node prev;
    public Node treeToDoublyList(Node root) {
        if (root == null) {
            return null;
        }
        buildList(root);
        // 中序遍历结束后, 将首尾节点相连
        head.left = prev;
        prev.right = head;
        return head;
    }

    private void buildList(Node curr) {
        if (curr == null) {
            return;
        }

        // 中序遍历
        buildList(curr.left);

        // 修改节点指向
        // 上一个节点指向当前节点
        // 当前节点指向上一个节点
        // 将上一个节点设置成当前节点并遍历下一个节点
        if (prev != null) {
            prev.right = curr;
        } else {
            // 初始时设置头节点在最左边的叶子节点, 即最小值
            head = curr;
        }
        curr.left = prev;
        prev = curr;

        buildList(curr.right);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
    
    
        Solution solution = new Solution();
        System.out.println();
    }
}