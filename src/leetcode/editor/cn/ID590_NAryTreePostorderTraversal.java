package leetcode.editor.cn;

import leetcode.editor.cn.custom.Node;

import java.util.*;

/**
 * @author LQZ
 * @date 2022-02-19 09:52:47
 */
 
//Java：N 叉树的后序遍历
public class ID590_NAryTreePostorderTraversal{
    //leetcode submit region begin(Prohibit modification and deletion)
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> postorder(Node root) {
        Stack<Node> stack = new Stack<>();
        List<Integer> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }
        stack.push(root);
        while (!stack.isEmpty()) {
            Node node = stack.pop();
            if (node.children != null) {
                for (int i = 0; i < node.children.size(); i++) {
                    stack.push(node.children.get(i));
                }
            }
            ans.add(node.val);
        }
        Collections.reverse(ans);
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}