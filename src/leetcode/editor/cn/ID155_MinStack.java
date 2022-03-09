package leetcode.editor.cn;

import java.util.Stack;

/**
 * @author LQZ
 * @date 2022-02-17 21:35:02
 */

//Java：最小栈
public class ID155_MinStack {
    //leetcode submit region begin(Prohibit modification and deletion)
    class MinStack {

        private Stack<Long> minStack;
        private int minValue;

        public MinStack() {
            minStack = new Stack<>();
        }

        public void push(int val) {
            if (minStack.isEmpty()) {
                minStack.push(0L);
                minValue = val;
            } else {
                minStack.push((long)val - minValue);
                if (val < minValue) {
                    minValue = val;
                }
            }
        }
        public void pop() {
            long diff = minStack.pop();
            if (diff < 0) {
                minValue = (int) (minValue - diff);
            }
        }

        public int top() {
            if (minStack.peek() <= 0) {
                return minValue;
            }
            return (int) (minStack.peek() + minValue);
        }

        public int getMin() {
            return minValue;
        }
    }

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
//leetcode submit region end(Prohibit modification and deletion)

}