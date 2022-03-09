package leetcode.editor.cn.Stack;

import java.util.Stack;

/**
 * @author LQZ
 * @date 2022-02-23 14:59:59
 */
 
//Java：化栈为队
public class 面试题03_04_ImplementQueueUsingStacksLcci{
    //leetcode submit region begin(Prohibit modification and deletion)
class MyQueue {

    private Stack<Integer> mainStack;
    private Stack<Integer> stack;
    /** Initialize your data structure here. */
    public MyQueue() {
        mainStack = new Stack<>();
        stack = new Stack<>();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        stack.push(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if (mainStack.isEmpty()) {
            while (!stack.isEmpty()) {
                mainStack.push(stack.pop());
            }
        }
        return mainStack.pop();
    }
    
    /** Get the front element. */
    public int peek() {
        if (mainStack.isEmpty()) {
            while (!stack.isEmpty()) {
                mainStack.push(stack.pop());
            }
        }
        return mainStack.peek();
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        if (mainStack.isEmpty() && stack.isEmpty()) {
            return true;
        }
        return false;
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