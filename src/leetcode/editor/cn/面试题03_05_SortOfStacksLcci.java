package leetcode.editor.cn;
import org.junit.Test;

import java.util.Stack;

/**
 * @author LQZ
 * @date 2022-03-04 10:05:42
 */
 
//Java：栈排序
public class 面试题03_05_SortOfStacksLcci{
    //leetcode submit region begin(Prohibit modification and deletion)
class SortedStack {
    private Stack<Integer> mainStack;
    private Stack<Integer> stack;

    public SortedStack() {
        mainStack = new Stack<>();
        stack = new Stack<>();
    }
    
    public void push(int val) {
        while (!mainStack.isEmpty() && val > mainStack.peek()) {
            stack.push(mainStack.pop());
        }
        mainStack.push(val);
        while (!stack.isEmpty()) {
            mainStack.push(stack.pop());
        }
    }
    
    public void pop() {
        if (!mainStack.isEmpty()) {
            mainStack.pop();
        }
    }
    
    public int peek() {
        if (mainStack.isEmpty()) {
            return -1;
        }
        return mainStack.peek();
    }
    
    public boolean isEmpty() {
        return mainStack.isEmpty();
    }
}

/**
 * Your SortedStack object will be instantiated and called as such:
 * SortedStack obj = new SortedStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.isEmpty();
 */
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
    
    
        Solution solution = new Solution();
        System.out.println();
    }
}