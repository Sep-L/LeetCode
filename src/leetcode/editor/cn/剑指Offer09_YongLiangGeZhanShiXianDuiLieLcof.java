package leetcode.editor.cn;

import java.util.LinkedList;

/**
 * @author LQZ
 * @date 2022-02-22 20:47:35
 */
 
//Java：用两个栈实现队列
public class 剑指Offer09_YongLiangGeZhanShiXianDuiLieLcof{
    //leetcode submit region begin(Prohibit modification and deletion)
class CQueue {

    private LinkedList<Integer> mainStack;
    private LinkedList<Integer> stack;

    public CQueue() {
        mainStack = new LinkedList<>();
        stack = new LinkedList<>();
    }
    
    public void appendTail(int value) {
        stack.push(value);
    }
    
    public int deleteHead() {
        if (mainStack.isEmpty()) {
            if (stack.isEmpty()) {
                return -1;
            }
            while (!stack.isEmpty()) {
                mainStack.push(stack.pop());
            }
        }
        return mainStack.pop();
    }
}

/**
 * Your CQueue object will be instantiated and called as such:
 * CQueue obj = new CQueue();
 * obj.appendTail(value);
 * int param_2 = obj.deleteHead();
 */
//leetcode submit region end(Prohibit modification and deletion)
}