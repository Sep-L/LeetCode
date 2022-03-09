package leetcode.editor.cn.custom;

import java.util.List;

/**
 * @author LQZ
 * @date 2022-02-19 9:34
 */
public class Node {
    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
