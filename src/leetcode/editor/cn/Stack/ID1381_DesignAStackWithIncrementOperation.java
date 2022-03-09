package leetcode.editor.cn.Stack;

/**
 * @author LQZ
 * @date 2022-02-27 13:11:37
 */
 
//Java：设计一个支持增量操作的栈
public class ID1381_DesignAStackWithIncrementOperation{
    //leetcode submit region begin(Prohibit modification and deletion)
class CustomStack {
    private int[] stack;
    private int index = -1;

    public CustomStack(int maxSize) {
        stack = new int[maxSize];
    }
    
    public void push(int x) {
        if (index < stack.length - 1) {
            index++;
            stack[index] = x;
        }
    }
    
    public int pop() {
        if (index == -1) {
            return -1;
        }
        return stack[index--];
    }
    
    public void increment(int k, int val) {
        if (k > index + 1) {
            k = index + 1;
        }
        for (int i = 0; i < k; i++) {
            stack[i] += val;
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */
//leetcode submit region end(Prohibit modification and deletion)
}