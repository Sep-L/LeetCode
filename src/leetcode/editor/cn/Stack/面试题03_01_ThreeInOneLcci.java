package leetcode.editor.cn.Stack;

/**
 * @author LQZ
 * @date 2022-02-23 11:34:23
 */
 
//Java：三合一
public class 面试题03_01_ThreeInOneLcci{
    //leetcode submit region begin(Prohibit modification and deletion)
class TripleInOne {

    private int[] array;
    private int[] index;
    private int size;

    public TripleInOne(int stackSize) {
        array = new int[stackSize * 3];
        size = stackSize;
        index = new int[]{-1, -1, -1};
    }
    
    public void push(int stackNum, int value) {
        if (index[stackNum] < size - 1) {
            int id = ++index[stackNum];
            array[id + stackNum * size] = value;
        }
    }
    
    public int pop(int stackNum) {
        int id = index[stackNum];
        if (id == - 1) {
            return -1;
        }
        index[stackNum]--;
        return array[id + stackNum * size];
    }
    
    public int peek(int stackNum) {
        if (index[stackNum] < 0) {
            return -1;
        }
        return array[index[stackNum] + stackNum * size];
    }
    
    public boolean isEmpty(int stackNum) {
        if (index[stackNum] == -1) {
            return true;
        }
        return false;
    }
}

/**
 * Your TripleInOne object will be instantiated and called as such:
 * TripleInOne obj = new TripleInOne(stackSize);
 * obj.push(stackNum,value);
 * int param_2 = obj.pop(stackNum);
 * int param_3 = obj.peek(stackNum);
 * boolean param_4 = obj.isEmpty(stackNum);
 */
//leetcode submit region end(Prohibit modification and deletion)
}