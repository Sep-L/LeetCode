package leetcode.editor.cn;

import java.util.Stack;

/**
 * @author LQZ
 * @date 2022-02-22 20:58:01
 */
 
//Java：包含min函数的栈
public class 剑指Offer30_BaoHanMinhanShuDeZhanLcof{
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
        long num = stack.pop();
        if (num < 0) {
            minValue -= num;
        }

    }
    
    public int top() {
        if (stack.peek() < 0) {
            return minValue;
        } else {
            return (int) (minValue + stack.peek());
        }
    }
    
    public int min() {
        return minValue;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.min();
 */
//leetcode submit region end(Prohibit modification and deletion)
}