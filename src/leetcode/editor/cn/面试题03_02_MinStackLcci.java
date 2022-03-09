package leetcode.editor.cn;

import java.util.Stack;

/**
 * @author LQZ
 * @date 2022-02-23 14:50:31
 */
 
//Java：栈的最小值
public class 面试题03_02_MinStackLcci{
    //leetcode submit region begin(Prohibit modification and deletion)
class MinStack {
    private Stack<Long> stack;
    private int minValue;

    /** initialize your data structure here. */
    public MinStack() {
        stack = new Stack<>();
    }
    
    public void push(int x) {
        if (stack.isEmpty()) {
            stack.push(0L);
            minValue = x;
        } else {
            stack.push((long) x - minValue);
            if (x < minValue) {
                minValue = x;
            }
        }
    }
    
    public void pop() {
        if (stack.peek() < 0) {
            minValue -= stack.pop();
        } else {
            stack.pop();
        }

    }
    
    public int top() {
        if (stack.peek() < 0) {
            return minValue;
        }
        return (int) (minValue + stack.peek());
    }
    
    public int getMin() {
        return minValue;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
//leetcode submit region end(Prohibit modification and deletion)
}