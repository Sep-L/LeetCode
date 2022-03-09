package leetcode.editor.cn.Stack;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author LQZ
 * @date 2022-02-18 14:41:23
 */
 
//Java：用队列实现栈
public class ID225_ImplementStackUsingQueues{
    //leetcode submit region begin(Prohibit modification and deletion)
class MyStack {
    private Queue<Integer> queue1;
    private Queue<Integer> queue2;

    public MyStack() {
        // queue1模拟栈
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }
    
    public void push(int x) {
        // queue2存储栈顶元素
        queue2.offer(x);
        // 队列先进先出, 先将queue1模拟的栈中元素全部给queue2
        while (!queue1.isEmpty()) {
            queue2.offer(queue1.poll());
        }
        // 交换
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
    }
    
    public int pop() {
        return queue1.poll();
    }
    
    public int top() {
        return queue1.peek();
    }
    
    public boolean empty() {
        return queue1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
//leetcode submit region end(Prohibit modification and deletion)

}