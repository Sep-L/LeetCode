package leetcode.editor.cn.Stack;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @author LQZ
 * @date 2022-03-04 09:36:26
 */
 
//Java：堆盘子
public class 面试题03_03_StackOfPlatesLcci{
    //leetcode submit region begin(Prohibit modification and deletion)
class StackOfPlates {
    int capacity;
    List<Stack<Integer>> list;

    public StackOfPlates(int cap) {
        // 初始化容量和列表
        capacity = cap;
        list = new LinkedList<>();
    }
    
    public void push(int val) {
        // 容量小于等于0, 什么也放不下
        if (capacity <= 0) {
            return;
        }
        // 新建栈的情况: 1. 列表为空, 即第一次添加元素时. 2. 列表中最后一个栈的元素满了
        if (list.isEmpty() || list.get(list.size() - 1).size() == capacity) {
            Stack<Integer> stack = new Stack<>();
            stack.push(val);
            list.add(stack);
            return;
        }
        // 不需要新建就直接添加
        list.get(list.size() - 1).push(val);
    }
    
    public int pop() {
        return popAt(list.size() - 1);
    }
    
    public int popAt(int index) {
        // -1 的两种情况: 1. 索引大于列表的长度或小于0, 即栈不存在 2. 该栈为空 (不会出现)
        if (index < 0 || index >= list.size()) {
            return -1;
        }
        Stack<Integer> stack = list.get(index);
        int num = stack.pop();
        if (stack.isEmpty()) {
            list.remove(index);
        }
        return num;
    }
}

/**
 * Your StackOfPlates object will be instantiated and called as such:
 * StackOfPlates obj = new StackOfPlates(cap);
 * obj.push(val);
 * int param_2 = obj.pop();
 * int param_3 = obj.popAt(index);
 */
//leetcode submit region end(Prohibit modification and deletion)

}