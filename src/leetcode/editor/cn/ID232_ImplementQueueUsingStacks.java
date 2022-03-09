package leetcode.editor.cn;

import java.util.Stack;

/**
 * @author LQZ
 * @date 2022-02-19 09:13:04
 */
 
//Java：用栈实现队列
public class ID232_ImplementQueueUsingStacks{
    //leetcode submit region begin(Prohibit modification and deletion)
class MyQueue {
    // stack1模拟队列, stack2辅助
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void push(int x) {
        // 先暂时都存在辅助栈中
        stack2.push(x);
    }
    
    public int pop() {
        // 等主栈stack1需要元素时把辅助栈stack2的元素全部输入到stack1中
        if (stack1.isEmpty()) {
            while (!stack2.isEmpty()) {
                stack1.push(stack2.pop());
            }
        }
        return stack1.pop();
    }
    
    public int peek() {
        if (stack1.isEmpty()) {
            while (!stack2.isEmpty()) {
                stack1.push(stack2.pop());
            }
        }
        return stack1.peek();
    }
    
    public boolean empty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
//leetcode submit region end(Prohibit modification and deletion)

}